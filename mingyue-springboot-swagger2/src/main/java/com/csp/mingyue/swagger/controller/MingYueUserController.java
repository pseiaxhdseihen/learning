package com.csp.mingyue.swagger.controller;

import com.csp.mingyue.swagger.model.MingYueUser;
import com.csp.mingyue.swagger.service.MingYueUserService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
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

  @GetMapping("/{userId}")
  public ResponseEntity<MingYueUser> queryUserById(@PathVariable Long userId) {
    return ResponseEntity.ok(mingYueUserService.queryUserById(userId));
  }

  @PostMapping
  public ResponseEntity<Long> addUser(@RequestBody MingYueUser user) {
    return ResponseEntity.ok(mingYueUserService.addUser(user));
  }

  @PutMapping
  public ResponseEntity<String> updateUser(@RequestBody MingYueUser user) {
    return ResponseEntity.ok(mingYueUserService.updateUser(user));
  }

  @DeleteMapping("/{userId}")
  public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
    return ResponseEntity.ok(mingYueUserService.deleteUser(userId));
  }
}
