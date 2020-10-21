import java.util.Scanner;

public class GradeAvg
{
    public static void main(String args[])
    {
    	
        int grades[] = new int[3];
        int i;
        float total=0, avg;
	int LOWEST_GRADE  = 0;
	int HIGHEST_GRADE = 100;
	System.out.println("Enter Grades of 3 students");
        Scanner scanner = new Scanner(System.in);	
        
        for(i=0; i<3; i++) 
	{ 
           System.out.print("Enter grades of Students"+(i+1)+":");
           grades[i] = scanner.nextInt();
	   if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE))
	   {
           	total = total + grades[i];
           }
	   else
	   {
		system.out.println("Invalid Try again");
	    }
	}
        scanner.close();
        avg = total/3;
        System.out.print("The average Grade is: "+avg);
        
    }
}