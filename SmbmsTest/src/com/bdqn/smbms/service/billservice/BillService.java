package com.bdqn.smbms.service.billservice;

import java.util.List;

import com.bdqn.smbms.pojo.Bill;

public interface BillService {
	public int add(Bill bill)throws Exception;
	/**
	 * ͨ����ѯ������ȡ��Ӧ���б�-ģ����ѯ-getBillList
	 * @param connection
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public List<Bill> getBillList()throws Exception;
	
	/**
	 * ͨ��delIdɾ��Bill
	 * @param connection
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public int deleteBillById(int delId)throws Exception; 
	
	
	/**
	 * ͨ��billId��ȡBill
	 * @param connection
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Bill getBillById(int id)throws Exception; 
	
	/**
	 * �޸Ķ�����Ϣ
	 * @param connection
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public int modify(Bill bill)throws Exception;

	/**
	 * ���ݹ�Ӧ��ID��ѯ��������
	 * @param connection
	 * @param providerId
	 * @return
	 * @throws Exception
	 */
	public int getBillCountByProviderId(int providerId)throws Exception;
}
