package com.hwx.webservice;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.hesc.trundle.webservice.HescService;

public class Test {

    public static void main(String[] args) {
        // 框架自带调用方式
//        WebServiceClient wc = new WebServiceClient();
//        wc.setWsdl("http://localhost:8090/project/webservice/HescService?wsdl");
//        String returnValue = null;
//        try {
//            returnValue = wc.getService("1.0", "FF:FF:00:22", "login","{username:root,password:123456}", "ios");
//        } catch (Exception e) {
//            System.out.println("接口调用失败！");
//            e.printStackTrace();
//        }
//        System.out.println(returnValue);
        
        // 原生调用方式
         JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
         factory.setServiceClass(HescService.class);
         factory.setAddress("http://localhost:8090/project/webservice/HescService?wsdl");
         HescService service = (HescService) factory.create();
         String result = service.getService("1.0", "FF:FF:00:22", "login","{username:root,password:123456}", "ios");
         System.out.println(result);
         
        //  返回值
//        {"code":"1","msg":"成功","obj":[{"createtime":1457336299682,"id":"901cf820e43711e5a3f48
//        336cbf13620","logintime":1466063577760,"password":"3f2c147e52c4069193f0d6374d6a8fc7","
//        state":"1","username":"admin"}]}
        
    }
}
