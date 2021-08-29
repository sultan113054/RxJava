package first_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class FirstChapter {
    public static void main(String[] args) {
        Observable<String>one=Observable.just("one","two","three");
        one.subscribe(s-> System.out.println(s));

        //we can use map() to turn each string emission into its length(),
        // and each length integer will then be pushed to Observer
        Observable<String>two=Observable.just("one","two","three");
        two.map(s->s.length()).subscribe(s-> System.out.println(s));

        //Observable.interval() will push a consecutive Long at each specified time interval
        Observable<Long>three=Observable.interval(1, TimeUnit.SECONDS);
        three.subscribe(s-> System.out.println(s));
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
