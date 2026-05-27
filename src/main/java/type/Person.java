package main.java.type;

public abstract class Person {
    protected Name name;
    protected int age;
    protected Gender gender;
    private Role role;
    private Address address;

    public Person() {
        this(0, Gender.MALE, new Name());
    }

    public Person(int age, Gender gender, Name name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = new Address("City", "Street");
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void talk() {
        role.roleTalk();
    }

    public void talk(String topic) {
        System.out.println("Let's talk about " + topic);
    }

    public void chatWith(Person person, String topic) {
        System.out.printf("%s to %s: Let's talk about %s\n", this.name, person.name, topic);
    }

    public abstract void work();

    public final void breathe() {
        System.out.println("Breathing...");
    }

    public Person getPartner() {
        return null;
    }
}
