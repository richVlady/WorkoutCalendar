// CSP Creative Task
// Ayma Majeed
// Create a Calender that provides information about a generated workout scedual 
// uses files (Workout, WorkoutRunner)
// Legs File

public class Back extends Workout
{
  private String exersise;
  
  // contrstructor and generator of workout
  public Back(int weeks, boolean rest)
  {
    super (weeks,rest);
    
    int temp = (int) (Math.random()*3);
    
    if (temp == 0)
      exersise = "Bent-Over Row";
    if (temp == 1)
      exersise = "Lat Pull-Down";
    if (temp == 2)
      exersise = "Shrug";
  }
  
  // returns the generated exersise
  public String exersise()
  {
    return exersise;
  }
  
  // to string to show what type of object this is
  public String toString()
  {
    return "Back";
  }
}