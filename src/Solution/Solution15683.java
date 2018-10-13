package Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution15683 {    //감시
    
    static int blindSpot = Integer.MAX_VALUE;
    static int N, M;
    static ArrayList<CCTV> cctvList = new ArrayList<>(); 
    static int[][] matrix;
    
    static void detect(int i, int j, int direction, boolean[][] nextVisited) {
        switch(direction) {
        case 0: //up
            for(int k = i; k >= 0; k--) {
                if(matrix[k][j] == 6) {
                    break;
                }
                nextVisited[k][j] = true;
            }
            break;
        case 1: //right
            for(int k = j; k < M; k++) {
                if(matrix[i][k] == 6) {
                    break;
                }
                nextVisited[i][k] = true;
            }
            
            break;
        case 2: //down
            for(int k = i; k < N; k++) {
                if(matrix[k][j] == 6) {
                    break;
                }
                nextVisited[k][j] = true;
            }
            break;
        case 3: //left
            for(int k = j; k >= 0; k--) {
                if(matrix[i][k] == 6) {
                    break;
                }
                nextVisited[i][k] = true;
            }
            break;
        }
    }
    
    static void search(int cctvIndex, boolean[][] prevVisited) {
        boolean[][] visited = new boolean[N][M];
        if(cctvIndex == cctvList.size()) {
            int temp = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(prevVisited[i][j] == false) {
                        temp++;
                    }
                }
            }
            if(temp < blindSpot) {
                blindSpot = temp;
            }
        } else {
            CCTV cctv = cctvList.get(cctvIndex);
            int i = cctv.i;
            int j = cctv.j;
            int type = cctv.type;
            switch(type) {
            case 1:
                for(int d = 0; d < 4; d++) {
                    for(int n = 0; n < N; n++) {
                        for(int m = 0; m < M; m++) {
                            visited[n][m] = prevVisited[n][m];
                        }
                    }
                    detect(i, j, d, visited);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 2:
                for(int d = 0; d < 2; d++) {
                    for(int n = 0; n < N; n++) {
                        for(int m = 0; m < M; m++) {
                            visited[n][m] = prevVisited[n][m];
                        }
                    }
                    detect(i, j, d, visited);
                    detect(i, j, d + 2, visited);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 3:
                for(int d = 0; d < 4; d++) {
                    for(int n = 0; n < N; n++) {
                        for(int m = 0; m < M; m++) {
                            visited[n][m] = prevVisited[n][m];
                        }
                    }
                    detect(i, j, d, visited);
                    detect(i, j, (d + 1) % 4, visited);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 4:
                for(int d = 0; d < 4; d++) {
                    for(int n = 0; n < N; n++) {
                        for(int m = 0; m < M; m++) {
                            visited[n][m] = prevVisited[n][m];
                        }
                    }
                    detect(i, j, d, visited);
                    detect(i, j, (d + 1) % 4, visited);
                    detect(i, j, (d + 2) % 4, visited);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 5:
                for(int n = 0; n < N; n++) {
                    for(int m = 0; m < M; m++) {
                        visited[n][m] = prevVisited[n][m];
                    }
                }
                detect(i, j, 0, visited);
                detect(i, j, 1, visited);
                detect(i, j, 2, visited);
                detect(i, j, 3, visited);
                search(cctvIndex + 1, visited);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        matrix = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] > 0 && matrix[i][j] < 6) {
                    cctvList.add(new CCTV(i, j, matrix[i][j]));
                }
                if(matrix[i][j] == 6) {
                    visited[i][j] = true;
                }
            }
        }
        
        search(0, visited);
        
        System.out.println(blindSpot);
        
        sc.close();
    }

}

class CCTV {
    int i = 0;
    int j = 0;
    int type = 0;
    CCTV(int i, int j, int type){
        this.i = i;
        this.j = j;
        this.type = type;
    }
}
