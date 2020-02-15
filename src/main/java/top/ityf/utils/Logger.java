package top.ityf.utils;

/**
 * ClassName:Logger
 * Package: top.ityf.utils
 * Description: 用于记录日志的工具类，它里面提供了公用的方法
 *
 * @Date: 2020/2/13 18:16
 * @Author: YanFei
 */
public class Logger {
    /**
     * 前置通知
     * 用于打印日志，计划让其在切入点方法执行之前执行(切入点方法就是业务层方法)
     * */
    public void printLog(){
        System.out.println("前置通知的beforePrintLog()方法开始记录日志了。。。");
    }

}
