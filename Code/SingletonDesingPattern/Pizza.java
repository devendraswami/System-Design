 // Lazy way to create singleton object 

 
// Our Aim is that only one object of the class can be created 

public class Pizza {  
  
// But if it is static then user will get the direct access of the Pizza but in encapsultation we do not allow the direct access so to give controlled access make it private 
 private static  Pizza pizza; 

 // if our constructor is public than many objects can created from outside the class so first we make it private 
    private Pizza() {
       // but now no object will be created so create method to create object (Encapsulation )
    }
   
    // This is the lazy of creating pizza becasue the pizza is created when the get method is called 
   
    public synchronized static Pizza getPizza() {
        
        // But here is also one catch if the user can call the getPizza method many times so more then one object will be created 
        // Pizza pizza = new Pizza(); 
        // return pizza;  
        
         // To solve the problem of multiThreding we use synchronized keyword(one thread at a time)
        synchronized(Pizza.class) {
           if(pizza == null) {
             pizza = new Pizza(); 
              
         } 
        }
          
          return pizza;

    }

}