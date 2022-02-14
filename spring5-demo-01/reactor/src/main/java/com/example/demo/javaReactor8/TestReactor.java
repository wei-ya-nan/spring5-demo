package com.example.demo.javaReactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class TestReactor {
    public static void main(String[] args) {
        //just 方法直接声明
        Flux.just(1,2,3,4);
        Mono.just(1);
        //其他的方法
        Integer[] array = {1,2,3,4};
        Flux.fromArray(array);
        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);
        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);

        //just方法直接声明
        Flux.just(1,2,3,4).subscribe(System.out::println);
        Mono.just(1).subscribe(System.out::println);


    }
}
