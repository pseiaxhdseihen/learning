package com.csp.mingyue.minio.controller;

import com.csp.mingyue.minio.config.MinioPropertiesConfig;
import com.csp.mingyue.minio.service.MinioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Minio 接口
 *
 * @author Strive
 * @date 2022/4/25 10:48
 * @description
 */
@RestController
@RequestMapping("/minio")
@RequiredArgsConstructor
public class MinioController {

  private final MinioPropertiesConfig minioPropertiesConfig;

  private final MinioService minioService;

  @PostMapping("/upload")
  public String upload(@RequestParam(name = "multipartFile") MultipartFile multipartFile) {
    return minioService.upload(
        multipartFile, minioPropertiesConfig.getBucketName(), multipartFile.getContentType());
  }

  @GetMapping("/getObjectUrl")
  public String getObjectUrl(String objectName) {
    return minioService.getObjectUrl(minioPropertiesConfig.getBucketName(), objectName);
  }
}
