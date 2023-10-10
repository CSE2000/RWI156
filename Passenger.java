package Oops;

public class Passenger {

		String pname;
		boolean bookingconfirmation;
		String from;
		String to;
		float distancetocovered;

	    Passenger (String pname,boolean bookingconfirmation,String from,String to,float distancetocovered) {
			
			System.out.println("My journey starts");
			
			this.pname = pname;
			this.bookingconfirmation = bookingconfirmation;
			this.from = from;
			this.to = to;
			this.distancetocovered = distancetocovered;
		}

		Passenger () {
		pname = "Krishna";
		bookingconfirmation = true;
		from = "Delhi";
		to = "kanpur";
		distancetocovered = 800.35f;
		}
	}

	class Train {

		public static void main(String[] args) {
			
			Passenger p1 = new Passenger("Krishna",true,"Delhi","Kanpur",800.35f);
	        
	        System.out.println("pname = "+p1.pname);
			System.out.println("bookingconfirmation = "+p1.bookingconfirmation);
			System.out.println("from = "+p1.from);
			System.out.println("to = "+p1.to);
			System.out.println("distancetocovered = "+p1.distancetocovered);

	        Passenger p2 = new Passenger();
	        
	        System.out.println("pname = "+p2.pname);
			System.out.println("bookingconfirmation = "+p2.bookingconfirmation);
			System.out.println("from = "+p2.from);
			System.out.println("to = "+p2.to);
			System.out.println("distancetocovered = "+p2.distancetocovered);

			System.out.println("My journey ends");
		}
}
