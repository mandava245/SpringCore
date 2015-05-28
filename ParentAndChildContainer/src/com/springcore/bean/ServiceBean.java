package com.springcore.bean;

public class ServiceBean {
	private DAOBean daoBean;

	public DAOBean getDaoBean() {
		return daoBean;
	}

	public void setDaoBean(DAOBean daoBean) {
		this.daoBean = daoBean;
	}

	public void serviceMethod() {
		System.out.println("From serviceMethod()");
		daoBean.daoMethod();
	}
}
