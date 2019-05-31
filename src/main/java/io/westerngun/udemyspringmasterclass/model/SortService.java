package io.westerngun.udemyspringmasterclass.model;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SortService {

    // @Qualifier takes precedence over @Primary; this enables minimal config over fields when
    // we only want the alternative bean in less occations, and the rest of time the @Primary one
    @Autowired
    @Qualifier("bubble")
    private final SortAlgorithm sortAlgorithm;

    public void sort() {
        sortAlgorithm.sort();
    }
}
