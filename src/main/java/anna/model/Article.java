package anna.model;

public class Article {

    private String title;
    private String body;
    private String tags;


    public boolean checkNotEmpty(){
        if(body!=null && body.length()>5)
            return true;
        else
            return false;
    }

    public Article(){}

    public Article(String title, String body, String tags) {
        this.title = title;
        this.body = body;
        this.tags = tags;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
