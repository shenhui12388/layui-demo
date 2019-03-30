package tup.iit.util;

import java.util.List;

/**
 * @author senfel
 * @Title: ResponseObject
 * @ProjectName layui-demo
 * @Description: TODO
 * @date 2019/2/2513:16
 */
public class ResponseObject<E> {
    private String status;
    private Long total;
    private List<E> rows;

    public ResponseObject(String status, Long total, List<E> rows) {
        this.status = status;
        this.total = total;
        this.rows = rows;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<E> getRows() {
        return rows;
    }

    public void setRows(List<E> rows) {
        this.rows = rows;
    }
}
