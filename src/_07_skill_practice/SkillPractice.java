package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

String userCents = JOptionPane.showInputDialog("How many cents do you have, please enter a number. (ex. 7)");
int cents = Integer.parseInt(userCents);


// Tell them how many cents they have (hint multiply by 10)
int totalCents = cents * 10; 
JOptionPane.showMessageDialog(null, "Your total amount of cents is, " +totalCents+ " cents");



// Ask the user how tall they are (inches)
String userHeight = JOptionPane.showInputDialog("How tall are you in inches, please enter a number. (ex. 7");
int height = Integer.parseInt(userHeight);


// If they are shorter than 36 inches, tell them to eat their Wheaties
if (height<36) {
	JOptionPane.showMessageDialog(null, "eat your wHeAtIeS");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 1; i <= 30; i++) {
if (i%3==0) {
System.out.println(i);
}
	
	
	
}
}

void skill3() { // Get a random number that is less than 20 and print it to the console 

	Random r = new Random();
	int randomNumberLessThanTwenty = r.nextInt(20);
	System.out.println(randomNumberLessThanTwenty);
	
// Get another random number that is less than 10 and print it to the console 

	Random b = new Random();
	int randomNumberLessThanTen = b.nextInt(10);
	System.out.println(randomNumberLessThanTen);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 

int difference = randomNumberLessThanTwenty-randomNumberLessThanTen;
	
JOptionPane.showMessageDialog(null, "The difference between your numbers is, "+difference);

}

void skill4() { // In a pop-up, ask the user for the city they live in

String userCity = JOptionPane.showInputDialog("What city do you live in");

// If they answered "San Diego", tell them they live in America's Finest City 

if (userCity.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");
}

// Otherwise, tell them to move to San Diego 

else {
	JOptionPane.showMessageDialog(null, "You should move to San Diego");
}

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

int cars = 1;

// If there is 1 car, use a pop-up to display the make/model of the car 

JOptionPane.showMessageDialog(null, "My family has a Honda CRV 2019");

// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 

String userSchool = JOptionPane.showInputDialog("What school do you go to");

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 

JOptionPane.showMessageDialog(null, userSchool+ " is a fantastic school.");

}
}
