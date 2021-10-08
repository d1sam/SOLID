package ua.od.atomspace;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

//суть в том, что нужно в интерфейс выносить только те методы, которые всегда будут нужны классу реализующему интерфейс
//то есть не должно возникать ситуацци, когда класс реализует интерфейс и один из методов этого интерфейса ему не нужен
interface Worker{
    void work();
}

interface Eater{
    void eat();
}

interface IWorker extends Worker,Eater{

}

class Cook implements IWorker{

    @Override
    public void work() {
        System.out.println("I'm cooking");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }
}

class Janitor implements Worker{

    @Override
    public void work() {
        System.out.println("I'm deliver orders");
    }
}