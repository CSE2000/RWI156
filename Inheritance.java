package Oops;

class Grandfather{
    Grandfather() {
    	System.out.println("GrandFather");
	}
}

class Father extends Grandfather{
	Father(){
		System.out.println("Father");
	}
	
}

class Son extends Grandfather{
	Son(){
		System.out.println("Father");
	}
	
}


public class Inheritance {
	public static void main(String[] args) {
		Son f1 = new Son();
		
	}
	

}
