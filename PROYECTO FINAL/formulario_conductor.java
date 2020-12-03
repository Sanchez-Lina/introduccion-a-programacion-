// p1: lineas de comentarios de autor, fecha y descripcion.
//AUTHORS: Andres Felipe Torres lopez & Lina Sanchez ROmero.
//DATE: 01/12/2020.
//DESCRIPTION: Este Software nos muestra por medio de una ventana emergente, un formulario que nos muestra el control
// ...........de datos  del transporte urbano de una ciudad. Se da a conocer la infomacion  conductor del vehiculo
// ...........(identificación, nombres, licencia, etc) y la informacion del  vehivulo que prestara el servicio
// ...........(placa, fecha de la matricula, numero de puestos y el propietario).

import javax.swing.*;
import java.awt.*;

public class formulario_conductor extends JFrame{

    public  formulario_conductor(){
        // panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_conductor = new JLabel("Conductor");
        label_conductor.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_conductor);

        JLabel l_titulo = new JLabel("INFORMACIÓN DEL CONDUCTOR");
        l_titulo.setBounds(200,40,500,20);

        JLabel l_identificacion = new JLabel("Identificación");
        l_identificacion.setBounds(70,100,300,20);

        JLabel l_nombre = new JLabel("Nombre Completo");
        l_nombre.setBounds(70,150,300,20);

        JLabel l_licencia= new JLabel("Licencia de Conducción");
        l_licencia.setBounds(70,200,300,20);

        JLabel l_fechaN = new JLabel("Fecha de Nacimiento");
        l_fechaN.setBounds(70,250,300,20);

        JTextField t_identificacion = new JFormattedTextField("identificacion");
        t_identificacion.setBounds(330, 100, 200, 20);

        JTextField t_nombre = new JFormattedTextField("nombre");
        t_nombre.setBounds(330, 150, 200, 20);

        JTextField t_licencia = new JFormattedTextField("licencia");
        t_licencia.setBounds(330, 200, 200, 20);

        JTextField t_fecha = new JFormattedTextField("dd/mm/aa");
        t_fecha.setBounds(330, 250, 200, 20);

        JButton boton_guardar = new JButton("Guardar");
        boton_guardar.setBounds(230,300,100,40);
        boton_guardar.addActionListener(new botton_click());


        add(l_titulo);
        add(l_identificacion);
        add(l_nombre);
        add(l_licencia);
        add(l_fechaN);

        add(t_identificacion);
        add(t_nombre);
        add(t_licencia);
        add(t_fecha);

        add(boton_guardar);

        setTitle("conductores");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
}
