package ZOO;

public class Dog extends Animal  implements Cannie{


    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void introduce() {
        System.out.println("I'm a tiger. My name is "
                +this.name + ". I weight "
                + this.weight
                + " kg.");
    }

    @Override
    public void bark() {

    }

    public void sitPretty(){
        System.out.println(this.name + " sits pretty.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
