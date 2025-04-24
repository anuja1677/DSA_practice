import java.util.*;
class Palindrom{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int rev_num = f(num,0);
		System.out.println(rev_num);
		if(rev_num == num){
			System.out.println("number is Palindrom");
		}
		else{
			System.out.println("number is not Palindrom");

		}
		
	}
	static int f(int num,int rev_num){
		if(num == 0){
			return rev_num;
		}
		int rev = num%10;
		rev_num = rev_num*10+rev;
		num = num/10;
		
		return f(num,rev_num);
	}
}