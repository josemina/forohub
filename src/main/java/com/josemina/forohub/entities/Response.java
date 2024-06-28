package com.josemina.forohub.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "respuestas")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private Date createDate;
    @ManyToOne
    private User author;
    private String solution;
    @ManyToOne
    @JoinColumn(name = "id_topico")
    private Topic topic;
}
