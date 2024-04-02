package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10){
            discount = discount + 1000;
            System.out.println("10살 이하 어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원 입니다.");
    }
}

// if 문을 따로 하는 이유 : 중복할인이 가능하게 하는 독립 수행 조건이기 떄문에 if문을 따로 작성...
// else if문을 사용할 경우 하나의 조건을 만족하게 된다면 나머지 조건은 수행조자 하지 않기 떄문에
// 독립 수행 조건은 else-if 를 사용하지 않는다.
