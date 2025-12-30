package A2dfs;

public class A02이차원배열의완전탐색 {

    public static void main(String[] args) {
//        일반적으로 2차원의 지도는 2차원 배열 형태로 주어짐
//        갈 수 있는 곳, 갈 수 없는 곳, 출발지, 도착지 등이 숫자값으로 주어짐
        int[][] arr = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 2, 1}, {1, 1, 1, 1}};  // 이건 나중에 static으로 설계하면됨
        int[] current = {0, 0};  // 0,0 부터 시작할꺼임
        dfs(arr, current);


    }

    static void dfs(int[][] arr, int[] current) {
//        가는 방법이 일반적으로 "상,하,좌,우" 로 주어지거나 대각선까지 추가되는 경우 있음.
//        위로 이동 : {x-1, y}
//        아래로 이동 : {x+1, y}
//        왼쪽으로 이동 : {x, y-1}
//        오른쪽으로 이동 : {x, y+1}
        int[] dx = {-1, 1, 0, 0};  // dx,dy배열 순서는 딱히 상관없는데 dy랑 쌍으로 잘 이루어져있어야함
        int[] dy = {0, 0, -1, 1};
        for (int k = 0; k < 4; k++) {
            int nx = current[0] + dx[k];
            int ny = current[1] + dy[k];
            if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {  // 왼쪽, 위쪽, 오른쪽, 아래쪽 벗어나면
                dfs(arr, new int[]{nx, ny});
            }
        }
    }
}

// 관련 문제풀이 : 숫자판점프 - 백준 set쓰고, visited배열 필요없음. 시작점도 없음. 상하좌우.

