package fourth_chapter;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableError;
import io.reactivex.rxjava3.observables.GroupedObservable;

public class Grouping {
    public static void main(String[] args) {
        Observable<String>observable= Observable.just("abc","defg","hid","");
        Observable<GroupedObservable<Integer,String>>groupedObservableObservable=observable.groupBy(g->g.length());
        //groupedObservableObservable.flatMapSingle(m->m.toList()).subscribe(p-> System.out.println(p));

        groupedObservableObservable.flatMapSingle(g->g.reduce("",(x,y)->x.equals("")?y:x+","+y).map(d->g.getKey()+" : "+d))
                .subscribe(p-> System.out.println(p));

    }
}
