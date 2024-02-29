package com.agencyamazon.cache;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CacheManagementService {
    private final CacheManager cacheManager;

    public void clearCache() {
        cacheManager.getCacheNames()
                .forEach(cacheName -> cacheManager.getCache(cacheName).clear());
    }
}
