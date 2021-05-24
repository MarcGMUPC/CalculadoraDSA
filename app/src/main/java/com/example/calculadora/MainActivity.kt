package com.example.calculadora

import android.R
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /*Aquí declaramos la variables*/
    var button0: Button? = null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var button5: Button? = null
    var button6: Button? = null
    var button7: Button? = null
    var button8: Button? = null
    var button9: Button? = null
    var buttonSuma: Button? = null
    var buttonRes: Button? = null
    var buttonDiv: Button? = null
    var buttonMul: Button? = null
    var button10: Button? = null
    var buttonC: Button? = null
    var buttonigual: Button? = null
    var etResultado: EditText? = null
    var mValueOne = 0f
    var mValueTwo = 0f
    var opSuma = false
    var mSubtract = false
    var opMul = false
    var opDiv = false


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Aquí hacemos que al pulsar los botones el valor cambie en las variables*/
        button0 = findViewById<View>(R.id.boton0) as Button
        button1 = findViewById<View>(R.id.button1) as Button
        button2 = findViewById<View>(R.id.button2) as Button
        button3 = findViewById<View>(R.id.button3) as Button
        button4 = findViewById<View>(R.id.button4) as Button
        button5 = findViewById<View>(R.id.button5) as Button
        button6 = findViewById<View>(R.id.button6) as Button
        button7 = findViewById<View>(R.id.button7) as Button
        button8 = findViewById<View>(R.id.button8) as Button
        button9 = findViewById<View>(R.id.button9) as Button
        button10 = findViewById<View>(R.id.button10) as Button
        buttonSuma = findViewById<View>(R.id.buttonadd) as Button
        buttonRes = findViewById<View>(R.id.buttonsub) as Button
        buttonMul = findViewById<View>(R.id.buttonmul) as Button
        buttonDiv = findViewById<View>(R.id.buttondiv) as Button
        buttonC = findViewById<View>(R.id.buttonC) as Button
        buttonigual = findViewById<View>(R.id.buttoneql) as Button
        etResultado = findViewById<View>(R.id.etResultado) as EditText

        /*Aquí se añaden los números en el EditText del Resultado*/
        button1!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "1") }
        button2!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "2") }
        button3!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "3") }
        button4!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "4") }
        button5!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "5") }
        button6!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "6") }
        button7!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "7") }
        button8!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "8") }
        button9!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "9") }
        button0!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + "0") }
        buttonSuma!!.setOnClickListener {
            if (etResultado == null) {
                etResultado!!.setText("")
            } else {
                mValueOne = (etResultado!!.text.toString() + "").toFloat()
                opSuma = true
                etResultado.setText(null)
            }
        }

        /*Aquí se hace la operación de suma */
        buttonRes!!.setOnClickListener {
            mValueOne = (etResultado!!.text.toString() + "").toFloat()
            mSubtract = true
            etResultado.setText(null)
        }

        /*Aquí se hace la operación de multiplicacion*/
        buttonMul!!.setOnClickListener {
            mValueOne = (etResultado!!.text.toString() + "").toFloat()
            opMul = true
            etResultado.setText(null)
        }

        /*Aquí se hace la operación de división*/
        buttonDiv!!.setOnClickListener {
            mValueOne = (etResultado!!.text.toString() + "").toFloat()
            opDiv = true
            etResultado.setText(null)
        }

        /*Aquí se obtiene el resultado de las operaciones */
        buttonigual!!.setOnClickListener {
            mValueTwo = (etResultado!!.text.toString() + "").toFloat()
            if (opSuma) {
                etResultado.setText(mValueOne + mValueTwo + "")
                opSuma = false
            }
            if (mSubtract) {
                etResultado.setText(mValueOne - mValueTwo.toString() + "")
                mSubtract = false
            }
            if (opMul) {
                etResultado.setText(mValueOne * mValueTwo.toString() + "")
                opMul = false
            }
            if (opDiv == true) {
                etResultado.setText(mValueOne / mValueTwo.toString() + "")
                opDiv = false
            }
        }

        /*Aquí se elimina lo que haya escrito*/
        buttonC!!.setOnClickListener { etResultado!!.setText("") }

        /*Aquí se añaden decimales en caso de ser necesario*/
        button10!!.setOnClickListener { etResultado!!.setText(etResultado!!.text.toString() + ".") }
    }
}