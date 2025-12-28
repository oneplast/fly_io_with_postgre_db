package io.river.flyiopostgres.domain.post.post.service

import io.river.flyiopostgres.domain.post.post.entity.Post
import io.river.flyiopostgres.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository
) {
    fun write(title: String, content: String): Post {
        return postRepository.save(Post(title = title, content = content))
    }

    fun count() = postRepository.count()

    fun findAll() = postRepository.findAll()
}