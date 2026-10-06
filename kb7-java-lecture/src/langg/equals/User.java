package langg.equals;

import java.io.*;
import java.util.*;

public class User {
    private String name;
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
