package Oops;

class Train {

		String pname;
		boolean bookingconfirmation;
		String from;
		String to;
		float distancetocovered;

	    Train (String pname,boolean bookingconfirmation,String from,String to,float distancetocovered) {
			
			System.out.println("My journey starts");
			
			this.pname = pname;
			this.bookingconfirmation = bookingconfirmation;
			this.from = from;
			this.to = to;
			this.distancetocovered = distancetocovered;
		}

		Train () {
		pname = "Krishna";
		bookingconfirmation = true;
		from = "Delhi";
		to = "kanpur";
		distancetocovered = 800.35f;
		}
	}

public class Passenger{

		public static void main(String[] args) {
			
			Train p1 = new Train("Krishna",true,"Delhi","Kanpur",800.35f);
	        
	        System.out.println("pname = "+p1.pname);
			System.out.println("bookingconfirmation = "+p1.bookingconfirmation);
			System.out.println("from = "+p1.from);
			System.out.println("to = "+p1.to);
			System.out.println("distancetocovered = "+p1.distancetocovered);

	       Train p2 = new Train("Shubham Pandey",true, "Kanpur", "Gorakhpur", 500.36f);
	        
	        System.out.println("pname = "+p2.pname);
			System.out.println("bookingconfirmation = "+p2.bookingconfirmation);
			System.out.println("from = "+p2.from);
			System.out.println("to = "+p2.to);
			System.out.println("distancetocovered = "+p2.distancetocovered);

			System.out.println("My journey ends");
		}
}
