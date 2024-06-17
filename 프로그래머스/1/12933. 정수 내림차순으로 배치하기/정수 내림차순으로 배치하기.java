import java.util.*;

class Solution {
    public long solution(long n) {
        char[] ch = (n + "").toCharArray();
        Character[] charArr = new Character[ch.length];

        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (Character) ch[i];
        }

        Arrays.sort(charArr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(Character c : charArr){
            sb.append(c);
        }

        return Long.parseLong(sb.toString());
    }
}

/*
이런식으로도 가능함

String str = "Hello, World!";
Character[] characterArray = str.chars()
                                .mapToObj(c -> (char)c)
                                .toArray(Character[]::new);
*/
