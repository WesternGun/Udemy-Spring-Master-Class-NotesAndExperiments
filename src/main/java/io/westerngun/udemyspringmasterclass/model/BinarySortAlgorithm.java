package io.westerngun.udemyspringmasterclass.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BinarySortAlgorithm implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Binary sort!");
    }
}
