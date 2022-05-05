package com.codegym.model;

public class Settings {
    private String languages;
    private String pageSize;
    private String signature;
    private String spamFilter;

    public Settings() {
    }

    public Settings(String languages, String pageSize, String signature, String spamFilter) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.signature = signature;
        this.spamFilter = spamFilter;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }


    public void setSpamFilter(String spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSpamFilter() {
        return spamFilter;
    }
}
