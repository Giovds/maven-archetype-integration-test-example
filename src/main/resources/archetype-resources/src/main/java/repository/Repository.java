package ${package}.repository; // Notice we use a default required property here!

import ${package}.model.User;

public interface Repository 
{
    User findUserById(final Long id);
}
