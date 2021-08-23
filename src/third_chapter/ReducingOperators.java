package third_chapter;

import io.reactivex.rxjava3.core.Observable;

public class ReducingOperators {
    public static void main(String[] args) {
       /* Observable.just("a","b","c")
                .count()
                .subscribe(p-> System.out.println(p));*/

        /*Observable.just(1,2,3)
                .reduce((total,i)->total+i)
                .subscribe(p-> System.out.println(p));*/

        Observable.just(1,2,3)
                .reduce("",(total,i)->total+(total.equals("")?"":",")+i)
                .subscribe(p-> System.out.println(p));
    }
}
