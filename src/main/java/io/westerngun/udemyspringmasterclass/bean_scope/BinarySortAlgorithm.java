package io.westerngun.udemyspringmasterclass.bean_scope;

import io.westerngun.udemyspringmasterclass.common.SortAlgorithm;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Scope("singleton") // by default
//@Scope("prototype") // not best option
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class BinarySortAlgorithm implements SortAlgorithm {
    @Override
    public void sort() {
        System.out.println("Binary sort!");
    }
}
