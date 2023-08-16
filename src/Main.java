public class Main {
    public static void main(String[] args) {
        int amountOnAccount = 345;
        int amountOfPayment = 1001;
        int bonus;
        int total;

        if (amountOfPayment > 1000) {
            bonus = amountOfPayment / 100;
            total = amountOnAccount + amountOfPayment + bonus;
            System.out.println("Итоговая сумма на счету " + total);
            System.out.println("Количество бонусов " + bonus);
        } else {
            total = amountOnAccount + amountOfPayment;
            System.out.println("Итоговая сумма на счету " + total);
            System.out.println("Количество бонусов 0");
        }
    }
}