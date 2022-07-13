

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Description: 微信菜单数据库
 * @Author: jeecg-boot
 * @Date:   2022-07-07
 * @Version: V1.0
 */

public class SkyWechatMenu implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<SkyWechatMenu> subButtons;

    private String id;
	/**创建人*/

    private String createBy;
	/**创建日期*/

    private Date createTime;
	/**更新人*/

    private String updateBy;
	/**更新日期*/

    private Date updateTime;
	/**所属部门*/

    private String sysOrgCode;
	/**父id*/


    private String parentId;
	/**菜单的响应动作类型*/

    private String type;
	/**菜单标题，不超过16个字节，子菜单不超过60个字节*/

    private String name;
	/**菜单 KEY 值，用于消息接口推送，不超过128字节*/

    private String menuKey;
    private String url;


    private String mediaId;

    private String appid;

    private String pagepath;
	/**发布后获得的合法 article_id*/
    private String articleId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSysOrgCode() {
        return sysOrgCode;
    }

    public void setSysOrgCode(String sysOrgCode) {
        this.sysOrgCode = sysOrgCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPagepath() {
        return pagepath;
    }

    public void setPagepath(String pagepath) {
        this.pagepath = pagepath;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public List<SkyWechatMenu> getSubButtons() {
        return subButtons;
    }

    public void setSubButtons(List<SkyWechatMenu> subButtons) {
        this.subButtons = subButtons;
    }

    @Override
    public String toString() {
        return "id:" + id + ",parentid:" + parentId  +  ",subButtons:" + subButtons.toString() +"\n";
    }
}
