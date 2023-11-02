package id.ac.unpas.ib.heuristik.greedybfs;

public class MainTest {

    //objek node yang mewakili jalan-jalan dalam peta. setiap jalan dan tempat memiliki
    // nama jalan dan beberapa diantaranya memiliki tetangga (jalan yang terhubung)
    public static void main(String[] args) {
        // inisialisasi node-node yang ada
        Node kampusIUNPAS = new Node("Kampus I UNPAS");
        Node pungkur = new Node("Jl. Pungkur");
        Node dewiSartika = new Node("Jl. Dewi Sartika");
        Node dalemKaum = new Node("Jl. Dalem Kaum");
        Node alunAlunTimur = new Node("Jl. Alun-Alun Timur");
        Node asiaAfrika = new Node("Jl. Asia Afrika");
        Node gardujati = new Node("Jl. Gardujati");
        Node banceuy = new Node("Jl. Banceuy");
        Node suniaraja = new Node("Jl. Suniaraja");
        Node wastukencana = new Node("Jl. Wastukencana");
        Node pajajaran = new Node("Jl. Pajajaran");
        Node cihampelas = new Node("Jl. Cihampelas");
        Node pasirkaliki = new Node("Jl. Pasirkaliki");
        Node sukajadi = new Node("Jl. Sukajadi");
        Node drSetiabudhi = new Node("Jl. Dr Setiabudhi");
        Node kampusIVUNPAS = new Node("Kampus IV UNPAS");

        // inisialisasi node-node yang ada dengan costnya
        NodeUCS kampusIUNPASUNCS = new NodeUCS(kampusIUNPAS, 31);
        NodeUCS pungkurUCS = new NodeUCS(pungkur, 30);
        NodeUCS dewiSartikaUCS = new NodeUCS(dewiSartika, 29);
        NodeUCS dalemKaumUCS = new NodeUCS(dalemKaum, 28);
        NodeUCS alunAlunTimurUCS = new NodeUCS(alunAlunTimur, 26);
        NodeUCS asiaAfrikaUCS = new NodeUCS(asiaAfrika, 24);
        NodeUCS gardujatiUCS = new NodeUCS(gardujati, 19);
        NodeUCS pasirkalikiUCS = new NodeUCS(pasirkaliki, 11);
        NodeUCS banceuyUCS = new NodeUCS(banceuy, 43);
        NodeUCS suniarajaUCS = new NodeUCS(suniaraja, 40);
        NodeUCS wastukencanaUCS = new NodeUCS(wastukencana, 36);
        NodeUCS pajajaranUCS = new NodeUCS(pajajaran, 31);
        NodeUCS cihampelasUCS = new NodeUCS(cihampelas, 26);
        NodeUCS sukajadiUCS = new NodeUCS(sukajadi, 6);
        NodeUCS drSetiabudhiUCS = new NodeUCS(drSetiabudhi, 5);
        NodeUCS kampusIVUNPASUCS = new NodeUCS(kampusIVUNPAS, 0);
      

        // menambahkan tetangga dari masing-masing node
        kampusIUNPASUNCS.addTetangga(pungkurUCS);
   
        pungkurUCS.addTetangga(kampusIUNPASUNCS);
        pungkurUCS.addTetangga(dewiSartikaUCS);
     

        dewiSartikaUCS.addTetangga(pungkurUCS);
        dewiSartikaUCS.addTetangga(dalemKaumUCS);
        

        dalemKaumUCS.addTetangga(alunAlunTimurUCS);
        dalemKaumUCS.addTetangga(dewiSartikaUCS);

        alunAlunTimurUCS.addTetangga(dalemKaumUCS);
        alunAlunTimurUCS.addTetangga(asiaAfrikaUCS);

        asiaAfrikaUCS.addTetangga(alunAlunTimurUCS);
        asiaAfrikaUCS.addTetangga(banceuyUCS);
        asiaAfrikaUCS.addTetangga(gardujatiUCS);

        gardujatiUCS.addTetangga(asiaAfrikaUCS);
        gardujatiUCS.addTetangga(pasirkalikiUCS);

        banceuyUCS.addTetangga(asiaAfrikaUCS);
        banceuyUCS.addTetangga(suniarajaUCS);

        suniarajaUCS.addTetangga(banceuyUCS);
        suniarajaUCS.addTetangga(wastukencanaUCS);

        wastukencanaUCS.addTetangga(suniarajaUCS);
        wastukencanaUCS.addTetangga(pajajaranUCS);

        pajajaranUCS.addTetangga(wastukencanaUCS);
        pajajaranUCS.addTetangga(cihampelasUCS);

        cihampelasUCS.addTetangga(pajajaranUCS);
        cihampelasUCS.addTetangga(pasirkalikiUCS);

        pasirkalikiUCS.addTetangga(cihampelasUCS);
        pasirkalikiUCS.addTetangga(sukajadiUCS);
        pasirkalikiUCS.addTetangga(gardujatiUCS);

        sukajadiUCS.addTetangga(pasirkalikiUCS);
        sukajadiUCS.addTetangga(drSetiabudhiUCS);
        

        drSetiabudhiUCS.addTetangga(sukajadiUCS);
        drSetiabudhiUCS.addTetangga(kampusIVUNPASUCS);
        
        kampusIVUNPASUCS.addTetangga(drSetiabudhiUCS);
        
                // menampilkan hasil dari algoritma Greedy Best First Search
                System.out.println("Greedy BFS");
                // inisialisasi objek GreedyBestFirstSearch
                GreedyBestFirstSearch bfs = new GreedyBestFirstSearch();
                // memanggil fungsi search dari objek GreedyBestFirstSearch dari node aradUCS ke
                // bucharestUCS
                bfs.search(kampusIUNPASUNCS, kampusIVUNPASUCS);
                System.out.println();
        
    
    }
}
