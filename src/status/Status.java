/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * Change the code to avoid String input and input errors 
 * then print the status details. 
 * @author srinivsi date:March 8th
 */
public class Status {
    
    enum Stats{
        ZERO,ONE,TWO,THREE;
    }
    public static void getZero(){System.out.println(Stats.ZERO);}
    public static void getOne(){System.out.println(Stats.ONE);}
    public static void getTwo(){System.out.println(Stats.TWO);}
    public static void getThree(){System.out.println(Stats.THREE);}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    Stats a = Stats.ZERO;
    Stats b = Stats.ONE;
    Stats c = Stats.TWO;
    Stats d = Stats.THREE;
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (zero,one,two,three) in string");
    String code = in.next();
    
    StausUser t= new StausUser();
    t.statusDetail(code); 
    }
    
}
