package enzocesarano.D3_Esercizio.controllers;


import enzocesarano.D3_Esercizio.entities.BlogPost;
import enzocesarano.D3_Esercizio.payloads.BlogPostPayload;
import enzocesarano.D3_Esercizio.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<BlogPost> getBlogPosts() {
        return this.blogPostService.findAll();
    }

    @GetMapping("/{blog_post_id}")
    public BlogPost getBlogPost(@PathVariable int blog_post_id) {
        return this.blogPostService.findById(blog_post_id);
    }

    @PostMapping
    public BlogPost postBlogPost(@RequestBody BlogPostPayload blogPost) {
        return this.blogPostService.saveBlogPost(blogPost);
    }

    @PutMapping("/blog_post_id")
    public BlogPost putBlogPost(@PathVariable int blog_post_id, @RequestBody BlogPostPayload blogPost) {
        return this.blogPostService.findByIdAndUpdate(blog_post_id, blogPost);
    }

    @DeleteMapping("/blog_post_id")
    public void deleteBlogPost(@PathVariable int blog_post_id) {
        this.blogPostService.findByIdAndDelete(blog_post_id);
    }

}
