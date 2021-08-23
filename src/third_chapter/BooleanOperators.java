package third_chapter;

import io.reactivex.rxjava3.core.Observable;

//Sub category of reducing operators
public class BooleanOperators {
    public static void main(String[] args) {
  /*      Observable.just(1,2,10,12)
                .all(i->i<20)
                .subscribe(p-> System.out.println(p));

        Observable.just(100,200,100,120)
                .any(i->i>20)
                .subscribe(p-> System.out.println(p));*/
       /* Observable.just(100, 200, 100, 120)
                .filter(s -> s < 10)
                .isEmpty().subscribe(p -> System.out.println(p));

        Observable.range(1, 100)
                .contains(9).subscribe(p -> System.out.println(p));*/

        Observable<String>ob1=Observable.just("1","2");
        Observable<String>ob2=Observable.just("2","1");
        Observable<String>ob3=Observable.just("1","2");

        Observable.sequenceEqual(ob1,ob2).subscribe(s-> System.out.println(s));
        Observable.sequenceEqual(ob1,ob3).subscribe(s-> System.out.println(s));

    }
}
