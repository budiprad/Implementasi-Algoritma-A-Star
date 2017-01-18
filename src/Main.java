/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Budi Pradnyana
 */
public class Main {
    public static void main(String[] args) {
        Node node1 = new Node("Ravenna",0);
        Node node2 = new Node("Rimini",0.5);
        Node node3 = new Node("Ferrara",5);
        Node node4 = new Node("Forli",2);
        Node node5 = new Node("Cesena",4.5);
        Node node6 = new Node("Faenza",4);
        Node node7 = new Node("Imola",5);
        Node node8 = new Node("Emilia",6);
        Node node9 = new Node("Terme",7);
        Node node10 = new Node("Carpi",8);
        Node node11 = new Node("Piacenza",10);
        Node node12 = new Node("Bobbia",10.5);
        
        node12.connect(new Edge(node11,5));
        node12.connect(new Edge(node9,3));
        node12.connect(new Edge(node5,15));
        
        node11.connect(new Edge(node10,3));
        node11.connect(new Edge(node9,3));
        
        node9.connect(new Edge(node8,2));
        node9.connect(new Edge(node6,3));
        
        node6.connect(new Edge(node4,2));
        node6.connect(new Edge(node5,6));
        
        node5.connect(new Edge(node2,5));
        
        node4.connect(new Edge(node5,2));
        node4.connect(new Edge(node1,3));
    
        node7.connect(new Edge(node4,3));
        node7.connect(new Edge(node6,1));
        
        node8.connect(new Edge(node7,2));
        
        node10.connect(new Edge(node8,2));
        node10.connect(new Edge(node3,8));
        
        node3.connect(new Edge(node7,3));
        node3.connect(new Edge(node1,6));
        
        node2.connect(new Edge(node1,1));
        
        AStarSearch astar = new AStarSearch();
        astar.Astarsearch(node12, node1);
        System.out.println();
        System.out.print("Rutenya : ");
        astar.printRute(node1);
        System.out.println();
        System.out.println("Costnya : "+astar.getCosttotal());
    }
}
