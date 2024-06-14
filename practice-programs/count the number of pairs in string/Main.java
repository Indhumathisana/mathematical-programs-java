import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char b[]=a.toCharArray();
		int i,j;
		char temp=0;
		int count=0;
		for( i=0;i<b.length;i++){
		   for( j=i+1;j<b.length;j++){
		    if(b[i]>b[j]){
		        temp=b[i];
		        b[i]=b[j];
		        b[j]=temp;
		    }
		   }
		        //System.out.print(b[i]+" ");
		}
	
	    for( i=0;i<b.length && (i+1)<b.length;i++){
	        if(b[i]==b[i+1]){
	            i++;
	            count++;
	        }
	    }
	        System.out.println(count);
	}
	
}