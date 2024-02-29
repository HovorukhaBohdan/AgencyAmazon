package com.agencyamazon.repository;

import com.agencyamazon.model.SalesAndTrafficByAsin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AsinReportsRepository
        extends MongoRepository<SalesAndTrafficByAsin, String> {
    List<SalesAndTrafficByAsin> findAllByParentAsinIn(List<String> asin);
}
