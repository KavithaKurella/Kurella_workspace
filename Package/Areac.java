package package1;

public class Areac {
	float area;
	float r;
	
	area(float x){
		float r=x;
	}
	
	void area(){
		area=3.14*r*r;
		System.out.println(area);
	}
	public static void main(String[] args){
		area a=new area(2.17);
		a.area();
	}
	}
