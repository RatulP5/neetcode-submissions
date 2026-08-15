class Solution {
    public boolean isValid(String str) {
        Deque<Character> dq=new ArrayDeque<>();
        for(char c: str.toCharArray()){
            if(c=='{' || c=='[' || c=='(') dq.addLast(c);
            else if(dq.isEmpty()) return false;
            else if(c=='}') {if(dq.removeLast()!='{') return false;}
            else if(c==']') {if(dq.removeLast()!='[') return false;}
            else if(c==')') {if(dq.removeLast()!='(') return false;}
        }
        if(!dq.isEmpty()) return false;
        return true;
    }
}
