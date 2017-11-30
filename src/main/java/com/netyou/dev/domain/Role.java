package com.netyou.dev.domain;

import java.util.Date;
import javax.persistence.*;

public class Role {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 版本
     */
    private Long version;

    /**
     * 机构code
     */
    @Column(name = "org_code")
    private String orgCode;

    /**
     * 角色code
     */
    @Column(name = "role_code")
    private String roleCode;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色状态（0:开启，1:关闭）
     */
    private Boolean status;

    /**
     * 删除标识(0-未删除,1-已删除)
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取机构code
     *
     * @return org_code - 机构code
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置机构code
     *
     * @param orgCode 机构code
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取角色code
     *
     * @return role_code - 角色code
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 设置角色code
     *
     * @param roleCode 角色code
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色状态（0:开启，1:关闭）
     *
     * @return status - 角色状态（0:开启，1:关闭）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置角色状态（0:开启，1:关闭）
     *
     * @param status 角色状态（0:开启，1:关闭）
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取删除标识(0-未删除,1-已删除)
     *
     * @return deleted - 删除标识(0-未删除,1-已删除)
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置删除标识(0-未删除,1-已删除)
     *
     * @param deleted 删除标识(0-未删除,1-已删除)
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取更新时间
     *
     * @return gmt_modify - 更新时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置更新时间
     *
     * @param gmtModify 更新时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}