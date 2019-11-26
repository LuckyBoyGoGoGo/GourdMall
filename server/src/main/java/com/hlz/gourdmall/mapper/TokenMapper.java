package com.hlz.gourdmall.mapper;

import com.hlz.gourdmall.model.Token;
import com.hlz.gourdmall.model.TokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    long countByExample(TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int deleteByExample(TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int insert(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int insertSelective(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    List<Token> selectByExample(TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    Token selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int updateByExampleSelective(@Param("record") Token record, @Param("example") TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int updateByExample(@Param("record") Token record, @Param("example") TokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int updateByPrimaryKeySelective(Token record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table token
     *
     * @mbg.generated Tue Nov 26 14:48:35 CST 2019
     */
    int updateByPrimaryKey(Token record);
}