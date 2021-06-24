package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add((int) (Math.random() * 10));
        }
        AtomicInteger a = new AtomicInteger(0);
        List<Integer> list1 = list.stream()
                .filter(x -> a.getAndIncrement() % 2 != 0)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(list1);
//        final ArrayList<Integer> integers = new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            integers.add((int) (Math.random() * 10));
//        }
//        int[] n = {0};
//        List<Integer> list3 = integers.stream()
//                .filter(x -> n[0]++ % 2 != 0)
//                .map(x -> x * 2)
//                .collect(Collectors.toList());
//        System.out.println(list3);
////    }
    }
}
