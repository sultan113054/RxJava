package third_chapter;

import io.reactivex.rxjava3.core.Observable;

public class ErrorRecoveryOperators {
    public static void main(String[] args) {
       /* Observable.just(6,0,2)
                .map(m->m/i)
                .onErrorReturnItem(-1)
                .subscribe(p-> System.out.println(p));

        Observable.just(6,0,2)
                .map(m->m/i)
                .onErrorReturnItem(-1)
                .subscribe(p-> System.out.println(p)); */

/*        Observable.just(6,0,2)
                .map(m->10/m)
                .onErrorReturn(r->r instanceof ArithmeticException?-1:0)
                .subscribe(p-> System.out.println(p));*/

       /* Observable.just(6, 0, 2)
                .map(m -> {
                    try {
                       return  10 / m;
                    } catch (Exception e) {
                        return -1;
                    }
                })
                .subscribe(p -> System.out.println(p));*/

  /*      Observable.just(6, 0, 2)
                .map(m -> 10 / m)
                .onErrorResumeWith(Observable.just(-1, -2, 3).repeat(2))
                .subscribe(p -> System.out.println(p));*/
    /*    Observable.just(6, 0, 2)
                .map(m -> 10 / m)
                .onErrorResumeWith(Observable.empty())
                .subscribe(p -> System.out.println(p)); */

       /* Observable.just(6, 0, 2)
                .map(m -> 10 / m)
                .onErrorResumeNext((Throwable t)->Observable.just(1,2,3))
                .subscribe(p -> System.out.println(p));*/

        Observable.just(1,2,0)
                .map(e->10/e)
                .retry(2)
                .subscribe(p-> System.out.println(p),e-> System.out.println(e));


    }
}
