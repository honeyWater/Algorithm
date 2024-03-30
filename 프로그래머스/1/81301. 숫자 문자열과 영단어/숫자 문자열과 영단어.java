class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            String present = String.valueOf(s.charAt(i));
            String next = i + 1 < s.length() ? String.valueOf(s.charAt(i + 1)) : "";

            if (present.equals("z") && next.equals("e")) {
                sb.append("0");
                i += 4;
            } else if (present.equals("o") && next.equals("n")) {
                sb.append("1");
                i += 3;
            } else if (present.equals("t") && next.equals("w")) {
                sb.append("2");
                i += 3;
            } else if (present.equals("t") && next.equals("h")) {
                sb.append("3");
                i += 5;
            } else if (present.equals("f") && next.equals("o")) {
                sb.append("4");
                i += 4;
            } else if (present.equals("f") && next.equals("i")) {
                sb.append("5");
                i += 4;
            } else if (present.equals("s") && next.equals("i")) {
                sb.append("6");
                i += 3;
            } else if (present.equals("s") && next.equals("e")) {
                sb.append("7");
                i += 5;
            } else if (present.equals("e") && next.equals("i")) {
                sb.append("8");
                i += 5;
            } else if (present.equals("n") && next.equals("i")) {
                sb.append("9");
                i += 4;
            } else {
                sb.append(present);
                i += 1;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}