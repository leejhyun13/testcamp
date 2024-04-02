package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: And 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        // 두 피연산자가 모두 참이어야 true를 반환
        // 둘 중 하나라도 거짓이면 false를 반환한다.

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        // 하나라도 참일 경우 true를 반환
        // 모두 거짓이어야 false 반

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);
        // 참을 거짓으로 거짓을 참으로

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);



    }
}
