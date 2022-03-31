// Shakespeare
// The Nature of Code
// The Coding Train / Daniel Shiffman
// https://youtu.be/jv3CgDN9sc
// https://thecodingtrain.com/more/achive/nature-of-code/9-genetic-algorithms/9.4-looking-at-code.html
// https://editor.p5js.org/codingtrain/sketches/PqRSmKLQU

// http://natureofcode.com

// Genetic Algorithm, Evolving Shakespeare

// A class to describe a pseudo-DNA, i.e. genotype
//   Here, a virtual organism's DNA is an array of character.
//   Functionality:
//      -- convert DNA into a string
//      -- calculate DNA's "fitness"
//      -- mate DNA with another set of DNA
//      -- mutate DNA

import java.util.*;

// Constructor (makes a random DNA)
public class DNA {
	public static char newChar() {
		int c = (int) Math.floor(Math.random() * (122 - 63) + 63);
		if (c == 63) c = 32;
		if (c == 64) c = 46;

		return (char)c;
	}

	public ArrayList<Character> genes;
	public double fitness;

  public DNA(int num) {
    // The genetic sequence
    this.genes = new ArrayList<>();
    this.fitness = 0.0;

    for (int i = 0; i < num; i++) {
      this.genes.add(DNA.newChar()); // Pick from range of chars
    }
  }

  // Converts character array to a String
  public String getPhrase() {
		String str = "";
		for (char c : this.genes) {
			str += c;
		}
		return str;
  }

  // Fitness function (returns floating point % of "correct" characters)
  public void calcFitness(String target) {
    int score = 0;
    for (int i = 0; i < this.genes.size(); i++) {
      if (this.genes.get(i) == target.charAt(i)) {
        score++;
      }
    }
    this.fitness = (double) score / target.length();
  }

  // Crossover
  public DNA crossover(DNA partner) {
    // A new child
    DNA child = new DNA(this.genes.size());

    int midpoint = (int) Math.floor(Math.random() * this.genes.size()); // Pick a midpoint

    // Half from one, half from the other
    for (int i = 0; i < this.genes.size(); i++) {
      if (i > midpoint) child.genes.set(i, this.genes.get(i));
      else child.genes.set(i, partner.genes.get(i));
    }
    return child;
  }

  // Based on a mutation probability, picks a new random character
  public void mutate(double mutationRate) {
    for (int i = 0; i < this.genes.size(); i++) {
      if (Math.random() < mutationRate) {
        this.genes.set(i, newChar());
      }
    }
  }
}