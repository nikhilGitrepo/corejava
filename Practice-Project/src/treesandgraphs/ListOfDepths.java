package treesandgraphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ListOfDepths {

	static Map<Integer,LinkedList<TreeNode>> listsofdepths = new HashMap<>();
	
	public static void main(String[] args) {

		ListOfDepths ld = new ListOfDepths();
		int a[] = {1,2,3,4,5,6,7};
		
		ld.treeToDepthsMap(a);
		
		System.out.println("Done");
		System.out.println(listsofdepths);
			
	}
	
	public Map<Integer,LinkedList<TreeNode>> treeToDepthsMap(int[] a) {
		TreeNode root = createTree(a);
		processTree(root,0);
		return listsofdepths;
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

	private TreeNode createTree(int[] a ) {
		
		TreeNode tn = new TreeNode();
				
		tn = MinimalTree.createTree(a,tn);
		return tn;
	}

}
