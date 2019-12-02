package com.hlz.gourdmall.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private Long uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sno
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private String sno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nickname
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.telephone
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.modified_time
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private Date modifiedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private Short sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.state
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private Short state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.admin
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    private Short admin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sno
     *
     * @return the value of user.sno
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public String getSno() {
        return sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sno
     *
     * @param sno the value for user.sno
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nickname
     *
     * @return the value of user.nickname
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nickname
     *
     * @param nickname the value for user.nickname
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.telephone
     *
     * @return the value of user.telephone
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.telephone
     *
     * @param telephone the value for user.telephone
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.modified_time
     *
     * @return the value of user.modified_time
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.modified_time
     *
     * @param modifiedTime the value for user.modified_time
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public Short getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.state
     *
     * @return the value of user.state
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public Short getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.state
     *
     * @param state the value for user.state
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.admin
     *
     * @return the value of user.admin
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public Short getAdmin() {
        return admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.admin
     *
     * @param admin the value for user.admin
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    public void setAdmin(Short admin) {
        this.admin = admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 02 08:53:45 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", sno=").append(sno);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", email=").append(email);
        sb.append(", telephone=").append(telephone);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", sex=").append(sex);
        sb.append(", state=").append(state);
        sb.append(", admin=").append(admin);
        sb.append("]");
        return sb.toString();
    }
}