package id.ac.unpas.ib.heuristik.astar;

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
      
        // menambahkan tetangga dari masing-masing node dengan costnya
        kampusIUNPASUNCS.addTetangga(pungkurUCS, 1);
   
        pungkurUCS.addTetangga(kampusIUNPASUNCS, 1);
        pungkurUCS.addTetangga(dewiSartikaUCS, 1);
     

        dewiSartikaUCS.addTetangga(pungkurUCS, 1);
        dewiSartikaUCS.addTetangga(dalemKaumUCS, 1);
        

        dalemKaumUCS.addTetangga(alunAlunTimurUCS, 2);
        dalemKaumUCS.addTetangga(dewiSartikaUCS, 1);

        alunAlunTimurUCS.addTetangga(dalemKaumUCS, 2);
        alunAlunTimurUCS.addTetangga(asiaAfrikaUCS, 2);

        asiaAfrikaUCS.addTetangga(alunAlunTimurUCS, 2);
        asiaAfrikaUCS.addTetangga(banceuyUCS, 2);
        asiaAfrikaUCS.addTetangga(gardujatiUCS, 5);

        gardujatiUCS.addTetangga(asiaAfrikaUCS, 5);
        gardujatiUCS.addTetangga(pasirkalikiUCS, 8);

        banceuyUCS.addTetangga(asiaAfrikaUCS, 2);
        banceuyUCS.addTetangga(suniarajaUCS, 3);

        suniarajaUCS.addTetangga(banceuyUCS, 3);
        suniarajaUCS.addTetangga(wastukencanaUCS, 4);

        wastukencanaUCS.addTetangga(suniarajaUCS, 4);
        wastukencanaUCS.addTetangga(pajajaranUCS, 5);

        pajajaranUCS.addTetangga(wastukencanaUCS, 5);
        pajajaranUCS.addTetangga(cihampelasUCS, 5);

        cihampelasUCS.addTetangga(pajajaranUCS, 5);
        cihampelasUCS.addTetangga(pasirkalikiUCS, 6);

        pasirkalikiUCS.addTetangga(cihampelasUCS, 6);
        pasirkalikiUCS.addTetangga(sukajadiUCS, 6);
        pasirkalikiUCS.addTetangga(gardujatiUCS, 8);

        sukajadiUCS.addTetangga(pasirkalikiUCS, 6);
        sukajadiUCS.addTetangga(drSetiabudhiUCS, 3);
        

        drSetiabudhiUCS.addTetangga(sukajadiUCS, 3);
        drSetiabudhiUCS.addTetangga(kampusIVUNPASUCS, 2);
        
        kampusIVUNPASUCS.addTetangga(drSetiabudhiUCS, 2);
        
     // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        AStar aStar = new AStar();
        // memanggil fungsi search dari objek aStar dari node aradUCS ke bucharestUCS
        aStar.search(kampusIUNPASUNCS, kampusIVUNPASUCS);
        System.out.println();
    
    }
}
