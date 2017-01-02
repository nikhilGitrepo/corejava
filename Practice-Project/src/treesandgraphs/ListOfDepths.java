package treesandgraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import hackerrank.LinkedListNode;

public class ListOfDepths {

	static Map<Integer,LinkedList<TreeNode>> listsofdepths = new HashMap<>();
	
	public static void main(String[] args) {

		TreeNode root = createTree();
		ListOfDepths ld = new ListOfDepths();

		ld.processTree(root,0);
		
		System.out.println("Done");
		System.out.println(listsofdepths);
	}

	private void processTree(TreeNode root, int level) {
		
		LinkedList<TreeNode> levelList = listsofdepths.get(level);
		
		if(root == null){
			return;
		}
		
		TreeNode node = new TreeNode();
		node.data = root.data;
		
		if(levelList == null){
			levelList = new LinkedList<TreeNode>();
		}
		
		levelList.add(node);
		listsofdepths.put(level, levelList);
		
		processTree(root.left,level+1);
		processTree(root.right,level+1);
		
	}

	private static TreeNode createTree() {
		int a[] = {1,2,3,4,5,6,7,8};
		
		TreeNode tn = new TreeNode();
				
		tn = MinimalTree.createTree(a,tn);
		return tn;
	}

}
