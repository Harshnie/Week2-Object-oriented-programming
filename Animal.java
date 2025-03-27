
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some general animal sound");
    }
}


class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof, Woof!");
    }
}


class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow, Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp, Chirp!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animal dog = new Dog("Pinky", 8);
        Animal cat = new Cat("Whiskey", 3);
        Animal bird = new Bird("Blacky", 2);

        makeAnimalSound(dog);
        makeAnimalSound(cat);
        makeAnimalSound(bird);
    }

    public static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
}
