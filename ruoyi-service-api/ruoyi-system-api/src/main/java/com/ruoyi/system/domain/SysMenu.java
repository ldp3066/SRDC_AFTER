package com.ruoyi.system.domain;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.common.core.domain.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 菜单权限表 sys_menu
 * 
 * @author ruoyi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 菜单ID */
    private Long              menuId;

    /** 菜单名称 */
    private String            menuName;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


    /** 父菜单名称 */
    private String            parentName;

    /** 父菜单ID */
    private Long              parentId;

    /** 打开方式 (_blank新窗口) */
    private String            target;

    /** 显示顺序 */
    private String            orderNum;

    /** 类型:0目录,1菜单,2按钮 */
    private String            menuType;

    /** 菜单URL */
    private String            menuKey;

    /** 组件 */
    private String            component;

    /** 菜单状态:0显示,1隐藏 */
    private String            visible;

    /** 权限字符串 */
    private String            perms;

    /** 菜单图标 */
    private String            icon;

    /** 链接地址 */
    private String            path;

    /** 重定向地址 */
    private String            redirect;

    /** 隐藏子菜单 */
    private Boolean           hiddenChildren;

    /** 隐藏 PageHeader 组件中的页面带的 面包屑和页面标题栏 */
    private Boolean           hiddenHeader;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public Boolean getHiddenChildren() {
        return hiddenChildren;
    }

    public void setHiddenChildren(Boolean hiddenChildren) {
        this.hiddenChildren = hiddenChildren;
    }

    public Boolean getHiddenHeader() {
        return hiddenHeader;
    }

    public void setHiddenHeader(Boolean hiddenHeader) {
        this.hiddenHeader = hiddenHeader;
    }

    public List<SysMenu> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenu> children) {
        this.children = children;
    }

    /** 子菜单 */
    private List<SysMenu>     children         = new ArrayList<SysMenu>();
}
