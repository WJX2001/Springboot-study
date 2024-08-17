package com.wjx.mapper;

import com.github.pagehelper.Page;
import com.wjx.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {


  // 查询总记录数
  @Select("select count(*) from emp")
  public Long count();

  /**
   * 分页查询 获取列表
   * @return
   */
  @Select("select * from emp limit #{start},#{pageSize}")
  public List<Emp> page(Integer start, Integer pageSize);

  // 使用分页工具进行分页 员工信息查询
  @Select("select * from emp")
  public List<Emp> list();

}
