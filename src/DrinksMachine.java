public enum DrinksMachine {
    КАВА,
    ЧАЙ,
    ЛИМОНАД,
    МОХІТО,
    МІНЕРАЛКА,
    КОКА_КОЛА;
    public static DrinksMachine fromString(String value) {
        for (DrinksMachine напій : DrinksMachine.values()) {
            if (напій.name().equalsIgnoreCase(value)) {
                return напій;
            }
        }
        throw new IllegalArgumentException("Невідомий напій: " + value);
    }
}
