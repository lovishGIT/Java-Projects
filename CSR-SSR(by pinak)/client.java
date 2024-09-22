import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class client extends JFrame {
    Socket socket;
    PrintWriter outi;
    BufferedReader br;
    private JLabel heading = new JLabel("Client Area");
    private JTextArea messageArea = new JTextArea();
    private JTextField messageInput = new JTextField();
    private Font font = new Font("Roboto", Font.PLAIN, 20);

    public client() {
        try {
            System.out.println("sending request");
            socket = new Socket("10.0.72.162", 1110);
            System.out.println("connection done");
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outi = new PrintWriter(socket.getOutputStream(), true);
            createGUI();
            handleevents();
            startReading();
            // startWriting();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleevents() {
        messageInput.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Implementation for keyTyped event
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Implementation for keyPressed event
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key Released " + e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    SwingUtilities.invokeLater(() -> {
                        String contentToSend = messageInput.getText();
                        messageArea.append("Me: " + contentToSend + "\n");
                        if (outi != null) {
                            outi.println(contentToSend);
                            messageInput.setText("");
                        } else {
                            System.err.println("PrintWriter is not initialized.");
                        }
                    });
                }
            }
        });
    }

    private void createGUI() {
        this.setTitle("Client Message");
        this.setSize(600, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("path/to/chatapplication/hllo.jpg");
        if (icon.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.err.println("Image failed to load.");
        } else {
            heading.setIcon(icon);
        }

        heading.setHorizontalTextPosition(SwingConstants.CENTER);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        heading.setFont(font);

        messageArea.setFont(font);
        messageInput.setFont(font);
        messageArea.setEditable(false);

        // Create JScrollPane for the message area
        JScrollPane jScroll = new JScrollPane(messageArea);
        jScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        this.setLayout(new BorderLayout());
        this.add(heading, BorderLayout.NORTH);
        this.add(jScroll, BorderLayout.CENTER); // Add JScrollPane instead of JTextArea
        this.add(messageInput, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void startReading() {
        Runnable r1 = () -> {
            System.out.println("Client is reading");
            try {
                while (true) {
                    String msg = br.readLine();
                    if (msg.equals("exit")) {
                        System.out.println("server is terminated");
                        JOptionPane.showMessageDialog(this, "Server terminated the chat");
                        messageInput.setEnabled(false);
                        socket.close();
                        break;
                    }
                    messageArea.append("Server: " + msg + "\n");
                    messageArea.setCaretPosition(messageArea.getDocument().getLength()); // Auto-scroll to the bottom
                }
            } catch (Exception e) {
                System.out.println("SERVER DOES NOT SEND ANYTHING");
            }
        };
        new Thread(r1).start();
    }

    public void startWriting() {
        Runnable r2 = () -> {
            System.out.println("writer Started...");
            try {
                while (!socket.isClosed()) {
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    if (content.equals("exit")) {
                        socket.close();
                    }
                }
            } catch (Exception e) {
                System.out.println("server ended in write");
            }
        };
        new Thread(r2).start();
    }

    public static void main(String[] args) {
        System.out.println("this is client...");
        new client();
    }
}