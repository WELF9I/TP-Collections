public class Entreprise {
    public static void main(String[] args) {
        Salarie tabSalarie[]=new Salarie[5];
        Salarie S1=new Employe(12345,"Walid",2002,15,4);
        Salarie S2=new Vendeur(23445,"Yessine",2007,1000,0.1);
        Salarie S3=new Vendeur(65478,"Nassime",2000,700,0.1);
        Salarie S4=new Employe(87698,"Aymen ",2003,19,5);
        Salarie S5=new Employe(12345,"Khaled",2008,7,4);
        tabSalarie[0]=S1;
        tabSalarie[1]=S2;
        tabSalarie[2]=S3;
        tabSalarie[3]=S4;
        tabSalarie[4]=S5;
        for(int i=0;i<tabSalarie.length;i++){
            if(tabSalarie[i]instanceof Employe){
                tabSalarie[i].Affiche();
            }
            else if(tabSalarie[i]instanceof Vendeur){
                tabSalarie[i].Affiche();
            }
        }
        System.out.print(" Nom du salarié le plus ancien dans l'entreprise : ");
        Salarie S=tabSalarie[0];
        for(int i=1;i<tabSalarie.length;i++){
            if(tabSalarie[i].getRecrutement()<S.getRecrutement()){
                S=tabSalarie[i];
            }
        }
        System.out.println(S.getNom()+" recruté en l'an "+S.getRecrutement());
        System.out.println(" Matricule du vendeur disposant du plus grand salaire : ");
        boolean test=false;
        Salarie s=null;
        for(int i=1;i<tabSalarie.length;i++){
            if(tabSalarie[i]instanceof Vendeur){
                test=true;
                if(test){
                    s=tabSalarie[i];
                    if(tabSalarie[i].salaire()>s.salaire()){
                        s=tabSalarie[i];
                    }
                }
            }
        }
        System.out.print("Matricule= "+s.getMatricule()+" de salaire= "+s.salaire()+"Dt");

    }
}
