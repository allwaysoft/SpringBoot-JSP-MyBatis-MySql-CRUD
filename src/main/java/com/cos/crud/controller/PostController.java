package com.cos.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cos.crud.model.Post;
import com.cos.crud.repository.PostRepository;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostRepository postReposityry;

    // GET => http://localhost:8080/post
    // GET => http://localhost:8080/post/
    @GetMapping("")
    public String postList(Model model) {
        List<Post> posts = postReposityry.findAll();
        model.addAttribute("posts", posts);
        // webapp/WEB-INF/views/post/list.jsp
        return "post/list";
    }

    // POST => http://localhost:8080/post/update
    @PostMapping("/update")
    public String update(Post post) { // param, form
        try {
            postReposityry.update(post);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/post";
    }

    // @RequestParam("id")
    // @ResponseBody => JSON
    // POST => http://localhost:8080/post/delete/1
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        try {
            postReposityry.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/post";
    }

    // POST => http://localhost:8080/post/save
    @PostMapping("/save")
    public String save(Post post) {
        try {
            postReposityry.save(post);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/post";
    }

    // POST => http://localhost:8080/post/1
    @GetMapping("/{id}")
    public String post(@PathVariable int id, Model model) {
        try {
            Post post = postReposityry.findById(id);
            model.addAttribute(post);
            return "post/detail";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/post";
    }

    // GET => http://localhost:8080/post/writeForm
    @GetMapping("/writeForm")
    public String writeForm() {
        return "post/writeForm";
    }

    // GET => http://localhost:8080/post/updateForm
    @GetMapping("/updateForm/{id}")
    public String updateForm(@PathVariable int id, Model model) {
        Post post = postReposityry.findById(id);
        model.addAttribute("post", post);
        return "post/updateForm";
    }

}
