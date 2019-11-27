package com.mainacad.dao;

import com.mainacad.model.User;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {
    private static final Logger LOG = Logger.getLogger(UserDAOTest.class.getName());

    @Test
    void save() {
        User user = new User("testLogin3", "testPass3", "testName3",
                "testLastName3", "testEmail3", "123456789(3)");
        UserDAO.save(user);
        assertNotNull(user.getId());
    }

    @Test
    void update() {
        User user = new User(57, "UpdateLogin(2)", "UpdatePass(2)", "UpdateName(2)",
                "UpdateLastName(2)", "UpdateEmail(2)", "Update123456789(2)");
        UserDAO.update(user);
        assertNotNull(user.getId());
    }

    @Test
    void getById() {
        LOG.info(UserDAO.getById(3).toString());
        assertNotNull(UserDAO.getById(3));
    }

    @Test
    void getByLoginAndPassword() {
        LOG.info(String.valueOf(UserDAO.getByLoginAndPassword("testLogin", "testPass")));
        assertNotNull(UserDAO.getByLoginAndPassword("testLogin", "testPass"));
    }

    @Test
    void delete() {
        UserDAO.delete(57);
        assertNull(UserDAO.getById(57));
    }
}