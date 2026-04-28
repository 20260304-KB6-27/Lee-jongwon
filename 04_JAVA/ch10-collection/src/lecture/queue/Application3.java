package lecture.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) {

        /*
        * PriorityQueue 우선순위 큐
        * - FIFO가 아니아 우선순위가 높은 요소부터 꺼냄
        * - Comparable, Computer 정렬 기준을 변경 할 수 있음(우선순위 지정가능
         */

        //숫자형 기본 : 오름차순
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        pq.offer(40);

        System.out.println("pq = " + pq); //정렬 순서는 아님 메모리상 구조



    }
}
