package com.vanroid.gd.shop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGdComment<M extends BaseGdComment<M>> extends Model<M> implements IBean {

	public void setCid(java.lang.Integer cid) {
		set("cid", cid);
	}

	public java.lang.Integer getCid() {
		return get("cid");
	}

	public void setCtime(java.util.Date ctime) {
		set("ctime", ctime);
	}

	public java.util.Date getCtime() {
		return get("ctime");
	}

	public void setText(java.lang.String text) {
		set("text", text);
	}

	public java.lang.String getText() {
		return get("text");
	}

	public void setReceiver(java.lang.Integer receiver) {
		set("receiver", receiver);
	}

	public java.lang.Integer getReceiver() {
		return get("receiver");
	}

	public void setSender(java.lang.Integer sender) {
		set("sender", sender);
	}

	public java.lang.Integer getSender() {
		return get("sender");
	}

	public void setTid(java.lang.Integer tid) {
		set("tid", tid);
	}

	public java.lang.Integer getTid() {
		return get("tid");
	}

}
