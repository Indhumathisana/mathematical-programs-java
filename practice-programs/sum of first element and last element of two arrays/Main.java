import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int p[]=new int[a];
		int q[]=new int[b];
		
		for(int i=0;i<p.length;i++){
		    p[i]=sc.nextInt();
		}
		for(int j=0;j<q.length;j++){
		    q[j]=sc.nextInt();
		}
		int f=1;
		for(int i=0;i<p.length;i++){
		for(int j=q.length-1;j>=0;j--){
		 
		      System.out.print(p[i]+q[j]);
		      f=0;
		    if(f==0){
		        i++;
		    }
		    }
		}
		}
		
	}
