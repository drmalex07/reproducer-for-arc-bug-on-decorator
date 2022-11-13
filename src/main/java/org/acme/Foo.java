package org.acme;

public class Foo
{
    int id;
    
    String name;

    public Foo(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
}
