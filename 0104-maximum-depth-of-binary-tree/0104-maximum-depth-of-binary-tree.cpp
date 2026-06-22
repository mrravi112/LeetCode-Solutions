
class Solution {
public:
    int maxDepth(TreeNode* root) {
        if(root==NULL){
            return 0;
        }
        int left_height=maxDepth(root->left);
        int ryt_height=maxDepth(root->right);

        return 1+max(left_height,ryt_height);

    }
};