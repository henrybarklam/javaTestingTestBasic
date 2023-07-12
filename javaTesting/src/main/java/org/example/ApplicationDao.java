package org.example;

import java.util.ArrayList;
import java.util.List;

public class ApplicationDao {


    public User getByUserId(String id){
        //Make database query here
        if(id.equals("3212")){
            return null;
        }

        User user = new User();
        user.setUsername("mark");
        user.setPassword("name123");
        List<String> postEx = new ArrayList<String>();
        postEx.add("Example");
        user.setPosts(postEx);
        return user;



    }

    public void save (User user) throws Exception {
        //Make database query here

        if(user==null){
            throw new Exception("The user is null");
        }
        //actually does nothing
        System.out.println("User saved successfuly");
    }
}
