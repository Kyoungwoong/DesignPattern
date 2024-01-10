public abstract class Beverage {
    String description = "아무것도 없음";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
