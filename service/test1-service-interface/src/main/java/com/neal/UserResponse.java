package com.neal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Neal
 */
public class UserResponse {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
