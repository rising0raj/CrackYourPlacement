class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxRectangle = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
                heights[j]=(matrix[i][j]=='1')? (heights[j] += 1 ):0;
            maxRectangle = Math.max(maxRectangle, largestRectangleArea(heights));
        }

        return maxRectangle;
    }

    int largestRectangleArea(int[] histo) {
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
        
    }
}
