package lecture.lambda.section01;

public interface OuterCalculator {
    /*내부 인터페이스
    * - 기본적으로 public static 속성을 가짐
    * - 바깥 클래스명.내부인터페이스명으로 접근
    * */

    @FunctionalInterface
    public interface Sum {
        int sum(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int Minus(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int Multiple(int a, int b);
    }

    @FunctionalInterface
    public interface Devide {
        int Devide(int a, int b);
    }
}
