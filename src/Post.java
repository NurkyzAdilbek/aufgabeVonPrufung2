public class Post extends  Id{
    private String imageUri;
    private String description;

    public Post(int uniqueID, String imageUri, String description) {
        super(uniqueID);
        this.imageUri = imageUri;
        this.description = description;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
