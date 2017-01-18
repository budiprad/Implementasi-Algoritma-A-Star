/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Budi Pradnyana
 */
public class Edge {
    private double cost;
    private Node targetnode;
    
    public Edge(Node target, double cost) {
        targetnode=target;
        this.cost=cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Node getTargetnode() {
        return targetnode;
    }

    public void setTargetnode(Node targetnode) {
        this.targetnode = targetnode;
    }
    
    
}
