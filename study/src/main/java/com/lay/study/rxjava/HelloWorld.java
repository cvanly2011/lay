package com.lay.study.rxjava;

import io.reactivex.*;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @Author yalei.chen
 * @Date 2017/9/20
 * @Since JDK 1.8
 */
public class HelloWorld {

    public static void main(String[] args) throws Exception {


        demo1();
//        demo2();
    }


    public static void test2(String... names) throws InterruptedException {


        Observable<String> fromObs = Observable.fromArray(names);

        Observable<String> oneItemObs = Observable.just("one item");


    }

    public static void  demo1(){

       Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {

           @Override
           public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Exception {
               emitter.onNext(1);
               emitter.onNext(2);
               emitter.onNext(3);
               emitter.onComplete();
           }
       });


        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable disposable) {

                System.out.println("subscribe");
            }

            @Override
            public void onNext(@NonNull Integer value) {

                System.out.println("next:"+value);
            }

            @Override
            public void onError(@NonNull Throwable throwable) {

                System.out.println("error");
            }

            @Override
            public void onComplete() {

                System.out.println("complete");
            }
        };

        observable.subscribeWith(observer);

    }


//    public static void  demo2(){
//
//        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
//
//            @Override
//            public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Exception {
//                emitter.onNext(1);
//                emitter.onNext(2);
//                emitter.onNext(3);
//                emitter.onComplete();
//            }
//        }).subscribeWith((E) new Observer<Integer>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable disposable) {
//
//                System.out.println("subscribe");
//            }
//
//            @Override
//            public void onNext(@NonNull Integer value) {
//
//                System.out.println("next:"+value);
//            }
//
//            @Override
//            public void onError(@NonNull Throwable throwable) {
//
//                System.out.println("error");
//            }
//
//            @Override
//            public void onComplete() {
//
//                System.out.println("complete");
//            }
//        });
//
//    }





    public static void test1() throws InterruptedException {
        Flowable.fromCallable(() -> {
            Thread.sleep(1000); //  imitate expensive computation
            return "Done";
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single())
                .subscribe(System.out::println, Throwable::printStackTrace);

        Thread.sleep(2000); // <--- wait for the flow to finish
    }

}
