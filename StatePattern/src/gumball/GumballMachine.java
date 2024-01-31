package gumball;

public class GumballMachine {

    /*
     * 알맹이 상태 저장
     */
    final static int SOLD_OUT = 0; // 알맹이 없음
    final static int NO_QUARTER = 1; // 동전 없음
    final static int HAS_QUARTER = 2; // 동전 있음
    final static int SOLD = 3; // 알맹이 내보내는 중

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /*
     * 동전이 투입된 경우
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 하나만 넣어주세요"); // 동전이 이미 투입되어 있다면 이미 있다고
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니당");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요");
        } else { // state == SOLD
            System.out.println("알맹이를 내보내는 중");
        }
    }

    /*
     * 동전 반환
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전을 반환합니다");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않았습니다. 동전이 반환되지 않았습니다.");
        } else { // state == SOLD
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        }
    }

    /*
     * 손잡이를 돌리는 경우
     */
    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else { // state == SOLD
            System.out.println("손잡이는 한번만 돌려주세요");
        }
    }

    /*
     * 알맹이 내보내기
     */
    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("알맹이를 내보낼 수 없습니다");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else { // state == SOLD
            System.out.println("알맹이를 내보내고 있습니다" );
            count--;
            if (count == 0) {
                System.out.println("더이상 알맹이가 없습니다");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
