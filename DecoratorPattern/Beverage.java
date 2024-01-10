public abstract class Beverage {

    enum SIZE {
        TALL, GRANDE, VENTI
    }

    String description = "아무것도 없음";
    SIZE size = SIZE.TALL;

    public String getDescription() {
        return description;
    }

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    abstract double cost();
}
