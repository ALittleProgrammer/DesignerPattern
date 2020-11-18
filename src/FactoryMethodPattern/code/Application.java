package FactoryMethodPattern.code;

/**
 * @Description 工厂抽象类
 * @program DesignPatternLearn
 * @Author Peng Jiankun
 * @Date 2020-11-14 21:29
 **/
public interface Application {
    ConcreteProduct createProduct();
}
