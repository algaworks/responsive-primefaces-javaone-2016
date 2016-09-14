package com.algaworks.sales.controller;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.algaworks.sales.model.LineType;
import com.algaworks.sales.model.Order;
import com.algaworks.sales.model.OrderLine;

@ManagedBean
@ViewScoped
public class OrderManagerController implements Serializable {

	private static final long serialVersionUID = 1L;

	private Order order = new Order();
	
	private OrderLine line;
	
	public OrderManagerController() {
		OrderLine line = new OrderLine();
		line.setDescription("MacBook Pro");
		line.setPrice(new BigDecimal(2000));
		line.setType(LineType.PRODUCT);
		
		order.getLines().add(line);
	}
	
	public void newLine() {
		line = new OrderLine();
	}
	
	public void addLine() {
		order.getLines().add(line);
	}
	
	public void save() {
		order = new Order();
		
		FacesMessage msg = new FacesMessage("Order saved successfully!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Order getOrder() {
		return order;
	}

	public OrderLine getLine() {
		return line;
	}
	
}