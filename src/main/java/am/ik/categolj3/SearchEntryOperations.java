package am.ik.categolj3;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SearchEntryOperations {
    Page<Entry> findAll(Pageable pageable);
}
