package WeekSix;

import WeekSix.TrieNode;

import java.util.List;

public class ReplaceWords {
    TrieNode root = new TrieNode(false);
    public String replaceWords(List<String> dictionary, String sentence) {

        String result = "";
        TrieNode root1 =this. root;
        String[] sentences = sentence.split(" ");
        for( int i = 0; i < dictionary.size(); i++){
            add(root1,dictionary.get(i));
        }

        for(int i = 0; i < sentences.length; i++){
            TrieNode node = this.root;
            String word = sentences[i];
            String temp="";
            for( int j = 0; j < word.length(); j++){

                if(!node.children.containsKey(word.charAt(j)) ){
                    break;
                }
                node = node.children.get(word.charAt(j));
                if(node.end){

                    temp+=Character.toString(word.charAt(j));
                    break;
                }
                else{
                    temp+=Character.toString(word.charAt(j));

                }


            }
            if(temp.equals("") || (!temp.equals("") && node != null && !node.end)){
                result+=word;
            }
            else{
                result+=temp;
            }
            result+=" ";
        }
        return result.substring(0,result.length()-1);

    }

    public void add(TrieNode root,String word){
        //System.out.println(word);
        TrieNode node =root;
        for(int i = 0; i < word.length(); i++){
            if(!node.children.containsKey(word.charAt(i))){
                node.children.put(word.charAt(i),new TrieNode(false));
            }
            node = node.children.get(word.charAt(i));
        }
        node.end = true;


    }

}
