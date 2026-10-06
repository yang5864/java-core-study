package polymorphism;

public class AnimalMain6 {
    public static void main(String[] args) throws Exception {
        Animal[] animals = {new Donkey(), new Dog(), new Cat(), new Chicken()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();

        // Cat의 instance인 경우
        if (animal instanceof Cat) {
            Cat poly = (Cat) animal;    // 다운캐스팅
            poly.grooming();
        }
    }
}
