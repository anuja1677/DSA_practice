class Array{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		int new_arr[] = arr;
		f(arr,0,arr.length-1);
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
		if(arr == new_arr){
			f(arr,0,arr.length-1);
		}
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	static void f(int arr[],int s,int e){
		if(s == e){
			return;
		}
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
		f(arr,s+1,e-1);
	}
}