package com.teamtreehouse.giflib.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    String name
    String colorCode
    @OneToMany(mappedBy = 'category')
    List<Gif> gifs = []
}
