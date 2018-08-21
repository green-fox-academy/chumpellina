import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        BlogPost postN = new BlogPost("x", "y", "z", "zs");
        ArrayList<BlogPost> PostList = new ArrayList<BlogPost>() {
            BlogPost post1 = new BlogPost("aaaa", "aaaa", "aaaa", "aaaa");
            BlogPost post2 = new BlogPost("bbbb", "bbbb", "bbbb", "bbbb");
            BlogPost post3 = new BlogPost("cccc", "cccc", "cccc", "cccc");
            BlogPost post4 = new BlogPost("dddd", "dddd", "dddd", "dddd");
            BlogPost post5 = new BlogPost("eeee", "eeee", "eeee", "eeee");

        };

    }
}


   /* Create a Blog class which can
        store a list of BlogPost
        add BlogPost to the list
        delete(int) one item at given index
        update(int, BlogPost) one item at the given index and update it with another BlogPost */