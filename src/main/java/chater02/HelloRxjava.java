package chater02;
import java.io.*;
import java.util.*;
import io.reactivex.Observable;

public class HelloRxjava {
    public static void main(String[] args){
        Observable<String> observable = Observable.just("Hello", "Rxjava");
        observable.subscribe(data -> System.out.println(data));


    }
}
