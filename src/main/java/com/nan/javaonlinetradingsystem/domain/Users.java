package com.nan.javaonlinetradingsystem.domain;

import java.sql.Date;
import java.util.Objects;

public class Users {
    // 用户ID（唯一标识），每个用户的唯一标志符，用于数据库主键
    private int userID;

    // 用户名，用于用户登录和显示，具有唯一性约束
    private String userName;

    // 用户密码，存储为加密后的字符串，保障用户隐私与安全
    private String password;

    // 用户邮箱，用于账户的绑定及验证
    private String email;

    // 用户身份，用于区分用户权限，如普通用户或管理员
    private String role;

    // 注册日期，记录用户创建账户的时间
    private Date registrationDate;

    /**
     * 获取用户ID
     * @return 用户的唯一标识符
     */
    public int getUserID() {
        return userID;
    }

    /**
     * 设置用户ID
     * @param userID 用户的唯一标识符
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * 获取用户名
     * @return 用户名字符串
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     * @param userName 用户名字符串
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     * @return 加密后的密码字符串
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     * @param password 加密后的密码字符串
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户邮箱
     * @return 邮箱字符串
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     * @param email 邮箱字符串
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户身份
     * @return 用户身份字符串
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置用户身份
     * @param role 用户身份字符串
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取用户注册日期
     * @return 注册日期对象
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * 设置用户注册日期
     * @param registrationDate 注册日期对象
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * 比较两个用户对象是否相等
     * @param o 需要比较的对象
     * @return 如果所有字段相等，则返回 true；否则返回 false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userID == users.userID &&
                Objects.equals(userName, users.userName) &&
                Objects.equals(password, users.password) &&
                Objects.equals(email, users.email) &&
                Objects.equals(role, users.role) &&
                Objects.equals(registrationDate, users.registrationDate);
    }

    /**
     * 生成用户对象的哈希码
     * @return 根据用户字段生成的哈希值
     */
    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, password, email, role, registrationDate);
    }

    /**
     * 将用户对象转换为字符串表示
     * @return 包含所有用户字段的字符串
     */
    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
