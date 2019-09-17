package com.liuencier.dubbo.quickstart;

import com.liuencier.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        System.out.println("message="+message);
        return "quickstart-provider-message=" + message;
    }
}
