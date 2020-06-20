package com.naznjari.domain.problem;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Problems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String notes;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Builder
    public Problems(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
