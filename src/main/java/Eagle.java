public class Eagle implements CanFly, Animal {

    @Override
    public int fly() {
        System.out.print("I'm an eagle and I can fly up to 85 miles an hour!");
        return 85;
    }

    @Override
    public void takeBreath() {
        System.out.print("Eagle took a breath");
    }

    @Override
    public void makeSound() {
        System.out.print("Eagle made a sound");
    }

}
