package io.westerngun.udemyspringmasterclass.main;

import io.westerngun.udemyspringmasterclass.model.BinarySortAlgorithm;
import io.westerngun.udemyspringmasterclass.model.BubbleSortAlgorithm;
import io.westerngun.udemyspringmasterclass.model.SortAlgorithm;
import io.westerngun.udemyspringmasterclass.model.SortService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class AutowiringExample {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AutowiringExample.class, args);
        SortAlgorithm bubbleAlgorithm1 = context.getBean(BubbleSortAlgorithm.class);
        SortAlgorithm bubbleAlgorithm2 = context.getBean(BubbleSortAlgorithm.class);
        SortAlgorithm binaryAlgorithm = context.getBean(BinarySortAlgorithm.class);

        SortService serviceBubble1 = new SortService(bubbleAlgorithm1);
        System.out.println(bubbleAlgorithm1);
        serviceBubble1.sort();

        SortService serviceBubble2 = new SortService(bubbleAlgorithm2);
        System.out.println(bubbleAlgorithm2);
        serviceBubble2.sort();

        SortService serviceBinary = new SortService(binaryAlgorithm);
        serviceBinary.sort();

        System.exit(0);
        //sortService.sort(); // @Qualifier > @Primary > var name matching class name
        // >  - if I autowire without `@Qualifier` and variable name is `sortAlgorithm`: choose binary
        // >  - if I autowire without annotation but var name is `bubbleSortAlgorithm`: still choose binary
        // >  - if I autowire with `@Qualifier("bubble")`: will instead choose bubble
    }
}
