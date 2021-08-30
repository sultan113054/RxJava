package fourth_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Merge {
    public static void main(String[] args) throws InterruptedException {
        //   Observable<Integer>ob1=Observable.just(1,2);
        //   Observable<Integer>ob2=Observable.just(3,4);
        //   Observable.merge(ob1,ob2).subscribe(p-> System.out.println(p));
        //   ob1.mergeWith(ob2).subscribe(p-> System.out.println(p));
        //    Observable.mergeArray(ob1,ob2).subscribe(p-> System.out.println(p));

        //   List<Observable<Integer>>list= Arrays.asList(ob1,ob2);
        //   Observable.merge(list).subscribe(p-> System.out.println(p));

        Observable<String>ob1=Observable.interval(1, TimeUnit.SECONDS)
                .map(l->l+1)
                .map(l->"source1  "+l+"miliseconds");

        Observable<String>ob2=Observable.interval(600, TimeUnit.MILLISECONDS)
                .map(l->(l+1)*300)
                .map(l->"source2  "+l+"miliseconds");

        Observable<String>ob3=Observable.just("a");

        Observable.merge(ob1,ob2,ob3).subscribe(p-> System.out.println(p));
        Thread.sleep(3000);

    }
}
