class Solution {
    public int solution(String dartResult) {
        int[] num = new int[3];
        int len = dartResult.length();

        int n = 0;
        for (int i = 0; i < len; i++) {
            char temp = dartResult.charAt(i);
            switch (temp) {
                case 'S':
                    break;
                case 'D':
                    num[n - 1] = (int) Math.pow(num[n - 1], 2);
                    break;
                case 'T':
                    num[n - 1] = (int) Math.pow(num[n - 1], 3);
                    break;
                case '#':
                    num[n - 1] = -1 * num[n - 1];
                    break;
                case '*':
                    if (n >= 2) {
                        num[n - 2] = 2 * num[n - 2];
                    }
                    num[n - 1] = 2 * num[n - 1];
                    break;
                default:
                    if (isDigit(dartResult.charAt(i + 1))) { // 다음 문자가 숫자이면 10임을 의미함
                        num[n++] = 10;
                        i++;
                    } else {
                        num[n++] = temp - '0';
                    }
                    break;
            }
        }

        return num[0] + num[1] + num[2];
    }
    
    private static boolean isDigit(char c) {
        c -= '0';
        if (c >= 0 && c <= 9) {
            return true;
        }
        return false;
    }
}
