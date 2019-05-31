package io.westerngun.udemyspringmasterclass.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
//@Scope("prototype") // @Scope should be combined with @Component, at class level on the class you want to create instance
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // using constants is better
public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Bubble sort!");
    }
}
