
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bear bear = new Bear("Yogi", 200, 40);
        Tiger tiger = new Tiger("Tygrysek", 156, 25);
        Wolf wolf = new Wolf("Holer", 70, 40);
        Dog dog = new Dog("Scooby", 30);

        // sposob 1 dodawania elementow do listy
        List<Animal> animals = new ArrayList<>();
        animals.add(bear);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);


        for (Animal animal : animals) {
            System.out.print(animal.getId() + " : ");
            animal.introduce();
        }

        //LAMBDA, programowanie funkcyjne

//        animals.forEach(a-> System.out.println(a));
//        animals.forEach(System.out::println);

        //todo - na jutro

        List<Cannie> howlers = Arrays.asList(wolf, dog);

        for (Cannie c : howlers) {
            //sprawdzamy czy element cannie rozszerza klasę Animal
            if (c instanceof Animal) {
                Animal a = (Animal) c;            //rzutowanie konieczne zeby stworzyc ten obiekt jako ANimal i potem robic na nim metody
                System.out.println("My name is " + a.getName() + " and I am barking: ");
            }
            c.bark();

            if (c instanceof Dog) {
                Dog d = (Dog) c;
                d.sitPretty();
            }
        }
    }
}
