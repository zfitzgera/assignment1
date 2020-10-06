This assignment is in Canvas as Assignment1. Therefore, the root directory of this project is Assignment1. However, the specs require a package named cse360assignment02, so there is some ambiguity here.

Also, I thought it would be more informative to complete this project with command line only. Therefore, some of Eclipse's auto-generated files won't exist in the repo.

A test case program named TestCase.java exists in the src directory. Simply, it imports the AddingMachine class from the cse360assignment02 package, creates an instance of it, adds 4, subtracts 2, adds 5, then displays this history of these opperations.

To compile the AddingMachine class, simply run the following command while in the assignment1 directory:
	javac -d bin src/cse360assignment02/AddingMachine.java

To compile TestCase.java, run the following:
	javac -cp bin -d bin src/TestCase.java

To run the test case program, navigate to the bin directory (cd bin), then run the following command:
	java TestCase
