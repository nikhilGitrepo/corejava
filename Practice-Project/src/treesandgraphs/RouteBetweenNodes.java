package treesandgraphs;

import java.util.LinkedList;

public class RouteBetweenNodes {

	public static void main(String[] args) {
		
		Graph g = createNewGraph();
		Node[] n = g.getNodes();
		Node start = n[1];
		Node end = n[4];
		System.out.println(search(g, start, end));
		
	}
	
	private static boolean search(Graph g, Node start, Node end) {
		if(start==end) return false;
		
//		boolean startFound = false;
//		boolean endFound = false;
		
		boolean routeExists = false;

		for(Node un : g.getNodes()){
			un.state = State.Unvisited;
		}
		
		LinkedList<Node> queue = new LinkedList<>();
		start.state = State.Visited;
		queue.add(start);
		
		while(!queue.isEmpty()){
			Node curr = queue.removeFirst();
			if(curr != null){
				for(Node v : curr.getAdjacent()){
					if(v.state == State.Unvisited){
						v.state = State.Visiting;
						
						if(v == end){
							return true;
						}else{
							queue.add(v);
						}
						
					}
				}
				curr.state = State.Visited;
			}
		}
		
		return routeExists;
	}


	public static Graph createNewGraph()
	{
		Graph g = new Graph();        
		Node[] temp = new Node[6];

		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		return g;
	}
}
