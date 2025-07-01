/*Title: Activity Selection Problem
 Description:
 You are given n activities with start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
 Input Format:
 n
 start1 end1
 start2 end2
 ...
 startn endn
 Output Format:
 Maximum number of non-overlapping activities
 Sample Input:
 6
 1 3
 2 4
 3 5
 0 6
 5 7
 8 9
 Sample Output:
 4*/
package GreedyApproach;
import java.util.*;
public class prblm1_activitySelection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<int[]> activityList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            if (start < end) {
                activityList.add(new int[]{start, end});
            }
        }
        int[][] activities = activityList.toArray(new int[0][0]);
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));
        for (int[] activity : activities) {
            System.out.println(Arrays.toString(activity));
        } 
        int count = 1;
        int lastend = activities[0][1];
        for(int i=1;i<n;i++) {
            if(activities[i][0]>=lastend){
                count++;
                lastend=activities[i][1];
            }
}
        System.out.println(count);
        sc.close();
}
}