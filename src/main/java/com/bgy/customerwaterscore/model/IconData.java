package com.bgy.customerwaterscore.model;

import com.bgy.customerwaterscore.model.IconFileData;

import java.io.Serializable;

public class IconData implements Serializable {
    private Long id;

    private String name;

    private Integer iconType;

    private Integer size;

    private Integer iconFileType;

    private Long iconFileId;

    private IconFileData iconFileData;

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

    public Integer getIconType() {
        return iconType;
    }

    public void setIconType(Integer iconType) {
        this.iconType = iconType;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getIconFileType() {
        return iconFileType;
    }

    public void setIconFileType(Integer iconFileType) {
        this.iconFileType = iconFileType;
    }

    public Long getIconFileId() {
        return iconFileId;
    }

    public void setIconFileId(Long iconFileId) {
        this.iconFileId = iconFileId;
    }

    public IconFileData getIconFileData() {
        return iconFileData;
    }

    public void setIconFileData(IconFileData iconFileData) {
        this.iconFileData = iconFileData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", iconType=").append(iconType);
        sb.append(", size=").append(size);
        sb.append(", iconFileType=").append(iconFileType);
        sb.append(", iconFileId=").append(iconFileId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}