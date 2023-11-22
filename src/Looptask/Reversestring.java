package Looptask;
//marolix =string,find length 7,for loop and use concation + each letter,and extract each
//charcter
//reverse=xiloram

public class Reversestring {
	
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			 String m="marolix";
				String re="";
				
				int len=m.length();//here using length method
				for(int i=len-1;i>=0;i--)
				{
					re=re+m.charAt(i);//here gaine the reverse order marolix
					
				}
				System.out.println("reverse string:"+" "+re);

			}


		}




