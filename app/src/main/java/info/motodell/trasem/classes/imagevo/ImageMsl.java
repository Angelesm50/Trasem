package info.motodell.trasem.classes.imagevo;

public class ImageMsl {

    private int id;
    private int imageMslId;
    private String name;
    private String displayName;
    private String description;

    public ImageMsl(int id, int imageMslId, String name, String displayName, String description) {
        this.id = id;
        this.imageMslId = imageMslId;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageMslId() {
        return imageMslId;
    }

    public void setImageMslId(int imageMslId) {
        this.imageMslId = imageMslId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
