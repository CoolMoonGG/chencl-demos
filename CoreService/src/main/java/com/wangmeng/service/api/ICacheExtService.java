package com.wangmeng.service.api;

import com.wangmeng.exception.CacheException;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <ul>
 * <li>
 * <p>
 * 系统名程　　　　　： 浙江网盟B2B平台项目           <br/>
 * 子系统名称　　　　： 服务                 		  <br/>
 * 类／接口名　　　　： ICacheExtService          	  <br/>
 * 版本信息　　　　　： 1.00                       <br/>
 * 新建日期　　　　　： 2016年10月15日               <br/>
 * 作者　　　　　　　： 衣奎德                      <br/>
 * <!-- <b>修改历史（修改者）：</b> -->			  <br/>
 *
 *  缓存接口
 *     用于redis
 *     未继承ICacheService，因为通过motan发布的服务通过接口区分
 *
 *
 * Copyright (c) wangmeng  Co., Ltd. 2016. All rights reserved.
 * </p>
 *
 * </li>
 * </ul>
 */
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
