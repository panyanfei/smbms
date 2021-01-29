package com.bdqn.smbms.dao.provider;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.smbms.pojo.Provider;

public interface ProviderMapper {

	/**
	 * ���ӹ�Ӧ��
	 * @param connection
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	public int addProvider(Provider provider);


	/**
	 * ͨ����Ӧ�����ơ������ȡ��Ӧ���б�-ģ����ѯ-providerList
	 * @param connection
	 * @param proName
	 * @return
	 * @throws Exception
	 */
	public List<Provider> getProviderList(@Param("proName") String proName, @Param("proCode")String proCode);
	
	/**
	 * ͨ��proIdɾ��Provider
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public int deleteProviderById(Integer delId); 
	
	
	/**
	 * ͨ��proId��ȡProvider
	 * @param connection
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Provider> getProviderById(int id); 
	
	/**
	 * �޸��û���Ϣ
	 * @param connection
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int modify(Provider provider);
	
	
}
