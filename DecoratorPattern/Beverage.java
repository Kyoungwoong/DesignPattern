public abstract class Beverage {
    String description;

    // 첨가물 관리를 위해 인스턴스 변수 사용
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    abstract void getDescription();

    boolean hasMilk() {
        if (milk) {
            return true;
        }
        return false;
    }

    boolean hasSoy() {
        if (soy) {
            return true;
        }
        return false;
    }

    boolean hasMocha() {
        if (mocha) {
            return true;
        }
        return false;
    }

    boolean hasWhip() {
        if (whip) {
            return true;
        }
        return false;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    double cost() {
        double sum = 0;

        if (hasMilk()) {
            sum += 0.1;
        }

        if (hasMocha()) {
            sum += 0.5;
        }

        if (hasSoy()) {
            sum += 0.2;
        }

        if (hasWhip()) {
            sum += 0.3;
        }

        return sum;
    }
}
