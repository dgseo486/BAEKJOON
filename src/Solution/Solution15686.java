package Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution15686 { // 치킨 배달
    
    static int N;
    static int M;
    static int ans = Integer.MAX_VALUE;
    static int[][] city;
    static ArrayList<Location> storeList = new ArrayList<Location>();
    static ArrayList<Location> homeList = new ArrayList<Location>();
    static ArrayList<Location> selectedList = new ArrayList<Location>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        city = new int[N + 1][N + 1];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                city[i][j] = sc.nextInt();
                if(city[i][j] == 2) {
                    storeList.add(new Location(i, j));
                } else if(city[i][j] == 1) {
                    homeList.add(new Location(i, j));
                }
            }
        }
        dfs(0, 0);
        System.out.println(ans);
        sc.close();
    }

    public static void dfs(int cnt, int depth) {
        if(depth == M) {
            calcDist();
            return;
        }
        for(int i = cnt; i < storeList.size(); i++) {
            selectedList.add(storeList.get(i));
            dfs(cnt + 1, depth + 1);
            selectedList.remove(i);
        }
    }
    
    public static void calcDist() {
        int[] dist = new int[homeList.size()];
        for(int i = 0; i < selectedList.size(); i++) {
            for(int j = 0; j < homeList.size(); j++) {
                int distance = Math.abs(selectedList.get(i).x - homeList.get(j).x) + Math.abs(selectedList.get(i).y - homeList.get(j).y);
                dist[j] = distance;
            }
        }
        int chickenDist = 0;
        for(int i = 0; i < homeList.size(); i++) {
            chickenDist += dist[i];
        }
        if(ans > chickenDist) {
            ans = chickenDist;
        }
    }
}

class Location {
    int x;
    int y;
    Location(int x, int y){
        this.x = x;
        this.y = y;
    }
}
