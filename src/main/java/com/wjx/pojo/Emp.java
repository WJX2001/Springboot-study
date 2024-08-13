package com.wjx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
  private int id;
  private String username;
  private String password;
  private String name;
  private int gender; // 性别：1、男 2、女
  private String image; // 图像URL
  private int job; // 职位：1、班主任 2、讲师 3、学工主管 4、教研主管 5、咨询师
  private LocalDate entryDate; // 入职日期
  private int deptId; // 部门ID
  private LocalDateTime createTime; // 创建时间
  private LocalDateTime updateTime; // 修改时间
}
