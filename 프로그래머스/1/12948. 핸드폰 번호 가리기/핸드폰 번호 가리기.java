class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int frontLength = phone_number.length() - 4;
        String backString = phone_number.substring(frontLength);

        // sb.append("*".repeat(frontLength)); 이렇게도 가능 !
        for (int i = 0; i < frontLength; i++) {
            sb.append("*");
        }
        sb.append(backString);

        return sb.toString();
    }
}