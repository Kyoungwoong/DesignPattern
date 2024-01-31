package gumballstate;

public interface State {
    // 동전을 넣었을 때의 상태 정의
    public void insertQuarter();

    // 동전을 반환했을 때의 상태 정의
    public void ejectQuarter();

    // 손잡이를 돌렸을 때의 상태 정의
    public void turnCrank();

    // 알맹이가 나올 때의 상태 정의
    public void dispense();

    public void refill();
}
