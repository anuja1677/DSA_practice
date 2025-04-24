import java.util.*;
class Multi{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int multi = f(num,1);
		System.out.println(multi);
	}
	static int f(int num,int multi){
		if(num == 0){
			return multi;
		}
		int rev = num%10;
		num = num/10;
		multi = multi*rev;
		return f(num,multi);
	}
}