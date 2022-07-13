public class Main {
    public static void main(String[] args) {
        int money = 100;
        // начальное кол-во денег

        int add_money = 2000;
        // введённое кол-во денег на счёт

        int bonus = add_money / 100;
        // бонус по акции

        int all_money = money + add_money;
        // общее кол-во денег при пополнении счёта

        if (add_money > 1000) {
            all_money = all_money + bonus;
        }
        // общее кол-во денег при пополнении счёта вместе с бонусом акции (при учёте того, если условие выполнено)

        System.out.println("Вы пополнили счёт на " + (add_money) + " рублей");
        if (add_money > 1000) {
            System.out.println("Вы активировали акцию \"Получи рубль за каждые 100!\". Ваш бонус составляет: " + bonus);
        }
        System.out.println("Итоговый счёт: " + all_money);
    }
}