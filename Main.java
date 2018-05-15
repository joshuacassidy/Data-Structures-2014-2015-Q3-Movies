public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(new Movie("The Shining", 1980));
        binarySearchTree.insert(new Movie("Fight Club", 1999));
        binarySearchTree.insert(new Movie("Crocodile Hunter", 2010));
        binarySearchTree.insert(new Movie("West Route", 2004));
        binarySearchTree.traverse();
    }

}
