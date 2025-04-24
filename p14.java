import java.util.*;
class CountOccurance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int A = sc.nextInt();
		System.out.println("Enter a number which is multiple time occure");
		int D = sc.nextInt();
		int count = f(A,D,0);
		System.out.println(count);
	}
	static int f(int num,int digit,int count){
		if(num == 0){
			return count;
		}
		int rev  = num%10;
		if(rev == digit){
			count++;
		}
		num = num/10;
		return f(num,digit,count);
	}
}