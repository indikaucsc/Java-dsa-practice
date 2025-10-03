package com.kamal.ds;

import java.util.*;

class AlienDictionary {
    public String alienOrder(@org.jetbrains.annotations.NotNull String[] words) {
        Map<Character, Set<Character>> g = new HashMap<>();
        int[] indeg = new int[26];
        Arrays.fill(indeg, -1);
        for (String w: words) for (char c: w.toCharArray())
            if (indeg[c-'a'] == -1) { indeg[c-'a']=0; g.put(c,new HashSet<>()); }

        for (int i=0;i<words.length-1;i++) {
            String a = words[i], b = words[i+1];
            if (a.startsWith(b) && a.length()>b.length()) return "";
            int len = Math.min(a.length(), b.length());
            for (int j=0;j<len;j++) if (a.charAt(j)!=b.charAt(j)) {
                if (g.get(a.charAt(j)).add(b.charAt(j))) indeg[b.charAt(j)-'a']++;
                break;
            }
        }
        Deque<Character> dq = new ArrayDeque<>();
        for (char c: g.keySet()) if (indeg[c-'a']==0) dq.add(c);
        StringBuilder sb = new StringBuilder();
        while (!dq.isEmpty()) {
            char u = dq.remove();
            sb.append(u);
            for (char v: g.get(u)) if (--indeg[v-'a']==0) dq.add(v);
        }
        return sb.length()==g.size()? sb.toString() : "";
    }
}

