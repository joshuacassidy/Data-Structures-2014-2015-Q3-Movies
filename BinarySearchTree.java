public class BinarySearchTree implements ITree {

    private Node root;

    @Override
    public void insert(Movie data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            insert(root, data);
        }
    }

    @Override
    public Node insert(Node node, Movie data) {
        if (node.getKey().compareTo(data.getMovieTitle()) < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(data));
                return node.getLeft();
            } else {
                return insert(node.getLeft(), data);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node(data));
                return node.getRight();
            } else {
                return insert(node.getRight(), data);
            }
        }
    }

    @Override
    public void search(Movie data) {

    }

    @Override
    public void search(Node node, Movie data) {

    }

    @Override
    public void delete(Movie data) {

    }

    @Override
    public void delete(Movie data, Node node) {

    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            inOrderTraversal(root);
        }
    }

    @Override
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getData()+ " ");
            inOrderTraversal(node.getRight());
        }
    }

    @Override
    public int size() {
        return 0;
    }
}
