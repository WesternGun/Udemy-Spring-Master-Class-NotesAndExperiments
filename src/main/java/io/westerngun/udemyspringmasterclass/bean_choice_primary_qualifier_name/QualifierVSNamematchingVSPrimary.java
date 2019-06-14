package io.westerngun.udemyspringmasterclass.bean_choice_primary_qualifier_name;

import io.westerngun.udemyspringmasterclass.common.SortAlgorithm;
import io.westerngun.udemyspringmasterclass.common.SortService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
class QualifierVSNamematchingVSPrimary {

    /** This example will show the priority of choosing interface implement class:
     * {@link Qualifier} > {@link Primary} > var name matching class name
     *
     * When {@link BinarySortAlgorithm} is the @Primary bean, and {@link BubbleSortAlgorithm} is with @Qualifier "bubble":
     * <ul>
     * <li> if I autowire without `@Qualifier` and variable name is `sortAlgorithm`: choose binary</li>
     * <li> if I autowire without `@Qualifier` but var name is `bubbleSortAlgorithm`: still choose binary</li>
     * <li> if I autowire with `@Qualifier("bubble")`: will instead choose bubble</li>
     * </ul>
     *
     */
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(QualifierVSNamematchingVSPrimary.class, args);

        // choose primary bean
        SortAlgorithm sortAlgorithm = context.getBean(SortAlgorithm.class);
        SortService sortService1 = new SortService(sortAlgorithm);
        sortService1.sort();

        // choose primary bean
        SortAlgorithm bubbleSortAlgorithm = context.getBean(SortAlgorithm.class);
        SortService sortService2 = new SortService(bubbleSortAlgorithm);
        sortService2.sort();

        // choose qualifiered bean
        SortAlgorithm sortAlgorithmQualifier = context.getBean(BubbleSortAlgorithmQualifier.class);
        SortService sortService3 = new SortService(sortAlgorithmQualifier);
        sortService3.sort();

        // choose qualifiered bean
        SortServiceQualifier sortServiceQualifier = context.getBean(SortServiceQualifier.class);
        sortServiceQualifier.sort();

        System.exit(0);
    }
}
