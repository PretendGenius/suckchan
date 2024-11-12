package chapter7

import java.util.*

class BinaryTreeImpl {
    var tree: TreeNode<Int>? = null

    fun orderingByLevel() {
        val queue: Queue<TreeNode<Int>> = LinkedList()

        queue.add(tree)

        while (queue.isNotEmpty()) {
            val polledNode = queue.poll()
            print("${polledNode.data} ")

            if (polledNode.left != null) {
                queue.offer(polledNode.left)
            }

            if (polledNode.right != null) {
                queue.offer(polledNode.right)
            }
        }
    }
}