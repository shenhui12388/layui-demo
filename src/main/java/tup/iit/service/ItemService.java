package tup.iit.service;

import tup.iit.entity.Item;
import tup.iit.entity.ItemExample;
import tup.iit.util.ResponseObject;

import java.util.List;

/**
 * @author senfel
 * @Title: ItemService
 * @ProjectName layui-demo
 * @Description: TODO
 * @date 2019/2/2511:00
 */
public interface ItemService {
    ResponseObject<Item> queryItem(int page, int limit);
}
