package org.acme;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Priority(10)
@Decorator
public class LoggingFooService implements FooService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFooService.class); 
    
    @Inject
    @Any
    @Delegate
    FooService delegate;

    @Override
    public Foo findById(int id)
    {
        LOGGER.info("Forwarding to findById(id={})", id);
        return delegate.findById(id);
    }

    @Override
    public Foo findById(String idAsString)
    {
        LOGGER.info("Forwarding to findById(idAsString={})", idAsString);
        return delegate.findById(idAsString);
    }
}
