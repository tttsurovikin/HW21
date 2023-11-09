import java.util.Scanner;

public class HW21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int кількістьНапоїв = 0;
        double загальнаВартість = 0.0;

        while (true) {
            System.out.println("Виберіть напій:");
            System.out.println("1. Кава");
            System.out.println("2. Чай");
            System.out.println("3. Лимонад");
            System.out.println("4. Мохіто");
            System.out.println("5. Мінералка");
            System.out.println("6. Кока-кола");
            System.out.println("0. Завершити замовлення");

            int вибір = scanner.nextInt();

            if (вибір == 0) {
                break;
            }

            switch (вибір) {
                case 1:
                    приготуватиНапій(DrinksMachine.КАВА);
                    кількістьНапоїв++;
                    загальнаВартість += Drinks.КАВА_ЦІНА;
                    break;
                case 2:
                    приготуватиНапій(DrinksMachine.ЧАЙ);
                    кількістьНапоїв++;
                    загальнаВартість += Drinks.ЧАЙ_ЦІНА;
                    break;
                case 3:
                    приготуватиНапій(DrinksMachine.ЛИМОНАД);
                    кількістьНапоїв++;
                    загальнаВартість += Drinks.ЛИМОНАД_ЦІНА;
                    break;
                case 4:
                    приготуватиНапій(DrinksMachine.МОХІТО);
                    кількістьНапоїв++;
                    загальнаВартість += Drinks.МОХІТО_ЦІНА;
                    break;
                case 5:
                    приготуватиНапій(DrinksMachine.МІНЕРАЛКА);
                    кількістьНапоїв++;
                    загальнаВартість += Drinks.МИНЕРАЛКА_ЦІНА;
                    break;
                case 6:
                    приготуватиНапій(DrinksMachine.КОКА_КОЛА);
                    кількістьНапоїв++;
                    загальнаВартість += Drinks.КОКА_КОЛА_ЦІНА;
                    break;
                default:
                    System.out.println("Невірний вибір");
                    break;
            }
        }

        System.out.println("Кількість напоїв: " + кількістьНапоїв);
        System.out.println("Загальна вартість: " + загальнаВартість);
    }

    public static void приготуватиНапій(DrinksMachine напій) {
        System.out.println("Приготування напою: " + напій);

    }
}
