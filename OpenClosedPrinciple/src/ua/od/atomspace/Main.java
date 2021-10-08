package ua.od.atomspace;
//WRONG
//public class Main {
//
//    public static void main(String[] args) {
//	    //Toyota toyota = new Toyota();
//        Celica celica = new Celica();
//        workInTaxi(celica);
//    }
//    static void workInTaxi(Toyota toyota){
//        if (toyota instanceof Celica){
//            toyota.getOnePassenger();
//        }else{
//            toyota.getPassengers();
//        }
//    }
//}
//class Toyota {
//    void getPassengers(){
//        System.out.println("Get passengers!");
//    }
//    void getOnePassenger(){
//        System.out.println("Get only one passenger!");
//    }
//}
//
//class Celica extends Toyota{
//
//}

//Выше говнокод, всегда придется редачить workInTaxi, когда будем добавлять какую-то логику классу Тойота. Ниже правильный вариант

public class Main {
    public static void main(String[] args) {
        Celica celica = new Celica();
        workInTaxi(celica);
    }
    static void workInTaxi(Car car){
        car.workInTaxi();
    }
}

interface Car{
    void workInTaxi();
}

class Toyota implements Car{

    @Override
    public void workInTaxi() {
        getPassengers();
    }
    void getPassengers(){
        System.out.println("Get passengers!");
    }
}

class Celica extends Toyota{
    @Override
    public void workInTaxi() {
        getOnePassenger();
    }
    void getOnePassenger(){
        System.out.println("Get only one passenger!");
    }
}