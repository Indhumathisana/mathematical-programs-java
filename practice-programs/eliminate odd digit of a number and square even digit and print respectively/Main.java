import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int [n-1];
		int temp=n,x, sq=0, num=0,count=0;
		while(n>0){
		    x=n%10;
		    if(x%2==0){
            sq=x*x;
               count++; }
               a[count]=sq;
            n=n/10;
}
for(int i=count;i>0;i--){
    System.out.print(a[i]);
}
}}