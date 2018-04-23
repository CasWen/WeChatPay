package com.zwj.pay_library;


/**
 * <b>Create Date:</b> 2018/4/2<br>
 * <b>Author:</b> Zhongwenjie <br>
 * <b>Description:</b>
 * 支付的API
 */
public class PayAPI {


    private static final Object mLock = new Object();
    private static PayAPI mInstance;

    public static PayAPI getInstance(){
        if(mInstance == null){
            synchronized (mLock){
                if(mInstance == null){
                    mInstance = new PayAPI();
                }
            }
        }
        return mInstance;
    }


    /**
     * 支付宝支付请求
     * @param aliPayRe
     */
    public void sendPayRequest(AliPayReq aliPayRe){
        AliPayAPI.getInstance().sendPayReq(aliPayRe);
    }

    /**
     * 支付宝支付请求 - 避免商户私钥暴露在客户端
     * @param aliPayRe2
     */
    public void sendPayRequest(AliPayReq2 aliPayRe2){
        AliPayAPI.getInstance().sendPayReq(aliPayRe2);
    }



    /**
     * 微信支付请求
     * @param wechatPayReq
     */
    public void sendPayRequest(WechatPayReq wechatPayReq){
        WechatPayAPI.getInstance().sendPayReq(wechatPayReq);
    }

}

