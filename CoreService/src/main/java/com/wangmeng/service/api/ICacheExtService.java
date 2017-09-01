package com.wangmeng.service.api;

import com.wangmeng.exception.CacheException;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public interface ICacheExtService  {

    /**
     *  是否支持key正则表达式
     * @return
     */
    boolean isSupportKeyPatter();

    /**
     * 设置缓存
     * @param key
     * @param value
     * @param exp
     * @param unit
     * @param <T>
     * @throws CacheException
     */
    <T> void setCache(String key, T value, int exp, TimeUnit unit) throws CacheException;

    /**
     * 设置缓存
     *
     * @param key
     * @param value
     * @param exp
     * @param <T>
     * @throws CacheException
     */
    <T> void setCache(String key, T value, int exp) throws CacheException;

    /**
     *  设置缓存
     * @param key
     * @param value
     * @param <T>
     * @throws CacheException
     */
    <T> void setCache(String key, T value) throws CacheException;

    /**
     * 取缓存
     *
     * @param key
     * @param <T>
     * @return
     * @throws CacheException
     */
    <T> T getCache(String key) throws CacheException;

    /**
     * 删除缓存
     *
     * @param key
     * @throws CacheException
     */
    void removeCache(String key) throws CacheException;

    /**
     * 是否有缓存
     *
     * @param key
     * @return
     * @throws CacheException
     */
    boolean hasCache(String key) throws CacheException;

    /**
     *  获取缓存列表
     * @param keyPatter
     * @param <T>
     * @return
     * @throws CacheException
     */
    <T> List<T> getCacheList(String keyPatter) throws CacheException;

    /**
     * 取缓存key list
     *
     * @param keyPatter
     * @return
     * @throws CacheException
     */
    Collection<String> getKeys(String keyPatter) throws CacheException;

    /**
     * 是否有缓存
     *
     * @param key
     * @return
     * @throws CacheException
     */
    boolean hasKey(String key) throws CacheException;
}
