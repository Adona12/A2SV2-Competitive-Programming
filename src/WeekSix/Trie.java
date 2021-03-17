package WeekSix;

import java.util.HashMap;

public class  Trie {

        /** Initialize your data structure here. */
        TrieNode node;
public Trie() {
        node = new TrieNode(false);

        }

/** Inserts a word into the trie. */
public void insert(String word) {
        TrieNode current = this.node;
        for(int i = 0; i < word.length(); i++ ){
        if(! current.children.containsKey(word.charAt(i))){
        current.children.put(word.charAt(i),new TrieNode(false));

        }
        current = current.children.get(word.charAt(i));
        }
        current.end = true;
        }

/** Returns if the word is in the trie. */
public boolean search(String word) {
        TrieNode current = this.node;

        for( int i = 0; i < word.length(); i++){
        if( !current.children.containsKey((word.charAt(i)))){
        return false;
        }

        current = current.children.get(word.charAt(i));

        if( i == word.length()-1 && !current.end){
        return false;
        }
        }

        return true;
        }

/** Returns if there is any word in the trie that starts with the given prefix. */
public boolean startsWith(String prefix) {
        TrieNode current = this.node;

        for( int i = 0; i < prefix.length(); i++){
        if( current.children.containsKey((prefix.charAt(i)))){
        current = current.children.get(prefix.charAt(i));
        }
        else{
        return false;
        }

        }

        return true;
        }
        }
class TrieNode {

    HashMap<Character,TrieNode> children;
    boolean end;
    public TrieNode(boolean end) {
        children = new HashMap<>();
        this.end= end;
    }
}
