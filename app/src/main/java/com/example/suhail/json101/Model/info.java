package com.example.suhail.json101.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit2.http.Url;

/**
 * Created by Suhail on 8/14/2017.
 */

public class info {


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("authority")
    @Expose
    private String authority;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("post")
    @Expose
    private String post;
    @SerializedName("image_link")
    @Expose
    private String imageLink;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("teacher")
    @Expose
    private String teacher;
    @SerializedName("hideid")
    @Expose
    private String hideid;
    @SerializedName("first_login_datetime")
    @Expose
    private String firstLoginDatetime;
    @SerializedName("last_login_datetime")
    @Expose
    private String lastLoginDatetime;
    @SerializedName("last_login_ip")
    @Expose
    private String lastLoginIp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getHideid() {
        return hideid;
    }

    public void setHideid(String hideid) {
        this.hideid = hideid;
    }

    public String getFirstLoginDatetime() {
        return firstLoginDatetime;
    }

    public void setFirstLoginDatetime(String firstLoginDatetime) {
        this.firstLoginDatetime = firstLoginDatetime;
    }

    public String getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    public void setLastLoginDatetime(String lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

}
   /* public info(String id, String name, String authority, String level,
                String post, String img_links, String username, String password,
                String phone, String email, String teacher, String hideid, String first_login_datetime,
                String last_login_datetime, String last_login_ip) {
        this.id = id;
        this.name = name;
        this.authority = authority;
        this.level = level;
        this.post = post;
        this.img_links = img_links;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.teacher = teacher;
        this.hideid = hideid;
        this.first_login_datetime = first_login_datetime;
        this.last_login_datetime = last_login_datetime;
        this.last_login_ip = last_login_ip;
    }

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("authority")
    private String authority;
    @SerializedName("level")
    private String level;
    @SerializedName("post")
    private String post;
    @SerializedName("img_links")
    private String img_links;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("phone")
    private String phone;
    @SerializedName("email")
    private String email;
    @SerializedName("teacher")
    private String teacher;
    @SerializedName("hideid")

    private String hideid;
    @SerializedName("first_login_datetime")
    private String first_login_datetime;
    @SerializedName("last_login_datetime")
    private String last_login_datetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getImg_links() {
        return img_links;
    }

    public void setImg_links(String img_links) {
        this.img_links = img_links;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getHideid() {
        return hideid;
    }

    public void setHideid(String hideid) {
        this.hideid = hideid;
    }

    public String getFirst_login_datetime() {
        return first_login_datetime;
    }

    public void setFirst_login_datetime(String first_login_datetime) {
        this.first_login_datetime = first_login_datetime;
    }

    public String getLast_login_datetime() {
        return last_login_datetime;
    }

    public void setLast_login_datetime(String last_login_datetime) {
        this.last_login_datetime = last_login_datetime;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    @SerializedName("last_login_ip")
    private String last_login_ip;
}
*/