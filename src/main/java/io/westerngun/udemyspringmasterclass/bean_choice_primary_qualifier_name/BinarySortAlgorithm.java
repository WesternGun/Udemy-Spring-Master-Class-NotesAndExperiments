package io.westerngun.udemyspringmasterclass.bean_choice_primary_qualifier_name;

import io.westerngun.udemyspringmasterclass.common.SortAlgorithm;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class BinarySortAlgorithm implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Binary sort!");
    }
}
