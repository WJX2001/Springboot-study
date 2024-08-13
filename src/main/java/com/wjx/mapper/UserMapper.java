package com.wjx.mapper;

import com.wjx.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

  @Select("select * from mybatis.user")
  public List<User> list();

  @Delete("delete from mybatis.user where id = #{id}")
  public int delete(Integer id);

  // 新增操作
  // 用来返回主键名
  @Options(useGeneratedKeys = true,keyProperty = "id")
  @Insert("insert into user(id, name, age, gender, phone)" +
    "values (#{id},#{name},#{age},#{gender},#{phone});")
  public void insert(User user);

  // 更新操作
  @Update("update user set name=#{name},age=#{age},gender = #{gender},phone = #{phone} where id = #{id}")
  public void update(User user);


  // 根据ID查询员工
  @Select("SELECT * from user where id = #{id}")
  public User getById(Integer id);

  // 根据条件查询
  @Select("select * from user where name like concat('%',#{name},'%') order by age desc")
  public List<User> getByName(String name);


  public List<User> listSpecial(String name,Integer gender);

  // 批量删除
  public void deleteByIds(List<Integer> ids);

}
