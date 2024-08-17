package com.wjx.service.impl;

import com.wjx.mapper.EmpMapper;
import com.wjx.pojo.Emp;
import com.wjx.pojo.PageBean;
import com.wjx.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

  @Autowired
  private EmpMapper empMapper;

  @Override
  public PageBean page(Integer page, Integer pageSize) {
    Long count = empMapper.count();
    // 2.获取分页查询结果列表
    Integer start = (page - 1) * pageSize;
    List<Emp> empList = empMapper.page(start,pageSize);
    PageBean pageBean = new PageBean(count,empList);
    return pageBean;
  }
}
