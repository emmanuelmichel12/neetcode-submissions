class Solution {
    public boolean isValid(String s) {
        char open1 = '(';
        char open2 = '{';
        char open3 = '[';

        char closed1 = ')';
        char closed2 = '}';
        char closed3 = ']';

        char[] arr = s.toCharArray();
        Stack <Character> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == open1 || arr[i] == open2 || arr[i] == open3)
            {
                stack.push(arr[i]);
            }

            if(arr[i] == closed1 || arr[i] == closed2 || arr[i] == closed3)
            {
                if(stack.empty())
                {
                    return false;
                }
                char check = stack.peek();

                if(arr[i] == closed1 && check == open1)
                {
                    stack.pop();
                }
                else if(arr[i] == closed2 && check == open2)
                {
                    stack.pop();
                }
                else if(arr[i] == closed3 && check == open3)
                {
                    stack.pop();    
                }
                else
                {
                    return false;
                }
            }
        }

        if(!stack.empty())
        {
            return false;
        }

        return true;
    }
}
