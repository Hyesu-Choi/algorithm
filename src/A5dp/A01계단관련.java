package A5dp;

// 기억하기 알고리즘.
public class A01계단관련 {
    public static void main(String[] args) {
//        멀리 뛰기 : 프로그래머스
        /*
        if (n == 1) return 1;  // 초기값부분은 분기처리해줘야함
        if (n == 2) return 2;
        int[] dp = new int[n + 1];  // 1번째칸부터 시작이라 +1한 배열 생성해줘야함.
        dp[1] = 1;  // 초기값 깔아줘야함. 1번쨰 칸에 도달하는 경우의 수 1임
        dp[2] = 2;  // 2번째 칸에 도달하는 경우의 수는 2임

        for (int i = 3; i <= n; i++) {  // 초기값 다음식 3부터 시작
            dp[i] = ( dp[i - 1]%1234567 + dp[i - 2]%1234567 ) % 1234567;
        }
        return dp[n];
         */

//        계단 오르기 : 백준
        /*
        int stages = Integer.parseInt(br.readLine());
        int[] arr = new int[stages+1];
        for(int i=1; i<stages+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[stages+1];
        dp[1] = arr[1];
        if(stages>1) dp[2] = arr[1] + arr[2];
        if(stages>2) dp[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);

        for(int i = 4; i <= stages; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
        }
        System.out.println(dp[stages]);
         */

    }
}
