public class Graphs {
    static Graph<String> makeGraph() {
        Graph<String> graph = new AdjacencyGraph<>();

        // Use String variables instead of Vertex<String>
        String vA = "A";
        String vB = "B";
        String vC = "C";
        String vD = "D";
        String vE = "E";
        String vF = "F";
        String vG = "G";
        String vH = "H";
        String vI = "I";
        String vJ = "J";
        String vK = "K";

        // Add vertices to the graph
        graph.add(vA);
        graph.add(vB);
        graph.add(vC);
        graph.add(vD);
        graph.add(vE);
        graph.add(vF);
        graph.add(vG);
        graph.add(vH);
        graph.add(vI);
        graph.add(vJ);
        graph.add(vK);

        // Connect vertices
        graph.connectDirected(vA, vB);
        graph.connectDirected(vA, vC);

        graph.connectDirected(vB, vA);
        graph.connectDirected(vB, vE);
        
        graph.connectDirected(vC, vD);
        graph.connectDirected(vC, vE);
        graph.connectDirected(vC, vH);

        graph.connectDirected(vD, vB);
        graph.connectDirected(vD, vC);
        graph.connectDirected(vD, vF);

        graph.connectDirected(vE, vB);
        graph.connectDirected(vE, vC);
        graph.connectDirected(vE, vF);

        graph.connectDirected(vF, vD);
        graph.connectDirected(vF, vG);

        graph.connectDirected(vI, vK);
        
        graph.connectDirected(vJ, vI);
        graph.connectDirected(vJ, vK);
        
        graph.connectDirected(vK, vI);
        graph.connectDirected(vK, vJ);

        return graph;
    }
}
