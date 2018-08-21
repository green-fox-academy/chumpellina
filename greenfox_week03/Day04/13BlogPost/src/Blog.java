import java.util.ArrayList;

public class Blog {
    Blog blogx = new Blog();
    ArrayList<BlogPost> PostList = new ArrayList<BlogPost>();


    public Blog() {
    }


    public void addPost(BlogPost toAdd) {
        PostList.add(toAdd);

    }

    public void removePost(int x) {
        PostList.remove(x);


    }
}


//ArrayList<String> obj = new ArrayList<String>();
