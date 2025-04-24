import java.util.*;
class division{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		f(num,1);
	}
	static void f(int num , int i){
		if(num == i){
			return;
		}
		if(num%i == 0){
			System.out.println(i);
		}
		i++;
		f(num,i);
	}
	
}