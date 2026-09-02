class Solution {
    public int longestValidParentheses(String s) {

        int n = s.length();
        int[] stack = new int[n + 1];
        int top = -1;

        stack[++top] = -1;

        int max = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(') {
                stack[++top] = i;
            } else {

                top--;

                if (top == -1) {
                    stack[++top] = i;
                } else {
                    int len = i - stack[top];
                    if (len > max) {
                        max = len;
                    }
                }
            }
        }

        return max;
    }
}
