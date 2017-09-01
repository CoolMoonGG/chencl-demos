package com.wangmeng.base.singleton;

/**
 * @CreatedBy : ChenChunlei .
 * @CreatedOn : 2017/8/31 0031 下午 5:19 .
 * @Description: 懒汉式单例模式最优实现
 *               [通过内部类，既实现了线程安全，又避免了同步带来的性能影响。]
 */

public class LazySingleton {
    //--1 创建内部类
    private static class LazyHolder{
        private static final LazySingleton singleton=new LazySingleton();
    }
    //--2 私有化构造函数
    private LazySingleton(){}

    //--3 提供公开的实例访问方法
    public static LazySingleton getInstance(){
        return LazyHolder.singleton;
    }
}
