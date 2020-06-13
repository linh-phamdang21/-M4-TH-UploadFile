package com.codegym.form;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class MyUploadForm {
    private String description;
    private CommonsMultipartFile[] fileDatas;

    public MyUploadForm() {
    }

    public MyUploadForm(String description, CommonsMultipartFile[] fileDatas) {
        this.description = description;
        this.fileDatas = fileDatas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommonsMultipartFile[] getFileDatas() {
        return fileDatas;
    }

    public void setFileDatas(CommonsMultipartFile[] fileDatas) {
        this.fileDatas = fileDatas;
    }
}
