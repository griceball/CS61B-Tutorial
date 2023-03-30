public class Palindrome {
    //change word from string to deque
    public Deque<Character> wordToDeque(String word){
        Deque<Character> d=new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            d.addLast(ch);
        }
        return d;
    }
    //judge is a palindrome or not
    public boolean isPalindrome(String word) {
        Deque word_deque=wordToDeque(word);
        return isPalindromeHelper(word_deque);
    }
    public boolean isPalindromeHelper(Deque d){
        if(d.size()==0 || d.size()==1){
            return true;
        }
        if(d.removeFirst()!=d.removeLast()){
            return false;
        }
        return isPalindromeHelper(d);
    }
    //check diff=1 palindrome
    public boolean isPalindrome(String word,CharacterComparator cc){
        for(int i=0;i<word.length()/2;i++){
            if(!cc.equalChars(word.charAt(i),word.charAt(word.length()-i-1))){
                return false;
            }
        }
        return true;
    }
}
