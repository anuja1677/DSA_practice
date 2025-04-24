class SortedArray{
	public static void main(String args[]){	
		int arr[] = {1,3,2,4};
		int s =0;
		int max = 0;
		boolean check = f(arr,s,max);
		System.out.println(check);		
	}
	static boolean f(int arr[],int s,int max){
		if(s == arr.length-1){
			return true;
		}
		if(max<=arr[s]){
			return f(arr,s+1,max=arr[s]);
		}else{
			return false;
		}
		 
	}
}