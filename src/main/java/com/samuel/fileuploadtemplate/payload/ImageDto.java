package com.samuel.fileuploadtemplate.payload;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ImageDto {

    private String name;
    private MultipartFile file;
}
