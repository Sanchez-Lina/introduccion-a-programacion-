// p1: lineas de comentarios de autor, fecha y descripcion.
//AUTHORS: Andres Felipe Torres lopez & Lina Sanchez ROmero.
//DATE: 01/12/2020.
//DESCRIPTION: Este Software nos muestra por medio de una ventana emergente, un formulario que nos muestra el control
//............ del transporte urbano de una ciudad. Se da a conocer la infomacion  conductor del vehiculo
// ...........(identificación, nombres, licencia, etc) y la informacion del  vehivulo que prestara el servicio
// ...........(placa, fecha de la matricula, numero de puestos y el propietario).

// p2: importar las librerias requeridas.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class formulario_principal extends JFrame {

    public formulario_principal() {
        setLayout(new BorderLayout());
        // panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("MENU PRINCIPAL");
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        //panel inferior
        JPanel panel_inferior = new JPanel();
        JLabel label_creado = new JLabel("Creado por: Lina Sanchez & Andres Torres");
        label_creado.setFont(new Font("Arial", 0, 15));
        panel_inferior.add(label_creado);
        // panel izquierdo
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3, 1));
        // boton conductores
        JButton boton_conductores = new JButton("Conductores");
        boton_conductores.setBounds(300, 150, 100, 40);
        boton_conductores.addActionListener(new boton_conductores_click());
        // boton vehiculo
        JButton boton_vehiculos = new JButton("Vehiculos");
        boton_vehiculos.setBounds(300,200 , 100, 40);
        boton_vehiculos.addActionListener(new boton_vehiculos_click());
        // boton acerca de
        JButton boton_AcercaDe = new JButton("Acerca de");
        boton_AcercaDe.setBounds(300, 250, 100, 40);
        boton_AcercaDe.addActionListener(new boton_AcercaDe_click());

        panel_izquierdo.add(boton_conductores);
        panel_izquierdo.add(boton_vehiculos);
        panel_izquierdo.add(boton_AcercaDe);

        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.CENTER);
        add(panel_inferior, BorderLayout.SOUTH);

        setTitle("Menu principal");
        setVisible(true);
        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
class boton_conductores_click implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        formulario_conductor from_conductor = new formulario_conductor();
    }
}
class boton_vehiculos_click implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        formulario_vehiculo form_vehiculo = new formulario_vehiculo();
    }
}
class boton_AcercaDe_click implements ActionListener {
    public void actionPerformed(ActionEvent a) {
        formulario_AcercaDe form_AcercaDe = new formulario_AcercaDe();
    }
}



