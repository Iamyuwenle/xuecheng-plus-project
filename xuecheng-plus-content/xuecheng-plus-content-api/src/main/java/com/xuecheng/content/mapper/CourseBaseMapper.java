package com.xuecheng.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xuecheng.content.model.po.CourseBase;

/**
 * <p>
 * 课程基本信息 Mapper 接口
 * </p>
 *
 * @author itcast
 */
public interface CourseBaseMapper extends BaseMapper<CourseBase> {

    /**
     * 自定义查询sql
     * @param companyid
     * @return 返回机构id对应的数据
     */
    /*@Select("select * from ")
    CourseBase selectstyleById(@Param("CourseBase") Long companyid);*/

}
