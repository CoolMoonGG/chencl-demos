package com.wangmeng.beans;

import java.io.Serializable;

public class SysConfig  implements Serializable {
    private Long id;

    private String itemCate;

    private String itemCode;

    private String itemName;

    private String itemValue;

    private String itemType;

    private String itemInputs;

    private Integer itemSort;

    private String itemTip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemCate() {
        return itemCate;
    }

    public void setItemCate(String itemCate) {
        this.itemCate = itemCate == null ? null : itemCate.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue == null ? null : itemValue.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getItemInputs() {
        return itemInputs;
    }

    public void setItemInputs(String itemInputs) {
        this.itemInputs = itemInputs == null ? null : itemInputs.trim();
    }

    public Integer getItemSort() {
        return itemSort;
    }

    public void setItemSort(Integer itemSort) {
        this.itemSort = itemSort;
    }

    public String getItemTip() {
        return itemTip;
    }

    public void setItemTip(String itemTip) {
        this.itemTip = itemTip == null ? null : itemTip.trim();
    }
}