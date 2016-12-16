/**
 * 
 */
package primeNumbers;

import java.util.Scanner;

/**
 * @author d.anderson2
 *
 */
public class primeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner userInput = new Scanner(System.in);
   
        
        boolean Prime;
	    int userNum;
		
		System.out.print("What is your number? ");
    	userNum = userInput.nextInt();
		
		Prime = isPrime(userNum);
		
		if(Prime == false){
			System.out.print(userNum + " is not a Prime Number");
		}
		
		if(Prime == true){
			System.out.print(userNum + " is a Prime Number");
		}
         
																	   	
    	
             userInput.close();
        }
	
	
	
	/**
	 *
	 * @param isPrime
	 * @return 
	 */
     
	public static boolean isPrime(int userNum){
		
		
		boolean prime = true;
		
		for(int i = 2; prime && i <= Math.sqrt(userNum); i++){
			if(userNum % i == 0){
				prime = false;
			}
	        	
		}
		return prime;
		
	}
	  
}
		
	

	
	

