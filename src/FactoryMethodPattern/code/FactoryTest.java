package FactoryMethodPattern.code;

/**
 * @Description 测试类
 * @program DesignPatternLearn
 * @Author Peng Jiankun
 * @Date 2020-11-14 21:45
 **/
public class FactoryTest {
    public static void main(String[] args) {
        Application application= (Application) ReadXML.getOneObect();
        Product product=application.createProduct();
        System.out.println(product.getValue());
    }
}
