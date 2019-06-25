
package com.wangmeng.base;

import com.wangmeng.beans.AbstractSerializable;

import java.util.HashMap;
import java.util.Map;


public class ActionResult extends AbstractSerializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6956105719342072670L;

	public ActionResult() {		
	}


	protected String code="000000";//返回code码

	protected Object data; //返回数据
	
	protected String desc="";//结果描述

	protected Map<String, Object> dataExt;


	/**
	 * @BareFieldName : code
	 *
	 * @return  the code
	 */
	
	public String getCode() {
		return code;
	}

	/**
	 * @BareFieldName : code
	 *
	 * @return  the code
	 *
	 * @param code the code to set
	 */
	
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @BareFieldName : objResult
	 *
	 * @return  the objResult
	 */


	/**
	 * @BareFieldName : desc
	 *
	 * @return  the desc
	 */
	
	public String getDesc() {
		return desc;
	}

	/**
	 * @BareFieldName : desc
	 *
	 * @return  the desc
	 *
	 * @param desc the desc to set
	 */
	
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @BareFieldName : data
	 *
	 * @return  the data
	 */
	
	public Object getData() {
		return data;
	}

	/**
	 * @BareFieldName : data
	 *
	 * @return  the data
	 *
	 * @param data the data to set
	 */

	public void setData(Object data) {
		this.data = data;
	}

	public Map<String, Object> getDataExt() {
		return dataExt;
	}

	public void addDataExt(String k, Object v) {
		if (dataExt == null) {
			dataExt = new HashMap<>();
		}
		dataExt.put(k, v);
	}

}
