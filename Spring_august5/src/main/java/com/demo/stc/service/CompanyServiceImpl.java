package com.demo.stc.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.stc.dao.CompanyDao;
import com.demo.stc.dao.CompanyDaoImpl;
import com.demo.stc.model.Company;

public class CompanyServiceImpl implements CompanyService {

	private CompanyDao companyDao=new CompanyDaoImpl();
	
	public Company insertCompany(Company company) throws SQLException, ClassNotFoundException {
		CompanyDaoImpl companydaoimpl=new CompanyDaoImpl();
		return companydaoimpl.insertCompany(company);
	}

	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> getCompanyList() throws SQLException {
		return null;
	}

}