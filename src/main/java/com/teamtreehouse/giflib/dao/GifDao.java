package com.teamtreehouse.giflib.dao;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif);
    void delete(Gif gif);
}
