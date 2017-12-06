package com.example.udenar.pruebasowasp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pruebas extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    public TextView tv1;
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas);
        tv1 = (TextView)findViewById(R.id.lblListItem);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }
    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Pruebas para gestionar la configuración y la implementación");
        listDataHeader.add("Pruebas de Administración de Identidad");
        listDataHeader.add("Pruebas de autenticación");
        listDataHeader.add("Pruebas de autorización");
        listDataHeader.add("Pruebas de administración de sesión");
        listDataHeader.add("Pruebas de administración de entradas");
        listDataHeader.add("Pruebas de manejo de errores");
        listDataHeader.add("Pruebas para Critografía débil");
        listDataHeader.add("Prueba de la lógica del negocio");
        listDataHeader.add("Pruebas en el lado del cliente");

//PPRUEBAS PARA GESTIONAR LA CONFIGURACION E IMPLEMENTACION
        List<String> L1 = new ArrayList<>();
        L1.add("OWASP: WebScarab");
        L1.add("Burp Suite");
        L1.add("cat");
        L1.add("NetLoony");


//PRUEBAS DE ADMINISTRACION DE IDENTIDAD
        List<String> L2 = new ArrayList<>();
        L2.add("Prueba de definición de roles");
        L2.add("Prueba proceso de registro de usuarios");
        L2.add("Prueba proceso de provisión de cuentas");
        L2.add("Pruebas para ennumeración de cuentas y adivinanza de cuentas de usuario");
        L2.add("Pruebas politica de nombre de usuarios debiles o sin fuerza");

        //PRUEBAS DE AUTENTICACION
        List<String> L3 = new ArrayList<>();
        L3.add("Pruebas para credenciales transportadas sobre canales encriptados");
        L3.add("Pruebas credenciales por defecto");
        L3.add("Pruebas para mecanismos de seguridad débiles");
        L3.add("Pruebas para eludir el esquema de autenticación");
        L3.add("Prueba funcionalidad recordatorio de clave");
        L3.add("Prueba para debilidades en la memoria del navegador\n");
        L3.add("Prueba para politica de clave débil");
        L3.add("Prueba para seguirdad pregunta/respuest débil");
        L3.add("Prueba para cambios de clave débil o funcionalidades de reinio");
        L3.add("Prueba para autenticación débil en canal alternativo");

//PRUEBAS DE AUTORIZACION
        List<String> L4 = new ArrayList<>();
        L4.add("Prueba de inclusión archivos de directorio de circulación");
        L4.add("Prueba para evadir el esquema de autorización");
        L4.add("Prueba de fijación de sesión");
        L4.add("Prueba para escalación de privilegios");
        L4.add("Prueba de la referencia de objetos directos inseguros");




        List<String> L5 = new ArrayList<>();
        L5.add("Prueba para evadir el esquema de administración de sesión");
        L5.add("Prueba para atributos de cookies");
        L5.add("Prueba de fijación de sesión");
        L5.add("Prueba de exposición de variables de sesión");
        L5.add("Prueba para falsificación de petición de sitio cruzado");
        L5.add("Pruebas funcionalidad cierre de sesión");
        L5.add("Pruebas del tiempo cierre de sesión");
        L5.add("Prueba para sobrecarga de variables");

        List<String> L6 = new ArrayList<>();
        L6.add("Pruebas para la reflexión de Cross Site scripting");
        L6.add("Pruebas de Cross Site Scripting almacenados");
        L6.add("Pruebas de manipulación de verbos en HTTP");
        L6.add("Pruebas de contaminación de parámetros HTTP");
        L6.add("Pruebas de Inyecciones de SQL");
        L6.add("Pruebas en Oracle");
        L6.add("Pruebas de MySQL");
        L6.add("Pruebas del servidor SQL");
        L6.add("Probar la seguridad del proyecto de acceso restringido PostgresSQL");
        L6.add("Pruebas para MS Access");
        L6.add("Pruebas de inyección NoSQL");
        L6.add("Pruebas de inyección LDAP");
        L6.add("Pruebas de inyección de ORM");
        L6.add("Pruebas de inyección de XML");
        L6.add("Pruebas de inyección SSI ");
        L6.add("Pruebas de inyección XPath");
        L6.add("Pruebas de inyección de IMAP/SMTP");
        L6.add("Pruebas para la inclusión remota de archivos");
        L6.add("Pruebas de saturación de Heap");
        L6.add("Probar la saturación de pila de datos");
        L6.add("Pruebas para la cadena de formato");
        L6.add("Pruebas de las vulnerabilidades incubadas");

        List<String> L7 = new ArrayList<>();
        L7.add("Pruebas para la reflexión de Cross Site scripting");
        L7.add("Pruebas de Cross Site Scripting almacenados");
        L7.add("Pruebas de manipulación de verbos en HTTP");
        L7.add("Pruebas de contaminación de parámetros HTTP");
        L7.add("Pruebas de Inyecciones de SQL");
        L7.add("Pruebas en Oracle");
        L7.add("Pruebas de MySQL");
        L7.add("Pruebas del servidor SQL");
        L7.add("Probar la seguridad del proyecto de acceso restringido PostgresSQL");
        L7.add("Pruebas para MS Access");
        L7.add("Pruebas de inyección NoSQL");
        L7.add("Pruebas de inyección LDAP");
        L7.add("Pruebas de inyección de ORM");
        L7.add("Pruebas de inyección de XML");
        L7.add("Pruebas de inyección SSI ");
        L7.add("Pruebas de inyección XPath");
        L7.add("Pruebas de inyección de IMAP/SMTP");
        L7.add("Pruebas para la inclusión remota de archivos");
        L7.add("Pruebas de saturación de Heap");
        L7.add("Probar la saturación de pila de datos");
        L7.add("Pruebas para la cadena de formato");
        L7.add("Pruebas de las vulnerabilidades incubadas");


        List<String> L8 = new ArrayList<>();
        L8.add("Pruebas de codificadores SSL/TLS débiles, pritección de trasnporte de capas insuficiente");
        L8.add("Prueba del Padding Oracle");
        L8.add("Pruebas para el envío de información sensible por canales sin encriptar");

        List<String> L9 = new ArrayList<>();
        L9.add("Pruebas de la validación de datos de la lógica del negocio");
        L9.add("Prueba de la habilidad para manipular consultas");
        L9.add("Prueba de comprobación de integridad");
        L9.add("Pruebas del tiempo de procesamiento\n");
        L9.add("Prueba del número de veces que limita el uso de una función");
        L9.add("Pruebas para la evasión de los flujos de trabajo ");
        L9.add("Prueba de las defensas contra el mal uso de la aplicación");
        L9.add("Prueba de la posibilidad de carga de tipos de archivos inesperados");
        L9.add("Prueba de la posibilidad de carga de archivos maliciosos");

        List<String> L11 = new ArrayList<>();
        L11.add("Prueba del Cross Site Scripting basado en DOM");
        L11.add("Prueba de la ejecución de JavaScript");
        L11.add("Prueba de inyección de HTML");
        L11.add("Pruebas de redireccionamiento de la URL del lado del cliente");
        L11.add("Pruebas de inyección de CSS ");
        L11.add("Pruebas de la manipulación de recursos del lado del cliente");
        L11.add("Pruebas para el Intercambio de recursos de origen cruzado");
        L11.add("Pruebas de Cross Site Flashing");
        L11.add("Pruebas de Clickjacking");
        L11.add("Pruebas de WebSockets");
        L11.add("Prueba de mensajería web");
        L11.add("Prueba de Almacenamiento Local");


        listHash.put(listDataHeader.get(0),L1);
        listHash.put(listDataHeader.get(1),L2);
        listHash.put(listDataHeader.get(2),L3);
        listHash.put(listDataHeader.get(3),L4);
        listHash.put(listDataHeader.get(4),L5);
        listHash.put(listDataHeader.get(5),L6);
        listHash.put(listDataHeader.get(6),L7);
        listHash.put(listDataHeader.get(7),L8);
        listHash.put(listDataHeader.get(8),L9);
        listHash.put(listDataHeader.get(9),L11);
    }
}
