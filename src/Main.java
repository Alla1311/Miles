public class Main {
    public static void main(String[] args) {
        int price = 1000;
        int accrual = 20;
        int bonus = price / accrual;

        System.out.println("Количество начисленных миль " + bonus);
    }
}