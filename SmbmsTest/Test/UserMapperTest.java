

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.smbms.pojo.Bill;
import com.bdqn.smbms.pojo.Provider;
import com.bdqn.smbms.pojo.Role;
import com.bdqn.smbms.pojo.User;
import com.bdqn.smbms.service.billservice.BillService;
import com.bdqn.smbms.service.providerservice.ProviderService;
import com.bdqn.smbms.service.roleservice.RoleService;
import com.bdqn.smbms.service.userservice.UserService;

public class UserMapperTest {
	private Logger logger = Logger.getLogger(UserMapperTest.class);

	@Test
	public void getLoginUser() throws Exception {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext_mybatis.dao.xml","applicationContext_mybatis.service.xml");
		//获取javabean
		UserService userService=(UserService)applicationContext.getBean("userService");
		User loginUser = userService.getLoginUser("admin");
			logger.info("<<<<<<<"+loginUser.getAddress());
		}
	@Test
	public void getBillList() throws Exception {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext_mybatis.xml");
		//获取javabean
		BillService billService=(BillService)applicationContext.getBean("billService");
		for(Bill bill:billService.getBillList()){
			logger.info("<<<<<<<"+bill.getProductName());
		}
		
			
		}
	@Test
	public void getRole() throws Exception {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext_mybatis.xml");
		//获取javabean
		RoleService roleService=(RoleService)applicationContext.getBean("roleService");
		for(Role role:roleService.getRole()){
			logger.info("<<<<<<<"+role.getRoleName());
		}		
		}
	@Test
	public void getProviderById() throws Exception {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext_mybatis.xml");
		//获取javabean
		ProviderService providerService=(ProviderService)applicationContext.getBean("providerService");
		for(Provider p:providerService.getProviderById(3)){
			logger.info("<<<<<<<"+p.getProAddress());
		}
		
			
		}
	
	}
		

