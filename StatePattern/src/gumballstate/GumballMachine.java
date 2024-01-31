package gumballstate;

public class GumballMachine {

    /*
     * 알맹이 상태 저장
     */
    State soldOutState; // 알맹이 없음
    State noQuarterState; // 동전 없음
    State hasQuarterState; // 동전 있음
    State soldState; // 알맹이 내보내는 중

    State state;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    /*
     * 동전이 투입된 경우
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /*
     * 동전 반환
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /*
     * 손잡이를 돌리는 경우
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다");

        if (count > 0) {
            count--;
        }
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public int getCount() {
        return this.count;
    }
}
