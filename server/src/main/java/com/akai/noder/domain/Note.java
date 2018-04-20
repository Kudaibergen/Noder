package com.akai.noder.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "notes")
public class Note extends BaseEntity {

    @Column(name = "text")
    private String text;
}
