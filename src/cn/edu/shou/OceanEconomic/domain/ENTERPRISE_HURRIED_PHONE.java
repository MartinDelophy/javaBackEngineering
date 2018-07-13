package cn.edu.shou.OceanEconomic.domain;

   /**
    * ENTERPRISE_HURRIED_PHONE 实体类
    * Wed May 30 15:37:17 CST 2018 yanghaixin
    */ 


public class ENTERPRISE_HURRIED_PHONE{
	private int id;
	private String org_code;
	private String org_tel;
	public void setId(int id){
	this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setOrg_code(String org_code){
	this.org_code=org_code;
	}
	public String getOrg_code(){
		return org_code;
	}
	public void setOrg_tel(String org_tel){
	this.org_tel=org_tel;
	}
	public String getOrg_tel(){
		return org_tel;
	}
}

