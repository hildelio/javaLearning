package first_project_java;

import first_project_java.model.Cat;

public class firstOne {

	public static void main(String[] args) {
		int a = 5;
		int b = 18;
		System.out.println("Hello World! " + (a*b));
		
		Cat cat = new Cat();
		System.out.println(cat);
		
		Books books = new Books();
		System.out.println(books);
	}
}

class Books {
	private String name;
	private String page;
}



