package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {
    private Long ItemId;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;
}
