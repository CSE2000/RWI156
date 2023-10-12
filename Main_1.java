package Oops;

public class Main_1 {

		public static String shop(double amt)
		{
			System.out.println("welome to shop");
			return "pen";
		}

		public static void main(String[] args)
		{
			System.out.println("you are main method");
			String cover  =  shop (500.78);
			System.out.println("cover=" + cover);
	}

}
