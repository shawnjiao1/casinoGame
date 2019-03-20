
package casino;
import java.util.ArrayList;

public class GeneralUser extends User {
     
     private String name;
     private int income;
     private int age;
     public double balance;
     public double weight;
     public double height;
     public String gender;
     public int gamesPlayed;
     public double openingBalance;
     
     
     public GeneralUser(String name, String pass){
         super(name,pass);
     }
     
     public GeneralUser(String name, int income, int age, double balance, double weight, double height, String gender, String user, String pass, int gamesPlayed){
        
         super(user,pass);
         this.name = name;
         this.income = income;
         this.age = age;
         this.balance = balance;
         this.weight = weight;
         this.height = height;
         this.gender = gender;
         this.gamesPlayed = gamesPlayed;
         this.openingBalance = this.balance;       
                 
         
     }
     
     public String getName(){
         return this.name;
     }
     
     public int getIncome(){
         return this.income;
     }
     
     public int getAge(){
         return this.age;
     }
     
     public double getBalance(){
         return this.balance;
     }
     
             
}
