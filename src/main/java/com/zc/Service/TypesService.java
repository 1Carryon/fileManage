package com.zc.Service;

import com.zc.pojo.types;

import java.util.List;

public interface TypesService {

    /**
     * 通过ID查找type
     * @param id
     * @return
     */
    public types selectTypeByID(int id);

    /**
     * 查询全部
     * @return
     */
    public List<types> Alltypes();

    /**
     * 通过id删除type
     * @param id
     * @return
     */
    public int DeletetypeById(int id);

    /**
     *  更新type
     * @param types
     * @return
     */
    public int Updatetype(types types);

    /**
     * 添加type
     * @param types
     * @return
     */
    public int addtype(types types);
}
