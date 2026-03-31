interface Animal {
   public void makeSound();
   public void move();
}

class Bird implements Animal {
   
   public void makeSound() {
      System.out.println("Chirp");
   }

   public void move() {
      System.out.println("Fly");
   }
}

class Dog implements Animal {
   
   public void makeSound() {
      System.out.println("Bark");
   }

   public void move() {
      System.out.println("Run");
   }
} 

public class Zoo {
    public static void main(String[] args) {
      
      Animal bird = new Bird();
      Animal dog = new Dog();

      System.out.println("Bird: ");
      bird.makeSound();
      bird.move();

      System.out.println();

      System.out.println("Dog: ");
      dog.makeSound();
      dog.move();
    }
}
