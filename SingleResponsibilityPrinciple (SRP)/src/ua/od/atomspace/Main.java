package ua.od.atomspace;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
//у классов ниже существует одна причина для изменений из-за того, что каждый из классов ориентирован на один род деятельности
//делать класс в котором будут методы убирать, готовить, разносить заказы и тд нельзя
interface Employee{
    int getSalary();
}
class Cook implements Employee{

    @Override
    public int getSalary() {
        return 0;
    }
    public void cook(){}

}

class Janitor implements Employee{

    @Override
    public int getSalary() {
        return 0;
    }
    public void clearFloor(){}
}

//Иногда приходится создавать фасад которым будет универсальный класс

class EmployeeFacade{
    Cook cook = new Cook();
    Janitor janitor = new Janitor();

    public void cook(){
        cook.cook();
    }
    public void clearFloor(){
        janitor.clearFloor();
    }
}