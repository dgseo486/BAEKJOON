package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution3163 { //떨어지는 개미
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            int k = sc.nextInt();
            
            ArrayList<Ant> antList = new ArrayList<>();
            for(int n = 0; n < N; n++) {
                int dis = sc.nextInt();
                int id = sc.nextInt();
                if(id > 0) {
                    dis = L - dis;
                }
                Ant ant = new Ant(dis, id);
                antList.add(ant);
            }
            
            AscendingObj ascending = new AscendingObj();
            Collections.sort(antList, ascending);
            
            /*for(int i = 0; i < antList.size(); i++) {
                System.out.println(antList.get(i).getDistance());
            }*/
            System.out.println(antList.get(k).getId());
            
        }
        sc.close();
    }

}

class Ant {
    private Integer distance;
    private Integer id;
    
    public Ant(Integer distance, Integer id) {
        this.distance = distance;
        this.id = id;
    }
    
    public Integer getDistance() {
        return distance;
    }
    
    public Integer getId() {
        return id;
    }
}

class AscendingObj implements Comparator<Ant> {
    @Override
    public int compare(Ant o1, Ant o2) {
        return o1.getDistance().compareTo(o2.getDistance());
    }
}
