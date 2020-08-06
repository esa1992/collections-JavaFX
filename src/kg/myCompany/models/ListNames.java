package kg.myCompany.models;

import java.util.ArrayList;
import java.util.List;

public class ListNames {

    List<String> names = new ArrayList<>();

    public void addNamesInList (String name){

        if(name.equals("")){
        }else {
            this.names.add(name);
        }
    }

    public List<String> getNamesList(){

        if (this.names.size() < 10){
            return null;
        }
        return this.names;
    }

}
