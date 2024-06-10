package main;

public class Hedgehog {
    private String name;
    private int age;
    private int round;

    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }

    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }      
    

    public void speak() {
        System.out.println(name + " puhuu");
    }

    public void run() {
        System.out.println(this.name + " juoksee kovaa vauhtia!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
