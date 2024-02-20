package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P1764_듣보잡_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (int i = 0; i < nm[0]; i++) set1.add(br.readLine());
        for (int i = 0; i < nm[1]; i++) set2.add(br.readLine());
        set1.retainAll(set2);

        System.out.println(set1.size());
        set1.stream().sorted().forEach(System.out::println);
    }
}
