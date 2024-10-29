package enzocesarano.D2_Esercizio.services;

import enzocesarano.D2_Esercizio.entities.BlogPost;
import enzocesarano.D2_Esercizio.payloads.BlogPostPayload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    private List<BlogPost> blogList = new ArrayList<>();


    public List<BlogPost> findAll() {
        return this.blogList;
    }

    public BlogPost saveBlogPost(BlogPostPayload body) {
        Random rndm = new Random();
        BlogPost newBlogPost = new BlogPost(body.getCategoria(), body.getTitolo(), body.getContenuto(), body.getTempo_lettura());
        newBlogPost.setId_blog_post(rndm.nextInt(1, 1000));
        newBlogPost.setCover("https://avatars.dicebear.com/api/identicon/" + newBlogPost.getId_blog_post());
        this.blogList.add(newBlogPost);
        return newBlogPost;
    }

    public BlogPost findById(int blogId) {
        BlogPost found = null;
        for (BlogPost blog : this.blogList) {
            if (blog.getId_blog_post() == blogId) found = blog;
        }
        if (found == null) throw new RuntimeException("Blog Post non trovato.");
        return found;
    }

    public BlogPost findByIdAndUpdate(int blogId, BlogPostPayload body) {
        BlogPost found = null;
        for (BlogPost blog : this.blogList) {
            if (blog.getId_blog_post() == blogId) {
                found = blog;
                found.setTitolo(body.getTitolo());
                found.setContenuto(body.getContenuto());
                found.setCategoria(body.getCategoria());
                found.setTempo_lettura(body.getTempo_lettura());
            }
        }
        if (found == null) throw new RuntimeException("Blog Post non trovato.");
        return found;
    }

    public void findByIdAndDelete(int blogId) {
        BlogPost found = null;
        for (BlogPost blog : this.blogList) {
            if (blog.getId_blog_post() == blogId) found = blog;
        }
        if (found == null) throw new RuntimeException("Blog Post non trovato.");
        this.blogList.remove(found);
    }
}
