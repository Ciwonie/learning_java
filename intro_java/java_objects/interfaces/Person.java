public class Person implements Chattable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String chat() {
        return "Hi, I'm a person";
    }
}