import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void reverseListTest1() {   // 5 scores
        LinkedList myLL = new LinkedList();
        myLL.add(3);
        myLL.add(0);
        myLL.add(-2);
        myLL.reverseList();

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(-2);
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            assertEquals(list.get(i), myLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest2() {   // 5 scores
        LinkedList stringLL = new LinkedList();
        stringLL.add("hello");
        stringLL.add("world");
        stringLL.reverseList();

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        Collections.reverse(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), stringLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest3() {   // 5 score
        LinkedList stringLL = new LinkedList();
        stringLL.add("hello");
        stringLL.reverseList();

        List<String> list = new ArrayList<>();
        list.add("hello");
        Collections.reverse(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), stringLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest4() {   // 5 scores
        LinkedList stringLL = new LinkedList();
        stringLL.reverseList();

        List<String> list = new ArrayList<>();
        Collections.reverse(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), stringLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest5() {   // 5 scores
        LinkedList charLL = new LinkedList();
        charLL.add('a');
        charLL.add('p');
        charLL.add('p');
        charLL.add('l');
        charLL.add('e');
        charLL.reverseList();

        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('p');
        list.add('p');
        list.add('l');
        list.add('e');
        Collections.reverse(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), charLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest6() {   // 10 scores
        LinkedList floatLL = new LinkedList();
        List<Float> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 1000; i++){
            float num = rand.nextFloat();
            floatLL.add(num);
            list.add(num);
        }
        floatLL.reverseList();
        Collections.reverse(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), floatLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest7() {   // 10 scores
        LinkedList floatLL = new LinkedList();
        List<Float> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 1000; i++){
            float num = rand.nextFloat();
            floatLL.add(num);
            list.add(num);
        }
        floatLL.reverseList();
        Collections.reverse(list);

        for (int i = 0; i < 1000; i++){
            float num = rand.nextFloat();
            floatLL.add(num);
            list.add(num);
        }

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), floatLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest8() {   // 10 scores
        LinkedList floatLL = new LinkedList();
        List<Float> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 1000; i++){
            float num = rand.nextFloat();
            floatLL.add(num);
            list.add(num);
        }
        floatLL.reverseList();
        floatLL.reverseList();

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), floatLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest9() {   // 10 scores Input: A LinkedList with different data types
        LinkedList mixLL = new LinkedList();
        LinkedList mixLLCopy = new LinkedList();

        mixLL.add(1);
        mixLL.add("abc");
        mixLL.add(true);
        mixLL.add(null);
        mixLL.add(2.5);
        mixLL.add(1);
        mixLL.add('c');
        mixLL.add(false);
        mixLL.add(-15.4);

        for(int i = 0; i < mixLL.size(); i++){
            mixLLCopy.add(mixLL.get(i));
        }

        mixLL.reverseList();

        for(int i = 0; i < mixLL.size(); i++){
            assertEquals(mixLLCopy.get(mixLL.size() - 1 - i), mixLL.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void reverseListTest10() {   // 10 scores Input:
        LinkedList mixLL = new LinkedList();
        List<Integer> list = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 1000; i++){
            int num = rand.nextInt(500);
            mixLL.add(num);
            list.add(num);
        }

        mixLL.reverseList();
        Collections.reverse(list);

        for (int i = 0; i < 1000; i++){
            int num = rand.nextInt(500);
            mixLL.add(num);
            list.add(num);
        }

        mixLL.reverseList();
        Collections.reverse(list);

        for(int i = 0; i < list.size(); i++){
            assertEquals(list.get(i), mixLL.get(i));
        }
    }
}