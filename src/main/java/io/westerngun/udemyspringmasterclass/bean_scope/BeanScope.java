package io.westerngun.udemyspringmasterclass.bean_scope;

import org.junit.jupiter.api.Assertions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanScope {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanScope.class, args);

        BinarySortAlgorithm binarySortAlgorithm1 = context.getBean(BinarySortAlgorithm.class);
        System.out.println(binarySortAlgorithm1);
        BinarySortAlgorithm binarySortAlgorithm2 = context.getBean(BinarySortAlgorithm.class);
        System.out.println(binarySortAlgorithm2);
        Assertions.assertNotEquals(binarySortAlgorithm1, binarySortAlgorithm2);

        BubbleSortAlgorithm bubbleSortAlgorithm1 = context.getBean(BubbleSortAlgorithm.class);
        System.out.println(bubbleSortAlgorithm1);
        BubbleSortAlgorithm bubbleSortAlgorithm2 = context.getBean(BubbleSortAlgorithm.class);
        System.out.println(bubbleSortAlgorithm2);
        Assertions.assertEquals(bubbleSortAlgorithm1, bubbleSortAlgorithm2);

        System.exit(0);
    }
}
