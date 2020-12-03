
// p1: lineas de comentarios de autor, fecha y descripcion.
//AUTHORS: Andres Felipe Torres lopez & Lina Sanchez ROmero.
//DATE: 01/12/2020.
//DESCRIPTION: Este Software nos muestra por medio de una ventana emergente, un formulario que nos muestra el control
// ...........de datos  del transporte urbano de una ciudad. Se da a conocer la infomacion  conductor del vehiculo
// ...........(identificación, nombres, licencia, etc) y la informacion del  vehivulo que prestara el servicio
// ...........(placa, fecha de la matricula, numero de puestos y el propietario).

import javax.swing.*;
import java.awt.*;

public class formulario_vehiculo extends JFrame {

    public formulario_vehiculo(){
        // panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_vehiculo = new JLabel("Vehículo");
        label_vehiculo.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_vehiculo);

        JLabel l_titulo = new JLabel("INFORMACIÓN DEL VEHICULO");
        l_titulo.setBounds(200,40,500,20);

        JLabel l_placa = new JLabel("Placa del Vehiculo");
        l_placa.setBounds(70,100,300,20);

        JLabel l_fechaM = new JLabel("Fecha de la Matricula");
        l_fechaM.setBounds(70,150,300,20);

        JLabel l_puestos = new JLabel("Cantidad de Puestos");
        l_puestos.setBounds(70,200,300,20);

        JLabel l_propietario = new JLabel("Propietario");
        l_propietario.setBounds(70,250,300,20);

        JTextField t_placa = new JFormattedTextField("placa");
        t_placa.setBounds(330, 100, 200, 20);

        JTextField t_matricula = new JFormattedTextField("matricula");
        t_matricula.setBounds(330, 150, 200, 20);

        JTextField t_puestos = new JFormattedTextField("puestos");
        t_puestos.setBounds(330, 200, 200, 20);

        JTextField t_propietario = new JFormattedTextField("propietario");
        t_propietario.setBounds(330, 250, 200, 20);

        JButton b_detalle = new JButton(" Ver Detalle");
        b_detalle.setBounds(100,300,100,40);
        b_detalle.addActionListener(new botton_click());

        JButton b_imprimir=new JButton("Imprimir");
        b_imprimir.setBounds(250,300,100,40);
        b_imprimir.addActionListener(new botton_click());

        JButton boton_guardar = new JButton("Guardar");
        boton_guardar.setBounds(400,300,100,40);
        boton_guardar.addActionListener(new botton_click());

        add(l_titulo);
        add(l_placa);
        add(l_fechaM);
        add(l_puestos);
        add(l_propietario);

        add(t_placa);
        add(t_matricula);
        add(t_puestos);
        add(t_propietario);

        add(b_detalle);
        add(b_imprimir);
        add(boton_guardar);

        setTitle("Vehiculos");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);





    }
}
