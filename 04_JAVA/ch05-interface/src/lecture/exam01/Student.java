package lecture.exam01;

public class Student extends Person implements Behavior{
    //추가적인 필드
    String schoolName;
    int grade;

    @Override
    public void eat() {
        System.out.println("학교에서 급식을 먹습니다.");
    }

    @Override
    public void live() {
        System.out.println(Behavior.OPENING_TIME + "시간부터" + Behavior.CLOSING_TIME + "까지 수업을 듣습니다.");
    }
}
