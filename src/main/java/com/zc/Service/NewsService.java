package com.zc.Service;

import com.zc.pojo.news;

import java.util.List;

public interface NewsService {
    /**
     * 通过 ISDN 查找 new
     * @param ISDN
     * @return
     */
    public news selectNewById(int ISDN);

    /**
     *  查询全部新闻
     * @return
     */
    public List<news> Allnews();

    /**
     *  添加新闻
     * @param news
     * @return
     */
    public int addNew(news news);

    /**
     *  更新新闻
     * @param news
     * @return
     */
    public int upNew(news news);

    /**
     * 通过 ISDN 删除新闻
     * @param ISDN
     * @return
     */
    public int DelnewById(int ISDN);
}
