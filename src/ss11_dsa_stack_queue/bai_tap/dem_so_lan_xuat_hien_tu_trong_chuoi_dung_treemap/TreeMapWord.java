package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_tu_trong_chuoi_dung_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWord {
    public static void main(String[] args) {
        String wordString = new String("You say yes , i say no , you say stop and i say go go go , oh no");
        wordString = wordString.toLowerCase();
        String[] wordArray = wordString.split("");

        TreeMap<String, Integer> treeMapWord = new TreeMap<String, Integer>();

        for (int i = 0; i < wordArray.length; i++) {
            int count = 0;
            for (int j = 0; j < wordArray.length; j++) {
                if(wordArray[i].equals(wordArray[j])) {
                    count++;
                }
            }
            treeMapWord.put(wordArray[i],count);
        }
        for (Map.Entry m: treeMapWord.entrySet()
             ) {
            System.out.println(m.getKey()+" "+ m.getValue());
        }
    }
}
