package sia.tacocloud.models;

import lombok.Data;

@Data
public class Design {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
