package com.vanroid.gd.shop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGdMessage<M extends BaseGdMessage<M>> extends Model<M> implements IBean {

	public void setMid(java.lang.Integer mid) {
		set("mid", mid);
	}

	public java.lang.Integer getMid() {
		return get("mid");
	}

	public void setMContent(java.lang.String mContent) {
		set("mContent", mContent);
	}

	public java.lang.String getMContent() {
		return get("mContent");
	}

	public void setMTitle(java.lang.String mTitle) {
		set("mTitle", mTitle);
	}

	public java.lang.String getMTitle() {
		return get("mTitle");
	}

	public void setMPublishDate(java.util.Date mPublishDate) {
		set("m_publish_date", mPublishDate);
	}

	public java.util.Date getMPublishDate() {
		return get("m_publish_date");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}

	public java.lang.Integer getType() {
		return get("type");
	}

	public void setCid(java.lang.Integer cid) {
		set("cid", cid);
	}

	public java.lang.Integer getCid() {
		return get("cid");
	}

	public void setMIcon(java.lang.String mIcon) {
		set("mIcon", mIcon);
	}

	public java.lang.String getMIcon() {
		return get("mIcon");
	}

}
