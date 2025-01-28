package genericBounded;

public class GenericClass<T extends AnimalAbstr>{
    T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void getName() {
        animal.name();
    }

    public void getSound() {
        animal.sound();
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        GenericClass<Cat> genericCat = new GenericClass<>();
        genericCat.setAnimal(cat);
        genericCat.getName();    // Output: I am a Cat
        genericCat.getSound();   // Output: Meow
    }
}