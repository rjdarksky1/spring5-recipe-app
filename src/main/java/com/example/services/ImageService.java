package com.example.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImageFile(Long valueOf, MultipartFile file);

}
