package com.example.querydsl.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriceGenerator {
    List<Integer> priceList =
            Arrays.asList(1000, 2000, 3000, 4000, 5000, 5500, 60000, 7000);

    public int priceGenerator() {
        Collections.shuffle(priceList);
        return priceList.get(0);
    }
}
