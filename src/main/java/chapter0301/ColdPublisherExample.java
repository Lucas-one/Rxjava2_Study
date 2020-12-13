package chapter0301;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;

import java.util.*;

public class ColdPublisherExample {
    public static void main(String[] args) {

        Flowable<Integer> flowable = Flowable.just(1,3,5,7);

        flowable.subscribe(data -> System.out.println("구독자 1: " + data));
        flowable.subscribe(data -> System.out.println("구독자 2: "+  data));
    }
}
