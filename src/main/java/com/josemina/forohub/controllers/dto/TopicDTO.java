package com.josemina.forohub.controllers.dto;

import com.josemina.forohub.persistence.entities.Response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopicDTO {
    private Long id;
    private String title;
    private String message;
    private Date createDate;
    private boolean status;
    private String author;
    private String course;
    private List<Response> responseList = new ArrayList<>();
}
