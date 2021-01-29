package com.bdqn.smbms.service.billservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.smbms.dao.bill.BillMapper;
import com.bdqn.smbms.pojo.Bill;
@Service("billService")
public class BillServiceImpl implements BillService{
@Autowired
  private BillMapper billMapper;
	public BillMapper getBillMapper() {
	return billMapper;
}
public void setBillMapper(BillMapper billMapper) {
	this.billMapper = billMapper;
}

	public int add(Bill bill) throws Exception {
		// TODO Auto-generated method stub
		return billMapper.add(bill);
	}

	public List<Bill> getBillList() throws Exception {
		// TODO Auto-generated method stub
		return billMapper.getBillList();
	}

	public int deleteBillById(int delId) throws Exception {
		// TODO Auto-generated method stub
		return billMapper.deleteBillById(delId);
	}

	public Bill getBillById(int id) throws Exception {
		// TODO Auto-generated method stub
		return billMapper.getBillById(id);
	}

	public int modify(Bill bill) throws Exception {
		// TODO Auto-generated method stub
		return billMapper.modify(bill);
	}

	public int getBillCountByProviderId(int providerId) throws Exception {
		// TODO Auto-generated method stub
		return billMapper.getBillCountByProviderId(providerId);
	}

}
