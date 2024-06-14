import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
        int[] arr={0,1,2,6,24,120,720,5040,40320,362880};
        if(n==0)
        System.out.print(0);
	    for(int i=9;i>0;i--)
	    {
	        if(n>=arr[i])
	        {
	            System.out.print(i);
	            n=n-arr[i];
	            i=9;
	        }
	        if(n==0)
	        break;
	    }
	}
	   }
