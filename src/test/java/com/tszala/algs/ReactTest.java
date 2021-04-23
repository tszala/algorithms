package com.tszala.algs;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReactTest {

    @Test
    public void produceSomeData() {
        List<Integer> numbers = new ArrayList<>();
        Flux<Integer> otherPublisher = Flux.just(10, 11, 12, 14);

        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4).zipWith(otherPublisher, Integer::sum);
        integerFlux
                .log().subscribe(numbers::add);

        Mono<List<Integer>> listMono = integerFlux.collectList();

        List<Integer> block = listMono.block();

        assertThat(numbers).contains(11,13,15,18);
        assertThat(block).contains(11,13,15,18);
    }

}
