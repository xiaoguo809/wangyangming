package com.bgy.customerwaterscore.model;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * author guoxujie
 * date 2019年8月17日
 */
public enum FileSizeEnum {
    OneM("1M",1048576);
    private  String name;
    private long size;

    FileSizeEnum(String name,long size){
        this.name=name;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

}
