package com.wjx;

import com.wjx.mapper.UserMapper;
import com.wjx.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void testListUser() {
    List<User> list = userMapper.list();
    list.forEach(user -> {
      System.out.println(user);
    });
  }

  @Test
  public void testDelete() {
    userMapper.delete(2);
  }

  @Test
  public void testInsert() {
    // 构造用户对象
    User user = new User();

    user.setId(4);
    user.setName("zhangzih2");
    user.setAge(13);
    user.setGender(2);
    user.setPhone("12323333456");
    userMapper.insert(user);

    System.out.println(user.getId());
  }

  @Test
  public void testUpdate() {
    User user = new User();
    user.setId(5);
    user.setName("zhangzih3");
    user.setAge(13);
    user.setGender(2);
    user.setPhone("12323333456");
    userMapper.update(user);

    System.out.println(user.getId());
  }

  @Test
  public void testGetById() {
    User user = userMapper.getById(3);
    System.out.println(user);
  }

  @Test
  public void testGetByName() {
    List<User> list = userMapper.listSpecial("张", 1);
    System.out.println(list);
  }

  @Test
  public void testDeleteByIds() {
    List<Integer> ids = Arrays.asList(2,3,4);
    userMapper.deleteByIds(ids);
  }




}
