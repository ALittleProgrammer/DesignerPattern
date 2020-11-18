package FactoryMethodPattern.code;

/**
 * @Description 具体产品
 * @program DesignPatternLearn
 * @Author Peng Jiankun
 * @Date 2020-11-14 21:27
 **/
public class ConcreteProduct implements Product {
    String val="This is ConcreteProduct";
    @Override
    public String getValue() {
        return val;
    }
    ConcreteProduct(){
        System.out.println("Create ConcreteProduct!");
    }
}
