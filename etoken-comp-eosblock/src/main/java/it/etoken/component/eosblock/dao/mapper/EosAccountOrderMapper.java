package it.etoken.component.eosblock.dao.mapper;

import it.etoken.base.model.eosblock.entity.EosAccountOrder;
import it.etoken.base.model.eosblock.entity.EosAccountOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface EosAccountOrderMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@SelectProvider(type = EosAccountOrderSqlProvider.class, method = "countByExample")
	long countByExample(EosAccountOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@DeleteProvider(type = EosAccountOrderSqlProvider.class, method = "deleteByExample")
	int deleteByExample(EosAccountOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@Delete({ "delete from eos_account_order", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@Insert({ "insert into eos_account_order (id, order_no, ", "status, amount, ", "account_name, owner_public_key, ",
			"active_public_key, ip, ", "transaction_id, notify_date, ", "createdate, updatedate, ", "notify_content)",
			"values (#{id,jdbcType=BIGINT}, #{orderNo,jdbcType=VARCHAR}, ",
			"#{status,jdbcType=VARCHAR}, #{amount,jdbcType=DECIMAL}, ",
			"#{accountName,jdbcType=VARCHAR}, #{ownerPublicKey,jdbcType=VARCHAR}, ",
			"#{activePublicKey,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, ",
			"#{transactionId,jdbcType=VARCHAR}, #{notifyDate,jdbcType=TIMESTAMP}, ",
			"#{createdate,jdbcType=TIMESTAMP}, #{updatedate,jdbcType=TIMESTAMP}, ",
			"#{notifyContent,jdbcType=LONGVARCHAR})" })
	int insert(EosAccountOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@InsertProvider(type = EosAccountOrderSqlProvider.class, method = "insertSelective")
	int insertSelective(EosAccountOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@SelectProvider(type = EosAccountOrderSqlProvider.class, method = "selectByExampleWithBLOBs")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "order_no", property = "orderNo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "amount", property = "amount", jdbcType = JdbcType.DECIMAL),
			@Result(column = "account_name", property = "accountName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "owner_public_key", property = "ownerPublicKey", jdbcType = JdbcType.VARCHAR),
			@Result(column = "active_public_key", property = "activePublicKey", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ip", property = "ip", jdbcType = JdbcType.VARCHAR),
			@Result(column = "transaction_id", property = "transactionId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "notify_date", property = "notifyDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "createdate", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updatedate", property = "updatedate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "notify_content", property = "notifyContent", jdbcType = JdbcType.LONGVARCHAR) })
	List<EosAccountOrder> selectByExampleWithBLOBs(EosAccountOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@SelectProvider(type = EosAccountOrderSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "order_no", property = "orderNo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "amount", property = "amount", jdbcType = JdbcType.DECIMAL),
			@Result(column = "account_name", property = "accountName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "owner_public_key", property = "ownerPublicKey", jdbcType = JdbcType.VARCHAR),
			@Result(column = "active_public_key", property = "activePublicKey", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ip", property = "ip", jdbcType = JdbcType.VARCHAR),
			@Result(column = "transaction_id", property = "transactionId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "notify_date", property = "notifyDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "createdate", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updatedate", property = "updatedate", jdbcType = JdbcType.TIMESTAMP) })
	List<EosAccountOrder> selectByExample(EosAccountOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@Select({ "select", "id, order_no, status, amount, account_name, owner_public_key, active_public_key, ",
			"ip, transaction_id, notify_date, createdate, updatedate, notify_content", "from eos_account_order",
			"where id = #{id,jdbcType=BIGINT}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "order_no", property = "orderNo", jdbcType = JdbcType.VARCHAR),
			@Result(column = "status", property = "status", jdbcType = JdbcType.VARCHAR),
			@Result(column = "amount", property = "amount", jdbcType = JdbcType.DECIMAL),
			@Result(column = "account_name", property = "accountName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "owner_public_key", property = "ownerPublicKey", jdbcType = JdbcType.VARCHAR),
			@Result(column = "active_public_key", property = "activePublicKey", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ip", property = "ip", jdbcType = JdbcType.VARCHAR),
			@Result(column = "transaction_id", property = "transactionId", jdbcType = JdbcType.VARCHAR),
			@Result(column = "notify_date", property = "notifyDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "createdate", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "updatedate", property = "updatedate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "notify_content", property = "notifyContent", jdbcType = JdbcType.LONGVARCHAR) })
	EosAccountOrder selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@UpdateProvider(type = EosAccountOrderSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") EosAccountOrder record,
			@Param("example") EosAccountOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@UpdateProvider(type = EosAccountOrderSqlProvider.class, method = "updateByExampleWithBLOBs")
	int updateByExampleWithBLOBs(@Param("record") EosAccountOrder record,
			@Param("example") EosAccountOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@UpdateProvider(type = EosAccountOrderSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") EosAccountOrder record, @Param("example") EosAccountOrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@UpdateProvider(type = EosAccountOrderSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(EosAccountOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@Update({ "update eos_account_order", "set order_no = #{orderNo,jdbcType=VARCHAR},",
			"status = #{status,jdbcType=VARCHAR},", "amount = #{amount,jdbcType=DECIMAL},",
			"account_name = #{accountName,jdbcType=VARCHAR},", "owner_public_key = #{ownerPublicKey,jdbcType=VARCHAR},",
			"active_public_key = #{activePublicKey,jdbcType=VARCHAR},", "ip = #{ip,jdbcType=VARCHAR},",
			"transaction_id = #{transactionId,jdbcType=VARCHAR},", "notify_date = #{notifyDate,jdbcType=TIMESTAMP},",
			"createdate = #{createdate,jdbcType=TIMESTAMP},", "updatedate = #{updatedate,jdbcType=TIMESTAMP},",
			"notify_content = #{notifyContent,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKeyWithBLOBs(EosAccountOrder record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table eos_account_order
	 * @mbg.generated  Thu Oct 11 09:49:31 CST 2018
	 */
	@Update({ "update eos_account_order", "set order_no = #{orderNo,jdbcType=VARCHAR},",
			"status = #{status,jdbcType=VARCHAR},", "amount = #{amount,jdbcType=DECIMAL},",
			"account_name = #{accountName,jdbcType=VARCHAR},", "owner_public_key = #{ownerPublicKey,jdbcType=VARCHAR},",
			"active_public_key = #{activePublicKey,jdbcType=VARCHAR},", "ip = #{ip,jdbcType=VARCHAR},",
			"transaction_id = #{transactionId,jdbcType=VARCHAR},", "notify_date = #{notifyDate,jdbcType=TIMESTAMP},",
			"createdate = #{createdate,jdbcType=TIMESTAMP},", "updatedate = #{updatedate,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(EosAccountOrder record);
}