package org.example.core;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

import java.util.Objects;

@Getter
@XmlRootElement(name = "person")
@XmlType
public class Person {
    @XmlElement
    private String name;
    @XmlElement
    private String gender;
    @XmlElement
    private int id;

    public Person() {

    }

    public Person(String name, String gender, int id) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        if (gender == null) {
            throw new IllegalArgumentException();
        }
        this.gender = gender;
        if (id <= 0) {
            throw new IllegalArgumentException();
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person other) {
            return this.name.equals(other.getName()) &&
                    this.gender.equals(other.getGender()) &&
                    this.id == other.getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, id);
    }
}
