package com.wjx.controller;

import com.wjx.pojo.Dept;
import com.wjx.pojo.Result;
import com.wjx.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理的Controller
 */
@Slf4j // 加这个注解之后 可以直接使用 log来记录日志
@RestController
@RequestMapping("/departments")
//@CrossOrigin
public class DeptController {

  /**
   * 由于这里的controller 需要调用Service的，
   * 所以需要注入一个Service的对象
   */
  @Autowired
  private DeptService deptService;


  // 使用logback 记录日志对象
  //private static Logger log = LoggerFactory.getLogger(DeptController.class);
  //@RequestMapping(value = "/departments",method = RequestMethod.GET) // 指定请求方式为GET
  // TODO: 查询部门数据
  @GetMapping
  public Result list() {
    log.info("查询全部部门数据");

    // 调用service查询部门数据
    List<Dept> detpList = deptService.list();
    System.out.println(detpList);
    return Result.success(detpList);
  }

  // TODO: 删除部门数据
  @DeleteMapping("/{id}")
  public Result delete(@PathVariable Integer id) {
    log.info("根据id删除部门：{}", id);
    // 调用service删除部门
    deptService.delete(id);
    return Result.success();
  }

  // TODO: 添加部门数据
  @PostMapping("/add")
  public Result add(@RequestBody Dept dept) {
    log.info("新增部门：{}", dept);
    // 调用Service新增部门
    deptService.add(dept);
    return Result.success();
  }

  // TODO: 修改部门数据
  @PostMapping("/update")
  public Result update(@RequestBody Dept dept) {
    log.info("修改部门名称:{}",dept);
    deptService.update(dept);
    return Result.success();
  }


}
