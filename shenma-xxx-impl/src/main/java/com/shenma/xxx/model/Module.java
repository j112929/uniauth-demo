package com.shenma.xxx.model;

import java.io.Serializable;
import java.util.Date;

public class Module implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4806611197368344275L;

	private String id;

    private String moduleKey;

    private String isEnable;

    private String moduleDesc;

    private Date createTime;

    private Date updateTime;

    private String secretKey;

    private Long urlDefalutExpire;

    private String rsaPublicKey;

    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey;
    }

    private String rsaPrivateKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getModuleKey() {
        return moduleKey;
    }

    public void setModuleKey(String moduleKey) {
        this.moduleKey = moduleKey == null ? null : moduleKey.trim();
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc == null ? null : moduleDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    public Long getUrlDefalutExpire() {
        return urlDefalutExpire;
    }

    public void setUrlDefalutExpire(Long urlDefalutExpire) {
        this.urlDefalutExpire = urlDefalutExpire;
    }
}