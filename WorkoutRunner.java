// CSP Creative Task
// Ayma Majeed
// Create a Calender that provides information about a generated workout scedual 
// uses files (Workout, Leg, Back, Chest, Rest)
// WorkoutRunner File


import java.util.Scanner;

public class WorkoutRunner 
{
  public static void main(String[]args)
  {
    Scanner scan = new Scanner(System.in);
    
    int weeks, count = 0;
    String restStr, str = "yes";
    boolean rest = false;
    Workout[][] calendar;
    
    // print directions
    System.out.println("*************************************************************************************");
    System.out.println("This prgram will create a custom workout program for you based on selected muscles.");
    System.out.println("Follow the prompts to create the workout scedual.");
    System.out.println("*************************************************************************************\n");
    
    // read in initial variables
    System.out.println("How many weeks should this calendar be?");
    weeks = scan.nextInt();
    System.out.println("Will you have a weekly rest day on Sunday? (\"yes\" or \"no\")");
    restStr = scan.next();
    
    if (restStr.equalsIgnoreCase("yes"))
      rest = true;   
    
    // create calendar using user inputs 
    Workout routine = new Workout(weeks, rest);
    
    calendar = routine.makeCalender();
    
    
    // Allow user to view what workout they will be doing eachday for a specific muscle 
    System.out.println("Which muscle would you like to view exersises for?\n\t(\"leg\" \"chest\" \"back\")");
    
    while (!str.equalsIgnoreCase("no"))
    {
      if (count != 0)
        System.out.println("Would you like to see another muscle? If so, which Muscle?\n\t(\"no\" to exit)");
      str = scan.next();
      if (!str.equalsIgnoreCase("no"))
      routine.getExersise(str);
      count++;
    }
    
    // Allow the user to say if they want to print out the full calendar.
    System.out.println("Would you like to see the entire calendar?(\"yes\" or \"no\")");
    String calA = scan.next();
    if (calA.equalsIgnoreCase("yes"));
    {
      System.out.println(routine);
    }
  }
}



