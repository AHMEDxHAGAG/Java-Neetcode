class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='[')st.push(c);
            else{
                switch (c){
                    case ')': if(!st.empty()&&st.peek()=='(' )st.pop();else st.push(c);  break;
                    case '}': if(!st.empty()&&st.peek()=='{' )st.pop();else st.push(c);  break;
                    case ']': if(!st.empty()&&st.peek()=='[' )st.pop();else st.push(c);  break;
                    default: st.push(c); break;
                }
            }
        }
        return st.empty()?true:false;
    }
}