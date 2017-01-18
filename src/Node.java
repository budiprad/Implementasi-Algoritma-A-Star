
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Budi Pradnyana
 */
public class Node {
    private String nama;
    private double gn;
    private double fn;
    private double hn;
    private List<Edge> childlist;
    private Node parentnode;

   
    @Override
    public String toString(){
        return this.nama+"("+this.fn+")";
    }
     
    public Node(String nama, double hn){
        this.nama=nama;
        this.hn=hn;
        this.childlist=new ArrayList<Edge>();
    }
    
    public void connect(Edge e){
        this.getChildlist().add(e);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGn() {
        return gn;
    }

    public void setGn(double gn) {
        this.gn = gn;
    }

    public double getFn() {
        return fn;
    }

    public void setFn(double fn) {
        this.fn = fn;
    }

    public double getHn() {
        return hn;
    }

    public void setHn(double hn) {
        this.hn = hn;
    }

    public List<Edge> getChildlist() {
        return childlist;
    }

    public void setChildlist(List<Edge> childlist) {
        this.childlist = childlist;
    }

    public Node getParentnode() {
        return parentnode;
    }

    public void setParentnode(Node parentnode) {
        this.parentnode = parentnode;
    }
    
 
}
