package com.kakarote.crm9.erp.busniess.service.serviceImpl;
import com.kakarote.crm9.erp.busniess.dao.Message;
import com.kakarote.crm9.erp.busniess.dao.BusinessMapper;
import com.kakarote.crm9.erp.busniess.model.Business;
import com.kakarote.crm9.erp.busniess.model.BusinessExample;
import com.kakarote.crm9.erp.busniess.service.UnderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UnderServiceImpl implements UnderService {
    @Autowired
    private BusinessMapper businessMapper   ;

    /**
     * 新增员工
     * @param business
     * @param request
     * @return
     */


    /**
     * 查看所有商机
     * @return
     */


    @Override
    public List<Business> view(Business business, HttpServletRequest request) {
        return  businessMapper.selectByExample(new BusinessExample());

    }


    /**
     *
     * @param business
     * @param
     * @return
     */
//    @Override
//    public Message save(Business business) {
//        mapper.insert(business);
//        Message  mess  =  new Message();
//        mess.setMess("success");
//        return mess;
//    }

//    @Override
//    public Message save(Business business) {
//        Message mess = new Message();
//        String  time =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//        business.setDealDate(time);
//        business.setCreateTime(time);
//        business.setNextTime(time);
//        try {
//            businessMapper.insert(business);
//            mess.setMess("success");
//        } catch (Exception e) {
//            mess.setMess("系统错误");
//        }
//        return mess;
//    }
    @Override
    public void save(Business business, HttpServletRequest request){
        String  time =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
       business.setDealDate(time);
       business.setCreateTime(time);
       business.setNextTime(time);
       business.setUpdateTime(time);
        businessMapper.insert(business);
    }
}
