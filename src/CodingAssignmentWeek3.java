public class CodingAssignmentWeek3 {

	public static void main(String[] args) {

		/*
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93.
		 */
		
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 107};
			

		/*
		 * a. Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code). Print the result to the console.
		 */
		
			System.out.println(ages[(ages.length - 1)] - ages[0]);

		/*
		 * b. Add a new age to your array and repeat the step above to ensure it is
		 * dynamic (works for arrays of different lengths). (107) 
		 * 
		 * c. Use a loop to iterate through the array and calculate the average age. 
		 * Print the result to the console.
		 */
		
			int averagegAge = 0;
			for (int age : ages) {
			averagegAge += age; }
	
			System.out.println(averagegAge / ages.length);

		/*
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */		
		
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		/*
		 * a. Use a loop to iterate through the array and calculate the average number
		 * of letters per name. Print the result to the console.
		 */	
	
			double average = 0;
			for (String name : names) {
			average += name.length(); }
	
			System.out.println(average / names.length);
	
		/*
		 * b. Use a loop to iterate through the array again and concatenate all the
		 * names together, separated by spaces, and print the result to the console.
		 */		
		
			String concatenateNames = "";
			for (String name : names) {
			concatenateNames += name + " "; }
	
			System.out.println(concatenateNames);
		
		/*
		 * 3. How do you access the last element of any array? Array[Array.length - 1];
		 * 4. How do you access the first element of any array? Array[0]
		 */

		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */		
		
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length(); }
		
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */		
		
			int nameLengthsSum = 0;
			for (int length : nameLengths) {
			nameLengthsSum += length; }
		
			System.out.println(nameLengthsSum); }
		
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		 */		
		
			private static String concatenateString(String word, int n) {
				String concatenateString = "";
				if (n > 0) {
				while (n > 0) {
				concatenateString += word; }
				n--; }					
				
				return concatenateString; }
						
		
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns
		 * a full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */		
		
			private static String createFullName(String firstName, String lastName) {
				String fullName = firstName + " " + lastName; 
				
				return fullName; }
			
		/*
		 * 9. Write a method that takes an array of int and returns true if the sum of
		 * all the ints in the array is greater than 100.
		 */				
			
			private static boolean isGreaterThan100(int[] array) {
				int sum = 0;
				for (int number : array) {
				sum += number; }
				
				return sum > 100; }
			
		/*
		 * 10. Write a method that takes an array of double and returns the average of
		 * all the elements in the array.
		 */				
				
			private static double averageArray(double[] array) {
				double sum = 0;
				for (double number : array) {
				sum += number; }	
				
				return sum / array.length; }
				
		/*
		 * 11. Write a method that takes two arrays of double and returns true if the
		 * average of the elements in the first array is greater than the average of the
		 * elements in the second array.
		 */				
				
			private static boolean greaterThanAverage(double[] array1, double[] array2) {
				double average1 = 0;
				double average2 = 0;
				for (double number : array1) {
				average1 += number; }
					
				for (double number : array2) {
					average2 += number; }
					
				return average1 / array1.length > average2 / array2.length; }
				
		/*
		 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a
		 * double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */				
				
			private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50; }
				

		/*
		 * 13. Create a method of your own that solves a problem. In comments, write
		 * what the method does and why you created it.
		 */			
					
		/*
		 * Method to calculate my current grade average to track my progress through the bootcamp:
		 */				
		
			
			private static double myGradeAverage(double [] grades) {				
				double average = 0;
				for (double grade : grades) {
				average += grade; }
				return average / grades.length; }
			
}	

			

			
			

