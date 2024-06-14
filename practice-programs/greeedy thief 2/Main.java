// not all testcase passed ,just saving the try

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		int x=1;
		for(int i=1;i<=n;i++){
		      x=1;
		    for(int j=1;j<=i;j++){
		      x=x*j;  
		    }
		        a[i-1]=x;
		    }
		    
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            if(a[i]+a[j]==n){
		                System.out.println((i+1)+" "+(j+1));
		            }
		        }
		    }
		}
	}
	 // here only 1 , 2 passed for testcase 3 check greedy thief 2 HR soln
	       
	// test case:1   i/p: 10  o/p:3 2    
	// test case:2   i/p: 7  o/p:3 1  
	// test case:3   i/p: 30  o/p:3 2 2    


