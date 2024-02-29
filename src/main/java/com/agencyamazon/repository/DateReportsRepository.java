package com.agencyamazon.repository;

import com.agencyamazon.model.SalesAndTrafficByDate;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateReportsRepository
        extends MongoRepository<SalesAndTrafficByDate, String> {
    List<SalesAndTrafficByDate> findAllByDate(LocalDate date);

    List<SalesAndTrafficByDate> findAllByDateBetween(LocalDate dateFrom, LocalDate dateTo);
}
