public class Testing { 
    public static void main(String[] args) {
         
     // Constructor pizza is private so we can not create the object this way 
    //    Pizza pizza = new Pizza();  

          
           Pizza pizza = Pizza.getPizza();   
            System.out.println(pizza.hashCode());
           
           Pizza pizza2 = Pizza.getPizza();  
         System.out.println(pizza2.hashCode()); 
          

         Cake cake = Cake.getCake();  
         
         Cake cake1 = Cake.getCake();

         System.out.println(cake1.hashCode());
         System.out.println(cake.hashCode());
    } 


    
}
