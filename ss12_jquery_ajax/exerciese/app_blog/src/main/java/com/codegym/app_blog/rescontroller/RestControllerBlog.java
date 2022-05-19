package com.codegym.app_blog.rescontroller;

import com.codegym.app_blog.dto.BlogModelDto;
import com.codegym.app_blog.model.BlogModel;
import com.codegym.app_blog.model.Category;
import com.codegym.app_blog.service.IBlogService;
import com.codegym.app_blog.service.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/blog")
public class RestControllerBlog {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    IPostsService iPostsService;
    @GetMapping("/list")
    public ResponseEntity<Page<BlogModel>> getPageBlog(
            @PageableDefault(value = 3) Pageable pageable,
            @RequestParam Optional<String> name){

        String keywordName = name.orElse("");

        Page<BlogModel> blogModels = this.iBlogService.findAllByName(keywordName,pageable);
        if(!blogModels.hasContent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogModels,HttpStatus.OK);
    }

    @GetMapping("/list-category")
    public ResponseEntity<Page<Category>> getPosts(
            @PageableDefault(value = 2) Pageable pageable){
        Page<Category> categories = this.iPostsService.findAllPage(pageable);
        if(!categories.hasContent()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categories,HttpStatus.OK);
    }


    @GetMapping("/list-post/{postId}")
    public ResponseEntity<List<BlogModel>> getPagePosts(@PageableDefault(value = 2) Pageable pageable,
                                                        @PathVariable Integer postId){
       Category category = this.iPostsService.findById(postId);
       List<BlogModel> blogModels = category.getBlogModels();
        if(blogModels.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogModels,HttpStatus.OK);
    }

    @GetMapping("/detail-blog/{id}")
    public ResponseEntity<BlogModel> getBlog ( @PathVariable Integer id){
        BlogModel blogModel = this.iBlogService.findById(id);
        if(blogModel == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogModel,HttpStatus.OK);
    }

//    @GetMapping("/search-blog")
//    public ResponseEntity<Page<BlogModel>> searchBlog(@PageableDefault(value = 3) Pageable pageable,
//                                                      @RequestParam Optional<String> name,
//                                                      @RequestParam Optional<String> author,
//                                                      @RequestParam Integer postId
//                                                      ){
//        String keywordName = name.orElse("");
//        String keywordAuthor = author.orElse("");
//        Page<BlogModel> blogModels = this.iBlogService.findAllByNameAndAuthorAndPost(keywordName,keywordAuthor,postId,pageable);
//        if(blogModels.isEmpty()){
//            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(blogModels,HttpStatus.OK);
//    }
}
