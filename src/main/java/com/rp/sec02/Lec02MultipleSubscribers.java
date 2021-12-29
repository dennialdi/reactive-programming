package com.rp.sec02;

import reactor.core.publisher.Flux;

public class Lec02MultipleSubscribers {
    public static void main(String[] args) {
        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4);

        Flux<Integer> evenflux = integerFlux.filter(i->i %2==0);
        integerFlux.subscribe(i-> System.out.println("Sub 1 :"+i));
        evenflux.subscribe(i-> System.out.println("Sub 2 :"+i));

    }

}
