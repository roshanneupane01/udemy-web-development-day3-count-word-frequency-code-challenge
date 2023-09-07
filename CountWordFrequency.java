import java.util.HashMap;

class CountWordFrequency {

    public static void main(String[] args) {
        System.out.println(wordFrequencyCount(new String[]{"Apple", "Banana", "Orange", "Apple", "Orange", "Banana", "Apple"}));
    }

    private static HashMap<String, Integer> wordFrequencyCount(String[] wordArray) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : wordArray) {
            if(!map.containsKey(word)){
                map.put(word, 1);
                System.out.println("Word: " + word + ", " + "map: " + map);
            }else{
                map.put(word, map.get(word) + 1);
                System.out.println("Word: " + word + " " + "map: " + map);
            }
            
        }

        return map;
    }
}