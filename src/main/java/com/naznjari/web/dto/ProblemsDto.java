package com.naznjari.web.dto;

import com.naznjari.domain.problem.Problems;

public class ProblemsDto {
    private Long id;
    private String title;
    private String describe;
    private String notes;

    public ProblemsDto(Problems entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.describe = entity.getDescription();
        this.notes = entity.getNotes();
    }
}
