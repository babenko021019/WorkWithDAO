package com.mainacad.dao;

import com.mainacad.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    @Test
    void save() {
        User user = new User("testLogin", "testPass", "testName",
                "testLastName", "testEmail", "123456789");
        UserDAO.save(user);
        assertNotNull(user.getId());
    }
}