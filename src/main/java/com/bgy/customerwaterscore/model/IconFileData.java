package com.bgy.customerwaterscore.model;


import java.io.Serializable;

public class IconFileData implements Serializable {
    private Long id;

    private String name;

    private byte[] fileInfo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public byte[] getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(byte[] fileInfo) {
        this.fileInfo = fileInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", fileInfo=").append(fileInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}