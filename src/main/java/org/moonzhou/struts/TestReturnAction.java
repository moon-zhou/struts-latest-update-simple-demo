package org.moonzhou.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

@ParentPackage("basePackage")
//使用convention插件提供的@Action注解将一个普通Java类标识为可以处理用户请求的Action类
@Action("TestReturn")
//使用使用convention插件提供的@Namespace注解指明这个Action类的命名空间
@Namespace("/")
public class TestReturnAction {
    /**
     * test方法的访问方式：http://localhost:8080/struts_latest_update_simple_demo_war/TestReturn!testReturnStr.action
     *
     * MethodName: test
     * Description:
     * @author xudp
     */
    public void testReturnStr(){
        System.out.println("hello moon zhou");
    }

}