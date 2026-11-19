package com.xinglong.Object;

public class hauwei {
    public static void main(String[] args) {
        Demo04huawei huawei = new Demo04huawei();
        huawei.name = "华为mate90promax";
        huawei.brand = "华为";
        huawei.price = 9999;
        System.out.println("华为mate90promax");
        System.out.println("华为");
        System.out.println(9999);
        huawei.call("张轩浩");
        String message = huawei.message();
        System.out.println(message);
    }
}
