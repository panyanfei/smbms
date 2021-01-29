

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.bdqn.smbms.dao.provider.ProviderMapper;
import com.bdqn.smbms.pojo.Provider;
import com.bdqn.smbms.util.MyBatisUtil;


public class ProviderMapperTest {
	
	private Logger logger =Logger.getLogger(ProviderMapperTest.class);
	@Test
	public void addProvider(){
		int count = 0;
		SqlSession session = null;
		session = MyBatisUtil.getSqlsession();
		Provider  provider=new Provider();
		provider.setId(16);
		provider.setProCode("1");
		provider.setProName("2");
		provider.setProDesc("3");
		provider.setProContact("4");
		provider.setProPhone("5");
		provider.setProAddress("6");
		provider.setProFax("7");
		provider.setCreatedBy(1);
		provider.setModifyBy(1);
		provider.setCreationDate(new Date());
		provider.setModifyDate(new Date());
		count = session.getMapper(ProviderMapper.class).addProvider(provider);
		session.commit();
		
		logger.debug(count);
		MyBatisUtil.closeSqlsession(session);
	}
	
	
	@Test
	public void getProviderList(){
		//int count = 0;
		List<Provider> list = new ArrayList<Provider>();
		
		SqlSession session = null;
		session = MyBatisUtil.getSqlsession();
		
		list = session.getMapper(ProviderMapper.class).getProviderList("2","1");
			session.commit();
			
			for (Provider provider : list) {
				logger.debug(provider.toString());
			}
			MyBatisUtil.closeSqlsession(session);
			}
			
				
	@Test
	public void deleteProviderById(){
		int count = 0;
//		List<User> list = new ArrayList<User>();
		
		SqlSession session = null;
		session = MyBatisUtil.getSqlsession();
		
		count = session.getMapper(ProviderMapper.class).deleteProviderById(16);
			session.commit();
			
				logger.debug("删除成功!!");
			
				MyBatisUtil.closeSqlsession(session);
	}
	
	@Test
	public void getProviderById(){
		List<Provider> list = new ArrayList<Provider>();
		
		SqlSession session = null;
		session = MyBatisUtil.getSqlsession();
		
		list = session.getMapper(ProviderMapper.class).getProviderById(2);
			session.commit();
			
			for (Provider provider : list) {
				logger.debug(provider.toString());
			}
			
			MyBatisUtil.closeSqlsession(session);
	}
	
	@Test
	public void modify(){
		int count = 0;
//		List<User> list = new ArrayList<User>();
		
		SqlSession session = null;
		session = MyBatisUtil.getSqlsession();
		Provider  provider=new Provider();
		provider.setId(1);
		provider.setProCode("1");
		provider.setProName("2");
		
		count = session.getMapper(ProviderMapper.class).modify(provider);
		session.commit();
		
		logger.debug("修改成功!");
		MyBatisUtil.closeSqlsession(session);
	}
	
}

