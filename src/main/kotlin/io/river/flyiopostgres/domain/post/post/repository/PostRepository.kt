package io.river.flyiopostgres.domain.post.post.repository

import io.river.flyiopostgres.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>