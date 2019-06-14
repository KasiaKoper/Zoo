
public class Bear extends Animal {

    private int furLenth;

    public Bear(String name, float weight, int furLenth) {
        super(name, weight);
        this.furLenth = furLenth;
    }

    // ta metoda musi byc zaimplementowana, bo jest
    // jako abstract w Aminal
    @Override
    public void introduce() {
        System.out.println("I'm a bear. My name is "
                           +this.name + ". I weight "
                            + this.weight
                            + " kg nad my fur lenght is "
                            + furLenth + ".");

    }

    @Override
    public String toString() {
        return "Bear{" +
                "furLenth=" + furLenth +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getFurLenth() {
        return furLenth;
    }

    public void setFurLenth(int furLenth) {
        this.furLenth = furLenth;
    }
}
