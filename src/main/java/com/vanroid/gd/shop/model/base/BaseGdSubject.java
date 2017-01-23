package com.vanroid.gd.shop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGdSubject<M extends BaseGdSubject<M>> extends Model<M> implements IBean {

	public void setSid(java.lang.Integer sid) {
		set("sid", sid);
	}

	public java.lang.Integer getSid() {
		return get("sid");
	}

	public void setCj(java.lang.Double cj) {
		set("cj", cj);
	}

	public java.lang.Double getCj() {
		return get("cj");
	}

	public void setDept(java.lang.String dept) {
		set("dept", dept);
	}

	public java.lang.String getDept() {
		return get("dept");
	}

	public void setGname(java.lang.String gname) {
		set("gname", gname);
	}

	public java.lang.String getGname() {
		return get("gname");
	}

	public void setJd(java.lang.Double jd) {
		set("jd", jd);
	}

	public java.lang.Double getJd() {
		return get("jd");
	}

	public void setXf(java.lang.Double xf) {
		set("xf", xf);
	}

	public java.lang.Double getXf() {
		return get("xf");
	}

}