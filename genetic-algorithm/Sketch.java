// Shakespeare
// The Nature of Code
// The Coding Train / Daniel Shiffman
// https://youtu.be/jv3CgDN9sc
// https://thecodingtrain.com/more/achive/nature-of-code/9-genetic-algorithms/9.4-looking-at-code.html
// https://editor.p5js.org/codingtrain/sketches/PqRSmKLQU

// http://natureofcode.com

// Genetic Algorithm, Evolving Shakespeare

// Demonstration of using a genetic algorithm to perform a search

// setup()
//  # Step 1: The Population
//    # Create an empty population (an array or ArrayList)
//    # Fill it with DNA encoded objects (pick random values to start)

// draw()
//  # Step 1: Selection
//    # Create an empty mating pool (an empty ArrayList)
//    # For every member of the population, evaluate its fitness based on some criteria / function,
//      and add it to the mating pool in a manner consistant with its fitness, i.e. the more fit it
//      is the more times it appears in the mating pool, in order to be more likely picked for reproduction.

//  # Step 2: Reproduction Create a new empty population
//    # Fill the new population by executing the following steps:
//       1. Pick two "parent" objects from the mating pool.
//       2. Crossover -- create a "child" object by mating these two parents.
//       3. Mutation -- mutate the child's DNA based on a given probability.
//       4. Add the child object to the new population.
//    # Replace the old population with the new population
//
//   # Rinse and repeat

public class Sketch {
	private Population population;
	int popmax;
	double mutationRate;
	String target;

	public Sketch() {
		this.setup();
	}

	public void setup() {
		this.target = "To be or not to be.";
		this.popmax = 200;
		this.mutationRate = 0.01;

		// Create a population with a target phrase, mutation rate, and population max
		this.population = new Population(target, mutationRate, popmax);
	}

	public boolean draw() {
		// Generate mating pool
		population.naturalSelection();
		//Create next generation
		population.generate();
		// Calculate fitness
		population.calcFitness();

		population.evaluate();

		displayInfo();

		// If we found the target phrase, stop
		if (population.isFinished()) {
			//println(millis()/1000.0);
			return false;
		}

		return true;
	}

	public void displayInfo() {
		System.out.println("All phrases: \n" + population.allPhrases());

		// Display current status of population
		String answer = population.getBest();

		System.out.println("Best phrase: " + answer);

		String statstext =
			"total generations:     " + population.getGenerations() + "\n";

		statstext +=
			"average fitness:       " + population.getAverageFitness() + "\n";
		statstext += "total population:      " + popmax + "\n";
		statstext += "mutation rate:         " + Math.floor(mutationRate * 100) + "%";

		System.out.println(statstext);

	}
}
