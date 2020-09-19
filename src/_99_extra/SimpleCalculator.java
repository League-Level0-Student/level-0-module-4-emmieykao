package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String n=JOptionPane.showInputDialog(null, "Give me a number.");
String m=JOptionPane.showInputDialog(null, "Now give me another number.");
int x=Integer.parseInt(n);
int y=Integer.parseInt(m);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Should I add, subtract, multiply, or divide them?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==0) {
	Add(x,y);
}
else if (operation==1) {
	subtract(x,y);
}
else if (operation==2) {
	multiply(x,y);
}
else if (operation==3) {
	divide(x,y);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void Add(double x, double y) {
	double z=x+y;
	JOptionPane.showMessageDialog(null, x + " + " + y + " = " + z);
}
	// 4. Create similar methods for subtraction, multiplication and division.
static void subtract(double x, double y) {
	double q=x-y;
	JOptionPane.showMessageDialog(null, x + " - " + y + " = " + q);
}
static void multiply(double x, double y) {
	double w=x*y;
	JOptionPane.showMessageDialog(null, x + " • " + y + " = " + w);
}
static void divide(double x, double y) {
	double e=x/y;
	JOptionPane.showMessageDialog(null, x + " ÷ " + y + " = " + e);
}
}