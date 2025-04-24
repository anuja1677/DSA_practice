import java.util.*;
class Amstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count = length(num,0);
		System.out.println(count);
		int Ams_num = f(num,count,0);
		System.out.println(Ams_num);
		if(num == Ams_num){
			System.out.println("num is Amstrong");
		}else{
			System.out.println("num not is Amstrong");

		}
	}
	static int length(int num , int count){
		if(num == 0){
			return count;
		}
		num = num/10;
		count = count+1;
		return length(num,count);
	}
	static int f(int num , int count, int n){
		if(num == n){
			return n;
		}
		int rev = num%10;
		n = n+rev*count;
		return f(num,count,n);		  
	}
}