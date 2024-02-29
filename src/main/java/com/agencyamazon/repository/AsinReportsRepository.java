package com.agencyamazon.repository;

import com.agencyamazon.model.SalesAndTrafficByAsin;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsinReportsRepository
        extends MongoRepository<SalesAndTrafficByAsin, String> {
    List<SalesAndTrafficByAsin> findAllByParentAsinIn(List<String> asin);
}
