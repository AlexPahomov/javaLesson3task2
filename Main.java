public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1500;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int totalAccount = bonus + balance + refill ;
        System.out.println(bonus);
        System.out.println(totalAccount);
    }
}
