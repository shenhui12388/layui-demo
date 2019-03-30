package tup.iit.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tup.iit.dao.ItemMapper;
import tup.iit.entity.Item;
import tup.iit.entity.ItemExample;
import tup.iit.service.ItemService;
import tup.iit.util.ResponseObject;
import java.util.List;

/**
 * @author senfel
 * @Title: ItemServiceImpl
 * @ProjectName layui-demo
 * @Description: TODO
 * @date 2019/2/2511:01
 */
@Service
public class ItemServiceImpl  implements ItemService{
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public  ResponseObject<Item> queryItem(int page,int limit) {
        ItemExample itemExample = new ItemExample();
        PageHelper.startPage(page,limit);
        List<Item> items = itemMapper.selectByExample(itemExample);
        //查询总数
        PageInfo<Item> PageInfo = new PageInfo<>(items);
        long total = PageInfo.getTotal();
        return new ResponseObject<Item>("200",total,items);
    }
}
