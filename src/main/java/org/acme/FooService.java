package org.acme;

public interface FooService
{    
    Foo findById(int id);
    
    Foo findById(String idAsString);
}
