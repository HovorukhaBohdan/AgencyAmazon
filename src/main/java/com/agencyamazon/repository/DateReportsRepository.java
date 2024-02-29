package com.agencyamazon.repository;

import com.agencyamazon.model.SalesAndTrafficByDate;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateReportsRepository
        extends MongoRepository<SalesAndTrafficByDate, String> {
    Optional<SalesAndTrafficByDate> findByDate(LocalDate date);

    List<SalesAndTrafficByDate> findAllByDateBetween(LocalDate dateFrom, LocalDate dateTo);
}
