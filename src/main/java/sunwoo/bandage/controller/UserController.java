package sunwoo.bandage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sunwoo.bandage.domain.User;

@RestController
public class UserController {
    @PostMapping
    public ResponseEntity<User> userJoin(){

    }
}
