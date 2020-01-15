package com.nasee.encapsul;

public class MemberClassExample {

	public static void main(String[] args) {
		BusStand bs = new BusStand();
		BusStand.Bus b = bs.new Bus();
		b.driver("Mike");
	}

}


class BusStand{
	class Bus{
		void driver(String name){
			System.out.println("Hello, I'm a driver. My name is : "+name);
		}
	}	
}
