package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText ed_book,ed_price;
    private Button btn_query,btn_insert,btn_update,btn_delete;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> items =new ArrayList<>();
    private SQLiteDatabase dbrw;

    @Override
    protected void onDestroy(){
        super.onDestroy();
        dbrw.close();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_book=findViewById(R.id.ed_book);
        ed_price=findViewById(R.id.ed_price);
        btn_query=findViewById(R.id.btn_query);
        btn_delete=findViewById(R.id.btn_delete);
        btn_insert=findViewById(R.id.btn_insert);
        btn_update=findViewById(R.id.btn_update);
        listView=findViewById(R.id.listView);

        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items;
        listView.setAdapter(adapter);
        dbrw=new MyDBHelper(this).getWritableDatabase();
        btn_insert.setOnClickListener(view -> {
            if(ed_book.length()<1 || ed_price.length()<1){
                Toast.makeText(MainActivity.this,"欄位請勿留空",Toast.LENGTH_SHORT).show();
            }else{
                try{
                    dbrw.execSQL("INSERT INTO myTable(book,price) values(?,?)",new Object[]{ed_book.getText().toString(),ed_price.getText().toString()});
                    Toast.makeText(MainActivity.this,"成功書名"+ed_book.getText().toString()+"價格"+ed_price.getText().toString(),Toast.LENGTH_SHORT).show();
                    ed_book.setText("");
                    ed_price.setText("");
                }catch(Exception e){
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this,"新增失敗"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}