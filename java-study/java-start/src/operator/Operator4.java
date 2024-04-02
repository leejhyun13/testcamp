package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2*2) + (3*3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // sum3 과 sum4는 답이 같지만 코드가 좀더 길어지더라도 명확하고 단순한 것이 더 유지보수 하기 좋다.
        // 연산자 우선순위가 애매하거나 조금이라도 복잡해진다면 언제나 괄호를 사용해서 명확하게 하자
    }
}
