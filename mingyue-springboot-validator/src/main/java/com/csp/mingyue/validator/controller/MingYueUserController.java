package com.csp.mingyue.validator.controller;

import cn.hutool.core.util.StrUtil;
import com.csp.mingyue.validator.model.MingYueUser;
import com.csp.mingyue.validator.service.MingYueUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author Strive */
@Api(tags = "用户模块")
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class MingYueUserController {

  private final MingYueUserService mingYueUserService;

  @ApiOperation("根据用户ID查询用户信息")
  @GetMapping("/{userId}")
  public ResponseEntity<MingYueUser> queryUserById(@PathVariable Long userId) {
    return ResponseEntity.ok(mingYueUserService.queryUserById(userId));
  }

  @ApiOperation("添加用户")
  @PostMapping
  public ResponseEntity<Long> addUser(@RequestBody MingYueUser user) {
    if (null == user.getUserId()) {
      return new ResponseEntity("userId 不能为空！", HttpStatus.BAD_REQUEST);
    }

    if (StrUtil.isBlank(user.getUsername())) {
      return new ResponseEntity("username 不能为空！", HttpStatus.BAD_REQUEST);
    }

    return ResponseEntity.ok(mingYueUserService.addUser(user));
  }

  @ApiOperation("更新用户")
  @PutMapping
  public ResponseEntity<String> updateUser(@RequestBody MingYueUser user) {
    return ResponseEntity.ok(mingYueUserService.updateUser(user));
  }

  @ApiOperation("根据用户ID删除用户")
  @DeleteMapping("/{userId}")
  public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
    return ResponseEntity.ok(mingYueUserService.deleteUser(userId));
  }
}
