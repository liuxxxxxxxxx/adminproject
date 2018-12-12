package com.qf.service.Impl;

import com.qf.dao.ItemDao;
import com.qf.pojo.po.Item;
import com.qf.pojo.po.User;
import com.qf.pojo.vo.PageVO;
import com.qf.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> listItems() {
        try{
            return itemDao.listItems();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PageVO<Item> pageListItem(int pageIndex, int pageSize, int total) {
        //设置
        PageVO pageVO = new PageVO();
        pageVO.setPageIndex(pageIndex);
        pageVO.setPageSize(pageSize);
        pageVO.setTotal(total);
        pageVO.setOffset((pageVO.getPageIndex()-1)*pageVO.getPageSize());
        int offset = pageVO.getOffset();
        System.out.println(offset);
        List<Item> items = null;

        try{
            items = itemDao.pageListItem(offset,pageSize);
            pageVO.setDate(items);
        }catch (Exception e){
            e.printStackTrace();
        }

        return pageVO;
    }

    @Override
    public void removeItemById(int id) {
        try{
            itemDao.removeItemById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertItem(Item item) {
        try{
            itemDao.insertItem(item);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Item getItemById(int id) {
        try{
            return itemDao.getItemById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateItem(Item item) {
        try{
            itemDao.updateItem(item);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
