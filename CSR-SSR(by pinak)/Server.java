import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Server extends JFrame {
    ServerSocket Server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    boolean f = true;
    private JLabel heading = new JLabel("Server Side");
    private JTextArea messageArea = new JTextArea();
    private JTextField messageInput = new JTextField();
    private Font font = new Font("Roboto", Font.PLAIN, 20);

    public Server() {

        try {
            Server = new ServerSocket(1110);
            System.out.println("Server is ready to accept connection");
            System.out.println("waiting...");
            socket = Server.accept();
            // data is unidirectional
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            createGui();

            handlevents();
            startReading();
            // startWriting();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createGui() {
        this.setTitle("Server Message");
        this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heading.setFont(font);
        // heading.setHorizontalTextPosition(SwingConstants.CENTER);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        messageArea.setFont(font);
        messageInput.setFont(font);
        JScrollPane jscroll = new JScrollPane(messageArea);
        jscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        messageInput.setHorizontalAlignment(SwingConstants.CENTER);
        this.setLayout(new BorderLayout());
        this.add(heading, BorderLayout.NORTH);
        // this.add(messageArea,BorderLayout.CENTER);
        this.add(messageInput, BorderLayout.SOUTH);
        this.add(jscroll, BorderLayout.CENTER);

        messageArea.setEditable(false);
        this.setVisible(true);
    }

    public void handlevents() {
        messageInput.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    SwingUtilities.invokeLater(() -> {
                        String content = messageInput.getText();
                        messageArea.append("Me: " + content + "\n");
                        if (out != null) {
                            out.println(content);
                            out.flush();
                            messageInput.setText("");
                        }
                    });
                }
            }
        });

    }

    public void startReading() {

        Runnable r1 = () -> {
            System.out.println("reading started");
            try {
                while (!socket.isClosed()) {
                    String msg = br.readLine();
                    if (msg.equals("exit")) {
                        f = false;
                        System.out.println("client terminated the chat");
                        JOptionPane.showMessageDialog(this, "client terminated the chat");
                        messageInput.setEnabled(false);
                        socket.close();
                        break;
                    }
                    // System.out.println("Client: " + msg);
                    messageArea.append("Server " + msg + "\n");
                }
            } catch (Exception e) {
                System.out.println("CLIENT DOES NOT SEND ANYTHING ");

            }
        };
        new Thread(r1).start();
    }

    public void startWriting() {

        Runnable r2 = () -> {
            System.out.println("writing by Server");
            try {

                // if(socket.isClosed()){
                // System.out.println("now dont write it any to client as client ends the
                // chatbox ");
                // }

                while (!socket.isClosed()) {
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();
                    if (content.equals("exit")) {
                        socket.close();
                        break;

                    }
                }
            } catch (Exception e) {
                // to handle exception
                System.out.println("u cannot write ");
            }
        };
        new Thread(r2).start();
    }

    public static void main(String[] args) {
        System.out.println("this is Server");
        Server ob = new Server();
    }
}