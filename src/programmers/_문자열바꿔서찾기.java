package programmers;

public class _문자열바꿔서찾기 {
    public static void main(String[] args) {
        int answer1 = solution("ABBAA","AABB");
        int answer2 = solution("ABAB", "ABAB");

        System.out.println(answer1);
        System.out.println(answer2);
    }

    static public int solution(String myString, String pat) {
        String newString = "";

        for(int i=0; i<myString.length();i++){
            if(myString.charAt(i) == 'A')
                newString += "B";
            else
                newString += "A";
        }

        if(newString.contains(pat))
            return 1;
        else
            return 0;
    }
}
