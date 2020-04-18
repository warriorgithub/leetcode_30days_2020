package string;

import java.util.Stack;

public class BackSpaceString {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> st = new Stack<>();
        StringBuffer sb = new StringBuffer();
        StringBuffer tb = new StringBuffer();
        for (Character ch : S.toCharArray()) {
            if (ch != '#') {
                st.push(ch);
            } else {
                if(!st.empty())
                    st.pop();
            }
        }
        while (!st.empty()) {
            sb.append(st.pop());
        }
        for (Character ch : T.toCharArray()) {
            if (ch != '#') {
                st.push(ch);
            } else {
                if(!st.empty())
                    st.pop();
            }
        }
        while (!st.empty()) {
            tb.append(st.pop());
        }
        if (sb.toString().equals(tb.toString())) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(new BackSpaceString().backspaceCompare("a##c", "#a#c"));
    }
}

