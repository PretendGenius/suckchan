package chapter7

fun main() {
    val binaryTree = BinaryTreeImpl()
    binaryTree.tree = TreeNode(1)
    binaryTree.tree!!.left = TreeNode(2)
    binaryTree.tree!!.right = TreeNode(3)
    binaryTree.tree!!.left!!.left= TreeNode(4)
    binaryTree.tree!!.left!!.right = TreeNode(5)

    binaryTree.orderingByLevel()
}