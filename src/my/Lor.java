package my;

public class Lor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str={{"car","Truck","Lorry"},{"Bike","Scooter"}};
		outer:
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{	
				
			
				if(str.equals("Lorry"))
				{
				   break outer;
				}
				
			}
				  
			
		}
		}
	}

