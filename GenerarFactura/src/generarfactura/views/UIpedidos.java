package generarfactura.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.table.JTableHeader;

public class UIpedidos extends javax.swing.JFrame {
    
    public UIpedidos() {
        initComponents();
        
        //DISEÑO TABLAS:
        JTableHeader encabezado = tabla_pedidos.getTableHeader();
        encabezado.setForeground(new Color(193,39,45));
        encabezado.setBackground(Color.white);
        encabezado.setFont(new Font("Antonio", Font.BOLD, 15));
        
        btncerrar.addActionListener((ActionEvent ae) -> {
            this.dispose(); ;
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        btngenerarfactura = new javax.swing.JButton();
        btnnuevopedido = new javax.swing.JButton();
        tfmontototal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pedidos = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tfcantidad = new javax.swing.JTextField();
        tamanios = new javax.swing.JPanel();
        rbtamanio_8 = new javax.swing.JRadioButton();
        rbtamanio_10 = new javax.swing.JRadioButton();
        rbtamanio_12 = new javax.swing.JRadioButton();
        tipos = new javax.swing.JPanel();
        rbtipo_piedra = new javax.swing.JRadioButton();
        rbtipo_parrilla = new javax.swing.JRadioButton();
        rbtipo_molde = new javax.swing.JRadioButton();
        variedades = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        rbvariedad_napolitana = new javax.swing.JRadioButton();
        rbvariedad_mozarrella = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rbvariedad_fugazatta = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rbvariedad_mozarrella_morron = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbvariedad_especial = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfnombrecliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngenerarfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_generar_factura_off_p.png"))); // NOI18N
        btngenerarfactura.setBorder(null);
        btngenerarfactura.setContentAreaFilled(false);
        btngenerarfactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenerarfactura.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_generar_factura_on_p.png"))); // NOI18N
        btngenerarfactura.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_generar_factura_on_p.png"))); // NOI18N
        btngenerarfactura.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_generar_factura_on_p.png"))); // NOI18N
        getContentPane().add(btngenerarfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 665, -1, -1));

        btnnuevopedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_off_p.png"))); // NOI18N
        btnnuevopedido.setBorder(null);
        btnnuevopedido.setContentAreaFilled(false);
        btnnuevopedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevopedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_on_p.png"))); // NOI18N
        btnnuevopedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_on_p.png"))); // NOI18N
        btnnuevopedido.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_nuevo_pedido_on_p.png"))); // NOI18N
        getContentPane().add(btnnuevopedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 665, -1, -1));

        tfmontototal.setFont(new java.awt.Font("ChunkFive Roman", 0, 26)); // NOI18N
        tfmontototal.setForeground(new java.awt.Color(255, 210, 19));
        tfmontototal.setBorder(null);
        tfmontototal.setOpaque(false);
        getContentPane().add(tfmontototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 100, -1));

        jLabel15.setFont(new java.awt.Font("ChunkFive Roman", 0, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 201, 19));
        jLabel15.setText("MONTO TOTAL:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, -1));

        tabla_pedidos.setFont(new java.awt.Font("Antonio", 0, 13)); // NOI18N
        tabla_pedidos.setForeground(new java.awt.Color(102, 102, 102));
        tabla_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "VARIEDAD", "TIPO", "TAMAÑO", "CANTIDAD", "PRECIO", "SUBTOTAL"
            }
        ));
        tabla_pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_pedidos.setGridColor(new java.awt.Color(102, 102, 102));
        tabla_pedidos.setRowHeight(20);
        tabla_pedidos.setSelectionBackground(new java.awt.Color(255, 201, 19));
        tabla_pedidos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_pedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 670, 110));

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_eliminar_off.png"))); // NOI18N
        btneliminar.setBorder(null);
        btneliminar.setBorderPainted(false);
        btneliminar.setContentAreaFilled(false);
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_eliminar_on.png"))); // NOI18N
        btneliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_eliminar_on.png"))); // NOI18N
        btneliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_eliminar_on.png"))); // NOI18N
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_agregar_off.png"))); // NOI18N
        btnagregar.setBorder(null);
        btnagregar.setBorderPainted(false);
        btnagregar.setContentAreaFilled(false);
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_agregar_on.png"))); // NOI18N
        btnagregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_agregar_on.png"))); // NOI18N
        btnagregar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/btn_agregar_on.png"))); // NOI18N
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cajas");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 416, -1, 20));

        tfcantidad.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        tfcantidad.setForeground(new java.awt.Color(255, 255, 255));
        tfcantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfcantidad.setOpaque(false);
        tfcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfcantidadKeyTyped(evt);
            }
        });
        getContentPane().add(tfcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 40, 30));

        tamanios.setOpaque(false);
        tamanios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup3.add(rbtamanio_8);
        rbtamanio_8.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbtamanio_8.setForeground(new java.awt.Color(255, 255, 255));
        rbtamanio_8.setText("8");
        rbtamanio_8.setBorder(null);
        rbtamanio_8.setContentAreaFilled(false);
        rbtamanio_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtamanio_8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbtamanio_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbtamanio_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtamanio_8.setRequestFocusEnabled(false);
        rbtamanio_8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtamanio_8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        tamanios.add(rbtamanio_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 20));

        buttonGroup3.add(rbtamanio_10);
        rbtamanio_10.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbtamanio_10.setForeground(new java.awt.Color(255, 255, 255));
        rbtamanio_10.setText("10");
        rbtamanio_10.setBorder(null);
        rbtamanio_10.setContentAreaFilled(false);
        rbtamanio_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtamanio_10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbtamanio_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbtamanio_10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtamanio_10.setRequestFocusEnabled(false);
        rbtamanio_10.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtamanio_10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtamanio_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtamanio_10ActionPerformed(evt);
            }
        });
        tamanios.add(rbtamanio_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        buttonGroup3.add(rbtamanio_12);
        rbtamanio_12.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbtamanio_12.setForeground(new java.awt.Color(255, 255, 255));
        rbtamanio_12.setText("12");
        rbtamanio_12.setBorder(null);
        rbtamanio_12.setContentAreaFilled(false);
        rbtamanio_12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtamanio_12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbtamanio_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbtamanio_12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtamanio_12.setRequestFocusEnabled(false);
        rbtamanio_12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtamanio_12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        tamanios.add(rbtamanio_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 10, -1, 20));

        getContentPane().add(tamanios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 290, 40));

        tipos.setOpaque(false);
        tipos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(rbtipo_piedra);
        rbtipo_piedra.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbtipo_piedra.setForeground(new java.awt.Color(255, 255, 255));
        rbtipo_piedra.setText("A LA PIEDRA");
        rbtipo_piedra.setBorder(null);
        rbtipo_piedra.setContentAreaFilled(false);
        rbtipo_piedra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtipo_piedra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbtipo_piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbtipo_piedra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtipo_piedra.setRequestFocusEnabled(false);
        rbtipo_piedra.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtipo_piedra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtipo_piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtipo_piedraActionPerformed(evt);
            }
        });
        tipos.add(rbtipo_piedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 20));

        buttonGroup2.add(rbtipo_parrilla);
        rbtipo_parrilla.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbtipo_parrilla.setForeground(new java.awt.Color(255, 255, 255));
        rbtipo_parrilla.setText("A LA PARRILLA");
        rbtipo_parrilla.setBorder(null);
        rbtipo_parrilla.setContentAreaFilled(false);
        rbtipo_parrilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtipo_parrilla.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbtipo_parrilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbtipo_parrilla.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtipo_parrilla.setRequestFocusEnabled(false);
        rbtipo_parrilla.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtipo_parrilla.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        tipos.add(rbtipo_parrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 20));

        buttonGroup2.add(rbtipo_molde);
        rbtipo_molde.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbtipo_molde.setForeground(new java.awt.Color(255, 255, 255));
        rbtipo_molde.setText("DE MOLDE");
        rbtipo_molde.setBorder(null);
        rbtipo_molde.setContentAreaFilled(false);
        rbtipo_molde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtipo_molde.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbtipo_molde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbtipo_molde.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtipo_molde.setRequestFocusEnabled(false);
        rbtipo_molde.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbtipo_molde.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        tipos.add(rbtipo_molde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 20));

        getContentPane().add(tipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 290, 100));

        variedades.setOpaque(false);
        variedades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Antonio", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salsa, Mozzarella, Tomates en Rodajas, Aceitunas y Orégano");
        variedades.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 183, 320, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        variedades.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, 317, 1));

        buttonGroup1.add(rbvariedad_napolitana);
        rbvariedad_napolitana.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbvariedad_napolitana.setForeground(new java.awt.Color(255, 255, 255));
        rbvariedad_napolitana.setText("NAPOLITANA");
        rbvariedad_napolitana.setBorder(null);
        rbvariedad_napolitana.setContentAreaFilled(false);
        rbvariedad_napolitana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbvariedad_napolitana.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbvariedad_napolitana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbvariedad_napolitana.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_napolitana.setRequestFocusEnabled(false);
        rbvariedad_napolitana.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_napolitana.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        variedades.add(rbvariedad_napolitana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 20));

        buttonGroup1.add(rbvariedad_mozarrella);
        rbvariedad_mozarrella.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbvariedad_mozarrella.setForeground(new java.awt.Color(255, 255, 255));
        rbvariedad_mozarrella.setText("MOZARRELLA");
        rbvariedad_mozarrella.setBorder(null);
        rbvariedad_mozarrella.setContentAreaFilled(false);
        rbvariedad_mozarrella.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbvariedad_mozarrella.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbvariedad_mozarrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbvariedad_mozarrella.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_mozarrella.setRequestFocusEnabled(false);
        rbvariedad_mozarrella.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_mozarrella.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        variedades.add(rbvariedad_mozarrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 20));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        variedades.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, 317, 1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        variedades.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 130, 317, 1));

        jLabel7.setFont(new java.awt.Font("Antonio", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salsa, Mozzarella, Morrones, Aceitunas y Oregano.");
        variedades.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 83, 320, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        variedades.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, 317, 1));

        buttonGroup1.add(rbvariedad_fugazatta);
        rbvariedad_fugazatta.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbvariedad_fugazatta.setForeground(new java.awt.Color(255, 255, 255));
        rbvariedad_fugazatta.setText("FUGAZETTA");
        rbvariedad_fugazatta.setBorder(null);
        rbvariedad_fugazatta.setContentAreaFilled(false);
        rbvariedad_fugazatta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbvariedad_fugazatta.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbvariedad_fugazatta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbvariedad_fugazatta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_fugazatta.setRequestFocusEnabled(false);
        rbvariedad_fugazatta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_fugazatta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        variedades.add(rbvariedad_fugazatta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 20));

        jLabel8.setFont(new java.awt.Font("Antonio", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salsa, Mozzarella, Cebolla, Aceitunas y Oregano.");
        variedades.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 133, 320, -1));

        buttonGroup1.add(rbvariedad_mozarrella_morron);
        rbvariedad_mozarrella_morron.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbvariedad_mozarrella_morron.setForeground(new java.awt.Color(255, 255, 255));
        rbvariedad_mozarrella_morron.setText("MOZARRELLA CON MORRÓN");
        rbvariedad_mozarrella_morron.setBorder(null);
        rbvariedad_mozarrella_morron.setContentAreaFilled(false);
        rbvariedad_mozarrella_morron.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbvariedad_mozarrella_morron.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbvariedad_mozarrella_morron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbvariedad_mozarrella_morron.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_mozarrella_morron.setRequestFocusEnabled(false);
        rbvariedad_mozarrella_morron.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_mozarrella_morron.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        variedades.add(rbvariedad_mozarrella_morron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 20));

        jLabel6.setFont(new java.awt.Font("Antonio", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salsa, Mozzarella, Aceitunas y Oregano");
        variedades.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 33, 320, -1));

        buttonGroup1.add(rbvariedad_especial);
        rbvariedad_especial.setFont(new java.awt.Font("Antonio", 0, 17)); // NOI18N
        rbvariedad_especial.setForeground(new java.awt.Color(255, 255, 255));
        rbvariedad_especial.setText("ESPECIAL");
        rbvariedad_especial.setBorder(null);
        rbvariedad_especial.setContentAreaFilled(false);
        rbvariedad_especial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbvariedad_especial.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rbvariedad_especial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_no.png"))); // NOI18N
        rbvariedad_especial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_especial.setRequestFocusEnabled(false);
        rbvariedad_especial.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        rbvariedad_especial.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_check_si.png"))); // NOI18N
        variedades.add(rbvariedad_especial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, 20));

        jLabel10.setFont(new java.awt.Font("Antonio", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salsa, Mozzarella, Jamon Cocido, Morrones, Aceitunas, y Orégano.");
        variedades.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 233, 320, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        variedades.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 230, 317, 1));

        getContentPane().add(variedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 340, 270));

        jLabel13.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 201, 19));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_cantidad.png"))); // NOI18N
        jLabel13.setText("CANTIDAD");
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 201, 19));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_tamanio.png"))); // NOI18N
        jLabel12.setText("TAMAÑO");
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 201, 19));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_tipo.png"))); // NOI18N
        jLabel11.setText("TIPO DE PIZZA");
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 201, 19));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_variedad.png"))); // NOI18N
        jLabel5.setText("VARIEDAD DE PIZZAS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        tfnombrecliente.setFont(new java.awt.Font("Antonio", 0, 18)); // NOI18N
        tfnombrecliente.setForeground(new java.awt.Color(255, 255, 255));
        tfnombrecliente.setBorder(null);
        tfnombrecliente.setOpaque(false);
        getContentPane().add(tfnombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 105, 140, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_user_p.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 105, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/logo_m.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 97, 165, 1));
        jSeparator1.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Antonio", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/icon_nuevo_pedido_g.png"))); // NOI18N
        jLabel2.setText("PEDIDO ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 60));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_off.png"))); // NOI18N
        btncerrar.setToolTipText("");
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/cerrar_on.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/generarfactura/assets/UIpedidos_bg.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void tfcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfcantidadKeyTyped
        //INGRESAR SÓLO NUMEROS Y TECLA BORRAR.
        char vchar=evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || (vchar== KeyEvent.VK_BACK_SPACE) || (vchar== KeyEvent.VK_DELETE)) evt.consume();        
    }//GEN-LAST:event_tfcantidadKeyTyped

    private void rbtamanio_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtamanio_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtamanio_10ActionPerformed

    private void rbtipo_piedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtipo_piedraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtipo_piedraActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngenerarfactura;
    private javax.swing.JButton btnnuevopedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton rbtamanio_10;
    private javax.swing.JRadioButton rbtamanio_12;
    private javax.swing.JRadioButton rbtamanio_8;
    private javax.swing.JRadioButton rbtipo_molde;
    private javax.swing.JRadioButton rbtipo_parrilla;
    private javax.swing.JRadioButton rbtipo_piedra;
    private javax.swing.JRadioButton rbvariedad_especial;
    private javax.swing.JRadioButton rbvariedad_fugazatta;
    private javax.swing.JRadioButton rbvariedad_mozarrella;
    private javax.swing.JRadioButton rbvariedad_mozarrella_morron;
    private javax.swing.JRadioButton rbvariedad_napolitana;
    private javax.swing.JTable tabla_pedidos;
    private javax.swing.JPanel tamanios;
    private javax.swing.JTextField tfcantidad;
    private javax.swing.JTextField tfmontototal;
    private javax.swing.JTextField tfnombrecliente;
    private javax.swing.JPanel tipos;
    private javax.swing.JPanel variedades;
    // End of variables declaration//GEN-END:variables
}
