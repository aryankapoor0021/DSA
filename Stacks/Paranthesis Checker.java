
class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        Stack<Character> st=new Stack<Character>();
        char []ch=x.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
            {
                st.push(ch[i]);
                continue;
            }
            if(st.isEmpty())
            {
                return false;
            }
            char check; 
            switch (ch[i]) { 
            case ')': 
                check = st.pop(); 
                if (check == '{' || check == '[') 
                    return false; 
                break; 
  
            case '}': 
                check = st.pop(); 
                if (check == '(' || check == '[') 
                    return false; 
                break; 
  
            case ']': 
                check = st.pop(); 
                if (check == '(' || check == '{') 
                    return false; 
                break; 
            } 
            
        }
        if(st.isEmpty())
         return true;
         else 
         return false;
        
        
    }
}
