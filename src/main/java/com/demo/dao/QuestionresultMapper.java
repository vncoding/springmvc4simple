package com.demo.dao;

import com.demo.bean.Questionresult;
import com.demo.bean.QuestionresultKey;

public interface QuestionresultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionresult
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int deleteByPrimaryKey(QuestionresultKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionresult
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int insert(Questionresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionresult
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int insertSelective(Questionresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionresult
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    Questionresult selectByPrimaryKey(QuestionresultKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionresult
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int updateByPrimaryKeySelective(Questionresult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionresult
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int updateByPrimaryKey(Questionresult record);
}