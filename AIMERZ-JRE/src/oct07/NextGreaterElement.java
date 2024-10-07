package oct07;

import java.util.Stack;

public class NextGreaterElement {
    public long[] nextLargerElement(long[] arr, int n)
    {
        long[] ans = new long[n];
        Stack<Long> stk = new Stack<>();
        for(int i = n-1; i>=0; i--){
            if(stk.isEmpty()) ans[i] = -1;
            else if(!stk.isEmpty() && stk.peek()>arr[i]) ans[i] = stk.peek();
            else if(!stk.isEmpty() && stk.peek()<=arr[i]){
                while(!stk.isEmpty() && stk.peek()<=arr[i]) stk.pop();
                if(stk.isEmpty()) ans[i] = -1;
                else ans[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return ans;
    }
}
