package proxy_pattern;

/**
 * Created by Kong on 2016/11/2.
 */
public class ProxyPatternDemo {

    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
//        System.out.println("");
        //图像将无法从磁盘加载
        image.display();

        /**
         * 与直接调用RealImage没有区别
         * 不过是ProxyImage代理了RealImage的业务，客户向ProxyImage发送请求
         * 再由ProxyImage向RealImage发送请求
         */

    }

}
