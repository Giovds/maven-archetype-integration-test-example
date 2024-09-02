package com.example.repository; // Notice we use a default required property here!

import com.example.model.User;

public interface Repository 
{
    User findUserById(final Long id);
}
