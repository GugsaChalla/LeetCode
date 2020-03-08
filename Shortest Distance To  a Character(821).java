public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] res = new int[len];
        int prev = -len;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == C)   prev = i;
            res[i] = i - prev;
        }
        
        prev = len * 2;
        for (int i = len - 1; i >= 0; i--) {
            if (S.charAt(i) == C)   prev = i;
            res[i] = Math.min(res[i], prev - i);
        }
        return res;
    }