

public class SystemDesign1 {
     
    // Game 

    int playerHealth ;   
    boolean ishardMode = false ;

    // This is the bad Implementation becasue here the code is repeation 

    // public void ready() {
    //       playerHealth = 100; 
    // } 

    // public void resetHealth() {
    //     playerHealth = 100; 
    // } 


    


    // Good implementation   

    // To solve the code repetation problem we can write seprate method and call it when needed 

     public void ready() {
           defaultHealth();
     } 
    
      public void resetHealth() {
         defaultHealth();
      } 

      
      public void defaultHealth() {
         
        if(ishardMode) {
            playerHealth = 50; 
        } 
        else 
          playerHealth = 100; 
      } 


    
}