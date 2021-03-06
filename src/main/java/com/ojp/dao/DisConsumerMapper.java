package com.ojp.dao;

import com.ojp.entity.DisConsumer;
import com.ojp.entity.DisConsumerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisConsumerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    long countByExample(DisConsumerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int deleteByExample(DisConsumerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int insert(DisConsumer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int insertSelective(DisConsumer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    List<DisConsumer> selectByExample(DisConsumerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    DisConsumer selectByPrimaryKey(String cId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DisConsumer record, @Param("example") DisConsumerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DisConsumer record, @Param("example") DisConsumerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DisConsumer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_consumer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DisConsumer record);
}