package com.akai.noder.services;

import com.akai.noder.domain.Note;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface NoteService {

    Page<Note> findAll(Pageable pageable);

    Optional<Note> findOne(Long id);

    Note create(Note note);

    Note update(Note note);

    void delete(Long id);
}
