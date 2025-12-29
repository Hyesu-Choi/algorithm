package A1sort;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class A02힙정렬문제풀이 {
    //    명예의 전당(1) : 프로그래머스
    /*
    int[] answer = new int[scores.length];
    Queue<Integer> pq = new PriorityQueue<>();

    for(int i = 0; i<scores.length;i++) {
            pq.add(scores[i]);

            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        return answer;
     */

    //    야근지수 : 프로그래머스
    /*
    Queue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < works.length; i++) {
        que.add(works[i]);
    }

    while (n > 0) {
        int temp = que.poll(); //4 -> 3 -> 3 ->3
        if (temp == 0) break;
        temp--;  // 3 ->2 ->3 ->2
        n--; //3 ->2 ->1 ->0
        que.add(temp); // 3,3,3 -> 2,3,3 ->2,2,3 ->2,2,2
    }
    while (!que.isEmpty()) {
        int temp = que.poll();
        answer += temp * temp;
    }
    return answer;
     */

}
