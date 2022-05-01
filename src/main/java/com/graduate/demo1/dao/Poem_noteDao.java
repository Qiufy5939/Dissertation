package com.graduate.demo1.dao;


import com.graduate.demo1.model.Poem_note;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Poem_noteDao {
    //新增Poem_note
    //boolean savePoem_note(Poem_note poem_note);
    //通过poem_name查找Poem_note
    List<Poem_note> findPoem_notesByPoem_name(@Param("poem_name") String poem_name);
}
