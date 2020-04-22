/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.util.*;


/**
 *
 * @author Tiseka
 */
public class Proses {

    private static List<Data> ListData = new LinkedList<Data>();

    public static void AddData(Data data) {
        ListData.add(data);
    }

    public static void editData(Data data, int id) {
        ListData.set(id, data);
    }

    public static void removeData(int id) {
        ListData.remove(id);
    }

    public static List<Data> getListData() {
        return ListData;
    }
}
