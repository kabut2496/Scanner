/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variableuses;
import java.util.Scanner;
/**
*Karl Butler
* October 1 2018
*the reson for doing this it to learn stufffff
 */
public class VariableUses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput=new Scanner(System.in);
        String name;
        int num1,num2,sum; 
        System.out.println("your favorit number");
        num1 = keyedInput.nextInt();
        System.out.println("enter your second favorit number");
        num2 = keyedInput.nextInt();
        System.out.println("enter your name");
        name=keyedInput.next();
        sum=num1+num2;
        System.out.println("the sum of " + name + " favorit numbers are "+sum);
        keyedInput.close();
    }
    
}
