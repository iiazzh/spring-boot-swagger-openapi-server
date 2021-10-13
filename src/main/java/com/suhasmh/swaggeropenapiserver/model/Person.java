package com.suhasmh.swaggeropenapiserver.model;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Person {
    //Just keep this around. Not being used anywhere as of now. Sonar may not be happy.
    abstract String getName();

    abstract Integer getAge();
}
