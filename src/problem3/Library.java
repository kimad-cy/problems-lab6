package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    ArrayList<Document> documents;
    public static int id = 0;

    public Library(int capacity){
        this.capacity = capacity;
        documents = new ArrayList<>();
    }

    public void displayDocuments(){
        for (Document d : documents) {
            System.out.println(d);
        }
    }
    public boolean add(Document document){
        if(documents.size()<capacity){
            document.setNumRec(++id);
            documents.add(document);
            return true;
        }
        return false;
    }
    public boolean delete(Document document){
        for(int i=0; i<documents.size(); i++){
            if(documents.get(i).getTitle().equals(document.getTitle())){
                documents.remove(i);
                return true;
            }

        }
        return false;

    }
    public Document document(int numEnrg){
        for(int i = 0; i<documents.size(); i++){
            if(documents.get(i).getNumRec() == numEnrg){
                return documents.get(i);
            }
        }
        return null;
    }
    public void displayAuthors(){
        for (Document d : documents) {
            if (d instanceof Book) {
                System.out.println(((Book) d).getAuthor());
            }
        }
    }

}
