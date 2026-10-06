package stream;

import java.io.*;
import java.util.*;

public class LimitParallel {
    static final long SIZE = 100_000_000L;

    public static void main(String[] args) {
        try {
            long start, end;
            long[] data = new Random().longs(SIZE, 0, Long.MAX_VALUE).toArray();

            long[] arr1 = Arrays.copyOf(data, data.length);
            long[] arr2 = Arrays.copyOf(data, data.length);

            start = System.currentTimeMillis();
            Arrays.stream(arr1).sorted().toArray();
            end = System.currentTimeMillis();
            System.out.println("stream 정렬 시간 : " + (end - start) + "ms");

            start = System.currentTimeMillis();
            Arrays.stream(arr1).parallel().sorted().toArray();
            end = System.currentTimeMillis();
            System.out.println("parallel 정렬 시간 : " + (end - start) + "ms");
        } catch (Exception e) {
            System.out.println("예외 발생!!!");
        }
    }

}
