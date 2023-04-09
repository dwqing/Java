package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindingTheUsersActiveMinutes {
    //哈希表
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>>  map= new HashMap<>();
        for (int[] log:logs){
            int id = log[0],times = log[1];
            map.putIfAbsent(id,new HashSet<Integer>());
            map.get(id).add(times);
        }
        int[] answer = new int[k];
        for (Set<Integer> m:map.values()){
            int a = m.size()-1;
            answer[a]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int [][] w= {{0,5},{1,2},{0,2},{0,5},{1,3}};

    }
}
