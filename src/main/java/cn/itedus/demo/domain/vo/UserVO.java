package cn.itedus.demo.domain.vo;

import java.util.Date;

/**
 * @description: 用户VO
 * @author: 小傅哥，微信：fustack
 * @date: 2021/9/14
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class UserVO {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String userNickName;

    /**
     * 注册时间
     */
    private Date createTime;

    public UserVO() {
    }

    public UserVO(Long id, String userId, String userNickName, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.userNickName = userNickName;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(userId);
        sb.append("|").append(userNickName);
        sb.append("|").append(createTime);
        return sb.toString();
    }

}
