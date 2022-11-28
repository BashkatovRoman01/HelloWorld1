public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int goal = 2_459_000;
        int additionalDonation = 15000;
        int countMonth=1;
        int savings=0;
        while (savings<goal) {
            savings = savings+additionalDonation;
            countMonth++;
        }
        System.out.println("Месяц " + countMonth+ ", сумма накоплений равна " + savings + " рублей");
    }
}