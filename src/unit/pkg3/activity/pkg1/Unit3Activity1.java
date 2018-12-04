/*
 * Kaia Mac
 * 
 * November 29th, 2018
 */

package unit.pkg3.activity.pkg1;
import javax.swing.*;
/**
 *
 * @author kamac8665
 */
public class Unit3Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String myInput;
        int valid = 1;
        boolean next = false;
        int error;
        int val;
while (valid == 1)
{          
        try
        {
            myInput = JOptionPane.showInputDialog("Please input a string with more than 6 charaters");
            
            if(myInput.length() >= 6){
                System.out.println("Stage 2");
                valid = 2;
                error = 0;
            }
            else{
                System.err.println("You must use a string");
                valid = 1;
                error = 1;
            }
        }    
        
        catch (Exception ae)
        {    
                    if (myInput.length() < 6 && error == 1){
                        System.err.println("You must enter a string longer than 6 characters");
                        System.err.println("Exception: " + ae);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + ae);
                    }
        } 
}
            
while (valid == 2)
{
        try
        {
            myInput = JOptionPane.showInputDialog("Please input a string that cntains atleast one lowecase 'a'");
            
            if(myInput.contains("a")){
                System.out.println("Stage 3");
                valid = 3;
                error = 0;
            }
            else{
                System.err.println("You must use a string");
                valid = 2;
                error = 1;
            }
        }
          catch (Exception e)
        {    
                    if (error == 1){
                        System.err.println("You must enter a string with atleast one lowercase 'a'");
                        System.err.println("Exception: " + e);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + e);
                    }
        } 
        
}   

while (valid == 3)            
{
        try
        {
            myInput = JOptionPane.showInputDialog("Please input a string that is between 5 and 15 characters long and does not contain the letter 'z'");
            myInput = myInput.replace("z", "1");
            if(myInput.contains("1") && myInput.length() < 5 && myInput.length() > 15){
                
                System.err.println("You must use a string");
                valid = 3;
                error = 1;
            }
            else{
                System.out.println("Stage 4");
                valid = 4;
                error = 0;
            }
        }
          catch (Exception be)
        {    
                    if (error == 1){
                        System.err.println("You must enter a string that is between 5 and 15 characters long and does not contain the letter 'z'");
                        System.err.println("Exception: " + be);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + be);
                    }
        } 
}
          
while (valid == 4)
{
        try
        {
            myInput = JOptionPane.showInputDialog("Please input an integer between 5 and 500");
            val = Integer.parseInt(myInput());
            
            if(val >= 5 && val <= 500){
                System.out.println("Stage 5");
                valid = 5;
                error = 0;
            }
            else{
                System.err.println("You must use a number");
                valid = 4;
                error = 1;
            }
        }
          catch (Exception le)
        {    
                    if (error == 1){
                        System.err.println("Please input an integer between 5 and 500");
                        System.err.println("Exception: " + le);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + le);
                    }
        } 
        
}             
            
while (valid == 5)
{
        try
        {
            myInput = JOptionPane.showInputDialog("Please input a negative integer");
            val = Integer.parseInt(myInput());
            
            if(val < 0){
                System.out.println("Stage 6");
                valid = 6;
                error = 0;
            }
            else{
                System.err.println("You must use a number");
                valid = 5;
                error = 1;
            }
        }
          catch (Exception ye)
        {    
                    if (error == 1){
                        System.err.println("Please input an integer between 5 and 500");
                        System.err.println("Exception: " + ye);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + ye);
                    }
        } 
        
}            
            
while (valid == 6)
{
        try
        {
            myInput = JOptionPane.showInputDialog("Please enter a positive, odd integer");
            val = Integer.parseInt(myInput());
            if(val >=0 ){
                System.out.println("DONE");
                valid = 7;
                error = 0;
            }
            else{
                System.err.println("You must use a number");
                valid = 6;
                error = 1;
            }
        }
          catch (Exception ue)
        {    
                    if (error == 1){
                        System.err.println("Please input a positive, odd integer");
                        System.err.println("Exception: " + ue);
                    }
                    else{
                        System.err.println("You must use a string");
                        System.err.println("Exception: " + ue);
                    }
        } 
        
}

while (valid == 7)
{
    System.out.println("CONGRATS!");
        
}



























            
        }    
        
    }
    
