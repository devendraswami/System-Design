// Eager way to create Singleton object  

// But one disadvante of eager way is that when no one calls the getCake() then their is loss of memory (No one needs object )

  
public class Cake { 

 private static Cake cake = new Cake();  
 
 private Cake() {
      
  } 


  public static Cake getCake() {
      return cake;
  }

    
}
