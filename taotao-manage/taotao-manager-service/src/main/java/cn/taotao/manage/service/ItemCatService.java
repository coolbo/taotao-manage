package cn.taotao.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taotao.manage.mapper.ItemCatMapper;
import cn.taotao.manage.pojo.Item;
import cn.taotao.manage.pojo.ItemCat;

@Service
public class ItemCatService {
    
    /**
     * 类成员变量、方法及构造函数进行标注，完成自动装配的工作。 
     * 通过 @Autowired的使用来消除 set ，get方法
     */
    @Autowired
    private ItemCatMapper itemCatMapper;

    /**
     * 查询商品类目列表
     * @param l
     * @return
     */
    public List<ItemCat> queryItemListByParentId(long l) {
        
        ItemCat record = new ItemCat();
        record.setParentId(l);
        return  itemCatMapper.select(record);
    }

}
