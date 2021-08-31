package fifth_chapter;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableError;
import io.reactivex.rxjava3.subjects.*;

import java.util.concurrent.TimeUnit;

public class Subjects {
    public static void main(String[] args) throws InterruptedException {
        /*Subject<String> subject= PublishSubject.create();
        subject.map(String::length).subscribe(p-> System.out.println(p));
        subject.onNext("12");
        subject.onNext("2");
        subject.onNext("3");
        subject.onComplete();*/

  /*      Observable<String >ob1=Observable.interval(1, TimeUnit.SECONDS).map(l->(l+1)+" Seconds");
        Observable<String >ob2=Observable.interval(300, TimeUnit.MILLISECONDS).map(l->(l+1)*300+" Miliseconds");
        Subject<String>subject=PublishSubject.create();
        subject.subscribe(p-> System.out.println(p));
        ob1.subscribe(subject);
        ob2.subscribe(subject);
        Thread.sleep(3000);*/

   /*     Subject<String>subject=PublishSubject.create();
        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");
        subject.onComplete();
        subject.map(m-> m.contains("a")).subscribe(p-> System.out.println(p));

         Subject<String> subject1=PublishSubject.<String>create().toSerialized();*/

/*        Subject<String>subject= BehaviorSubject.create();
        subject.subscribe(p-> System.out.println(p));
        subject.onNext("1");
        subject.onNext("2");
        subject.onNext("13");
        subject.subscribe(p-> System.out.println(p));*/

   /*     Subject<String>subject= ReplaySubject.create();
        subject.subscribe(p-> System.out.println(p));
        subject.onNext("1");
        subject.onNext("2");
        subject.onComplete();
        subject.subscribe(p-> System.out.println("test "+p));*/

       /* Subject<String>subject= AsyncSubject.create();
        subject.subscribe(s-> System.out.println(s),e-> System.out.println(e),()-> System.out.println("done"));
        subject.onNext("1");
        subject.onNext("2");
        subject.onNext("3");
        subject.onComplete();
        subject.subscribe(p-> System.out.println(p),e-> System.out.println(e),()-> System.out.println("done"));*/

        /*Subject<String>subject=UnicastSubject.create();
        Observable.interval(300, TimeUnit.MILLISECONDS)
                .map(m->(m+1)*300+" Miliseconds").subscribe(subject);
        Thread.sleep(2000);
        subject.subscribe(p-> System.out.println(p));
        Thread.sleep(2000);*/

        Subject<String> subject = UnicastSubject.create();
        Observable.interval(300, TimeUnit.MILLISECONDS)
                .map(m -> (m + 1) * 300+"")
                .subscribe(subject);
        Thread.sleep(1000);
        Observable<String>ob2=subject.publish().autoConnect();
        ob2.subscribe(p-> System.out.println("ob2: "+p));
        Thread.sleep(1000);
        ob2.subscribe(p-> System.out.println("ob3: "+p));
        Thread.sleep(1000);


    }
}
