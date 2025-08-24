import java.util.Stack;

public class Characters {
public static int [] removeConsecuncens(int [] arr){

    int  n = arr.length;
    Stack<Integer> st = new Stack<>();
   
    for(int i=0; i<n; i++){
         if (st.size()==0||st.peek()!=arr[i]){
         st.push(arr[i]);
         }

        else if(st.peek()==arr[i]){
             if(i==n-1||arr[i]!=arr[i+1]){
            st.pop();
             }
         }
        }
         int [] ans = new int[st.size()];
          for(int i=ans.length-1; i>=0; i--){
            ans[i] = st.pop();
          }
     return ans;
   }

}
