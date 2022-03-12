
public class TestGradeMethod {

	public static void main(String[] args) {
		
		double[] grades = new double[5];
		grades[0] = 100;
		grades[1] = 100;
		grades[2] = 100;
		grades[3] = 100;
		grades[4] = 89;
		
		System.out.println(myGradeAverage(grades)); }
	
	
	private static double myGradeAverage(double [] grades) {				
		double average = 0;
		for (double grade : grades) {
		average += grade; }
		return average / grades.length; }
	
	
	
	
	
	
	
}
