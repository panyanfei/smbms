package com.bdqn.smbms.service.providerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.smbms.dao.provider.ProviderMapper;
import com.bdqn.smbms.pojo.Provider;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
	@Autowired
	private ProviderMapper providerMapper;

	public ProviderMapper getProviderMapper() {
		return providerMapper;
	}

	public void setProviderMapper(ProviderMapper providerMapper) {
		this.providerMapper = providerMapper;
	}

	public int addProvider(Provider provider) {
		// TODO Auto-generated method stub
		return providerMapper.addProvider(provider);
	}

	public List<Provider> getProviderList(String proName, String proCode) {
		// TODO Auto-generated method stub
		return providerMapper.getProviderList(proName, proCode);
	}

	public int deleteProviderById(Integer delId) {
		// TODO Auto-generated method stub
		return providerMapper.deleteProviderById(delId);
	}

	public List<Provider> getProviderById(int id) {
		// TODO Auto-generated method stub
		return providerMapper.getProviderById(id);
	}

	public int modify(Provider provider) {
		// TODO Auto-generated method stub
		return providerMapper.modify(provider);
	}

}
