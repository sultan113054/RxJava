package fifth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

import java.util.concurrent.TimeUnit;

public class Subjects {
    public static void main(String[] args) throws InterruptedException {
        /*Subject<String> subject= PublishSubject.create();
        subject.map(String::length).subscribe(p-> System.out.println(p));
        subject.onNext("12");
        subject.onNext("2");
        subject.onNext("3");
        subject.onComplete();*/

        Observable<String >ob1=Observable.interval(1, TimeUnit.SECONDS).map(l->(l+1)+" Seconds");
        Observable<String >ob2=Observable.interval(300, TimeUnit.MILLISECONDS).map(l->(l+1)*300+" Miliseconds");
        Subject<String>subject=PublishSubject.create();
        subject.subscribe(p-> System.out.println(p));
        ob1.subscribe(subject);
        ob2.subscribe(subject);
        Thread.sleep(3000);
    }
}
