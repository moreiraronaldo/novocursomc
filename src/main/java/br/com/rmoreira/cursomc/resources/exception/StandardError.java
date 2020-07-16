package br.com.rmoreira.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String mdsg;
	private Long timeStamp;

	public StandardError(Integer status, String mdsg, Long timeStamp) {
		super();
		this.status = status;
		this.mdsg = mdsg;
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMdsg() {
		return mdsg;
	}

	public void setMdsg(String mdsg) {
		this.mdsg = mdsg;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
