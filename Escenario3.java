import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.util.Random;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Escenario3 extends JPanel implements ActionListener, KeyListener {
    private ImageIcon icono;
    private Image fondo;
    private Timer t;
    private Random r;
    private JFrame frame;
    private Personaje mario;
    private Estructura[] plataformas;
    private Escalera[] escaleras;

    public Escenario3(JFrame jfp) {
        icono = new ImageIcon("imagenes/fondo.png");
        fondo = icono.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
        mario = new Personaje(100, 500, "imagenes/marios1.png");
        this.setSize(1200, 700);
        this.setVisible(true);
        this.frame = jfp;
        plataformas = new Estructura[65];
        escaleras = new Escalera[15];
       
        plataformas[0] = new Estructura(65, 680, "imagenes/plataformade34.png");
        plataformas[1] = new Estructura(125, 678, "imagenes/plataformade34.png");
        plataformas[2] = new Estructura(185, 676, "imagenes/plataformade34.png");
        plataformas[3] = new Estructura(245, 674, "imagenes/plataformade34.png");
        plataformas[4] = new Estructura(305, 672, "imagenes/plataformade34.png");
        plataformas[5] = new Estructura(365, 670, "imagenes/plataformade34.png");
        plataformas[6] = new Estructura(425, 668, "imagenes/plataformade34.png");
        plataformas[7] = new Estructura(485, 666, "imagenes/plataformade34.png");
        plataformas[8] = new Estructura(545, 664, "imagenes/plataformade34.png");
        plataformas[9] = new Estructura(605, 662, "imagenes/plataformade34.png");
        plataformas[10] = new Estructura(665, 660, "imagenes/plataformade34.png");
        plataformas[11] = new Estructura(725, 658, "imagenes/plataformade34.png");
        plataformas[12] = new Estructura(785, 656, "imagenes/plataformade34.png");
        plataformas[13] = new Estructura(845, 654, "imagenes/plataformade34.png");
        plataformas[14] = new Estructura(905, 654, "imagenes/plataformade34.png");
        plataformas[15] = new Estructura(965, 654, "imagenes/plataformade34.png");
        plataformas[16] = new Estructura(1025, 654, "imagenes/plataformade34.png");
        // Plataformas dsos
        plataformas[17] = new Estructura(905, 500, "imagenes/plataformade34.png");
        plataformas[18] = new Estructura(845, 500, "imagenes/plataformade34.png");
        plataformas[19] = new Estructura(785, 500, "imagenes/plataformade34.png");
        plataformas[20] = new Estructura(725, 499, "imagenes/plataformade34.png");
        plataformas[21] = new Estructura(665, 498, "imagenes/plataformade34.png");
        plataformas[22] = new Estructura(605, 497, "imagenes/plataformade34.png");
        plataformas[23] = new Estructura(545, 496, "imagenes/plataformade34.png");
        plataformas[24] = new Estructura(485, 495, "imagenes/plataformade34.png");
        plataformas[25] = new Estructura(425, 494, "imagenes/plataformade34.png");
        plataformas[26] = new Estructura(365, 493 ,"imagenes/plataformade34.png");
        plataformas[27] = new Estructura(305, 492, "imagenes/plataformade34.png");
        plataformas[28] = new Estructura(245, 491, "imagenes/plataformade34.png");
        plataformas[29] = new Estructura(185, 490, "imagenes/plataformade34.png");
        plataformas[30] = new Estructura(125, 489, "imagenes/plataformade34.png");
        plataformas[31] = new Estructura(65, 488, "imagenes/plataformade34.png");
        plataformas[32] = new Estructura(5, 487, "imagenes/plataformade34.png");

        // plataforma tres
        plataformas[33] = new Estructura(50, 327, "imagenes/plataformade34.png");
        plataformas[34] = new Estructura(110, 326, "imagenes/plataformade34.png");
        plataformas[35] = new Estructura(170, 325, "imagenes/plataformade34.png");
        plataformas[36] = new Estructura(230, 324, "imagenes/plataformade34.png");
        plataformas[37] = new Estructura(290, 323, "imagenes/plataformade34.png");
        plataformas[38] = new Estructura(350, 322, "imagenes/plataformade34.png");
        plataformas[39] = new Estructura(410, 321, "imagenes/plataformade34.png");        
        plataformas[40] = new Estructura(470, 320, "imagenes/plataformade34.png");
        plataformas[41] = new Estructura(530, 319, "imagenes/plataformade34.png");
        plataformas[42] = new Estructura(590, 318, "imagenes/plataformade34.png");    
        plataformas[43] = new Estructura(650, 318, "imagenes/plataformade34.png");
        plataformas[44] = new Estructura(710, 318, "imagenes/plataformade34.png");
        plataformas[45] = new Estructura(770, 318, "imagenes/plataformade34.png");
        plataformas[46] = new Estructura(830, 318, "imagenes/plataformade34.png");
        plataformas[47] = new Estructura(890, 318, "imagenes/plataformade34.png");        
        plataformas[48] = new Estructura(950, 318, "imagenes/plataformade34.png");
        plataformas[49] = new Estructura(1010, 318, "imagenes/plataformade34.png");
        plataformas[59] = new Estructura( 1070, 318, "imagenes/plataformade34.png");
        plataformas[60] = new Estructura( 1090, 318, "imagenes/plataformade34.png");
        // plataforma 4
        plataformas[50] = new Estructura( 460, 158, "imagenes/plataformade34.png");
        plataformas[51] = new Estructura( 520, 158, "imagenes/plataformade34.png");
        plataformas[52] = new Estructura( 580, 158, "imagenes/plataformade34.png");
        plataformas[53] = new Estructura( 640, 158, "imagenes/plataformade34.png");
        plataformas[54] = new Estructura( 700, 158, "imagenes/plataformade34.png");
       
        plataformas[56] = new Estructura( 485, 97, "imagenes/princesa.png");
        plataformas[57] = new Estructura(1080, 250, "imagenes/bariles.png");
        plataformas[58] = new Estructura(995, 220, "imagenes/Mono.png");
        // escaleras
        escaleras[0] = new Escalera(930, 500, "imagenes/Escalera1.png");
        escaleras[1] = new Escalera(65, 335, "imagenes/Escalera1.png");
        escaleras[2] = new Escalera(460, 167, "imagenes/Escalera1.png");
        escaleras[3] = new Escalera(760, 162, "imagenes/Escalera1.png");
        escaleras[4] = new Escalera(830, 162, "imagenes/Escalera1.png");
        escaleras[5] = new Escalera(760, 10, "imagenes/Escalera1.png");
        escaleras[6] = new Escalera(830, 10, "imagenes/Escalera1.png");
        escaleras[7] = new Escalera(400, 360, "imagenes/Escalera2.png");
      
        escaleras[9] = new Escalera(530, 509, "imagenes/Escalera1.png");
        escaleras[10] = new Escalera(200, 519, "imagenes/Escalera2.png");
       
        t = new Timer(16, null);
        t.addActionListener(this);
        t.start();
        addKeyListener(this);
        this.setFocusable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), null);
        for (int i = 0; i < plataformas.length; i++) {
            if (plataformas[i] != null) {
                plataformas[i].dibujar(g2d);
                Rectangle rectPlataforma = plataformas[i].getRectangle();
                g2d.setColor(Color.RED);
                g2d.drawRect(rectPlataforma.x, rectPlataforma.y, rectPlataforma.width, rectPlataforma.height);
            }
        }
        for (int i = 0; i < escaleras.length; i++){
            if (escaleras[i] != null) {
                escaleras[i].dibujar(g2d);
                Rectangle rectEscalera = escaleras[i].getRectangle();
                g2d.setColor(Color.GREEN);
                g2d.drawRect(rectEscalera.x, rectEscalera.y, rectEscalera.width, rectEscalera.height);
            }
        }

        mario.dibujar(g2d);
        Rectangle rectMario = mario.getRectangle();
        g2d.setColor(Color.BLUE);
        g2d.drawRect(rectMario.x, rectMario.y, rectMario.width, rectMario.height);
    }

    private void verificarColisionConPrincesa() {
        Estructura princesa = plataformas[56];
        if (mario.getRectangle().intersects(princesa.getRectangle())) {
            t.stop();
            frame.dispose();
            frame = new Principal(4);
        }
    }

    public void actionPerformed(ActionEvent e) {
        verificarColisionConPrincesa();
        mario.mover();
        
        boolean sobreEstructura = false;
    
        // Manejar colisiones solo si Mario no está escalando
        if (!mario.isEscalando()) {
            for (Estructura estructura : plataformas) {
                if (estructura != null && mario.getFeetRectangle().intersects(estructura.getRectangle())) {
                    // Detectar si Mario está cayendo hacia una plataforma
                    if (mario.getVelocidadY() > 0 && (mario.getY() + mario.getAlto()) >= estructura.getY()) {
                        mario.setY(estructura.getY() - mario.getAlto());
                        mario.setVelocidadY(0);
                        mario.setSaltando(false);
                        sobreEstructura = true;
                        mario.guardarUltimaPosicionY(mario.getY()); // Guardar la última posición válida
                        break;
                    }
                }
            }
    
            // Si no está sobre una plataforma, aplicar gravedad
            if (!sobreEstructura) {
                mario.setVelocidadY(mario.getVelocidadY() + 1);
                mario.setY(mario.getY() + mario.getVelocidadY());
    
                if (mario.getY() >= 640) { // Limitar la posición al suelo
                    mario.setY(640);
                    mario.setVelocidadY(0);
                    mario.setSaltando(false);
                }
            }
    
            // Manejar colisión con plataformas mientras Mario sube (opcional, si deseas evitar algo al saltar hacia arriba)
            for (Estructura estructura : plataformas) {
                if (estructura != null && mario.getRectangle().intersects(estructura.getRectangle())) {
                    if (mario.getVelocidadY() < 0 && mario.getY() <= estructura.getY() + 50) {
                        mario.setY(estructura.getY() + 50);
                        mario.setVelocidadY(0);
                        break;
                    }
                }
            }
        }
    
        // Manejar escaleras
        for (Escalera escalera : escaleras) {
            if (escalera != null && escalera.estaEscalando(mario)) {
                mario.setEscalando(true);
                break;
            } else {
                mario.setEscalando(false);
            }
        }
    
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        this.mario.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
        this.mario.keyReleased(e);
    }

    public void keyTyped(KeyEvent e) {
    }
}

