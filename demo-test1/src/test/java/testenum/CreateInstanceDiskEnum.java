package testenum;

/**
 *
 * 接口创建clickhouse时，指定实例挂载盘的类型
 */
public enum CreateInstanceDiskEnum {

    //云盘
    CloudDisk("SSD3.0","disk"),
    //本地盘
    LocalDisk("SSD3.0","local_disk");

    //对于底层使用的code
    private String diskcode;
    //订单中使用参数代表是
    private String orderUserParameter;

    CreateInstanceDiskEnum(String diskcode, String orderUserParameter) {
        this.diskcode = diskcode;
        this.orderUserParameter = orderUserParameter;
    }

    public String getDiskcode() {
        return diskcode;
    }

    public String getOrderUserParameter() {
        return orderUserParameter;
    }
}
