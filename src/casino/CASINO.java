/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class CASINO {

    public static ArrayList<GeneralUser> userList = new ArrayList();
    public static int currentUserIndex = 0;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //while(true){
        //System.out.println((int)(Math.random()*4));
        //}
        loadFile("GeneralUsers.txt",userList);
        for(int i = 0 ; i < userList.size() ; i ++ ){
        
        System.out.print(userList.get(i).getName()+" ");
        
    }
        
        
        //java.awt.EventQueue.invokeLater(() -> {
            new SignUp().setVisible(true);
        //});
        
        
        
        
    }
    
    public static void loadFile(String filename, ArrayList tempList ) {
String temp = "";
try {
BufferedReader file = new BufferedReader(new FileReader(filename));
while (file.ready()) {
temp = file.readLine();
String tempArray[] = temp.split(",");


tempList.add( new GeneralUser(  tempArray[0], Integer.parseInt(tempArray[1]), Integer.parseInt(tempArray[2]), Double.parseDouble(tempArray[3]), Double.parseDouble(tempArray[4]), Double.parseDouble(tempArray[5]), tempArray[6], tempArray[7], tempArray[8], Integer.parseInt(tempArray[9])  ));

}
} catch (IOException e) {
System.out.println(e);
}

}//end loadFile

public static void saveFile(String filename, ArrayList <GeneralUser> tempList ) {
try {
PrintWriter file = new PrintWriter(new FileWriter(filename));

for (int i = 0; i < tempList.size(); i++) {
//the next lines are customized for whatever data you are getting.
String toSave ="";
toSave = tempList.get(i).getName();
toSave +="," + tempList.get(i).getIncome();
toSave += "," + tempList.get(i).getAge();
toSave +="," + tempList.get(i).getBalance();
toSave +="," + tempList.get(i).weight;
toSave +="," + tempList.get(i).height;
toSave +="," + tempList.get(i).gender;
toSave +="," + tempList.get(i).getUsername();
toSave +="," + tempList.get(i).getPassword();
toSave +="," + tempList.get(i).gamesPlayed;



file.println(toSave);

}
file.close();
} catch (IOException ex) {
System.out.println(ex.toString());
}

}//end saveFile

public static int getIndexFromUsername(String u){
    int index = 0;
    for(int i = 0 ; i < userList.size() ; i ++ ){
        
        if(u.equalsIgnoreCase(userList.get(i).getName())){
            index = i;
        }
        
           
    }
        return index;
    
    
}

    
    
}//end MAIN class


