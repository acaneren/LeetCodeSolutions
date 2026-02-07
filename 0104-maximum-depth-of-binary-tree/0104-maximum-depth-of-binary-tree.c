/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode *root) {
    int left_depth = 0; 
    int right_depth = 0;

    if (root == 0){
        return 0;
    }
    left_depth = maxDepth(root->left);
    right_depth = maxDepth(root->right);

    if(left_depth >= right_depth){
        return left_depth + 1;
    }
    else{
        return right_depth + 1;
    }
}