package com.qf.dao;

import com.qf.pojo.po.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDao {

    List<Item> listItems();

    List<Item> pageListItem(@Param(value="offset")int offset, @Param(value = "pageSize") int pageSize);

    void removeItemById(int id);

    void insertItem(Item item);

    Item getItemById(int id);

    void updateItem(Item item);
}
