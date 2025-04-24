import java.util.*;
class Divisible{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		f(num,1);
	}
	static void f(int num,int i){
		if(num < i){
			return;
		}
		if(i%3 == 0){
			System.out.print(i+" ");
		}
		f(num,i+1);
		 
	}
}