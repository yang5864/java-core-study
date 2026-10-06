package interfacee2;

public class TetzMain2 {
    public static void main(String[] args) throws Exception {
        Animal[] animals = {new Dog(), new Tetz()};

        for (Animal animal : animals) {
            animalDo(animal);

            if (animal instanceof Human) {
                humanDo((Human) animal);
            }
        }
    }

    public static void animalDo(Animal animal) {
        animal.eat();
        animal.sleep();
    }

    public static void humanDo(Human human) {
        human.think();
    }
}
