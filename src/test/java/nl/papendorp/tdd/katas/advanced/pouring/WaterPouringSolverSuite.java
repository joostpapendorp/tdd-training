package nl.papendorp.tdd.katas.advanced.pouring;

import org.junit.jupiter.api.DisplayName;

@DisplayName( "Water pouring solving" )
class WaterPouringSolverSuite
{
	/*
	 * solve the water pouring problem
	 * https://en.wikipedia.org/wiki/Water_pouring_puzzle
	 *
	 * Create a solver that takes two arguments:
	 *  - a tray containing any number of glasses, numbered 1..n with a maximum capacity in liters for each.
	 *  - a desired quantity in liters between 0 and the capacity of the largest glass
	 *
	 * A solution is a series of steps, leading to (at least) one glass containing the desired capacity.
	 * Each of these steps can be any of the following:
	 *  -> Fill glass --> fills the glass to full capacity
	 *  -> Empty glass --> empties the glass
	 *  -> Pour from a into b --> pours liquid from the a-glass into the b-glass. Pouring is either the amount until
	 *  the into-glass reaches full capacity or until the from-glass is empty.
	 *
	 * The solver results in the solution that contains the least amount of steps.
	 */
}
