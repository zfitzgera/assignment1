package cse360assignment02;

/**
* <h1>Adding Machine</h1>
* Once initialized, a programmer can use this object as a very basic
* calculator. It performs addition and subtraction on integers.
* Furthermore, it stores a history of opperations that can be returned
* as a string by calling the object's toString() method.
* @author Zachary Fitzgerald
* @since 10/5/20
*/

public class AddingMachine
{
	//total initialized to 0. It stores computation results
	private int total;
	//history stores computation history
	private String history;
	
	public AddingMachine()
	{
		total = 0;
		//initialize history to 0, because the AddingMachine
		//starts with a value of 0
		history = "0";
	}

	/**
	* This method simply returns the current total
	* @return int The total value computed from calls to add and subtract
	*/
	public int getTotal()
	{
		return total;
	}

	/**
	* This method will add the input argument to the current total
	* and store the history of the opperation.
	* @param value integer to add to the current total
	*/
	public void add(int value)
	{
		history += " + " + value;
		total += value;
	}

	/**
	* This method will subtract the input argument from the current total
	* and store the history of the opperation.
	* @param value integer to subtract from the current total
	*/
	public void subtract(int value)
	{
		history += " - " + value;
		total -= value;
	}

	/**
	* This method will return the history of opperations as a string
	* @return String The history of opperations as a String
	*/
	public String toString()
	{
		return history;
	}

	/**
	* This method simply resets the total and clears the opperation history.
	*/
	public void clear()
	{
		total = 0;
		history = "0";
	}
}
