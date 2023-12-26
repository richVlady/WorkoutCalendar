// CSP Creative Task
// Ayma Majeed
// Create a Calender that provides information about a generated workout scedual 
// uses files (WorkoutRunner, Legs, Chest, Back)
// Workout (main) file

import java.util.ArrayList;
import java.util.Scanner;

public class Workout
{
  private Workout[][] calendar;
  private int numWeeks, stopper;
  private boolean restDay;
  private static String[] days = {"\tMonday", "\tTuesday", "\tWendsday", "\tThursday", "\tFriday", "\tSaturday", "\tSunday"};
  
  //constructors reads in how many weeks and if they want a rest day.
  public Workout (int weeks, boolean rest)
  {
    calendar = new Workout[weeks][7];
    numWeeks = weeks;
    restDay = rest;
    stopper = 7;
  }
  
  // allow the user to enter in what they did on specifc days
  public Workout[][] makeCalender()
  {
    // prints instructions for user to make method work
    Scanner scan = new Scanner(System.in);
    System.out.println("\nEnter which muscle group you want to exersise on each day.");
    System.out.println("\tLegs = \"L\"  Chest = \"C\"  Back = \"B\"");
    
    // sets every saturday to rest if rest is true
    if (restDay == true)
    {
      stopper = 6;
      for (int row = 0; row < calendar.length; row++)
        calendar[row][6] = new Rest(numWeeks, restDay);
    }
    
    // set the values in the calendar to whatever muscle the user wants to hit.
    for (int row = 0; row < calendar.length; row++)
    {
      System.out.println("Week: " + (row+1));
      for (int col = 0; col < stopper; col++)
      {
        System.out.println(days[col]);
          
        String str = scan.next();
        while (!str.equalsIgnoreCase("L") && !str.equalsIgnoreCase("C") && !str.equalsIgnoreCase("B"))
        {
          System.out.println("Enter either \"L\" \"C\" \"B\"");
          str = scan.next();
        }
        
        if (str.equalsIgnoreCase("L"))
          calendar[row][col] = new Leg(numWeeks, restDay);
        if (str.equalsIgnoreCase("C"))
          calendar[row][col] = new Chest(numWeeks, restDay);
        if (str.equalsIgnoreCase("B"))
          calendar[row][col] = new Back(numWeeks, restDay);
      }
    }
    return calendar;
  }
  
  
  // Mehtod used to allow the user to call which muscle day will print.
  // based on parameter to call either leg,chest,back
  public void getExersise(String muscle)
  {
    int count = 0;
    String day = "";
    
    if (muscle.equalsIgnoreCase("chest"))
    {
        System.out.println("\n-----------------------------------");
        System.out.println("Focus on squeezing your chest.");
    }
    else if (muscle.equalsIgnoreCase("leg"))
    {
        System.out.println("\n-----------------------------------");
        System.out.println("Go to full depth on all exercises.");
    }
    else
    {
        System.out.println("\n-----------------------------------");
        System.out.println("Take your time and control the eccentric portion of the lift.");
    }  
        
    
    for (int row = 0; row < calendar.length; row++)
    {
      System.out.print("-----------------------------------");
      System.out.print("\nWeek: " + (row+1));
      count = 0;
      for (int col = 0; col < calendar[row].length; col++)
        if (calendar[row][col].toString().equalsIgnoreCase(muscle))
    {
        day = days[col];
        
      System.out.print("\n" + day + " - " + calendar[row][col].exersise());
      count++;
      }
      if (count == 0)
        System.out.print("\n\tYou have no " + muscle.toUpperCase() + " days this week. ADD SOME\n");
      else if (count > 3)
        System.out.print("\nWOW, you're working your " + muscle.toUpperCase() + " a lot this week. Recover Well.\n");
      else if (count < 2)
        System.out.print("\nYou should add at least one more " + muscle.toUpperCase() + " day.\n");
      else
        System.out.print("\nPerect amout of " + muscle.toUpperCase() + " days.\n");
      
    }
    System.out.println("-----------------------------------\n");
  }
    
  
  // makes the method "exersise" polymorphic
  public String exersise()
  {
    return "Relax";
  }
  
  // tostring which prints out the entire calendar.
  public String toString()
  {
    String str = "", day = "";
    
    for (int row = 0; row < calendar.length; row++)
    {
      str += "\n\n*****\tWeek: " + (row+1) + "\t*****";
      for (int col = 0; col < calendar[row].length; col++)
      {
        if (col == 0)
          day = "Monday";
        if (col == 1)
          day = "Tuesday";
        if (col == 2)
          day = "Wensday";
        if (col == 3)
          day = "Thursday";
        if (col == 4)
          day = "Friday";
        if (col == 5)
          day = "Saturday";
        if (col == 6) 
          day = "Sunday";
        
        str += "\n" + day + ": " + calendar[row][col].toString() + "(" + calendar[row][col].exersise() + ")";
      }
    }
     return str; 
  }
}
  
  
  
  
    
  
  
  