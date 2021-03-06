package it.etoken.base.model.eosblock.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EosAccountOrder implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.id
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.order_no
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String orderNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.status
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.amount
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private BigDecimal amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.account_name
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String accountName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.owner_public_key
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String ownerPublicKey;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.active_public_key
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String activePublicKey;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.ip
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String ip;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.transaction_id
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String transactionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.notify_date
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private Date notifyDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.createdate
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private Date createdate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.updatedate
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private Date updatedate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column eos_account_order.notify_content
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	private String notifyContent;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.id
	 * @return  the value of eos_account_order.id
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.id
	 * @param id  the value for eos_account_order.id
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.order_no
	 * @return  the value of eos_account_order.order_no
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.order_no
	 * @param orderNo  the value for eos_account_order.order_no
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.status
	 * @return  the value of eos_account_order.status
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.status
	 * @param status  the value for eos_account_order.status
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.amount
	 * @return  the value of eos_account_order.amount
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.amount
	 * @param amount  the value for eos_account_order.amount
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.account_name
	 * @return  the value of eos_account_order.account_name
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.account_name
	 * @param accountName  the value for eos_account_order.account_name
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.owner_public_key
	 * @return  the value of eos_account_order.owner_public_key
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getOwnerPublicKey() {
		return ownerPublicKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.owner_public_key
	 * @param ownerPublicKey  the value for eos_account_order.owner_public_key
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setOwnerPublicKey(String ownerPublicKey) {
		this.ownerPublicKey = ownerPublicKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.active_public_key
	 * @return  the value of eos_account_order.active_public_key
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getActivePublicKey() {
		return activePublicKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.active_public_key
	 * @param activePublicKey  the value for eos_account_order.active_public_key
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setActivePublicKey(String activePublicKey) {
		this.activePublicKey = activePublicKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.ip
	 * @return  the value of eos_account_order.ip
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.ip
	 * @param ip  the value for eos_account_order.ip
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.transaction_id
	 * @return  the value of eos_account_order.transaction_id
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.transaction_id
	 * @param transactionId  the value for eos_account_order.transaction_id
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.notify_date
	 * @return  the value of eos_account_order.notify_date
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public Date getNotifyDate() {
		return notifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.notify_date
	 * @param notifyDate  the value for eos_account_order.notify_date
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setNotifyDate(Date notifyDate) {
		this.notifyDate = notifyDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.createdate
	 * @return  the value of eos_account_order.createdate
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public Date getCreatedate() {
		return createdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.createdate
	 * @param createdate  the value for eos_account_order.createdate
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.updatedate
	 * @return  the value of eos_account_order.updatedate
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public Date getUpdatedate() {
		return updatedate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.updatedate
	 * @param updatedate  the value for eos_account_order.updatedate
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column eos_account_order.notify_content
	 * @return  the value of eos_account_order.notify_content
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public String getNotifyContent() {
		return notifyContent;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column eos_account_order.notify_content
	 * @param notifyContent  the value for eos_account_order.notify_content
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	public void setNotifyContent(String notifyContent) {
		this.notifyContent = notifyContent;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5074572563961526993L;
}