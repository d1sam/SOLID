package ua.od.atomspace;

public class Main {

    public static void main(String[] args) {
	Client client = new Client();
	client.doJob();
    }
}
//суть принципа заключается в инверсии зависимостей с помощью промежуточного интерфейса
//и создает прослойку между низкоуровневым доступом к ресурсу и высокоуровневым клиентом

interface DAO{
    void execute();
}

class DataAccess implements DAO{

    @Override
    public void execute() {
        System.out.println("execute");
    }
}

class Client{
    private final DAO dataAccess = new DataAccess();
    void doJob(){
        dataAccess.execute();
    }
}