package com.xxzou.fusionmall.common;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author zxx
 */
public class AppCache<K, V> {

    private final Cache<K, V> localCache;

    public AppCache(int size, long expireSec){
        this.localCache = Caffeine.newBuilder()
                .initialCapacity(size)
                .maximumSize(size)
                .expireAfterWrite(expireSec, TimeUnit.SECONDS)
                .build();
    }

    public V get(K key){
        return localCache.getIfPresent(key);
    }

    public V get(K key, Supplier<V> supplier){
        return localCache.get(key, (k)->supplier.get());
    }
}
