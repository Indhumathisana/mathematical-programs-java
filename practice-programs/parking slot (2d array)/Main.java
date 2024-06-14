import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int m=sc.nextInt();
	 int a[][]=new int[n][m];
	 for(int i=0;i<n;i++){
	     for(int j=0;j<m;j++){
	         a[i][j]=sc.nextInt();
	     }
	 }
	 int sum=0,maxrow=0;
	       int max=0;
	 for(int i=0;i<n;i++){
	       //sum=0;
	     for(int j=0;j<m;j++){
	         sum=sum+a[i][j];
	     }
	         if(sum>max){
	             max=sum;
	             maxrow=i+1;
	         }
	 }
	 System.out.println(maxrow);
	}
}


 /* 
  testcase:1
     3 3
     101100111
  
  testcase:2
     4 3
     010110100111
   
    */
