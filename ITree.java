public interface ITree {

    public void insert(Movie data);
    public Node insert(Node node, Movie data);
    public void search(Movie data);
    public void search(Node node, Movie data);
    public void delete(Movie data);
    public void delete(Movie data, Node node);
    public boolean isEmpty();
    public void traverse();
    public void inOrderTraversal(Node node);
    public int size();
}
