package stringtask;

public class Reversestring {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="dad";//1234567,//0123456
		String re="";
		
		int len=m.length();//here using length method//7
		for(int i=len-1;i>=0;i--)//
		{
			re=re+m.charAt(i);//here gaine the reverse order marolix//xiloram
			
		}
		System.out.println("reverse string:"+" "+re);
		if(m.equals(re))
		{
			System.out.println(m+"palindrome");
			
			
		}
		else
		{
			System.out.println(m+"not palindrome");
		}

	}
	}



