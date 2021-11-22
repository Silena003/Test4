public class Main {
    public static void main(String[] args) {
        int accountAmount = 100;
        int replenishmentAmount2 = 1500;

        boolean promotionalBonuses1 = false;

        int percent1 = promotionalBonuses1 ? 0 : 1;

        int accountTotal2 = accountAmount + replenishmentAmount2;
        int bonuses2 = percent1 * accountTotal2 / 100;
        if (replenishmentAmount2 <= 1000) {
            bonuses2 = 0;
        }

        System.out.println("Сумма на счете2: " + accountTotal2);
        System.out.println("Бонусы2: " + bonuses2);
    }
}
