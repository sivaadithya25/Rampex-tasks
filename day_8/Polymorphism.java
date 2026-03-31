
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }package Day_8.Concepts_Code;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }
}
class Elephant extends Animal {
    void sound() {
        System.out.println("Elephant trumpets");
    }
}
class Monkey extends Animal {
    void sound() {
        System.out.println("Monkey chatters");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        animal=new Lion();//Upcasting: Lion object is being referred to by an Animal reference variable
        animal.sound();
        animal=new Elephant();
        animal.sound();
        animal=new Monkey();
        animal.sound();
    }

    
}
//Polymorphism means it has many forms with Same name but different implementation. It is achieved through method overriding and method overloading. In this example, the sound() method is overridden in each subclass to provide a specific implementation for each animal type. When we call the sound() method on an Animal reference, it executes the appropriate version of the method based on the actual object type (Lion, Elephant, or Monkey).
}
class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }
}
class Elephant extends Animal {
    void sound() {
        System.out.println("Elephant trumpets");
    }
}
class Monkey extends Animal {
    void sound() {
        System.out.println("Monkey chatters");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        animal=new Lion();//Upcasting: Lion object is being referred to by an Animal reference variable
        animal.sound();
        animal=new Elephant();
        animal.sound();
        animal=new Monkey();
        animal.sound();
    }

    
}
//Polymorphism means it has many forms with Same name but different implementation. It is achieved through method overriding and method overloading. In this example, the sound() method is overridden in each subclass to provide a specific implementation for each animal type. When we call the sound() method on an Animal reference, it executes the appropriate version of the method based on the actual object type (Lion, Elephant, or Monkey).
