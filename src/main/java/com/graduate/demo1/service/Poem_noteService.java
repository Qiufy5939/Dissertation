package com.graduate.demo1.service;

import com.graduate.demo1.model.Poem_note;

import java.util.List;

public interface Poem_noteService {
    List<Poem_note> findNotesByPoem_name(String poem_name);
}
