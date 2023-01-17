package my;

public class Larnsma {
	public static void main(String args){
		int[] arr=new int[]{12,34,14,33,22,11,19,45,61};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(i>arr[0]){
				arr[i]=largest;
			}
			else{
				arr[i]=smallest;
			}
		}
		
	}

}
