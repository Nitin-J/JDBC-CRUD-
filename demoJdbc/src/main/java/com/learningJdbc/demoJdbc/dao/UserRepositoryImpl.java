package com.learningJdbc.demoJdbc.dao;

import com.learningJdbc.demoJdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private static final String INSERT_USER = "INSERT INTO USER(id,firstName,lastName,email) values(?,?,?,?)";
    private static final String Get_USERS = "SELECT * FROM USER";
    private static final String DELETE_USERS = "DELETE FROM USER WHERE id = ?";
    private static final String UPDATE_USER = "UPDATE USER SET firstName= ?, lastName = ?, email = ? WHERE id = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveUser(User user) {
        jdbcTemplate.update(INSERT_USER,user.getId(),user.getFirstName(),user.getLastName(),user.getEmail());
    }

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query(Get_USERS, (rs, rowNum) -> {
            return new User(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("email"));
        } );
    }

    @Override
    public String deleteUser(int id) {
        jdbcTemplate.update(DELETE_USERS,id);
        return "User got deleted with id " + id;
    }

    @Override
    public String  updateUser(User user) {
        jdbcTemplate.update(UPDATE_USER, user.getFirstName(),user.getLastName(),user.getEmail(),user.getId());
        return "Record Updated";
    }
}
