package king;
import java.lang.*;
import java.util.*;
public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner abi = new Scanner(System.in);
		int a=abi.nextInt();   // value of a from user
		int b=abi.nextInt();   // value of b from user
		
		System.out.println(a|b);   //BITWISE OR
		System.out.println(a&b);   //BITWISE AND
		System.out.println(a^b);    //BITWISE XOR
		System.out.println(~b);       //BITWISE NOT
		System.out.println(~a);         //BITWISE NOT
		System.out.println(1>>a);      //RIGHT SWIFT BY 1 BIT
		System.out.println(a<<2);      //LEFT SWIFT BY 2 BITS
		
	}

}
