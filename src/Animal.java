package ZOO;

public abstract class Animal {

    private int id;
    protected String name;
    protected  float weight;
    private static int COUNTER=0;       // zmienne statyczne piszemy z duzych liter


    public Animal(String name, float weight) {
        this.id = ++COUNTER;            //najpierw inkrementuje, potem wyswietlam, dlatego ++ na poczatku
        this.name = name;
        this.weight = weight;
    }

    //jesli metoda jest abstarkcyjna, to musi byc zaimplementowana pozniej
    //ale tu nie moge dodac ciala metody (gdyby bylo bez 'abstract' mozna by bylo dodac cialo)
    public abstract void introduce();


    //gettery & settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
