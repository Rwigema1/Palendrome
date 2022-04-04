import java.util.*;

class Palindrom{
	public static void main(String[] args) {
		
		Scanner injiza=new Scanner(System.in);
		bination binobj=new bination();

		int number;
		String bin;
		
		System.out.println("Type in the number you want to check!");
		 
		number=injiza.nextInt();
		
		bin=binobj.giraBinary(number);
		
		String reversed=binobj.curikaBinary(bin);
		
		if (bin.equals(reversed)) {
			
		System.out.println(" \n the Binary value of "+number+" is "+bin+". and it's reverse form is "+reversed+" so it is a Palindrome");
		}
		else{
			System.out.println("the binary"+number+" is not a Palindrome. because it's binary value is "+bin+" and its's reverse value is "+reversed);


	}
}
}
 

 class bination{
 	
 	public String giraBinary(int number){
 		return Integer.toBinaryString(number);
 	}
 	
 	public String curikaBinary(String rev){

		StringBuilder stb=new StringBuilder(rev);
		stb.reverse();
		return stb.toString();
 	}
 }