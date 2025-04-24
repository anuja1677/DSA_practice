import java.util.*;
class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean Prime_num =f(num,1,0);
		System.out.println(Prime_num);
		}
	static boolean f(int num,int i,int count){
		if(num < i){
			if(count == 2){
				return true;
			}
			return false;
		}
		if(num%i == 0){
			count++;
			
		}
		i++;
		return f(num,i,count);
	}
}