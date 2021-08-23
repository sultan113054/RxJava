package third_chapter;

import io.reactivex.rxjava3.core.Observable;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionOperator {
    public static void main(String[] args) {
       /* Observable.just("1","2","3")
                .toList()
                .subscribe(p-> System.out.println(p));*/

  /*      Observable.just("4","3","2")
                .toSortedList()
                .subscribe(p-> System.out.println(p));*/

      /*  Observable.just("abc","def")
                .toMap(p->p.charAt(0))
                .subscribe(p-> System.out.println(p));

        Observable.just("abc","def")
                .toMap(p->p.charAt(0),String::length)
                .subscribe(p-> System.out.println(p));*/

     /*   Observable.just("abc", "def")
                .toMap(p -> p.charAt(0), String::length, ConcurrentHashMap::new)
                .subscribe(p -> System.out.println(p));*/
        /*Observable.just("abc", "def")
                .toMap( String::length)
                .subscribe(p -> System.out.println(p));*/

       /* Observable.just("abc", "def")
                .toMultimap( String::length)
                .subscribe(p -> System.out.println(p));*/

        Observable.just("1","2","3")
                .collect(HashSet<String>::new,HashSet::add)
                .subscribe(p-> System.out.println(p));

    }
}
