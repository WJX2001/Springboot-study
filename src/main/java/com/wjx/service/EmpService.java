package com.wjx.service;

import com.wjx.pojo.PageBean;

public interface EmpService {
  PageBean page(Integer page, Integer pageSize);
}
