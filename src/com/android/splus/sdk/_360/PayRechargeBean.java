package com.android.splus.sdk._360;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class PayRechargeBean extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    private static final String TAG = "PayRechargeBean";

    private String orderid; // 订单号；360、91、anzhi、duoku、jifeng、xiaomi、oppo

    public static final String ORDERID = "orderid";

    private String productId; // 商品ID；360、91

    public static final String PRODUCTID = "productId";

    private String productName; // 商品名称；360、91、dcn、duoku、oppo

    public static final String PRODUCTNAME = "productName";

    private String productDescription; // 商品描述；91、anzhi、duoku、oppo

    public static final String PRODUCTDESCRIPTION = "productDescription";

    private double productPrice;

    public static final String PRODUCTPRICE = "productPrice";

    private double productOrginalPrice;

    public static final String PRODUCTORGINALPRICE = "productOrginalPrice";

    private int count;

    public static final String COUNT = "count";

    private String notifyUri; // 充值回调地址;360、OPPO
                              // 必需参数，应用方提供的支付结果通知uri，最大255字符。360服务器将把支付接口回调给该uri，具体协议请查看文档中，支付结果通知接口–应用服务器提供接口。

    public static final String NOTIFYURI = "notifyUri";

    // 必需参数，用户access token，要使用注意过期和刷新问题，最大64字符。
    private String accessToken;

    // 必需参数，360账号id，整数。
    private String qihooUserId;

    // 必需参数，所购买商品金额，以分为单位。金额大于等于100分，360SDK运行定额支付流程； 金额数为0，360SDK运行不定额支付流程。
    private String moneyAmount;

    // 必需参数，人民币与游戏充值币的默认比例，例如2，代表1元人民币可以兑换2个游戏币，整数。
    private String exchangeRate;

    // 必需参数，游戏或应用名称，最大16中文字。
    private String appName;

    // 必需参数，应用内的用户名，如游戏角色名。 若应用内绑定360账号和应用账号，则可用360用户名，最大16中文字。（充值不分区服，
    // 充到统一的用户账户，各区服角色均可使用）。
    private String appUserName;

    // 必需参数，应用内的用户id。 若应用内绑定360账号和应用账号, 充值不分区服, 充到统一的用户账户, 各区服角色均可使用,
    // 则可用360用户ID。最大32字符。
    private String appUserId;

    // 可选参数，应用扩展信息1，原样返回，最大255字符。
    private String appExt1;

    // 可选参数，应用扩展信息2，原样返回，最大255字符。
    private String appExt2;

    // 可选参数，应用订单号，应用内必须唯一，最大32字符。
    private String appOrderId;

    public PayRechargeBean(String jsonObject) {
        try {
            JSONObject data = new JSONObject(jsonObject);
            this.orderid = data.optString(ORDERID) == null ? "" : data.optString(ORDERID);
            this.productId = data.optString(PRODUCTID) == null ? "" : data.optString(PRODUCTID);
            this.productName = data.optString(PRODUCTNAME) == null ? "" : data.optString(PRODUCTNAME);
            this.productDescription = data.optString(PRODUCTDESCRIPTION) == null ? "" : data.optString(PRODUCTDESCRIPTION);
            this.notifyUri = data.optString(NOTIFYURI) == null ? "" : data.optString(NOTIFYURI);
            this.productPrice = data.optDouble(PRODUCTPRICE) == 0.0d ? 0.0d : data.optDouble(PRODUCTPRICE);
            this.productOrginalPrice = data.optDouble(PRODUCTORGINALPRICE) == 0.0d ? 0.0d : data.optDouble(PRODUCTORGINALPRICE);
            this.count = data.optInt(COUNT) == 0 ? 1 : data.optInt(COUNT);
            initMap();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    protected void initMap() {
        this.put(ORDERID, orderid);
        this.put(PRODUCTID, productId);
        this.put(PRODUCTNAME, productName);
        this.put(PRODUCTDESCRIPTION, productDescription);
        this.put(NOTIFYURI, notifyUri);
        this.put(PRODUCTPRICE, productPrice);
        this.put(PRODUCTORGINALPRICE, productOrginalPrice);
        this.put(COUNT, count);
    }

    public int getCount() {

        return this.count;
    }

    public void setCount(int count) {

        this.count = count;
    }

    public double getProductPrice() {

        return this.productPrice;
    }

    public void setProductOrginalPrice(double productOrginalPrice) {

        this.productOrginalPrice = productOrginalPrice;
    }

    public String getOrderid() {

        return this.orderid;
    }

    public void setOrderid(String orderid) {

        this.orderid = orderid;
    }

    public String getProductId() {

        return this.productId;
    }

    public void setProductId(String productId) {

        this.productId = productId;
    }

    public String getProductName() {

        return this.productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public String getProductDescription() {

        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {

        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductOrginalPrice() {
        return productOrginalPrice;
    }

    public String getNotifyUrl() {

        return this.notifyUri;
    }

    public void setNotifyUrl(String notifyUri) {

        this.notifyUri = notifyUri;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getQihooUserId() {
        return qihooUserId;
    }

    public void setQihooUserId(String qihooUserId) {
        this.qihooUserId = qihooUserId;
    }

    public String getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(String moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppUserName() {
        return appUserName;
    }

    public void setAppUserName(String appUserName) {
        this.appUserName = appUserName;
    }

    public String getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(String appUserId) {
        this.appUserId = appUserId;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getAppExt1() {
        return appExt1;
    }

    public void setAppExt1(String appExt1) {
        this.appExt1 = appExt1;
    }

    public String getAppExt2() {
        return appExt2;
    }

    public void setAppExt2(String appExt2) {
        this.appExt2 = appExt2;
    }

    public String getAppOrderId() {
        return appOrderId;
    }

    public void setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
    }

}
