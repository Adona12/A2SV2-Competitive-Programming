package WeekThree;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freqwords = new HashMap<String,Integer>();
        for(int i = 0; i < words.length; i++){
            if(freqwords.containsKey(words[i])){

                freqwords.put(words[i],(freqwords.get(words[i]) + 1));
            }else{

                freqwords.put(words[i],1);
            }

        }
        PriorityQueue<Word> maxheap = new PriorityQueue<>(new Comparator<Word>(){
            public int compare(Word word1, Word word2){
                if(word1.frequency < word2.frequency){
                    return 1;
                }
                else if(word1.frequency > word2.frequency){
                    return -1;
                }
                else{
                    for(int i=0;i <word1.element.length();i++){
                        if(i >= word2.element.length()){
                            return 1;
                        }
                        int ascii1=word1.element.charAt(i);
                        int ascii2=word2.element.charAt(i);
                        if(ascii1 > ascii2){
                            return 1;
                        }else if(ascii1 < ascii2){
                            return -1;
                        }
                    }
                    if(word2.element.length() > word1.element.length()){
                        return -1;
                    }
                    return 0;
                }
            }
        });
        for(Map.Entry<String,Integer> entry : freqwords.entrySet()){
            maxheap.add(new Word(entry.getKey(),entry.getValue()));
        }
        List<String> result = new ArrayList<String>();


        for(int i = 0; i < k; i++){
            result.add(maxheap.poll().element);
        }
        return result;
    }
}
class Word{
    String element;
    int frequency;
    Word(String element,int frequency){
        this.element=element;
        this.frequency=frequency;
    }
}
