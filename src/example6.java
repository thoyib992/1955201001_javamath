/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class example6 {
    public static void main(String[] args) {
          int i=50;  
        int j=0;  
        int data;  
        try  
        {  
        data=i/j; //may throw exception   
        }  
            // handling the exception  
        catch(Exception e)  
        {  
             // resolving the exception in catch block  
            System.out.println(i/(j+2));  
        }  
    }
}
