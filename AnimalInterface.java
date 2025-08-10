public interface AnimalInterface {
  void display();

  int a = 10; // public static final by default
}

class Dog implements AnimalInterface {
  int b = 10;

  public void display() {
    System.out.println(b);
  }
}

class InterfaceClass {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.display(); // Correct way to call void method
  }
}
