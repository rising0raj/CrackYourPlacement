class Solution {
    // Function to find minimum number of pages.
      public static int countstudents(int[] arr, int pages)
    {
        int students = 1;
        long pagestudent = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(pagestudent + arr[i] <= pages)
            {
                pagestudent += arr[i];
            }
            else
            {
                students += 1;
                pagestudent = arr[i];
            }
        }
        
        return students;
    }

    public static long findPages(int n, int[] arr, int m) {
     
        if(m>n){
            return -1;
        }
        
        
        
        int low = arr[0];
        int high = 0;
        
        for (int i = 0; i < n; i++)
        {
            if(arr[i] > low)
            {
                low = arr[i];
            }
            high += arr[i];
        }
        
         while(low <= high)
        {
            int mid = (low + high) / 2;
            int students = countstudents(arr, mid);
            if(students > m)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return (long)low;
    }
};
