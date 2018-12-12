package com.qf.service;

import com.qf.pojo.po.Item;
import com.qf.pojo.vo.PageVO;

import java.util.List;

public interface ItemService {

    List<Item> listItems();

    PageVO<Item> pageListItem(int pageIndex, int pageSize, int total);

    void removeItemById(int id);


    void insertItem(Item item);

    Item getItemById(int id);

    void updateItem(Item item);
}
