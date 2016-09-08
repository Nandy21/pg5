import java.util.Arrays;
import java.util.Scanner;

class Lex
{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner (System.in);
	String s=sc.nextLine();
	char[] a=s.toCharArray();
	Arrays.sort(a);
	String res="";
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]!=a[i+1])
		{
			res=res+a[i];
		}
	}
	int r=s.length()+res.length();
	String st=s+res;
	System.out.println(st);
	}
}
