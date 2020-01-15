package com.nasee.encapsul;

public class AnonymousClassExample {

	public static void main(String[] args) {
		new Object(){
			void Lifecycle(String message){
				System.out.println(message);
			}
		}.Lifecycle("Final stage");
		
	}

	
}

/*class Butterfly{
	void Lifecycle(String message){
		System.out.println(message);
	}
}*/