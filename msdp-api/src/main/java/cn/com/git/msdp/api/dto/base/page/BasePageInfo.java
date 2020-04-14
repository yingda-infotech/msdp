package cn.com.git.msdp.api.dto.base.page;


public class BasePageInfo {
    /** 查询页 */
    private int pageNum;

    /** 每页查询大小 */
    private int pageSize;

    /** 总记录数 */
    private long total;

    /** 排序 */
    private String orderBy;

    /** 总页数 */
    private int pages;
}
