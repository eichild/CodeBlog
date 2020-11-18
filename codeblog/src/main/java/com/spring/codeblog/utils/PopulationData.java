//package com.spring.codeblog.utils;
//
//import com.spring.codeblog.model.Post;
//import com.spring.codeblog.repository.CodeblogRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class PopulationData {
//
//    /*Facilita a referenciação no arquivo XML*/
//    @Autowired
//    CodeblogRepository codeblogRepository;
//
//    @PostConstruct
//    public void savePosts() {
//
//        List<Post> postList = new ArrayList<>();
//        Post post1 = new Post();
//        post1.setAutor("Lucas Gregorio");
//        post1.setData(LocalDate.now());
//        post1.setTitulo("Como ser o maior comedor de frango");
//        post1.setTexto("HOJE DHUAHDDMDMOADJIJDAD LOREUDUADN");
//
//        Post post2 = new Post();
//        post2.setAutor("Davi Martins");
//        post2.setData(LocalDate.now());
//        post2.setTitulo("Como ser o maior comedor de lasanha");
//        post2.setTexto("HOJE DHUAHDDMDMOADJIJDAD LOREUDUADN");
//
//        postList.add(post1);
//        postList.add(post2);
//
//        for (Post post : postList) {
//            Post postSaved = codeblogRepository.save(post);
//            System.out.println(postSaved.getId());
//        }
//
//    }
//}
