package com.test.jenkins.test_jenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	for(int i = 0; i<50; i++){
    		System.out.println( "Iteration 1" );
    		for(int j = 0; j<50; j++) {
    			System.out.println( "Iteration 1" );
    			for(int k = 0; k<50; k++){
    				System.out.println( "Iteration 1" );
    			}
    		}
    	}
        
    }
}
