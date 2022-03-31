// Shakespeare
// The Nature of Code
// The Coding Train / Daniel Shiffman
// https://youtu.be/jv3CgDN9sc
// https://thecodingtrain.com/more/achive/nature-of-code/9-genetic-algorithms/9.4-looking-at-code.html
// https://editor.p5js.org/codingtrain/sketches/PqRSmKLQU

// http://natureofcode.com

// Genetic Algorithm, Evolving Shakespeare

// A class to describe a population of virtual organisms
// In this case, each organism is just an instance of a DNA object
import java.util.*;

public class Population {
	public ArrayList<DNA> population;
	public ArrayList<DNA> matingPool;
	public boolean finished;
	public String target;
	public int generations;
	public double mutationRate;
	public int perfectScore;
	public String best;

  public Population(String p, double m, int num) {
		this.target = p;
    this.generations = 0; // Number of generations
    this.finished = false; // Are we finished evolving?
    this.target = p; // Target phrase
    this.mutationRate = m; // Mutation rate
    this.perfectScore = 1;
    this.best = "";
    this.population = new ArrayList<>();

    for (int i = 0; i < num; i++) {
			this.population.add(new DNA(this.target.length()));
    }

    this.matingPool = new ArrayList<>();
    this.calcFitness();
  }

  // Fill our fitness array with a value for every member of the population
  public void calcFitness() {
    for (int i = 0; i < this.population.size(); i++) {
      this.population.get(i).calcFitness(this.target);
    }
  }

  // Generate a mating pool
  void naturalSelection() {
    // Clear the ArrayList
    this.matingPool = new ArrayList<>();

    double maxFitness = 0;
    for (int i = 0; i < this.population.size(); i++) {
      if (this.population.get(i).fitness > maxFitness) {
        maxFitness = this.population.get(i).fitness;
      }
    }

    // Based on fitness, each member will get added to the mating pool a certain number of times
    // a higher fitness = more entries to mating pool = more likely to be picked as a parent
    // a lower fitness = fewer entries to mating pool = less likely to be picked as a parent
    for (int i = 0; i < this.population.size(); i++) {
			double fitness = maxFitness == 0 ? 0 : this.population.get(i).fitness / maxFitness;
      int n = (int) Math.floor(fitness * 100); // Arbitrary multiplier, we can also use monte carlo method
      for (int j = 0; j <= n; j++) {
        // and pick two random numbers
        this.matingPool.add(this.population.get(i));
      }
    }
  }

  // Create a new generation
  public void generate() {
    // Refill the population with children from the mating pool
    for (int i = 0; i < this.population.size(); i++) {
      int a = (int) Math.floor(Math.random() * this.matingPool.size());
      int b = (int) Math.floor(Math.random() * this.matingPool.size());
      DNA partnerA = this.matingPool.get(a);
      DNA partnerB = this.matingPool.get(b);
      DNA child = partnerA.crossover(partnerB);
      child.mutate(this.mutationRate);
      this.population.set(i, child);
    }
    this.generations++;
  }

  public String getBest() {
    return this.best;
  }

  // Compute the current "most fit" member of the population
  public void evaluate() {
    double worldrecord = 0.0;
    int index = 0;
    for (int i = 0; i < this.population.size(); i++) {
      if (this.population.get(i).fitness > worldrecord) {
        index = i;
        worldrecord = this.population.get(i).fitness;
      }
    }

    this.best = this.population.get(index).getPhrase();
    if (worldrecord == this.perfectScore) {
      this.finished = true;
    }
  }

  public boolean isFinished() {
    return this.finished;
  }

  public int getGenerations() {
    return this.generations;
  }

  // Compute average fitness for the population
  public double getAverageFitness() {
    int total = 0;
    for (int i = 0; i < this.population.size(); i++) {
      total += this.population.get(i).fitness;
    }
    return (double) total / this.population.size();
  }

  public String allPhrases() {
    String everything = "";

    int displayLimit = Math.min(this.population.size(), 50);

    for (int i = 0; i < displayLimit; i++) {
      everything += this.population.get(i).getPhrase() + "\n";
    }
    return everything;
  }
}