public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1500;
        int limit = 1000;
        int bonus;

        if (payment > limit) {
            bonus = balance + payment + payment / 100;
        } else {
            bonus = balance + payment;
        }
        System.out.println(bonus);
    }
}
