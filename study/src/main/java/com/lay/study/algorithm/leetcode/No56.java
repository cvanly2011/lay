package com.lay.study.algorithm.leetcode;

import java.util.*;

/**
 * @Author yalei.chen
 * @Date 2017/10/13
 * @Since JDK 1.8
 */
public class No56 {

    public static void main(String[] args) {


        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));
        merge1(intervals);
    }

    public class MyComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ans = new ArrayList<Interval>();
        if (intervals.size() == 0) return ans;

        Collections.sort(intervals, new MyComparator());

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (int i = 0; i < intervals.size(); i++) {
            Interval inter = intervals.get(i);
            if (inter.start > end) {
                ans.add(new Interval(start, end));
                start = inter.start;
                end = inter.end;
            } else {
                end = Math.max(end, inter.end);
            }
        }
        ans.add(new Interval(start, end));

        return ans;
    }

    public static List<Interval> merge1(List<Interval> intervals) {

        List<Interval> result = new ArrayList<>();

        boolean[] merged = new boolean[intervals.size()];

        for (int i = 0;i<intervals.size();i++){

            Interval in1 = intervals.get(i);

            if(merged[i]){
                continue;
            }

            for (int j = i+1; j < intervals.size(); j++) {

                Interval in2 = intervals.get(j);

                if((in1.start <= in2.start && in1.end >= in2.start) || (in2.start <= in1.start && in2.end >= in1.start)){
                    in1 = new Interval(Math.min(in1.start,in2.start),Math.max(in1.end,in2.end));
                    merged[j] = true;
                }

            }

            boolean canAdd = true;
            for (Interval interval: result) {

                if((in1.start <= interval.start && in1.end >= interval.start) || (interval.start <= in1.start && interval.end >= in1.start)){
                    canAdd = false;
                    break;
                }

            }

            if(canAdd){
                result.add(in1);
            }


        }

        return result;
    }

}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}
