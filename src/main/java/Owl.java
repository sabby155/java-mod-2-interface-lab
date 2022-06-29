public class Owl implements CanFly, Animal {

    @Override
    public int fly() {
        System.out.print("I'm an owl and I can fly up to 40 miles an hour!");
        return 40;
    }

    @Override
    public void takeBreath() {
        System.out.print("Owl took a breath");
    }

    @Override
    public void makeSound() {
        System.out.print("Owl made a sound");
    }

}
