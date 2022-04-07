import java.util.Scanner;

public class Main{
	
	public static boolean isZero=false;
	public static String resultString="";
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int enteredNumber=scanner.nextInt();
		
		System.out.println(zeroSumOperations(enteredNumber));
	}
	
	public static String zeroSumOperations(int num) {
		
		zeroSumOperations(num,0,"");
		
		if(isZero) {
			return resultString;
		}
		
		else {
			return "not possible";
		}
	}
	
	public static void zeroSumOperations(int num, int result, String s) {
		
		if(num==0) {
			
			if(result==0) {
				isZero=true;
				resultString=s;
			}
			
			return;
		}
		
		
		String temp=""+num;
		int firstDigit=0;
		int newNumber=0;
		
		if(temp.length()==1) {
			firstDigit=Integer.parseInt(temp);
		}
		
		else if(temp.length()>1) {
			firstDigit=Integer.parseInt(temp.substring(0,1));
			newNumber=Integer.parseInt(temp.substring(1));
		}
		
		zeroSumOperations(newNumber, result+firstDigit, s+"+");
		zeroSumOperations(newNumber, result-firstDigit, s+"-");
		
	}
}
