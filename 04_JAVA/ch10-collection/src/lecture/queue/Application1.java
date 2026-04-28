package lecture.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Queue
        *
        * 주요 메서드
        * - offer() : 요소 추가(실패했을시 false반환) - (add()는 예외 발생)
        * - peak() : 가장 앞 요소 반환
        * - poll() : 가장 앞 요소 반환 후 제거
         */

        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");

        System.out.println("que.peek() = " + que.peek());
        System.out.println("que.poll() = " + que.poll()); // 앞요소 꺼내고 제거
        System.out.println("que.peek() = " + que.peek());
    }
}
