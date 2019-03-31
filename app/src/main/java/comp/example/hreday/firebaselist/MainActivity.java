package comp.example.hreday.firebaselist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[]name={"Hreday","Sagar","Chakraborty","Ma","Baba","Bunu","Mama","Mami","Troyi","Toma","Nerol"};

    private  DatabaseReference databaseReference;

    ArrayList<HredaySagar>arrayList;

    int i=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        databaseReference=FirebaseDatabase.getInstance().getReference().child("Nmae");

        arrayList=new ArrayList<HredaySagar>();

        while(i<name.length){


            HredaySagar hredaySagar=new HredaySagar(name[i]);
            arrayList.add(hredaySagar);
            i++;
        }



        databaseReference.child("Hreday").setValue(arrayList);




    }
}































