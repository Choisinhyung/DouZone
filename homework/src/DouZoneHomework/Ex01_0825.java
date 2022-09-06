package DouZoneHomework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex01_0825 {

	public static void main(String[] args) throws Exception {
		
		// 숫자카드는 정수 하나가 적혀있음
		// 상근이가 숫자카드 n개를 가지고 있고
		// 정수 m개가 주어졌을 때 이 수가 적혀있는 숫자카드를 상근이가 가지고 있는지 아닌지~
		// 첫째줄 : 상근이가 가지고 있는 카드의 개수
		// 둘째줄 : 숫자카드에 적혀있는 정수
		// 셋째줄 : 주어질 정수의 개수 
		// 넷째줄 : 주어질 정수
		
		//첫째 줄에 입력으로 주어진 M개의 수에 대해서, 
		//각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.
		
		//Scanner 사용시 시간초과, map, 이분탐색, List, set 사용가능
		// 숫자를 set에 저장 후 m개의 정수에 대해 contains을 사용해 
		// 가지고있는 카드인지 아닌지 구분하자
		
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 상근이가 가지고있는 숫자카드 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) { // 숫자를 set에 저장
            int num = Integer.parseInt(st.nextToken()); // 상근이 숫자카드에 적혀있는 정수
            set.add(num);
        }

        int m = Integer.parseInt(br.readLine()); // 주어질 정수의 개수 입력
        //Stirng은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어 준다
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) { // 주어질 정수
            int num = Integer.parseInt(st.nextToken()); // 주어질 정수입력받기
            if (set.contains(num)) { // 위에서 저장한 set에 들어있는값들이 주어진 정수와 같다면
                sb.append("1 "); // 1출력
            }
            else
                sb.append("0 "); // 아니면 0출력
        }

        System.out.println(sb.toString().trim()); // 공백 제거
    }
}