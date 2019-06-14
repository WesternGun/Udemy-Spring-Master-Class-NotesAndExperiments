package io.westerngun.udemyspringmasterclass.bean_choice_primary_qualifier_name;

import io.westerngun.udemyspringmasterclass.common.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
class BubbleSortAlgorithmQualifier implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Bubble sort(qualifier)!");
    }
}
