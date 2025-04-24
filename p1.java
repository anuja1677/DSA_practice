import java.util.*;
class Numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
	f(num,0);
    }
    static void f(int sc,int count){
        if(sc == 0){
	    System.out.println(count);
            return ;
        }
        sc = sc/10;
        count++;
        f(sc,count);
        
    }
}