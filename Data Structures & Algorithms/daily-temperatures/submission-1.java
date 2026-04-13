class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // [30,38,30,36,35,40,28]
        // [0 ,1 ,2 ,3 ,4 ,5 ,6]
        // stack : 1 3 4
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] <  temperatures[i]){
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);

        }
        return result;
        
    }
}
