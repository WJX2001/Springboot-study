package com.wjx.service.impl;

// DeptService 接口的实现类

import com.wjx.mapper.DeptMapper;
import com.wjx.pojo.Dept;
import com.wjx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

  // 这里不能直接操作数据库 还需要调用Mapper接口
  @Autowired
  private DeptMapper deptMapper;


  @Override
  public List<Dept> list() {
    return deptMapper.list();
  }

  @Override
  public void delete(Integer id) {
    deptMapper.deleteById(id);
  }
}
