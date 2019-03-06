public class LongestCommonPrefix14 {

    public static void main(String[] args) {

        String[] strs  = {"flower", "flow", "flight"}, strs2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}