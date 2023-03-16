package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {
    private String uploadFileName;  //유저가 업로드한 파일명
    private String storeFileName;   //내부에서 관리하는 파일명 (파일명이 겹치지 않도록)

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
