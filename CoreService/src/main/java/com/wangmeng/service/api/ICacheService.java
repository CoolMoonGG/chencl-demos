package com.wangmeng.service.api;

import com.wangmeng.exception.CacheException;

import java.util.concurrent.TimeUnit;

public interface ICacheService {

    boolean isSupportKeyPatter();

    <T> void setCache(String key, T value, int exp, TimeUnit unit) throws CacheException;

    <T> void setCache(String key, T value, int exp) throws CacheException;

   <T> void setCache(String key, T value) throws CacheException;

   <T> T getCache(String key) throws CacheException;

   void removeCache(String key) throws CacheException;

   boolean hasCache(String key) throws CacheException;

}
