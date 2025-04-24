import java.util.*;
class Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = f(num,0);
		System.out.println(sum);
	}
	static int f(int num,int sum){
		if(num == 0){
			return sum;
		}
		int rev = num%10;
		num = num/10;
		sum = sum+rev;
		return f(num,sum);
	}
}