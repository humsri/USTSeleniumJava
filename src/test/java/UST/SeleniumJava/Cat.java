package UST.SeleniumJava;

public class Cat extends Animal {
	
	void meow()
	{
		System.out.println("Cat is Meowing");
		
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
	}

}
