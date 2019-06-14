package chapter3;

import java.util.LinkedList;

public class Question6 {
	abstract class Animal{
		private int order;
		private String name;
		public Animal(String nameInput) {
			this.name = nameInput;
		}
		public void setOrder(int orderInput) {
			this.order = orderInput;
		}
		public int getOrder() {
			return this.order;
		}
		public String getName() {
			return this.name;
		}
	}
	public class Dog extends Animal{
		public Dog(String nameInput) {
			super(nameInput);
		}		
	}
	public class Cat extends Animal{
		public Cat(String nameInput) {
			super(nameInput);
		}
	}
	public class AnimalShelter{
		LinkedList<Dog> dogCage = new LinkedList<Dog>();
		LinkedList<Cat> catCage = new LinkedList<Cat>();
		private int order = 0;
		
		public void enqueue(String animalName, String species) throws WrongSpeciesException {
			
			if(species.toUpperCase().equals("DOG")) {
				Dog dog = new Dog(animalName);
				dog.setOrder(order);
				dogCage.addLast(dog);
			}else if(species.toUpperCase().equals("CAT")) {
				Cat cat = new Cat(animalName);
				cat.setOrder(order);
				catCage.addLast(cat);
			}else {
				throw new WrongSpeciesException("CAT Ȥ�� DOG�� �Է��ϼ���");
			}
			order++;
		}
		public Animal dequeueAny() {
			Dog dog = dogCage.peekFirst();
			Cat cat = catCage.peekFirst();
			if(dog.getOrder()<cat.getOrder()) {
				return dogCage.poll();
			}else {
				return catCage.poll();
			}			
		}
		public Dog dequeueDog() {
			return dogCage.poll();
		}
		public Cat dequeueCat() {
			return catCage.poll();
		}
		
	}
	public static void main(String[] args) throws WrongSpeciesException {
		Question6 test = new Question6();		
		AnimalShelter shelter = test.new AnimalShelter(); // test�� Ŭ�����̱� ������..
		shelter.enqueue("ȫ��", "dog");
		shelter.enqueue("�繮", "cat"	);
		shelter.enqueue("����", "dog");
		shelter.enqueue("����", "dog");
		shelter.enqueue("ȫ��", "dog");
		shelter.enqueue("���繮", "cat");
		System.out.println(shelter.dequeueAny().getName());
		System.out.println(shelter.dequeueAny().getName());
		System.out.println(shelter.dequeueCat().getName());
		//shelter.enqueue("����", "���");
		
		
	}
	
	
}

class WrongSpeciesException extends Exception{
	private static final long serialVersionUID = 1L;
	public WrongSpeciesException() {}
	public WrongSpeciesException(String msg) {
		super(msg);
	}
	
}
