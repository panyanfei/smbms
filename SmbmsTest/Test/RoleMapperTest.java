
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import com.bdqn.smbms.dao.role.RoleMapper;
import com.bdqn.smbms.pojo.Role;
import com.bdqn.smbms.util.MyBatisUtil;
public class RoleMapperTest {
	private Logger logger =Logger.getLogger(RoleMapperTest.class);
	@Test
	public void getRole(){
		List<Role> list = new ArrayList<Role>();
		
		SqlSession session = null;
		
		session = MyBatisUtil.getSqlsession();
		
		list = session.getMapper(RoleMapper.class).getRole();
			for (Role role : list) {
				logger.debug(role.getId()+role.getRoleCode()+role.getRoleName());
			}
			
				
			MyBatisUtil.closeSqlsession(session);
	}
	
}
