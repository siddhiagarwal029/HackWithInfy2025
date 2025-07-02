# HackWithInfy2025
Problem 1: Activity selection problem
=====================================
Approach summary: Used greedy algorithm to select the activities that can be done in the given time slots.
steps to do it:
1. take input of number of activities and time slots(a 2d array) suchas [[1, 2], [2, 3], [3, 4]] where first element is start time and second element is end time
2. sort the activities based on their end time , so that we can select the activity with the earliest end time first . Done by using lambda expression in java.
3. select the activities one by one and check if it can be done in the given time slot.
4. if it can be done then add it to the result list and update the end time of the last.
5. return the result list.
6. And return the size of the result list as the answer.

LEETCODE QUESTION 646: https://leetcode.com/problems/maximum-length-of-pair-chain/

Time Complexity: O(n log n) 
Space Complexity: O(n) 
Status: Its done but needs revision about 2d array methods and Greedy search algorithm
