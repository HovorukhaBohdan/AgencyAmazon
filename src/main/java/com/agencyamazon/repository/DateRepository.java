package com.agencyamazon.repository;

import com.agencyamazon.model.SalesAndTrafficByDate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DateRepository
        extends MongoRepository<SalesAndTrafficByDate, String> {
    Optional<SalesAndTrafficByDate> findByDate(LocalDate date);

    List<SalesAndTrafficByDate> findAllByDateBetween(LocalDate dateFrom, LocalDate dateTo);
}
