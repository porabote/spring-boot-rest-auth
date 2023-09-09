package ru.porabote.springbootrestauth.repository;

import org.springframework.stereotype.Repository;
import ru.porabote.springbootrestauth.service.Authorities;

import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        return null;
    }

}
