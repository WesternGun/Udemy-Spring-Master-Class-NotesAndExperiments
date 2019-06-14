package io.westerngun.udemyspringmasterclass.bean_choice_primary_qualifier_name;

import io.westerngun.udemyspringmasterclass.common.SortAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SortServiceQualifier {
    @Autowired
    @Qualifier("bubble")
    private final SortAlgorithm sortAlgorithm;

    public void sort() {
        sortAlgorithm.sort();
    }
}
