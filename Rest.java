// CSP Creative Task
// Ayma Majeed
// Create a Calender that provides information about a generated workout scedual 
// uses files (WorkoutRunner, Workout)
// Rest File

public class Rest extends Workout
{
  private String exersise;
  
  // contrstructor and generator of workout
  public Rest(int weeks, boolean rest)
  {
    super (weeks, rest);
    
    exersise = "Relax and Rest";
  }
  
    // to string to show what type of object this is
  public String toString()
  {
    return "Rest";
  }
}