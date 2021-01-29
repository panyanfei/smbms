import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.bdqn.smbms.dao.bill.BillMapper;
import com.bdqn.smbms.pojo.Bill;
import com.bdqn.smbms.util.MyBatisUtil;


public class BillMapperTest {
	private Logger logger=Logger.getLogger(BillMapperTest.class);
	@Test
	public void addtest() throws Exception {
		SqlSession session=null;
		session=MyBatisUtil.getSqlsession();
		Bill bill=new Bill();
		bill.setBillCode("fd");
		bill.setProductName("nn");
		int s=session.getMapper(BillMapper.class).add(bill);
		session.commit();
		System.out.println(s);
		MyBatisUtil.closeSqlsession(session);
		
	}
	@Test
	public void getBillList() throws Exception {
		List<Bill> list=new ArrayList<Bill>();
		SqlSession session=null;
		session=MyBatisUtil.getSqlsession();
		list=session.getMapper(BillMapper.class).getBillList();
		for(Bill bill:list){
			System.out.println(bill.getBillCode());
		}
		
		MyBatisUtil.closeSqlsession(session);
		
	}
	@Test
	public void deleteBillById() throws Exception {
		SqlSession session=null;
		session=MyBatisUtil.getSqlsession();
		int s=session.getMapper(BillMapper.class).deleteBillById(20);
		session.commit();
		System.out.println(s);
		MyBatisUtil.closeSqlsession(session);
		
	}
	@Test
	public void getBillById() throws Exception {
		Bill b=new Bill();
		SqlSession session=null;
		session=MyBatisUtil.getSqlsession();
		b=session.getMapper(BillMapper.class).getBillById(4);
		logger.info(b.getBillCode());
		MyBatisUtil.closeSqlsession(session);
		
	}
	@Test
	public void modify() throws Exception {
		int count=0;
		Bill b=new Bill();
		SqlSession session=null;
		session=MyBatisUtil.getSqlsession();
		b.setBillCode("hh");
		b.setProductDesc("hh");
		b.setProductName("hh");
		b.setProductUnit("hh");
		b.setProductCount(new BigDecimal(400));
		b.setTotalPrice(new BigDecimal(400));
		b.setIsPayment(8);
		b.setProviderId(55);
		b.setModifyBy(40);
		b.setModifyDate(new Date());
		b.setId(4);
		count=session.getMapper(BillMapper.class).modify(b);
		logger.info(count);
		session.commit();
		MyBatisUtil.closeSqlsession(session);
		
	}
	@Test
	public void getBillCountByProviderId() throws Exception {
		int count=0;
		SqlSession session=null;
		session=MyBatisUtil.getSqlsession();
		count=session.getMapper(BillMapper.class).getBillCountByProviderId(1);
		logger.info(count);
		MyBatisUtil.closeSqlsession(session);
		
	}

}
