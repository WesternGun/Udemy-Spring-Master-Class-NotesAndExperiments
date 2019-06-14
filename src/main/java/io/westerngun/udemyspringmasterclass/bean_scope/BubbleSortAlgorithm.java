package io.westerngun.udemyspringmasterclass.bean_scope;

import io.westerngun.udemyspringmasterclass.common.SortAlgorithm;
import org.springframework.stereotype.Component;

@Component
class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Bubble sort!");
    }
}
