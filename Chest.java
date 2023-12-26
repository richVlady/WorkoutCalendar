// CSP Creative Task
// Ayma Majeed
// Create a Calender that provides information about a generated workout scedual 
// uses files (WorkoutRunner, Workout)
// Chest File

public class Chest extends Workout
{
  private String exersise;
  
  // contrstructor and generator of workout
  public Chest(int weeks, boolean rest)
  {
    super (weeks,rest);
    
    int temp = (int) (Math.random()*3);
    
    if (temp == 0)
      exersise = "Bench Press";
    if (temp == 1)
      exersise = "Push Ups";
    if (temp == 2)
      exersise = "Chest Fly";
  }
  
  // returns the generated exersise
  public String exersise()
  {
    return exersise;
  }
  
    // to string to show what type of object this is
  public String toString()
  {
    return "Chest";
  }
}