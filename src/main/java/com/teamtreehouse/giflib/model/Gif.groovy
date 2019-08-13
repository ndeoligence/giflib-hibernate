package com.teamtreehouse.giflib.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class Gif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    @Lob
    byte[] bytes
    String description
    @ManyToOne
    Category category
    LocalDateTime dateUploaded = LocalDateTime.now()
    String username = 'You'
    Boolean favorite
    String hash
}
