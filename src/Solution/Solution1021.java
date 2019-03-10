package Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1021 { //회전하는 큐

    static int N;
    static int M;
    static int minCount = 0;
    static ArrayList<Integer> arrList = new ArrayList<>();
    static ArrayList<Integer> tempList1 = new ArrayList<>();
    static ArrayList<Integer> tempList2 = new ArrayList<>();
    
    public static int moveRight(int location) {
        int count = 0;
        for(int i = 0; i < arrList.size(); i++) {
            tempList1.add(arrList.get(i));
        }
        while(tempList1.get(0) != location) {
            tempList1.add(0, tempList1.get(tempList1.size() - 1));
            tempList1.remove(tempList1.size() - 1);
            count++;
        }
        tempList1.remove(0);
        return count;
    }
    
    public static int moveLeft(int location) {
        int count = 0;
        for(int i = 0; i < arrList.size(); i++) {
            tempList2.add(arrList.get(i));
        }
        while(tempList2.get(0) != location) {
            tempList2.add(tempList2.get(0));
            tempList2.remove(0);
            count++;
        }
        tempList2.remove(0);
        return count;
    }
    
    public static void minCount(int countRight, int countLeft) {
        if(countRight > countLeft) {
            minCount += countLeft;
            arrList.clear();
            for(int i = 0; i < tempList2.size(); i++) {
                arrList.add(tempList2.get(i));
            }
            tempList1.clear();
            tempList2.clear();
        } else if(countRight < countLeft) {
            minCount += countRight;
            arrList.clear();
            for(int i = 0; i < tempList1.size(); i++) {
                arrList.add(tempList1.get(i));
            }
            tempList1.clear();
            tempList2.clear();
        } else {
            minCount += countRight;
            arrList.clear();
            for(int i = 0; i < tempList1.size(); i++) {
                arrList.add(tempList1.get(i));
            }
            tempList1.clear();
            tempList2.clear();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] loc = new int[M];
        for(int i = 0; i < M; i++) {
            loc[i] = sc.nextInt();
        }
        
        for(int i = 1; i <= N; i++) {
            arrList.add(i);
        }
        
        for(int i = 0; i < M; i++) {
            minCount(moveLeft(loc[i]), moveRight(loc[i]));
        }
        
        System.out.println(minCount);
        
        sc.close();
    }

}
