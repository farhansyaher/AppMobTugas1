package id.ac.uin.suska.recyclermobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Refactor_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<Item_Rec> items = new ArrayList<Item_Rec>();
        items.add(new Item_Rec("Adakadabra", "pun10@gmail.com", R.drawable.pun10));
        items.add(new Item_Rec("Peko", "pardun@gmail.com", R.drawable.pardun));
        items.add(new Item_Rec("Suhu", "jancok@gmail.com", R.drawable.suhu));
        items.add(new Item_Rec("Yu Gi Oh", "fniswkasebf@yahoo.com", R.drawable.yugi));
        items.add(new Item_Rec("Elemen Tal", "gogogagigo@uin-suska.ac.id", R.drawable.elemental));
        items.add(new Item_Rec("Marine_ori", "Marine@gmail.com", R.drawable.marine));
        items.add(new Item_Rec("Marine_onna", "onna_marine@gmail.com", R.drawable.houshou_marine));
        items.add(new Item_Rec("Co-Pun", "kangen@gmail.com", R.drawable.copun));
        items.add(new Item_Rec("Panda", "kungfupanda@gmail.com", R.drawable.panda));
        items.add(new Item_Rec("Oh-Hi", "vtuber@gmail.com", R.drawable.oh_hi));
        items.add(new Item_Rec("Hololive", "hololive@gmail.com", R.drawable.hololive));
        items.add(new Item_Rec("Nijisanji", "nijisanji@gmail.com", R.drawable.nijisanji));
        items.add(new Item_Rec("Unknown", "0123456789@uin-suska.ac.id", R.drawable.unknown));
        items.add(new Item_Rec("Goku109", "kamehameha@yahoo.com", R.drawable.goku));
        items.add(new Item_Rec("Dota_2", "roshan297@gmail.com", R.drawable.roshan));
        items.add(new Item_Rec("Keyboard", "qwerty@yahoo.com", R.drawable.keyboard));
        items.add(new Item_Rec("Num baaaaa", "0927368asdhuy@gmail.com", R.drawable.number));
        items.add(new Item_Rec("Apalah Daya", "santuy1278@gmail.com", R.drawable.apalah_daya));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter_Mobile(getApplicationContext(), items));
    }
}