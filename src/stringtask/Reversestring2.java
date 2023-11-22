package stringtask;

public class Reversestring2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="Ee Nagaraniki Emaindhi";
		String[]sp=p.split(" ");//here split mutiple parts where space occured
		
		String rev="";
		
		for(String w:sp)
		{
		String 	reverse =" ";
		
		for(int i=w.length()-1;i>=0;i--)
		{
			reverse=reverse+w.charAt(i);
		}
		rev=rev+reverse+" ";
		}
		System.out.println(rev);
	}

}


