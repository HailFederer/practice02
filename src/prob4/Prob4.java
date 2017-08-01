package prob4;
public class Prob4 {

	public static void main(String[] args) {
		
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		
		/*char[] ori_Array = str.toCharArray();
		
		char[] rev_Array = new char[ori_Array.length];
		
		for(int i=0; i<ori_Array.length; i++){
			rev_Array[i] = ori_Array[ori_Array.length-1-i];
		}*/
		
		char[] rev_Array = new char[str.length()];
		
		for(int i=0; i<str.length(); i++){
			rev_Array[i] = str.charAt(str.length()-i-1);
		}
		
		return rev_Array;
	}

	public static void printCharArray(char[] array){
		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
