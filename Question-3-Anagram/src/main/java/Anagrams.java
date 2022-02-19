import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = sc.nextLine();
        verifyAnagram(word);
    }

    static void verifyAnagram(String p){
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            for(int j = i; j < p.length(); j++){
                char[] sub = p.substring(i, j+1).toCharArray();
                Arrays.sort(sub);
                String substring = new String(sub);
                if (map.containsKey(substring))
                    map.put(substring, map.get(substring)+1);
                else
                    map.put(substring, 1);
            }
        }

        int contAnam = 0;
        for(String subs: map.keySet()){
            int q = map.get(subs);
            contAnam += (q * (q-1))/2;
        }
        System.out.println(contAnam);
    }
}