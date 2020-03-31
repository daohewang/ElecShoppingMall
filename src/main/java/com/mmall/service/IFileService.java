package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Author: swordsmanye
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
