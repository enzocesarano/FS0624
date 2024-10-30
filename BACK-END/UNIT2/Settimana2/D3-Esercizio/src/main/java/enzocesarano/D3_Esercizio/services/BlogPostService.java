package enzocesarano.D3_Esercizio.services;

import enzocesarano.D3_Esercizio.entities.Autore;
import enzocesarano.D3_Esercizio.entities.BlogPost;
import enzocesarano.D3_Esercizio.exceptions.NotFoundException;
import enzocesarano.D3_Esercizio.payloads.BlogPostPayload;
import enzocesarano.D3_Esercizio.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private AutoreService autoreService;

    public List<BlogPost> findAll() {
        return this.blogPostRepository.findAll();
    }

    public BlogPost saveBlogPost(BlogPostPayload body) {
        Autore autore = this.autoreService.findById(body.getAutore());
        BlogPost newBlogPost = new BlogPost(body.getCategoria(), body.getTitolo(), body.getContenuto(), body.getTempo_lettura(), autore);
        newBlogPost.setCover("https://avatars.dicebear.com/api/identicon/" + newBlogPost.getId_blog_post());
        return this.blogPostRepository.save(newBlogPost);
    }

    public BlogPost findById(long blogId) {
        return this.blogPostRepository.findById(blogId).orElseThrow(() -> new NotFoundException(blogId));
    }

    public BlogPost findByIdAndUpdate(long blogId, BlogPostPayload body) {
        BlogPost blogPost = this.findById(blogId);

        blogPost.setTitolo(body.getTitolo());
        blogPost.setContenuto(body.getContenuto());
        blogPost.setCategoria(body.getCategoria());
        blogPost.setTempo_lettura(body.getTempo_lettura());

        return this.blogPostRepository.save(blogPost);
    }

    public void findByIdAndDelete(long blogId) {
        BlogPost blogPost = this.findById(blogId);
        this.blogPostRepository.delete(blogPost);
    }
}
