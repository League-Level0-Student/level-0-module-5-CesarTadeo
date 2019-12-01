package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Give me any number, I will tell you if it is prime or composite");
	int num = Integer.parseInt(number);
	
	for (int i = 1; i < num; i++) {
		if (num%i == 1 || num%i == num) {
			JOptionPane.showMessageDialog(null, "Your number is prime");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is not prime it is composite");
			
		}
	}
	
}
} 
