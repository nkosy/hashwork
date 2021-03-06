package hashwork.client.content.system.utilities.model;

import java.io.Serializable;

/**
 * Created by bulelani on 2015/09/19.
 */
public class DisciplineActionTypeListModel implements Serializable {
    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
