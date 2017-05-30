package com.hesc.javademo.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hesc.trundle.Constants;
import com.hesc.trundle.webservice.Msg;

@Component
public class WebServiceTestImpl extends com.hesc.trundle.webservice.HescServiceImpl {
//    @Autowired
//    private DemoService demoService;

    /**
     * 对外提供接口服务的统一方法
     * 
     * @param version
     *            客户端版本号
     * @param Mac
     *            客户端机器码
     * @param operate
     *            客户端调用的方法类型
     * @param content
     *            客户端传过来的值， json 格式的数据
     * @param type
     *            客户端类型
     * @return 返回值， json 格式的数据
     */
    @Override
    protected Msg getMsg(String version, String mac, String operate, String content, String type) {
        Msg msg = new Msg();
        msg.setCode(Constants.CONSTNATS_YES);
        msg.setMsg("成功");
        msg.setObj("******");
        return msg;
    }
}