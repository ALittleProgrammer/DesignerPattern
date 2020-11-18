package FactoryMethodPattern.code;

/**
 * @Description 具体工厂
 * @program DesignPatternLearn
 * @Author Peng Jiankun
 * @Date 2020-11-14 21:30
 **/
public class ConcreteApplication implements Application {
    @Override
    public ConcreteProduct createProduct() {
        return new ConcreteProduct();
    }

    ConcreteApplication(){
        System.out.println("create ConcreteApplication!");
    }
}
