import java.util.Scanner;
public class TwoHighestScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many students?");
		int studentNumber = scan.nextInt();
		
		int i = 0;
		String studentName = "";
		double studentScore = 0.0;
		double max= 0.0;
		double max2= 0.0;
		
		while(i < studentNumber)
		{
			System.out.println("What is the student's name? ");
			studentName = scan.next();
			System.out.println("What are the student's score?");
			studentScore = scan.nextDouble();
			

			if(studentScore >= max)
			{
				max2 = max;
				max = studentScore;
			}
			else if(studentScore> max2)
				{
					max2 = studentScore;
				}						
			i++;
		}
		System.out.println("The highest score is " + max);
		System.out.println("The second-highest score is " + max2);		

	}
}
