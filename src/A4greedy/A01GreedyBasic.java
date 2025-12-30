package A4greedy;

import java.util.Arrays;
import java.util.Comparator;

// greedy(탐욕법) : 현재로서 최적의 해를 선택했을때, 전체의 최적해를 보장하는 알고리즘. //특별한 패턴없음. 문제 많이 풀어봐야함.. 그리디스럽게 문제 풀다가 아님 dp로 풀어보기
public class A01GreedyBasic {
    public static void main(String[] args) {
//        1,5,10,20원 짜리의 동전이 있을 때, 이를 조합하여 99를 만들 수 있는 조합 중에 최소개수를 구하라.
        int[] arr = {10, 1, 5, 20};
        Arrays.sort(arr);
        int total = 0;
        int target = 99;

        for(int i=arr.length-1; i>=0; i--) {
            int a = arr[i];
            int b = target/a;
            total += b;
            target -= b*a;
        }
        System.out.println(total);


    }
}
