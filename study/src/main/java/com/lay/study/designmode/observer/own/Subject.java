package com.lay.study.designmode.observer.own;

/**
 * 观察者主题类
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notityObservers();
}
