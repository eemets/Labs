public class Task extends Building{
    String manager;
    String Constructor;
    String Client;

    Task(){
        super();
        manager = Constructor = Client = "noname";
    }
    Task(int floor, String address, int flat, float cost, String manager, String Constructor, String Client){
        super(floor, address, flat, cost);
        this.manager = manager;
        this.Constructor = Constructor;
        this.Client = Client;
    }
    public String getManager(){return manager;}
    public String getConstructor(){return Constructor;}
    public String getClient(){return Client;}
    public void setManager(String manager){this.manager=manager;}
    public void setConstructor(String Constructor){this.Constructor=Constructor;}
    public void setClient(String Client){this.Client=Client;}
}
/*Замовник надає Технічне завдання (ТЗ) на
    проектування багатоповерхового Дому. Менеджер
    реєструє ТЗ, Конструктор визначає вартість
    проектування і побудови, виставляє Замовнику
    рахунок та створює Бригаду Конструкторів для
    виконання проекту*/

