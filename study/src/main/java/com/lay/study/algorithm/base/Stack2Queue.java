package com.lay.study.algorithm.base;

import java.util.Stack;

/**
 * 利用两个堆实现队列
 * @author yalei.chen
 * @date 2018/2/5
 * @since JDK 1.8
 */
public class Stack2Queue<T> {

    public static void main(String[] args) {

        Stack2Queue<Integer> test = new Stack2Queue<>();
        test.add(1);
        test.add(2);

        while (test.size>0){
            System.out.println(test.poll());
        }
    }

    private Integer size = 0;
    private Stack<T> stack = new Stack<T>();
    private Stack<T> queue = new Stack<T>();

    public void add(T item){
        stack.push(item);
        size++;
    }

    public T poll(){

        while (!stack.isEmpty()){
            queue.push(stack.pop());
        }

        T pop = queue.pop();
        size--;

        //恢复stack
        while (!queue.isEmpty()){
            stack.push(queue.pop());
        }

        return pop;
    }
}
