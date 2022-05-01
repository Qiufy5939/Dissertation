package com.graduate.demo1.service.impl;

import com.graduate.demo1.dao.Poem_noteDao;
import com.graduate.demo1.model.Poem_note;
import com.graduate.demo1.service.Poem_noteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Poem_noteServiceImpl implements Poem_noteService {

    @Resource
    private Poem_noteDao poem_noteDao;

    @Override
    public List<Poem_note> findNotesByPoem_name(String poem_name) {
        return poem_noteDao.findPoem_notesByPoem_name(poem_name);
    }
}
