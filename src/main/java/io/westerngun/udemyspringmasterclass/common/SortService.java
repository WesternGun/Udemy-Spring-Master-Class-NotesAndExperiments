package io.westerngun.udemyspringmasterclass.common;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SortService {

    // @Qualifier takes precedence over @Primary; this enables minimal config over fields when
    // we only want the alternative bean in less occations, and the rest of time the @Primary one
    /**
     * When BinarySearchAlgorithm is the @Primary bean
     * <ul>
     * <li> if I autowire without `@Qualifier` and variable name is `sortAlgorithm`: choose binary</li>
     * <li> if I autowire without annotation but var name is `bubbleSortAlgorithm`: still choose binary</li>
     * <li> if I autowire with `@Qualifier("bubble")`: will instead choose bubble</li>
     * </ul>
     */
    private final SortAlgorithm sortAlgorithm;

    public void sort() {
        sortAlgorithm.sort();
    }
}
