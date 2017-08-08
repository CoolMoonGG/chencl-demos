package com.wangmeng.service.api;

import com.wangmeng.exception.CacheException;

import java.util.concurrent.TimeUnit;

/**
 * <ul>
 * <li>
 * <p>
 * 系统名程　　　　　： 浙江网盟B2B平台项目           <br/>
 * 子系统名称　　　　： 服务                 		  <br/>
 * 类／接口名　　　　： ICacheService          	  <br/>
 * 版本信息　　　　　： 1.00                       <br/>
 * 新建日期　　　　　： 2016年10月15日               <br/>
 * 作者　　　　　　　： 衣奎德                      <br/>
 * <!-- <b>修改历史（修改者）：</b> -->			  <br/>
 *
 *  缓存接口
 *     用于memcached
 *
 * Copyright (c) wangmeng  Co., Ltd. 2016. All rights reserved.
 * </p>
 *
 * </li>
 * </ul>
 */
public interface ICacheService {

    boolean isSupportKeyPatter();

    <T> void setCache(String key, T value, int exp, TimeUnit unit) throws CacheException;

    <T> void setCache(String key, T value, int exp) throws CacheException;

   <T> void setCache(String key, T value) throws CacheException;

   <T> T getCache(String key) throws CacheException;

   void removeCache(String key) throws CacheException;

   boolean hasCache(String key) throws CacheException;

}
