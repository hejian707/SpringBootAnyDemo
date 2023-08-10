package cn.whut.edu.demotest1;

import com.google.common.base.Joiner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/2/14 11:43
 */
public class testString {
    private String s1;
    private String s2;

    @Test
    public void testTwoString() {
        String s3 = s1+ s2;
        System.out.println(s3);
    }
    @Test
    public void testStringUtil(){
        String a = null;
        if (a.equals("")){
            System.out.println(1);
        } else System.out.println(2);
    }

    @Test
    public void testmessage(){
        String a = "\"mem_type\":\"redis\",\"memory\":\"1\",\"vpc_name\":\"王思远开发使用\",\"vpc_id\":\"41927e98-20b6-4b59-a576-9ad70f1ae67c\",\"num\":\"1\",\"regionName\":\"华东1（上海）\",\"type\":\"2\",\"iamProjectName\":\"默认项目\",\"prepareAzName\":\"可用区B\",\"securityGroupId\":\"5aa5aae5-a69e-4ce1-973a-f9b82ea0b4bf\",\"duration\":\"1\",\"protocol\":\"4.0\",\"mem\":\"1\",\"pStartTime\":\"2023-03-14 19:39:30\",\"rrAzName\":\"可用区B\",\"connection\":\"10000\",\"iamProjectId\":\"0\",\"vnet_name\":\"终端子网\",\"productUse\":\"1\",\"net_type\":\"2\",\"billType\":\"按量付费\",\"display\":\"[{\\\"key\\\":\\\"数据中心\\\",\\\"value\\\":\\\"华东1（上海） \\\"},{\\\"key\\\":\\\"主可用区名称\\\",\\\"value\\\":\\\"可用区A \\\"},{\\\"key\\\":\\\"备可用区名称\\\",\\\"value\\\":\\\"可用区B \\\"},{\\\"key\\\":\\\"项目ID\\\",\\\"value\\\":\\\"0 \\\"},{\\\"key\\\":\\\"项目名称\\\",\\\"value\\\":\\\"默认项目 \\\"},{\\\"key\\\":\\\"内存容量\\\",\\\"value\\\":\\\"1 G\\\"},{\\\"key\\\":\\\"连接数\\\",\\\"value\\\":\\\"10000 \\\"},{\\\"key\\\":\\\"只读副本数量\\\",\\\"value\\\":\\\"1\\\"},{\\\"key\\\":\\\"只读副本内存容量\\\",\\\"value\\\":\\\"1 \\\"},{\\\"key\\\":\\\"只读副本可用区名称\\\",\\\"value\\\":\\\"可用区B \\\"}]\",\"instanceType\":\"Redis_0\",\"dbType\":\"redis\",\"vnet_id\":\"72adab7f-3df7-44d2-aeec-348a96c9acfc\",\"durationUnitDic\":\"3\",\"slv_mem\":\"1\",\"port\":\"6379\",\"name\":\"hejian_redis_230314193824\",\"az\":\"cn-shanghai-2a,cn-shanghai-2b,cn-shanghai-2b\",\"net_type_name\":\"VPC网络\",\"display_i18n\":\"[{\\\"key\\\":\\\"Data Center\\\",\\\"value\\\":\\\"CN East 1(Shanghai)\\\"},{\\\"key\\\":\\\"Master Availability Zone Name\\\",\\\"value\\\":\\\"A\\\"},{\\\"key\\\":\\\"Slavery Availability Zone Name\\\",\\\"value\\\":\\\"B\\\"},{\\\"key\\\":\\\"Project ID\\\",\\\"value\\\":\\\"0\\\"},{\\\"key\\\":\\\"Project Name\\\",\\\"value\\\":\\\"Default Project\\\"},{\\\"key\\\":\\\"Memory Capacity\\\",\\\"value\\\":\\\"1 G\\\"},{\\\"key\\\":\\\"Connections\\\",\\\"value\\\":\\\"10000\\\"},{\\\"key\\\":\\\"Read-only Replicas\\\",\\\"value\\\":\\\"1\\\"},{\\\"key\\\":\\\"Read-only Replica Memory Capacity\\\",\\\"value\\\":\\\"1\\\"},{\\\"key\\\":\\\"\\\",\\\"value\\\":\\\"B\\\"}]\",\"region\":\"SHPBSRegionOne\",\"mainAzName\":\"可用区A\"";
        String b = "{\"key\":\"Data Center\",\"value\":\"CN East 1(Shanghai)\"},{\"key\":\"Master Availability Zone Name\",\"value\":\"A\"},{\"key\":\"Slavery Availability Zone Name\",\"value\":\"B\"},{\"key\":\"Project ID\",\"value\":\"0\"},{\"key\":\"Project Name\",\"value\":\"Default Project\"},{\"key\":\"Memory Capacity\",\"value\":\"1 G\"},{\"key\":\"Connections\",\"value\":\"10000\"},{\"key\":\"Read-only Replicas\",\"value\":\"1\"},{\"key\":\"Read-only Replica Memory Capacity\",\"value\":\"1\"},{\"key\":\"\",\"value\":\"B\"}";
        String c = "[{\"key\":\"数据中心\",\"value\":\"华东1（上海） \"},{\"key\":\"主可用区名称\",\"value\":\"可用区A \"},{\"key\":\"备可用区名称\",\"value\":\"可用区B \"},{\"key\":\"项目ID\",\"value\":\"0 \"},{\"key\":\"项目名称\",\"value\":\"默认项目 \"},{\"key\":\"内存容量\",\"value\":\"1 G\"},{\"key\":\"连接数\",\"value\":\"10000 \"},{\"key\":\"只读副本数量\",\"value\":\"1\"},{\"key\":\"只读副本内存容量\",\"value\":\"1 \"},{\"key\":\"只读副本可用区名称\",\"value\":\"可用区B \"}]";

        String d = "{\"appId\":\"106.openapi\",\"createTime\":\"2023-03-21 16:53:45\",\"orderId\":\"M22303211653449212JS2C1\",\"orderUse\":1,\"orderUserAuthorizeMarket\":false,\"productInfoList\":[{\"billType\":87,\"duration\":1,\"durationUnitDic\":2,\"items\":[{\"itemName\":\"可用区\",\"itemNo\":\"az\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"cn-shanghai-fin-a\"},{\"itemName\":\"API自定义缓存ID\",\"itemNo\":\"cache_id\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"1408d7e0-2dd1-4a79-916e-bff912453989\"},{\"itemName\":\"缓存服务引擎类型\",\"itemNo\":\"dbType\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"redis\"},{\"itemName\":\"display\",\"itemNo\":\"display\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"[{\\\"key\\\":\\\"项目ID\\\",\\\"value\\\":\\\"0\\\"},{\\\"key\\\":\\\"项目名称\\\",\\\"value\\\":\\\"默认项目\\\"},{\\\"key\\\":\\\"内存容量\\\",\\\"value\\\":\\\"2 G\\\"},{\\\"key\\\":\\\"连接数\\\",\\\"value\\\":\\\"20000\\\"},{\\\"key\\\":\\\"只读副本数量\\\",\\\"value\\\":\\\"0\\\"},{\\\"key\\\":\\\"只读副本内存容量\\\",\\\"value\\\":\\\"0\\\"}]\"},{\"itemName\":\"项目ID\",\"itemNo\":\"iamProjectId\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"0\"},{\"itemName\":\"缓存服务套餐CODE\",\"itemNo\":\"instanceType\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"REDIS_2\"},{\"itemName\":\"缓存服务内存容量\",\"itemNo\":\"mem\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"unit\":\"G\",\"value\":\"2\"},{\"itemName\":\"缓存服务内存容量-价格体系使用\",\"itemNo\":\"memory\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"unit\":\"G\",\"value\":\"2\"},{\"itemName\":\"缓存服务名称\",\"itemNo\":\"name\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"hejian_redis230321\"},{\"itemName\":\"缓存服务网络类型\",\"itemNo\":\"net_type\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"2\"},{\"itemName\":\"用户密码\",\"itemNo\":\"passWord\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"bZnm6cpQheT1w+1+AoCwDcN/NfQpiggS/L/8yfwUMIEhXSZwyOG0mRZYZrTUGmcM+sd6nZ6nUELiYjaDiebQ5A==\"},{\"itemName\":\"缓存服务端口\",\"itemNo\":\"port\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"6379\"},{\"itemName\":\"缓存版本号\",\"itemNo\":\"protocol\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"4.0\"},{\"itemName\":\"安全组ID\",\"itemNo\":\"securityGroupId\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"c66494c7-a02b-447e-b7ea-ab4b1451d1e5\"},{\"itemName\":\"缓存服务从节点内存容量\",\"itemNo\":\"slv_mem\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"unit\":\"G\",\"unitCount\":\"0\",\"value\":\"2\"},{\"itemName\":\"缓存服务架构类型\",\"itemNo\":\"type\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"2\"},{\"itemName\":\"缓存服务 EndpointID\",\"itemNo\":\"vnet_id\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"f6b8f922-af07-4f7f-9857-07b313722cfd\"},{\"itemName\":\"缓存服务 VPCID\",\"itemNo\":\"vpc_id\",\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"value\":\"168d67a7-b0c8-4af0-af31-82686e2ffe84\"}],\"productGroup\":106,\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"productName\":\"缓存服务产品\",\"productType\":30,\"productUse\":1,\"productWhat\":1,\"region\":\"SHFINRegion\",\"userId\":2000102274}],\"reason\":\"instance.init\",\"source\":3,\"subOrderList\":[{\"productGroup\":106,\"productId\":\"08ee915f-36de-4eac-8975-a8741b03a6da\",\"productType\":30,\"region\":\"SHFINRegion\",\"subOrderId\":\"MREDIS2S2303211653450192JS3B3\"}],\"userId\":2000102274}";

        String s = "{\"msg\":\"{\\\"appId\\\":\\\"106.console\\\",\\\"createTime\\\":\\\"2023-03-22 16:51:43\\\",\\\"orderId\\\":\\\"M22303221651428983T0BT2\\\",\\\"orderUse\\\":1,\\\"orderUserAuthorizeMarket\\\":false,\\\"productInfoList\\\":[{\\\"billType\\\":87,\\\"duration\\\":1,\\\"durationUnitDic\\\":3,\\\"items\\\":[{\\\"itemName\\\":\\\"可用区code\\\",\\\"itemNo\\\":\\\"az\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"cn-shanghai-2a\\\"},{\\\"itemName\\\":\\\"可用区\\\",\\\"itemNo\\\":\\\"azName\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"可用区A\\\"},{\\\"itemName\\\":\\\"计费方式\\\",\\\"itemNo\\\":\\\"billType\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"按量付费\\\"},{\\\"itemName\\\":\\\"连接数\\\",\\\"itemNo\\\":\\\"connection\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"40000\\\"},{\\\"itemName\\\":\\\"缓存类型\\\",\\\"itemNo\\\":\\\"dbType\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"redis\\\"},{\\\"itemName\\\":\\\"display\\\",\\\"itemNo\\\":\\\"display\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"[{\\\\\\\"key\\\\\\\":\\\\\\\"数据中心\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"华东1（上海） \\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"可用区\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"可用区A \\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"项目ID\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"0 \\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"项目名称\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"默认项目 \\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"内存容量\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"12 G\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"连接数\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"40000 \\\\\\\"}]\\\"},{\\\"itemName\\\":\\\"display_i18n\\\",\\\"itemNo\\\":\\\"display_i18n\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"[{\\\\\\\"key\\\\\\\":\\\\\\\"Data Center\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"CN East 1(Shanghai)\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"Availability Zone\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"A\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"Project ID\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"0\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"Project Name\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"Default Project\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"Memory Capacity\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"12 G\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"Connections\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"40000\\\\\\\"}]\\\"},{\\\"itemName\\\":\\\"内存容量-企业版\\\",\\\"itemNo\\\":\\\"ECC_MEMORY\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"unit\\\":\\\"G\\\",\\\"value\\\":\\\"12\\\"},{\\\"itemName\\\":\\\"项目ID\\\",\\\"itemNo\\\":\\\"iamProjectId\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"0\\\"},{\\\"itemName\\\":\\\"项目名称\\\",\\\"itemNo\\\":\\\"iamProjectName\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"默认项目\\\"},{\\\"itemName\\\":\\\"缓存服务套餐CODE\\\",\\\"itemNo\\\":\\\"instanceType\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"\\\"},{\\\"itemName\\\":\\\"内存容量\\\",\\\"itemNo\\\":\\\"mem\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"unit\\\":\\\"G\\\",\\\"value\\\":\\\"12\\\"},{\\\"itemName\\\":\\\"缓存服务内存容量-价格体系使用\\\",\\\"itemNo\\\":\\\"memory\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"unit\\\":\\\"G\\\",\\\"value\\\":\\\"12\\\"},{\\\"itemName\\\":\\\"缓存类型-价格体系使用\\\",\\\"itemNo\\\":\\\"mem_type\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"redis\\\"},{\\\"itemName\\\":\\\"实例名称\\\",\\\"itemNo\\\":\\\"name\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"sunkai_temp\\\"},{\\\"itemName\\\":\\\"网络类型\\\",\\\"itemNo\\\":\\\"net_type\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"2\\\"},{\\\"itemName\\\":\\\"网络类型\\\",\\\"itemNo\\\":\\\"net_type_name\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"VPC网络\\\"},{\\\"itemName\\\":\\\"数量\\\",\\\"itemNo\\\":\\\"num\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"1\\\"},{\\\"itemName\\\":\\\"实例密码\\\",\\\"itemNo\\\":\\\"passWord\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"c3kMeAiinRgLYhm/pCABHPNjSa+e2805m3HLn5L+kcSnRik+uIt2MpPiwXQuCZ8vIL1X8W2FNVJtXe8zL/T1Kw==\\\"},{\\\"itemName\\\":\\\"缓存服务端口\\\",\\\"itemNo\\\":\\\"port\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"6379\\\"},{\\\"itemName\\\":\\\"引擎版本\\\",\\\"itemNo\\\":\\\"protocol\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"6.0\\\"},{\\\"itemName\\\":\\\"数据中心code\\\",\\\"itemNo\\\":\\\"region\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"cn-shanghai-2\\\"},{\\\"itemName\\\":\\\"数据中心\\\",\\\"itemNo\\\":\\\"regionName\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"华东1（上海）\\\"},{\\\"itemName\\\":\\\"安全组ID\\\",\\\"itemNo\\\":\\\"securityGroupId\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"5aa5aae5-a69e-4ce1-973a-f9b82ea0b4bf\\\"},{\\\"itemName\\\":\\\"分片数量\\\",\\\"itemNo\\\":\\\"shardNum\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"3\\\"},{\\\"itemName\\\":\\\"分片容量\\\",\\\"itemNo\\\":\\\"shardSize\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"4\\\"},{\\\"itemName\\\":\\\"缓存服务架构类型\\\",\\\"itemNo\\\":\\\"type\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"4\\\"},{\\\"itemName\\\":\\\"缓存服务 EndpointID\\\",\\\"itemNo\\\":\\\"vnet_id\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"e97c7b2b-4204-4fcc-83b8-b7e47c44b64f\\\"},{\\\"itemName\\\":\\\"缓存服务 Endpoint名称\\\",\\\"itemNo\\\":\\\"vnet_name\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"终端子网\\\"},{\\\"itemName\\\":\\\"缓存服务 VPCID\\\",\\\"itemNo\\\":\\\"vpc_id\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"72c00f9e-60e6-4b99-a0ee-558b6a561d7c\\\"},{\\\"itemName\\\":\\\"缓存服务 VPC名称\\\",\\\"itemNo\\\":\\\"vpc_name\\\",\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"value\\\":\\\"测试部公用-仅允许内网EIP-禁止绑定120开头IP\\\"}],\\\"productGroup\\\":106,\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"productType\\\":667,\\\"productUse\\\":1,\\\"productWhat\\\":1,\\\"region\\\":\\\"SHPBSRegionOne\\\",\\\"userId\\\":2000102274}],\\\"reason\\\":\\\"instance.init\\\",\\\"source\\\":1,\\\"subOrderList\\\":[{\\\"productGroup\\\":106,\\\"productId\\\":\\\"9af096e7-d558-4d67-8c32-427dcf82fd5b\\\",\\\"productType\\\":667,\\\"region\\\":\\\"SHPBSRegionOne\\\",\\\"subOrderId\\\":\\\"ECC2S2303221651434401TFR3V\\\"}],\\\"subUserId\\\":\\\"uzHAtpq1TuCOV4LNoYvkEQ\\\",\\\"userId\\\":2000102274}\",\"msg_id\":\"1679475103612TJWe\",\"msg_request_id\":\"0eb14cb8-2303-415a-b14f-2abc526ee85e\",\"msg_action\":\"instance.create\",\"msg_timestamp\":1679475103612}";
//        "{\"msg\":"{\"appId\":\"106.console\",\"createTime\":\"2023-03-22 16:51:43\",\"orderId\":\"M22303221651428983T0BT2\",\"orderUse\":1,\"orderUserAuthorizeMarket\":false,\"productInfoList\":[{\"billType\":87,\"duration\":1,\"durationUnitDic\":3,\"items\":[{\"itemName\":\"可用区code\",\"itemNo\":\"az\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"cn-shanghai-2a\"},{\"itemName\":\"可用区\",\"itemNo\":\"azName\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"可用区A\"},{\"itemName\":\"计费方式\",\"itemNo\":\"billType\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"按量付费\"},{\"itemName\":\"连接数\",\"itemNo\":\"connection\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"40000\"},{\"itemName\":\"缓存类型\",\"itemNo\":\"dbType\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"redis\"},{\"itemName\":\"display\",\"itemNo\":\"display\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"[{\\\"key\\\":\\\"数据中心\\\",\\\"value\\\":\\\"华东1（上海） \\\"},{\\\"key\\\":\\\"可用区\\\",\\\"value\\\":\\\"可用区A \\\"},{\\\"key\\\":\\\"项目ID\\\",\\\"value\\\":\\\"0 \\\"},{\\\"key\\\":\\\"项目名称\\\",\\\"value\\\":\\\"默认项目 \\\"},{\\\"key\\\":\\\"内存容量\\\",\\\"value\\\":\\\"12 G\\\"},{\\\"key\\\":\\\"连接数\\\",\\\"value\\\":\\\"40000 \\\"}]\"},{\"itemName\":\"display_i18n\",\"itemNo\":\"display_i18n\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"[{\\\"key\\\":\\\"Data Center\\\",\\\"value\\\":\\\"CN East 1(Shanghai)\\\"},{\\\"key\\\":\\\"Availability Zone\\\",\\\"value\\\":\\\"A\\\"},{\\\"key\\\":\\\"Project ID\\\",\\\"value\\\":\\\"0\\\"},{\\\"key\\\":\\\"Project Name\\\",\\\"value\\\":\\\"Default Project\\\"},{\\\"key\\\":\\\"Memory Capacity\\\",\\\"value\\\":\\\"12 G\\\"},{\\\"key\\\":\\\"Connections\\\",\\\"value\\\":\\\"40000\\\"}]\"},{\"itemName\":\"内存容量-企业版\",\"itemNo\":\"ECC_MEMORY\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"unit\":\"G\",\"value\":\"12\"},{\"itemName\":\"项目ID\",\"itemNo\":\"iamProjectId\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"0\"},{\"itemName\":\"项目名称\",\"itemNo\":\"iamProjectName\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"默认项目\"},{\"itemName\":\"缓存服务套餐CODE\",\"itemNo\":\"instanceType\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"\"},{\"itemName\":\"内存容量\",\"itemNo\":\"mem\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"unit\":\"G\",\"value\":\"12\"},{\"itemName\":\"缓存服务内存容量-价格体系使用\",\"itemNo\":\"memory\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"unit\":\"G\",\"value\":\"12\"},{\"itemName\":\"缓存类型-价格体系使用\",\"itemNo\":\"mem_type\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"redis\"},{\"itemName\":\"实例名称\",\"itemNo\":\"name\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"sunkai_temp\"},{\"itemName\":\"网络类型\",\"itemNo\":\"net_type\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"2\"},{\"itemName\":\"网络类型\",\"itemNo\":\"net_type_name\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"VPC网络\"},{\"itemName\":\"数量\",\"itemNo\":\"num\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"1\"},{\"itemName\":\"实例密码\",\"itemNo\":\"passWord\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"c3kMeAiinRgLYhm/pCABHPNjSa+e2805m3HLn5L+kcSnRik+uIt2MpPiwXQuCZ8vIL1X8W2FNVJtXe8zL/T1Kw==\"},{\"itemName\":\"缓存服务端口\",\"itemNo\":\"port\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"6379\"},{\"itemName\":\"引擎版本\",\"itemNo\":\"protocol\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"6.0\"},{\"itemName\":\"数据中心code\",\"itemNo\":\"region\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"cn-shanghai-2\"},{\"itemName\":\"数据中心\",\"itemNo\":\"regionName\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"华东1（上海）\"},{\"itemName\":\"安全组ID\",\"itemNo\":\"securityGroupId\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"5aa5aae5-a69e-4ce1-973a-f9b82ea0b4bf\"},{\"itemName\":\"分片数量\",\"itemNo\":\"shardNum\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"3\"},{\"itemName\":\"分片容量\",\"itemNo\":\"shardSize\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"4\"},{\"itemName\":\"缓存服务架构类型\",\"itemNo\":\"type\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"4\"},{\"itemName\":\"缓存服务 EndpointID\",\"itemNo\":\"vnet_id\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"e97c7b2b-4204-4fcc-83b8-b7e47c44b64f\"},{\"itemName\":\"缓存服务 Endpoint名称\",\"itemNo\":\"vnet_name\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"终端子网\"},{\"itemName\":\"缓存服务 VPCID\",\"itemNo\":\"vpc_id\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"72c00f9e-60e6-4b99-a0ee-558b6a561d7c\"},{\"itemName\":\"缓存服务 VPC名称\",\"itemNo\":\"vpc_name\",\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"value\":\"测试部公用-仅允许内网EIP-禁止绑定120开头IP\"}],\"productGroup\":106,\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"productType\":667,\"productUse\":1,\"productWhat\":1,\"region\":\"SHPBSRegionOne\",\"userId\":2000102274}],\"reason\":\"instance.init\",\"source\":1,\"subOrderList\":[{\"productGroup\":106,\"productId\":\"9af096e7-d558-4d67-8c32-427dcf82fd5b\",\"productType\":667,\"region\":\"SHPBSRegionOne\",\"subOrderId\":\"ECC2S2303221651434401TFR3V\"}],\"subUserId\":\"uzHAtpq1TuCOV4LNoYvkEQ\",\"userId\":2000102274}","msg_id":"1679475103612TJWe","msg_request_id":"0eb14cb8-2303-415a-b14f-2abc526ee85e","msg_action":"instance.create","msg_timestamp":1679475103612}"
//
        System.out.println(s);
    }

    @Test
    public void testChar(){
        String value = "cn-beijing-6b";
        byte dot = "`".getBytes()[0];
        System.out.println(dot);
        System.out.println(value.substring(value.length() - 1).toLowerCase().getBytes()[0] - dot);

    }

    @Test
    public void testChar1(){
        String value = "cn-beijing-6a";
        byte dot = "`".getBytes()[0];
//        System.out.println(dot);

//        String[] azTemps = value.split(",");
//        ArrayList<Integer> oarea = new ArrayList<>();
//        for (String azTemp: azTemps){
//            oarea.add(value.substring(value.length() - 1).toLowerCase().getBytes()[0] - dot);
//        }
//        System.out.println(oarea);
        String s = "1" + "," + "2,3";


        Form form1 = new Form("a","b","c",1);
        Form form2 = new Form("a","c",1);
        Form form = new Form("a","c");
        if (!StringUtils.isEmpty(form.getPrepareAzName())){
            form.setAvailableZone(form.getAvailableZone() + "," + form.getPrepareAzName());
        }
        if (!StringUtils.isEmpty(form.getRrAzName()) && form.getSlaveNum() > 0){
            if (StringUtils.isEmpty(form.getPrepareAzName())){
                form.setAvailableZone(form.getAvailableZone() + "," + form.getAvailableZone() + "," + form.getRrAzName());
            } else form.setAvailableZone(form.getAvailableZone() + "," + form.getRrAzName());
        }


        System.out.println(s);
    }

    @Data
    @AllArgsConstructor
    class Form {
        public String availableZone;
        String prepareAzName;
        String rrAzName;
        Integer slaveNum;

        Form(String a, String c, int slaveNum){
            this.availableZone = a;
            this.rrAzName = c;
            this.slaveNum = 1;

        }
        Form(String a, String c){
            this.availableZone = a;
            this.rrAzName = c;


        }

    }

    @Test
    public void testAZ(){
        String s1 = "1";
        List<String> collect = Arrays.stream(s1.split(",")).distinct().collect(Collectors.toList());
        if (collect.size() > 1) {
            String s = collect.get(0);
            for (int i = 1; i < collect.size(); i++) {
                s = s + "," + collect.get(i);
            }
            System.out.println(s);
        } else {
            System.out.println(collect.get(0));
        }

    }


    @Test
    public void testJoin() {

//        ArrayList<String> objects = new ArrayList<>();
//        objects.add("1");
//        objects.add("2");
//        objects.add("3");
        String[] strings = {"1", "2", "3"};
        ArrayList<String> list = new ArrayList<>();
        if (list.size() > 1){
//            list = Collections.addAll(strings);
        }
    }

    @Test
    public void testSwich(){

        String action = "Resize";

        switch (action){
            case "Resize":

            case "init":
            case "delete":
                System.out.println("delete");

            default:
                break;
        }

    }

    @Test
    public void testSer() {
        SampleClass sampleClass = new SampleClass();
    }



}
class SampleClass implements Serializable {
    private long serialVersionUID = 1; // field of a Serializable class is not declared 'private static final long'

    public SampleClass() {
        System.out.println(serialVersionUID);
    }
}
