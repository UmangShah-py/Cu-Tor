package com.umangshah.opencvtry1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SolveCubeActivity extends AppCompatActivity {
    int Cube[][];
    int faceid;

    TextView face0,face1,face2,face3,face4,face5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_cube);
        Bundle extras = getIntent().getExtras();
        faceid=extras.getInt("faceid");
        Object[] objectArray = (Object[]) getIntent().getExtras().getSerializable("Cube");
        Cube = new int[objectArray.length][];
        for(int j=0;j<6;j++)
        {
            Cube[j]=(int[])objectArray[j];
        }
            face0=(TextView)findViewById(R.id.face0);
            String str=new String();
            str="";
            for(int j=0;j<9;j++)
            {
                str+=getColorName(Cube[0][j])+" ";
                if(j%3==2);
                    str+="\n";

            }
            face0.setText(str);
        face1=(TextView)findViewById(R.id.face1);
        str="";
        for(int j=0;j<9;j++)
        {
            str+=getColorName(Cube[1][j])+" ";
            if(j%3==2);
            str+="\n";

        }
        face1.setText(str);
        face2=(TextView)findViewById(R.id.face2);
        str="";
        for(int j=0;j<9;j++)
        {
            str+=getColorName(Cube[2][j])+" ";
            if(j%3==2);
            str+="\n";

        }
        face2.setText(str);
        face3=(TextView)findViewById(R.id.face3);
        str="";
        for(int j=0;j<9;j++)
        {
            str+=getColorName(Cube[3][j])+" ";
            if(j%3==2);
            str+="\n";

        }
        face3.setText(str);
        face4=(TextView)findViewById(R.id.face4);
        str="";
        for(int j=0;j<9;j++)
        {
            str+=getColorName(Cube[4][j])+" ";
            if(j%3==2);
            str+="\n";

        }
        face4.setText(str);
        face5=(TextView)findViewById(R.id.face5);
        str="";
        for(int j=0;j<9;j++)
        {
            str+=getColorName(Cube[5][j])+" ";
            if(j%3==2);
            str+="\n";

        }
        face5.setText(str);
    }
    public String  getColorName(int i)
    {
        if(i==1)
            return "Green";
        if (i==2)
            return "White";
        if (i==3)
            return "Blue";
        if (i==4)
            return "Yellow";
        if(i==5)
            return "Orange";
        if(i==6)
            return "Red";
        else
            return "Unidentified";
    }


}
