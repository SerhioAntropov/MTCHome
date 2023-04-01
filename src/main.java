public class main {
    public static void main(String[] args) {

        int check = 100; //начальный счет клиента
        int refill = 1100; //сумма пополнение счета
        int bonus;

        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Вам начислено: " + bonus + " бонусных рублей.");
        System.out.println("На вашем счете: " + (check + refill + bonus) + " рублей.");


    }
}