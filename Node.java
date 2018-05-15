public class Node {

    private Node left, right;
    private Movie data;

    public Node(Movie data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(Movie data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Movie getData() {
        return data;
    }

    public String getKey() {
        return data.getMovieTitle();
    }

}
