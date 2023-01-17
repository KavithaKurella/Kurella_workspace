package my;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		String[][] str={{"Peter","Simond","Edgar"},{"Harry","Mathew","Stephen"},{"Jason","Erric","Jasmin"}};
		       for(String[] s:str){
			       for(String a:s){
				if(a.equals ("Simond")||a.equals("Erric")){
					System.out.print(a);
				}
			}
		}
		

	}

}
