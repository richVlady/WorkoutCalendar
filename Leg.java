// CSP Creative Task
// Ayma Majeed
// Create a Calender that provides information about a generated workout scedual 
// uses files (WorkoutRunner, Workout)
// Leg File

public class Leg extends Workout
{
  private String exersise;
  
  // contrstructor and generator of workout
  public Leg(int weeks, boolean rest)
  {
    super (weeks,rest);
    
    int temp = (int) (Math.random()*3);
    
    if (temp == 0)
      exersise = "Sqaut";
    if (temp == 1)
      exersise = "Bulgarian Split Squat";
    if (temp == 2)
      exersise = "Lundge";
  }
  
  // returns the generated exersise
  public String exersise()
  {
    return exersise;
  }
  
    // to string to show what type of object this is
  public String toString()
  {
    return "Leg";
  }
}
  
      
    
    