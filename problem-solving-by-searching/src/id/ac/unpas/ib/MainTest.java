package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

public class MainTest {

    //objek node yang mewakili jalan-jalan dalam peta. setiap jalan dan tempat memiliki
    // nama jalan dan beberapa diantaranya memiliki tetangga (jalan yang terhubung)
    public static void main(String[] args) {
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


        kampusIUNPAS.addTetangga(pungkur);
      

        pungkur.addTetangga(kampusIUNPAS);
        pungkur.addTetangga(dewiSartika);


        dewiSartika.addTetangga(pungkur);
        dewiSartika.addTetangga(dalemKaum);
      

        dalemKaum.addTetangga(dewiSartika);
        dalemKaum.addTetangga(alunAlunTimur);

        alunAlunTimur.addTetangga(dalemKaum);
        alunAlunTimur.addTetangga(asiaAfrika);

        asiaAfrika.addTetangga(alunAlunTimur);
        asiaAfrika.addTetangga(gardujati);
        asiaAfrika.addTetangga(banceuy);

        banceuy.addTetangga(asiaAfrika);
        banceuy.addTetangga(suniaraja);

        gardujati.addTetangga(asiaAfrika);
        gardujati.addTetangga(pasirkaliki);

        wastukencana.addTetangga(suniaraja);
        wastukencana.addTetangga(pajajaran);

        pajajaran.addTetangga(wastukencana);
        pajajaran.addTetangga(cihampelas);

        cihampelas.addTetangga(pasirkaliki);
        cihampelas.addTetangga(pajajaran);

        pasirkaliki.addTetangga(gardujati);
        pasirkaliki.addTetangga(cihampelas);
        pasirkaliki.addTetangga(sukajadi);

        sukajadi.addTetangga(pasirkaliki);
        sukajadi.addTetangga(drSetiabudhi);

        drSetiabudhi.addTetangga(sukajadi);
        drSetiabudhi.addTetangga(kampusIVUNPAS);

        kampusIVUNPAS.addTetangga(drSetiabudhi);
 
        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(kampusIUNPAS, kampusIVUNPAS);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(kampusIUNPAS, kampusIVUNPAS);
        System.out.println();

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
 
 
        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(kampusIUNPASUNCS, kampusIVUNPASUCS);
        System.out.println();
    }
}
