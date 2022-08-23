package com.krishna.app.service;

import java.util.Date;
import java.util.List;

import com.krishna.app.exceptionHandler.BussinessException;
import com.krishna.app.model.PurchaseReport;
import com.krishna.app.model.Shoe;

public interface SportyShoeService {
	
	public Shoe createShoe(Shoe shoe) throws BussinessException;
	public Shoe getShoeById(int id) throws BussinessException;
	public Shoe updateShoe(Shoe shoe);
	public void deleteShoeById(int id) throws BussinessException;
	public List<Shoe> getAllShoes();
	
	public PurchaseReport createPurchaseReport(PurchaseReport pr) throws BussinessException;
	public PurchaseReport getPurchaseReportById(int id) throws BussinessException;
	public PurchaseReport updatePurchaseReport(PurchaseReport pr);
	public void deletePurchaseReportById(int id) throws BussinessException;
	public List<PurchaseReport> getAllPurchaseReports();
	public List<PurchaseReport> getAllPurchaseReportsByCategory(String category);
	public List<PurchaseReport> getAllPurchaseReportsByDOP(Date dop);

}
