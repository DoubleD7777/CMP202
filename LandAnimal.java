public class LandAnimal extends Animal {
    @Override
    String move() {
        return "Swings on tree";
    }
    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        Dog.name = "victor";
        LandAnimal monkey = new LandAnimal();
        System.out.println(lion.move());
        System.out.println(monkey.move());
    }
}
