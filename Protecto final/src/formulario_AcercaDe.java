// p1: lineas de comentarios de autor, fecha y descripcion.
//AUTHORS: Andres Felipe Torres lopez & Lina Sanchez ROmero.
//DATE: 01/12/2020.
//DESCRIPTION: Este Software nos muestra por medio de una ventana emergente, un formulario que nos muestra el control
//............ de datos del transporte urbano de una ciudad. Se da a conocer la infomacion  conductor del vehiculo
// ...........(identificación, nombres, licencia, etc) y la informacion del  vehivulo que prestara el servicio
// ...........(placa, fecha de la matricula, numero de puestos y el propietario).

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario_AcercaDe extends JFrame {
    public formulario_AcercaDe(){
        JLabel l_titulo = new JLabel("ACERCA DE....");
        l_titulo.setBounds(250,30,500,20);

        JLabel l_desarrolador = new JLabel("DESARROLLADOR: Lina Sanchez Romero");
        l_desarrolador.setBounds(20,100, 400, 20);

        JLabel l_facultad = new JLabel("FACULTAD: ingenieria mecánica");
        l_facultad.setBounds(20,150,300,20);

        JLabel l_correo= new JLabel("CORREO: lina.sanchezr@usantoto.edu.co");
        l_correo.setBounds(20,200,300,20);

        JLabel l_github= new JLabel("GitHub: https://github.com/Sanchez-Lina");
        l_github.setBounds(20,250,300,20);

        JLabel l_desarrolador2 = new JLabel("DESARROLLADOR: Andres Felipe Torres Lopez");
        l_desarrolador2.setBounds(300,100, 400, 20);

        JLabel l_facultad2 = new JLabel("FACULTAD: ingenieria mecánica");
        l_facultad2.setBounds(300,150,300,20);

        JLabel l_correo2= new JLabel("CORREO: andres.torresl");
        l_correo2.setBounds(300,200,300,20);

        JLabel l_github2= new JLabel("GitHub: https://github.com/Andre5127");
        l_github2.setBounds(300,250,300,20);

        add(l_titulo);
        add(l_desarrolador);
        add(l_facultad);
        add(l_correo);
        add(l_github);

        add(l_desarrolador2);
        add(l_facultad2);
        add(l_correo2);
        add(l_github2);

        setTitle("ACERCA DE...");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}


