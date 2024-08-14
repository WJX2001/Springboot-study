package com.wjx.service;

import com.wjx.pojo.Dept;

import java.util.List;

public interface DeptService {
  /**
   * 查询全部部门数据
   * @return
   */
  List<Dept> list();
}
