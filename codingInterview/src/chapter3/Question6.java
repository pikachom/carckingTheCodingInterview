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
				throw new WrongSpeciesException("CAT 혹은 DOG만 입력하세요");
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
		AnimalShelter shelter = test.new AnimalShelter(); // test의 클래스이기 때문에..
		shelter.enqueue("홍기", "dog");
		shelter.enqueue("재문", "cat"	);
		shelter.enqueue("정범", "dog");
		shelter.enqueue("연도", "dog");
		shelter.enqueue("홍구", "dog");
		shelter.enqueue("잼재문", "cat");
		System.out.println(shelter.dequeueAny().getName());
		System.out.println(shelter.dequeueAny().getName());
		System.out.println(shelter.dequeueCat().getName());
		//shelter.enqueue("기훈", "사람");
		
		
	}
	
	
}

class WrongSpeciesException extends Exception{
	private static final long serialVersionUID = 1L;
	public WrongSpeciesException() {}
	public WrongSpeciesException(String msg) {
		super(msg);
	}
	
}
