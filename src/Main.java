public class Main {
    public static void main(String[] args) {
        int money = 100;
        // начальное кол-во денег

        int addMoney = 2000;
        // введённое кол-во денег на счёт

        int bonus = addMoney / 100;
        // бонус по акции

        int allMoney = money + addMoney;
        // общее кол-во денег при пополнении счёта

        if (addMoney > 1000) {
            allMoney = allMoney + bonus;
        }
        // общее кол-во денег при пополнении счёта вместе с бонусом акции (при учёте того, если условие выполнено)

        System.out.println("Вы пополнили счёт на " + (addMoney) + " рублей");
        if (addMoney > 1000) {
            System.out.println("Вы активировали акцию \"Получи рубль за каждые 100!\". Ваш бонус составляет: " + bonus);
        }
        System.out.println("Итоговый счёт: " + allMoney);
    }
}