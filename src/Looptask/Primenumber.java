package Looptask;

public class Primenumber {
	
	private static final String Break = null;

	public static void main(String[] args) {
		
		int num = 282;
		Boolean isPrime= true; {
			
		for(int i=2;i<=num/2;++i){
			 if(num%i==0) {
			isPrime = false;
			break;
			 }
			}
		}
		if(isPrime){
        System.out.println(num+ "is a prime number.");
		}
		else{
        System.out.println(num+ "is not a prime number.");
		}
		}
        }

