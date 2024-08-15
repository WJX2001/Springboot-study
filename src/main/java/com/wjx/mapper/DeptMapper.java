package com.wjx.mapper;

import com.wjx.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
  /*
   * 查询全部部门数据
   * @Return
   */

  @Select("select * from dept")
  List<Dept> list();

  @Delete("delete from dept where id = #{id}")
  void deleteById(Integer id);

  @Insert("insert into dept (name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
  void insert(Dept dept);

  @Update("UPDATE dept SET name = #{name} WHERE id = #{id}")
  void update(Dept dept);
}
