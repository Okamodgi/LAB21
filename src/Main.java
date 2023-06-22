
interface Observer {
    void update(String message);
}

public class Main{
    public static void main(String[] args) {

        Group gr1 = new Group("ОНИ");
        Group gr2 = new Group("НЛО");
        Group gr3 = new Group("Мы");
        Group gr4 = new Group("Время");

        User us1 = new User("us 1");
        User us2 = new User("us 2");

        gr1.addObserver(us1);
        gr1.addObserver(us2);
        gr2.addObserver(us1);
        gr2.addObserver(us2);
        gr3.addObserver(us1);
        gr4.addObserver(us2);

        gr1.sendNotification("Новый запись в сообществе");
        gr2.sendNotification("в Краснодаре замечен....");
        gr3.sendNotification("Гороскоп на 23 мая");
        gr4.sendNotification("Новости дня");
    }
}