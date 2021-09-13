package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
public class MainActivity3 extends AppCompatActivity {
    Spinner spinner1, spinner2;
    EditText et_shuru, et_shuchu;
    Button btn_CE, btn_js;
    Button btn_tr;
    Button tran;
    int ids[] = {R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4, R.id.btn_5, R.id.btn_6, R.id.btn_7,
            R.id.btn_8, R.id.btn_9};

    String temp = null;
    double num1;
    double num2;
    double num3;
    double num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn_CE = findViewById(R.id.btn_CE);
        btn_js = findViewById(R.id.btn_js);
        btn_tr = findViewById(R.id.btn_tr);
        btn_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_shuru.setText("");
                et_shuchu.setText("");
            }
        });
        tran = findViewById(R.id.trans);
        tran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        for (int i = 0; i < ids.length; i++) {
            Button btn = findViewById(ids[i]);

            if (btn != null)
                btn.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("NonConstantResourceId")
                    @Override
                    public void onClick(View v) {
                        switch (v.getId()) {
                            case R.id.btn_0:
                                et_shuru.setText(et_shuru.getText() + "0");
                                break;
                            case R.id.btn_1:
                                et_shuru.setText(et_shuru.getText() + "1");
                                break;
                            case R.id.btn_2:
                                et_shuru.setText(et_shuru.getText() + "2");
                                break;
                            case R.id.btn_3:
                                et_shuru.setText(et_shuru.getText() + "3");
                                break;
                            case R.id.btn_4:
                                et_shuru.setText(et_shuru.getText() + "4");
                                break;
                            case R.id.btn_5:
                                et_shuru.setText(et_shuru.getText() + "5");
                                break;
                            case R.id.btn_6:
                                et_shuru.setText(et_shuru.getText() + "6");
                                break;
                            case R.id.btn_7:
                                et_shuru.setText(et_shuru.getText() + "7");
                                break;
                            case R.id.btn_8:
                                et_shuru.setText(et_shuru.getText() + "8");
                                break;
                            case R.id.btn_9:
                                et_shuru.setText(et_shuru.getText() + "9");
                                break;
                        }
                    }
                });
        }
        et_shuru = findViewById(R.id.et_shuru);
        et_shuchu = findViewById(R.id.et_shuchu);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        //建立数据源
        String[] mltems3 = getResources().getStringArray(R.array.danwei3);
        String[] mltems2 = getResources().getStringArray(R.array.danwei2);
        String[] mltems1 = getResources().getStringArray(R.array.danwei1);
        String[] mltems = getResources().getStringArray(R.array.danwei);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mltems);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mltems1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mltems2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mltems3);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //绑定Adapter到控件
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int pos, long id) {
                switch (pos) {
                    case 0:
                        btn_tr.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                spinner2.setAdapter(adapter);
                                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, final int pos, long id) {
                                        switch (pos) {
                                            case 0:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num1 = Double.parseDouble(temp.toString());
                                                        et_shuchu.setText(num1 + "");
                                                    }
                                                });
                                                break;
                                            case 1:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num2 = Double.parseDouble(temp.toString());
                                                        num2 *= 10;
                                                        et_shuchu.setText(num2 + "");
                                                    }
                                                });
                                                break;
                                            case 2:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num3 = Double.parseDouble(temp.toString());
                                                        num3 *= 100;
                                                        et_shuchu.setText(num3 + "");
                                                    }
                                                });
                                                break;
                                            case 3:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num4 = Double.parseDouble(temp.toString());
                                                        num4 *= 1000;
                                                        et_shuchu.setText(num4 + "");
                                                    }
                                                });
                                                break;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {
                                    }
                                });
                            }
                        });
                        break;
                    case 1:
                        btn_tr.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                spinner2.setAdapter(adapter2);
                                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, final int pos, long id) {
                                        switch (pos) {
                                            case 0:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num1 = Double.parseDouble(temp.toString());
                                                        et_shuchu.setText(num1 + "");
                                                    }
                                                });
                                                break;
                                            case 1:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num2 = Double.parseDouble(temp.toString());
                                                        num2 = num2 / 1000000;
                                                        et_shuchu.setText(num2 + "");
                                                    }
                                                });
                                                break;
                                            case 2:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num3 = Double.parseDouble(temp.toString());
                                                        num3 *= 1000000;
                                                        et_shuchu.setText(num3 + "");
                                                    }
                                                });
                                                break;

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {
                                    }
                                });
                            }
                        });
                        break;
                    case 2:
                        btn_tr.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                spinner2.setAdapter(adapter3);
                                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, final int pos, long id) {
                                        switch (pos) {
                                            case 0:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num1 = Double.parseDouble(temp.toString());
                                                        et_shuchu.setText(num1 + "");
                                                    }
                                                });
                                                break;
                                            case 1:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num2 = Double.parseDouble(temp.toString());
                                                        num2 = num2/60;
                                                        et_shuchu.setText(num2 + "");
                                                    }
                                                });
                                                break;
                                            case 2:
                                                btn_js.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        temp = et_shuru.getText().toString();
                                                        num3 = Double.parseDouble(temp.toString());
                                                        num3 =num3/3600;
                                                        et_shuchu.setText(num3 + "");
                                                    }
                                                });
                                                break;

                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {
                                    }
                                });
                            }
                        });
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

}