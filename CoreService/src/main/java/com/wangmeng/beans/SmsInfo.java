package com.wangmeng.beans;

import java.io.Serializable;

/**
 * @CreatedBy  : ChenChunlei .
 * @CreatedOn  : 2017/9/21 0021 上午 11:27 .
 * @Description:
 */
public class SmsInfo implements Serializable {
    /** 手机号码 **/
    private String cellPhone;
    /** 消息模板编号 **/
    private String templeteCode;
    /** 参数数组 **/
    private String[] parmArr;
    /** 业务类型 **/
    private String businessType;


    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getTempleteCode() {
        return templeteCode;
    }

    public void setTempleteCode(String templeteCode) {
        this.templeteCode = templeteCode;
    }

    public String[] getParmArr() {
        return parmArr;
    }

    public void setParmArr(String[] parmArr) {
        this.parmArr = parmArr;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }


}
