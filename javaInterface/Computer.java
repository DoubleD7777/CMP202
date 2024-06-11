public class Computer implements Electronic{
    Ram ram;
    Processor cpu;
    Storage storage;

    public Computer(Ram ram, Processor cpu, Storage storage){
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return "Computer{"+ 
            "ram=" + ram +
            " cpu=" + cpu +
            " storage=" + storage +
            '}';
        }
    

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off(){
        return false;   
    }
    
    
}
