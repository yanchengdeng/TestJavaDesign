package com.design.test.singlton;
/**
 * 这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化
 * 
 * 如果涉及到反序列化创建对象时，可以尝试使用枚举方式
 */
public enum SingletanEnum {
    INSTANCE;

    public void whateverMathod(){
        System.out.println("-------what ever-");
    }

    
}
