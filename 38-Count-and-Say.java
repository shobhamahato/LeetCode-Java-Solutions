class Solution {
    public String countAndSay(int n) {
        String str = "";

        if(n == 1)
        {
            str += n;
            return str;
        }

        String s = "1";

        for(int k = 2; k <= n; k++)
        {
            str = "";

            for(int i = 0; i < s.length(); i++)
            {
                int c = 1;

                while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1))
                {
                    c++;
                    i++;
                }

                str += c;
                str += s.charAt(i);
            }

            s = str;
        }

        return str;
    }
}
