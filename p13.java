import java.util.*;
class Power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int A = sc.nextInt();
		int multi_num = A;
		int B = sc.nextInt();
		int power = f(A,B,1,multi_num);
		System.out.println(power);
	}
	static int f(int num,int pow,int count,int multi_num){
		if(pow == count){
			return multi_num;
		}
		multi_num = multi_num*num;
		return f(num,pow,count+1,multi_num);
	}
}