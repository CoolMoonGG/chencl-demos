package com.wangmeng.base.singleton;

/**
 * @CreatedBy : ChenChunlei .
 * @CreatedOn : 2017/8/31 0031 下午 5:13 .
 * @Description: 饿汉式单例模式(由于静态初始化了instance所以是线程安全的)
 */
//饿汉式单例类.在类初始化时，已经自行实例化
public  class  HungrySingleton {

    //--第一步：初始化变量
    private static final HungrySingleton instance=new HungrySingleton();
    //--第二步：私有化构造函数
    private HungrySingleton(){}
    //--第三步：提供外部获取实例的接口方法
    public static  HungrySingleton getInstance(){
        return instance;
    }
}
