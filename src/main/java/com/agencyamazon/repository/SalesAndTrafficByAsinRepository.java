package com.agencyamazon.repository;

import com.agencyamazon.model.SalesAndTrafficByAsin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesAndTrafficByAsinRepository
        extends MongoRepository<SalesAndTrafficByAsin, String> {
}
