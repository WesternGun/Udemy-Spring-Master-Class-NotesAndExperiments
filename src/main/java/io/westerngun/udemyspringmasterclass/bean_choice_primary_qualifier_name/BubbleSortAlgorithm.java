package io.westerngun.udemyspringmasterclass.bean_choice_primary_qualifier_name;

import io.westerngun.udemyspringmasterclass.common.SortAlgorithm;
import org.springframework.stereotype.Component;

@Component
class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Bubble sort!");
    }
}
