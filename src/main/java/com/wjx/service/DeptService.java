package com.wjx.service;

import com.wjx.pojo.Dept;

import java.util.List;

public interface DeptService {
  /**
   * 查询全部部门数据
   *
   * @return
   */
  List<Dept> list();

  /**
   * 删除部门
   *
   * @param id
   */

  void delete(Integer id);

  void add(Dept dept);

  void update(Dept dept);
}
