package com.vanroid.gd.shop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGdCircle<M extends BaseGdCircle<M>> extends Model<M> implements IBean {

	public void setTid(java.lang.Integer tid) {
		set("tid", tid);
	}

	public java.lang.Integer getTid() {
		return get("tid");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public void setSender(java.lang.Integer sender) {
		set("sender", sender);
	}

	public java.lang.Integer getSender() {
		return get("sender");
	}

}