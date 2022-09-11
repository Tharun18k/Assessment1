// Importing java util libraries
import java.util.*;
/**
 * Write a description of class StudentMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentMarks
{
   /** Method to calculate standard deviation
     * @Inputs / arguments -> array, float
     * @Output / return -> double
     */
    
    public static double calculate_sd(int marks[], float mean)
    {
        double sd=0;
        
        for (int i=0; i<marks.length; i++)
        {
            //Finding sigma((student_mark-mean)^2) for Standard deviation calculation
            sd = sd + Math.pow(marks[i]-mean, 2);
        }
        
        double sd_result = Math.sqrt(sd/marks.length);
        return sd_result;
    }
    
    //Main class
    public static void main(String[] args)
    {
        //Creating Scanner class Object to read the input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Unit name:");
        String unit_name = scanner.nextLine();
        
        // Initializing an array of size 25 to store the student marks
        int student_marks[] = new int[25];
        int sum =0;
        
        //iterating through for loop to update the array with the marks of indvidual students
        for (int i=0; i<25; i++)
        {
            System.out.println("Enter Student"+ (i+1)+ ":" );
            student_marks[i] = scanner.nextInt();
            
            //validaing the marks enter by User as mark should be in the range of 0 to 100
            if(student_marks[i] < 0 || student_marks[i] >100 )
            {
                System.out.println("Invalid marks! Please re-enter a valid mark i.e, any number between 0 and 100.");
                i--;
            }
            else
            {
                //Calculating the total student marks
                sum = sum + student_marks[i];
            }
        }
        
        // printing the unit name entered by the User
        System.out.println("Unit Name is: "+unit_name);
        
        //printing each student marks
        for (int i=0; i<student_marks.length; i++)
        {
            System.out.println("Student"+ (i+1)+ " marks: "+student_marks[i]);
        }
        
        // Intializing a variable to store Highest mark
        int max_marks = student_marks[0];
        
        // Intializing a variable to store Lowest mark
        int min_marks = student_marks[0];
        
        //Iterating through marks array to get the Highest and Lowest marks
        for (int i=0; i<student_marks.length; i++)
        {
            if(student_marks[i] < min_marks){
                min_marks = student_marks[i];
            }
            
            if(student_marks[i] > max_marks){
                max_marks = student_marks[i];
            }
            
        }
        
        //Printing the Highest and lowest marks
        System.out.println("Highest Mark is: " + max_marks);
        
        System.out.println("Lowest Mark is: " + min_marks);
        
        //Calculating Mean of Students marks
        float mean = sum/student_marks.length;
        
        //Printing Mean of Marks
        System.out.println("Mean of marks is: " + mean);
        
        //Calling method to calculate standard deviation         
        double sd_result = calculate_sd(student_marks,mean);
        
        //Displaying Standard deviation
        System.out.println("Standard deviation is: " + sd_result);
        
    }
}
