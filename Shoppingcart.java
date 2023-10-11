package Oops;


import java.util.ArrayList;
import java.util.Scanner;

	public class Shoppingcart {
		
		ArrayList<String> items = new ArrayList<String>();
			
		public ArrayList<String> getItems() {
			return items;
		}

		public void addItems(String name) {
			items.add(name);
		}
		
		public void removeItems(int number) {
			items.remove(number);		
		}
		
		public void showItems() {
			System.out.println(items);
		}

		public static void main(String[] args) {
			Shoppingcart sc = new Shoppingcart();
			Scanner sct = new Scanner(System.in);
//			sc.addItems(sct.nextLine());
//			sc.addItems(sct.nextLine());
//			sc.addItems(sct.nextLine());
			
			sc.addItems("Mobile Phone");
			sc.addItems("Earphones");
			sc.addItems("Laptop");
			
			//sc.showItems();
			System.out.println(sc.getItems());
			
//			sc.removeItems(sct.nextInt());
			
			//sc.showItems();
			
			
		}

}
