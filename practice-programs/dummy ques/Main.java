import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]= new int[5];
        int n=0,x,y,z;
        //boolean =z; 
        for(int i=0;i<a.length-1;i++){
            x=a[i];
            y=a[i+1];
            z=(x>y)?(n=a[i+1]):(n=a[i]);
        }
        System.out.println(n);
        
    }
}