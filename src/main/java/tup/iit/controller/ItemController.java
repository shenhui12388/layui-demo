package tup.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tup.iit.entity.Item;
import tup.iit.service.ItemService;
import tup.iit.util.ResponseObject;

/**
 * @author senfel
 * @Title: ItemController
 * @ProjectName layui-demo
 * @Description: TODO
 * @date 2019/2/2513:20
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping("/items")
    public ResponseObject<Item> queryItem(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "25") int limit){
        return  itemService.queryItem(page,limit);


    }
}
