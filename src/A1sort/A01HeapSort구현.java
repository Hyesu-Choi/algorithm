package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// "트리탐색+재귀적 호출"을 통한 힙정렬
public class A01HeapSort구현 {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 8, 3, 5, 9, 1, 6};
//        1.최초 힙 구성
//        1-1) 부모노드(n/2)와 자식노드(n/2) 분리하여 부모노드를 대상으로 heapify
//        1-2) 자식노드의 왼쪽노드는 부모노드X2+1, 자식노드의 오른쪽노드 : 부모노드X2+2
//        1-3) heapify 의 과정이 재귀호출로 이루어짐
        for(int i=arr.length/2-1; i>=0; i--) {
            heapify(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));  // 최초힙 결과: [1, 3, 5, 6, 7, 5, 9, 8, 6]

//        2.루트노드와 최하위노드를 자리 change해가면서 재 heapify  0번째랑 마지막자리 바꾸고나서 hepify
//        2-1) 자리 change한 마지막노드는 heapify 대상에서 제외
//        2-2) 최소힙 -> 내림차순정렬, 최대힙 -> 오름차순정렬
        for(int i=arr.length-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];  // 마지막자리값 감소
            arr[i] = temp;
            heapify(arr, 0, i);  // 전체길이 감소
        }
        System.out.println(Arrays.toString(arr));  //[9, 8, 7, 6, 6, 5, 5, 3, 1]

//        pq를 통한 정렬방법 : 데이터를 계속 추가했다가 뺐다 난리치면 pq 쓰는게 좋음. 안그럴경우는 그냥 Arrays.sort쓰기.
//        pq를 가지고 직접 정렬을 수행하기보다는 지속적으로 값을 add하고 poll해 나가는 상황에서 사용
//        최초힙구성 : n*log(n)
        Queue<Integer> pq = new PriorityQueue<>(Arrays.asList( 7, 6, 5, 8, 3, 5, 9, 1, 6));
        System.out.println("pq" + pq);  //[1, 3, 5, 6, 7, 5, 9, 8, 6]  .. 집어넣으면 최초힘 구성됨
        System.out.println(pq.poll());  // poll의 복잡도 log(n)
        pq.add(2); // add의 복잡도 log(n)
    }

    static void heapify(int[] arr, int parentIndex, int length) {
//        자식노드와의 비교.
        int leftIndex = parentIndex*2+1;
        int rightIndex = parentIndex*2+2;
        int smallestIndex = parentIndex;
//        가장 작은 index값 찾기
        if(leftIndex < length && arr[leftIndex] < arr[smallestIndex] ) {
            smallestIndex = leftIndex;
        }
        if(rightIndex < length && arr[rightIndex] < arr[smallestIndex] ) {
            smallestIndex = rightIndex;
        }
//        가장 작은 index가 부모노드가 아니라면 자리 change 및 heapify 호출
        if(smallestIndex != parentIndex) {
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
            heapify(arr, smallestIndex, length);
        }

    }
}
