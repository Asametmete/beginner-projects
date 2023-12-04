package project1;

public class Linkedlist {
    // Basa ekleme
Node head = null;  // null olarak tanımlamamışsın
Node tail = null;
public void basaekle(int x){
    Node eleman = new Node();
    eleman.data = x;
    
    
    if(head == null){// liste bos ise
        
        eleman.next = null;
        head = eleman;           // ŞURASI ÇOK ÖNEMLİ head boş ve heade elemanı atamalıyız elemanı heade değil!!!!
        tail = eleman;
        
        System.out.println("Liste oluşturuldu ve başa eleman eklendi");
        
    }
    else{
        eleman.data = x;
        eleman.next = head;
        head = eleman;  
        
        System.out.println("Başa eleman eklendi");
        
        
    }
    
}

public void sonaekle(int x){
    Node eleman = new Node();
    eleman.data = x;
 
    if(head == null){                   // eğer liste yok ise
        eleman.next = null;
        head = eleman;
        tail = eleman;
        
        System.out.println("Liste oluşturuldu");
        
    }
    
    else{
        // elamanı son eleman yapıcam şimdi
        
        Node temp;
        temp = head;                // Şurası ÇOK önemli nereden başlayacağını bilmeli head = temp deme sakına!
        while(temp.next != null){
            
            temp = temp.next;
            
        }
        temp.next = eleman;
        eleman.next = null;
        tail = eleman;
        
        
    }
    
}

public void arayaekle(int indis , int x){
    Node eleman = new Node();
    eleman.data = x;
  
    if (head == null){
        eleman.next = null;
        head = eleman;
        tail = eleman;
        
        System.out.println("Liste oluşturuldu");
    }
   
    
    else if(indis == 0){
        eleman.next = head;
        head = eleman;
        
        System.out.println("İstenilen hedef düğümün başıydı ve başa eklendi");
    }
    else {
    int n = 0;
    Node temp = head;
    Node temp2 = head;
   
    while(n != indis && temp != null){    // BURAYA DİKKAR ET
        temp2 = temp;
        temp = temp.next;
        n++;
    }
    if(temp.next == null){
         temp.next = eleman;
         eleman.next = null;
         tail = eleman;
    }
    else {
        temp2.next = eleman;
        eleman.next = temp;
    }
    
    }
    
} 

public void bastansil(){
    if(head == null){ // dizi boş mu
        System.out.println("Elaman boştur silinecek elaman yok!");
        
        
    }
    else if(head.next == null){  // headten sonrası boş mu kontorlü
        head = null;
        tail = null;
        System.out.println("Listedeki son eleman silindi");
        
    }
    else{   // headi burada sildik!
    Node temp = head;      
    head = temp.next;
    temp = null;
    }
  
}

public void sondansil(){
    if(head == null){
        System.out.println("liste boş silinecek eleman yok");
    }
    else if(head.next == null){
        head = null;
        tail = null;
        System.out.println("Listede kalan son eleman silindi");
    }
    else{
        Node temp = head;
        
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        
    }
}

public void aradansil(int indis){
    if(head == null){
        System.out.println("liste boş silinecek eleman yok");
    }
    else if(head.next == null){
        head = null;
        tail = null;
        System.out.println("Listede kalan son eleman silindi");
    }
    
    else{
        int n = 0;
        Node temp2 = head;
        Node temp = head;
        while(n != indis && temp != null){
            temp2 = temp;
            temp = temp.next;
            n++;
        }
        temp2.next = temp.next;
        temp = null;
        
    }
}

public void yazdir(){
    Node temp;
    temp = head;
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
}
