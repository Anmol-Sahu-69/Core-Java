import java.util.Scanner;
public class StringA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("===Enter your String===");
		String str=sc.nextLine();
		int len=str.length();
//		System.out.println("str : "+str.toString());
//		System.out.println("Length : "+len);
		int Vcount=0;
		int Ccount=0;
		int Ncount=0;
		int Scount=0;
		int Other=0;
		//System.out.println("The vowels in this string is : ");
		for(int i=0; i<=len-1; i++)
		{
			char ch=str.charAt(i);
			//System.out.print(ch+" ");
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				//System.out.print(ch+" ");
				//System.out.println("\n");
				Vcount++;
			}
			else if((ch>='a' ||ch<='A') && ( ch>='z' ||ch<='Z'))
			{
				
			    //System.out.print(ch+" ");
			    
			    Ccount++;
			}
			else if(ch>='0' && ch<='9')
			{
				Ncount++;
			}
			else if(ch==' ') {
				 Scount++;
			}
			else {
				Other++;
			}
		}
		System.out.println("Vcount of vowels is :"+Vcount+" ");
		System.out.println("Ccount of consonent is :"+Ccount);
		System.out.println("Ncount of number is :"+Ncount);
		System.out.println("Scount number of space: "+Scount);
		System.out.println("Ocount number of other: "+Other);
		
		sc.close();
    }
}
