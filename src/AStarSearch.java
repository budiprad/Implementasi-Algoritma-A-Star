
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Budi Pradnyana
 */
public class AStarSearch {
    private double costtotal;
    
    public void Astarsearch(Node start, Node goal){
        ArrayList<Node> closed = new ArrayList<Node>();
        ArrayList<Node> open = new ArrayList<Node>();
        open.add(start);
        start.setFn(start.getGn()+start.getHn());
       
        System.out.print("        OPEN : ");
        System.out.println(open);
        
         
        while(open.isEmpty() == false){        
            Node best;
            if (open.contains(goal)){
                int position = open.indexOf(goal);
                best = open.get(position);
            } else {
                //selection sort
                for (int i=0; i< open.size()-1; i++ ){
                    int min=i;
                    for(int j = i+1; j<open.size(); j++) {
                        if(open.get(j).getFn() < open.get(min).getFn()) {
                            min=j;
                        }
                      }
                        Node temp = open.get(min);
                        open.set(min, open.get(i));
                        open.set(i, temp);
                } 
                best = open.get(0);    
            }
            
            if (open.contains(best)){
                open.remove(best);
            }

            
            System.out.print("        CLOSED : ");
            System.out.println(closed);
            closed.add(best);
            System.out.println("   ***BEST NODE : "+best.getNama()+"***");
            System.out.print("        OPEN : ");
            System.out.println(open);
            System.out.print("        CLOSED : ");
            System.out.println(closed);
            System.out.println();
            System.out.println();
            
            if(best.getNama() == goal.getNama()){
                return;
            }
                      
                    
            for(Edge e:best.getChildlist()){//budipradnyana
                Node child = e.getTargetnode();
                double tempcost = e.getCost();
                double tempGn = best.getGn()+ tempcost;
                double tempFn = tempGn + child.getHn();              
                
                if (closed.contains(child)){
                    continue;
                }  else if (!open.contains(child)) {
                    child.setFn(tempFn);
                    child.setGn(tempGn);
                    child.setParentnode(best);
                    if (open.contains(child)) {
                        open.remove(child);
                    }
                    open.add(child); 
                }
            }
            System.out.print("        OPEN : ");
            System.out.println(open);          
        }
    }
    
    public void printRute(Node goal){
        ArrayList<Node> rute = new ArrayList<>();

        for (Node n = goal; n != null; n = n.getParentnode()){
            rute.add(n);
        }
        costtotal=goal.getGn(); 

        for (int i=rute.size()-1; i>=0; i--){
            System.out.print(rute.get(i).getNama()+" ");
        }
    }

    public double getCosttotal() {
        return costtotal;
    }

    public void setCosttotal(double costtotal) {
        this.costtotal = costtotal;
    }
}