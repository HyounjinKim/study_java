package ex10;

public class Solution {
    public Solution() {
        String num = "123";

        solution(num);
    }

    public int solution(String number) {
        int answer = 0;
        char[] arr = number.toCharArray();
        int[] brr = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i] - 48;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + brr[i];
        }

        answer = sum % 9;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new Solution(); // heap 영역
    }
}
