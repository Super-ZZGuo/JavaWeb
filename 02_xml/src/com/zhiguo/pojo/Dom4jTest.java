package com.zhiguo.pojo;/*
@date 2021/5/2 - 10:22 下午
*/

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Dom4jTest {

    @Test
    public void test1() throws Exception{
        //创建SAX输入流，去读取xml配置文件，生成Document对象
        SAXReader saxReader = new SAXReader();
        try{
            Document document = saxReader.read("src/books.xml");
            System.out.print(document);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 读取books.xml文件生成Book类
     */
    @Test
    public void test2() throws Exception{

        //1、读取xml文件
        SAXReader reader = new SAXReader();
        //Junit测试中，路径都是从模块名开始算的
        Document document = reader.read("src/books.xml");

        //2、通过Document对象获取根元素
        Element rootElement = document.getRootElement();
        //System.out.println( rootElement );

        //3、通过根元素获取book标签对象
        //element和elements都是通过标签名查找子元素
        List<Element> books = rootElement.elements("books");

        //4、遍历，处理每个book标签转换为book类
        for(Element book : books ){
            //asXML()把标签对象转换为标签字符串
            //System.out.println( book.asXML() );
            Element nameElement = book.element("name");

            //getText()可以获取标签中的文本内容
            String nameText = nameElement.getText();

            //直接获取制定标签名的文本内容
            String priceText = book.elementText("price");
            String authorText = book.elementText("author");

            String snValue = book.attributeValue("sn");

            System.out.println(new Book(snValue,nameText,authorText,Double.parseDouble(priceText)));
        }
    }


}
