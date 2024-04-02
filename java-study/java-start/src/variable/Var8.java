package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수 타입
        byte b = 127; // -128 ~ 127
        short s = 23767; // -32768 ~ 32767
        int i = 2147483647; // -2147483648 ~ 2147483647  (약 20억)
        long l = 9223372036854775807L; // 엄청난 범위

        // 실수 타입
        float f = 10.0f; // 실무에서 float를 사용하는 일은 거의 없다. 소수점 계산의 정확도가 double에 비해 현저히 떨어져 오류가 많다.
        double d = 10.0; // 실무에서는 고민하지말고 double을 사용해라
    }
}
