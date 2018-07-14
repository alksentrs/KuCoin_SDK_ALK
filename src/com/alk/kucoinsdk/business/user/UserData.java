package com.alk.kucoinsdk.business.user;

import java.util.Map;

/**
 * Created by ksander on 19/06/18.
 */
public class UserData {

    private String companyKyc;
    private String referrer_code;
    private Boolean photoCredentialValidated;
    private Float baseBonusRate;
    private String language;
    private String csrf;
    private String oid;
    private Integer baseFeeRate;
    private Boolean hasCredential;
    private String credentialStatus;
    private String userKyc;
    private Boolean phoneValidated;
    private Boolean credentialValidated;
    private Boolean googleTwoFaBinding;
    private String nickname;
    private String currency;
    private String email;
    private String videoValidated;
    private String phone;
    private Boolean hasSecurityQuestion;
    private String name;
    private Boolean hasTradePassword;
    private Boolean emailValidated;
    private String safeWords;
    private Boolean isChinaVisitor;
    private Boolean isSuspend;
    private Map<String,UserLoginRecord> loginRecord;

    public String getCompanyKyc() {
        return companyKyc;
    }

    public void setCompanyKyc(String companyKyc) {
        this.companyKyc = companyKyc;
    }

    public String getReferrer_code() {
        return referrer_code;
    }

    public void setReferrer_code(String referrer_code) {
        this.referrer_code = referrer_code;
    }

    public Boolean getPhotoCredentialValidated() {
        return photoCredentialValidated;
    }

    public void setPhotoCredentialValidated(Boolean photoCredentialValidated) {
        this.photoCredentialValidated = photoCredentialValidated;
    }

    public Float getBaseBonusRate() {
        return baseBonusRate;
    }

    public void setBaseBonusRate(Float baseBonusRate) {
        this.baseBonusRate = baseBonusRate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCsrf() {
        return csrf;
    }

    public void setCsrf(String csrf) {
        this.csrf = csrf;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getBaseFeeRate() {
        return baseFeeRate;
    }

    public void setBaseFeeRate(Integer baseFeeRate) {
        this.baseFeeRate = baseFeeRate;
    }

    public Boolean getHasCredential() {
        return hasCredential;
    }

    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    public String getCredentialStatus() {
        return credentialStatus;
    }

    public void setCredentialStatus(String credentialStatus) {
        this.credentialStatus = credentialStatus;
    }

    public String getUserKyc() {
        return userKyc;
    }

    public void setUserKyc(String userKyc) {
        this.userKyc = userKyc;
    }

    public Boolean getPhoneValidated() {
        return phoneValidated;
    }

    public void setPhoneValidated(Boolean phoneValidated) {
        this.phoneValidated = phoneValidated;
    }

    public Boolean getCredentialValidated() {
        return credentialValidated;
    }

    public void setCredentialValidated(Boolean credentialValidated) {
        this.credentialValidated = credentialValidated;
    }

    public Boolean getGoogleTwoFaBinding() {
        return googleTwoFaBinding;
    }

    public void setGoogleTwoFaBinding(Boolean googleTwoFaBinding) {
        this.googleTwoFaBinding = googleTwoFaBinding;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVideoValidated() {
        return videoValidated;
    }

    public void setVideoValidated(String videoValidated) {
        this.videoValidated = videoValidated;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getHasSecurityQuestion() {
        return hasSecurityQuestion;
    }

    public void setHasSecurityQuestion(Boolean hasSecurityQuestion) {
        this.hasSecurityQuestion = hasSecurityQuestion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasTradePassword() {
        return hasTradePassword;
    }

    public void setHasTradePassword(Boolean hasTradePassword) {
        this.hasTradePassword = hasTradePassword;
    }

    public Boolean getEmailValidated() {
        return emailValidated;
    }

    public void setEmailValidated(Boolean emailValidated) {
        this.emailValidated = emailValidated;
    }

    public String getSafeWords() {
        return safeWords;
    }

    public void setSafeWords(String safeWords) {
        this.safeWords = safeWords;
    }

    public Boolean getIsChinaVisitor() {
        return isChinaVisitor;
    }

    public void setIsChinaVisitor(Boolean chinaVisitor) {
        isChinaVisitor = chinaVisitor;
    }

    public Boolean getIsSuspend() {
        return isSuspend;
    }

    public void setIsSuspend(Boolean suspend) {
        isSuspend = suspend;
    }

    public Map<String, UserLoginRecord> getLoginRecord() {
        return loginRecord;
    }

    public void setLoginRecord(Map<String, UserLoginRecord> loginRecord) {
        this.loginRecord = loginRecord;
    }

    @Override
    public String toString() {
        return "{" +
                "companyKyc:" + companyKyc + "," +
                "referrer_code:" + referrer_code + "," +
                "photoCredentialValidated:" + photoCredentialValidated + "," +
                "baseBonusRate:" + baseBonusRate + "," +
                "language:" + language + "," +
                "csrf:" + csrf + "," +
                "oid:" + oid + "," +
                "baseFeeRate:" + baseFeeRate + "," +
                "hasCredential:" + hasCredential + "," +
                "credentialStatus:" + credentialStatus + "," +
                "userKyc:" + userKyc + "," +
                "phoneValidated:" + phoneValidated + "," +
                "credentialValidated:" + credentialValidated + "," +
                "googleTwoFaBinding:" + googleTwoFaBinding + "," +
                "nickname:" + nickname + "," +
                "currency:" + currency + "," +
                "email:" + email + "," +
                "videoValidated:" + videoValidated + "," +
                "phone:" + phone + "," +
                "hasSecurityQuestion:" + hasSecurityQuestion + "," +
                "name:" + name + "," +
                "hasTradePassword:" + hasTradePassword + "," +
                "emailValidated:" + emailValidated + "," +
                "safeWords:" + safeWords + "," +
                "isChinaVisitor:" + isChinaVisitor + "," +
                "isSuspend:" + isSuspend + "," +
                "loginRecord:" + loginRecord +
                "}";
    }
}
