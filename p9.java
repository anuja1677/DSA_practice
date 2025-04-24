import java.util.*;
class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		f(num);
	}
	static void f(int num){
		if(num == 0){
			return;
		}
		int rev = num%10;
		num = num/10;
		System.out.print(rev);
		f(num);
	}
}