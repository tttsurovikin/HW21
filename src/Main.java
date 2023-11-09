public class Main {
    public static void main(String[] args) {
        String рядок = "Кава";
        DrinksMachine напій = DrinksMachine.fromString(рядок);
        System.out.println("Вибраний напій: " + напій);
    }
}