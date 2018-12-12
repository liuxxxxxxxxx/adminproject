package com.qf.mvc;

import com.qf.pojo.po.Item;
import com.qf.pojo.po.User;
import com.qf.pojo.vo.PageVO;
import com.qf.service.ItemService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/items")
public class ItemAction {
    @Autowired
    private ItemService itemService;

    @ResponseBody
    @PostMapping("/listItems")
    public PageVO<Item> listItems(@RequestBody Map map){
        //获取当前页
        int pageIndex = 1;
        Object param1 = map.get("pageIndex");
        if (param1!=null){
            pageIndex = (int)param1;
        }
        //获取每页显示个数
        int pageSize = 5;
        Object param2 = map.get("pageSize");
        if(param2!=null){
            pageSize = (int)param2;
        }
        //求出商品总数
        List<Item> users = itemService.listItems();
        int total = users.size();
        //获得分页
        PageVO<Item> pageVO = itemService.pageListItem(pageIndex,pageSize,total);
        return pageVO;
    }

    @DeleteMapping("/removeItem")
    public void removeItem(@RequestBody Map map){
        int id = (int)map.get("id");
        itemService.removeItemById(id);
    }


    @PostMapping("/fileUpload")
    public void fileUpload(@RequestParam CommonsMultipartFile file, HttpServletRequest request){

        if(file!=null){
            String filename = file.getOriginalFilename();
//        上传文件
            String path = request.getServletContext().getRealPath("/item/");
            File filepath = new File(path,filename);
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            try {
                file.transferTo(new File(path+File.separator+filename));
            } catch (IOException e) {
                e.printStackTrace();
            }
//        将文件名存入域对象
            ServletContext servletContext = request.getServletContext();
            servletContext.setAttribute("filename",filename);

        }

    }

    @PostMapping("/downloadItem")
    public ResponseEntity<byte[]> downloadItem(@RequestBody Map map, HttpServletRequest request) throws IOException {
        //获取参数
        String param =(String) map.get("path");
        String[] split = param.split("/");
        String filename = split[split.length-1];
        System.out.println(filename);
        //        要下载文件的路径
        String path = request.getServletContext().getRealPath("/item/");
//        拼接
        File file = new File(path+File.separator+filename);


//        存放到httpHeaders中
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment",new String(filename.getBytes("UTF-8"),"ISO-8859-1"));
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
    }

    @PostMapping("/insertItem")
    public void insertItem(@RequestBody Map map,HttpServletRequest request){

        Item item = new Item();
        item.setName((String)map.get("name"));
        item.setUrl((String)map.get("url"));
//        这里获取的cname其实就是cid
        item.setCname((String)map.get("cname"));
        item.setInfo((String)map.get("info"));

        String name = request.getParameter("name");
        System.out.println("requestName:"+name);

//        从域对象中获取filename
        ServletContext servletContext = request.getServletContext();
        String filename = (String)servletContext.getAttribute("filename");
        if(filename!=null){
//            拼接文件路径
            item.setPath("/item"+item.getCname()+"/"+filename);
        }
        System.out.println(item);
       itemService.insertItem(item);
    }

    @ResponseBody
    @PostMapping("/getItemById")
    public Item getItemById(@RequestBody Map map){
        int id = (int)map.get("id");
        Item item = itemService.getItemById(id);
        item.setCname(item.getCid());
        return item;
    }

    @PutMapping("/updateItem")
    public void updateItem(@RequestBody Map map){
        Item item = new Item();
        item.setId((int)map.get("id"));
        item.setName((String)map.get("name"));
        item.setCid((String)map.get("cname"));
        item.setUrl((String)map.get("url"));
        item.setInfo((String)map.get("info"));

        System.out.println(item);
        itemService.updateItem(item);
    }
}
