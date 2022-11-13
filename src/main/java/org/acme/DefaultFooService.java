package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DefaultFooService implements FooService
{
    @Override
    public Foo findById(int id)
    {
        return new Foo(id, "Toto");
    }

    @Override
    public Foo findById(String idAsString)
    {
        return new Foo(Integer.parseInt(idAsString), "Toto");
    }
}
