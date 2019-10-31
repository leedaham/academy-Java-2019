package p428;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void ChangeDog(Animal animal) {
		//if(animal instanceof Dog) {
		//	Dog dog = (Dog) animal;		//ClassCastException 발생 가능
		//}
	}
}

Class Animal{}
Class Dog extens Animal
Class Cat extens Animal

