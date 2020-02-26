package cn.van.sfs.demo.common;

/**
 * @公众号： 风尘博客
 * @Classname MemberEnum
 * @Description 会员级别枚举
 * @Date 2020/2/6 8:58 下午
 * @Author by Van
 */
public enum MemberEnum {

    ORDINARY_MEMBER(0, "普通会员"),
    JUNIOR_MEMBER(1, "初级会员"),
    INTERMEDIATE_MEMBER(2, "中级会员"),
    SENIOR_MEMBER(3, "高级会员"),

    ;

    int code;
    String desc;

    MemberEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public int getCode() {
        return code;
    }

    public void setDesc(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
