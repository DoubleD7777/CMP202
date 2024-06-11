public class Main {
    void addNumber(int a, int b){
            System.out.println(a+b);
    }
    public static void main(String[] args) {
        Computer Dell = new Computer(new Ram(), new Processor(), new Storage());
        System.out.println(Dell);
        Main main = new Main();
        
        main.addNumber(4, 8);
    }
}
