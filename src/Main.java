public class Main {
    public static void main(String[] args) {
        int accountAmount = 100;
        int replenishmentAmount1 = 500;
        int replenishmentAmount2 = 1500;

        boolean promotionalBonuses1 = false;

        int percent1 = promotionalBonuses1 ? 0 : 1;
        int accountTotal1 = accountAmount + replenishmentAmount1;
        int bonuses1 = percent1 * accountTotal1 / 100;

        if (replenishmentAmount1 < 1000) {
            bonuses1 = 0;
        }

        boolean promotionalBonuses2 = true;

        int percent2 = promotionalBonuses2 ? 1 : 0;
        int accountTotal2 = accountAmount + replenishmentAmount2;
        int bonuses2 = percent2 * accountTotal2 / 100;

        if (replenishmentAmount2 > 1000); {
            //   bonuses2 = 16;
            }

            System.out.println("Сумма на счете1: " + accountTotal1);
            System.out.println("Бонусы1: " + bonuses1);
            System.out.println("Сумма на счете2: " + accountTotal2);
            System.out.println("Бонусы2: " + bonuses2);
        }
    }
