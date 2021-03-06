package com.demo.dao;

import com.demo.bean.Question;
import com.demo.bean.QuestionKey;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int deleteByPrimaryKey(QuestionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    Question selectByPrimaryKey(QuestionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    int updateByPrimaryKey(Question record);
}