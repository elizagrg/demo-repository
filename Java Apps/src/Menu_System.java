/**
 * 
 */

/**
 * @author Utilizator
 *
 */
import java.util.Scanner;
public class Menu_System {
	public static Scanner in = new Scanner(System.in); 
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 int n = 100; 
		  
	        
	        for (int i=1; i<=n; i++)                                  
	        { 
	            if (i%15==0)                                                  
	                System.out.print("FizzBuzz"+" ");  
	            // if number is a multiple of 3 and 5  print 'FizzBuzz' instead of the number itself
	          
	            else if (i%5==0)      
	                System.out.print("Buzz"+" ");  
	  
	            // if the number is a multiple of 5, print 'Buzz' instead of the number itself
	
	            else if (i%3==0)      
	                System.out.print("Fizz"+" ");  
	  
	            // if the number is a multiple of 3, print 'Fizz' instead of the number itself
	           
	            else // print the numbers 
	                System.out.print(i+" ");                          
	        } 
	    } 
	} 

	
	






