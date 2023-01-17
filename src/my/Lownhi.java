package my;

public class Lownhi {
	public static void main(String args[]){
		int [] arr=new int[]{12,34,14,22,11,19,45,61};
		int temp;
		for(int i=0;i<=arr.length;i++){
			for (int j=i+1;j<=arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("Smallest:"+arr[0]);
		System.out.println("Largest:"+arr[arr.length-1]);
	}

}
