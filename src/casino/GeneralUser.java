
package casino;
import java.util.ArrayList;

public class GeneralUser extends User {
     
     private String name;
     private int income;
     private int age;
     private double balance;
     public double weight;
     public double height;
     public boolean male;
     public int[] gamesPlayed;
     
     
     
     public GeneralUser(String name, String pass){
         super(name,pass);
     }
     
     public GeneralUser(String name, int income, int age, double balance, double weight, double height, boolean male, String user, String pass){
        
         super(user,pass);
         this.name = name;
         this.income = income;
         this.age = age;
         this.balance = balance;
         this.weight = weight;
         this.height = height;
         this.male = male;
         this.gamesPlayed = new int[5];
                
                 
         
     }
             
}
