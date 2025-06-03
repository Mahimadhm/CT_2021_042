import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JLabel nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel, statusLabel;
    JTextField nameField, mobileField;
    JRadioButton maleRadio, femaleRadio;
    ButtonGroup genderGroup;
    JComboBox<String> dayBox, monthBox, yearBox;
    JTextArea addressArea, outputArea;
    JCheckBox termsBox;
    JButton submitButton, resetButton;

    MyFrame() {
        setTitle("Registration Form");
        setSize(700, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Name
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 30, 100, 20);
        nameField = new JTextField();
        nameField.setBounds(130, 30, 150, 20);

        // Mobile
        mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(20, 60, 100, 20);
        mobileField = new JTextField();
        mobileField.setBounds(130, 60, 150, 20);

        // Gender
        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(20, 90, 100, 20);
        maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(130, 90, 60, 20);
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(200, 90, 70, 20);
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // DOB
        dobLabel = new JLabel("DOB");
        dobLabel.setBounds(20, 120, 100, 20);
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) days[i] = String.valueOf(i + 1);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] years = new String[50];
        for (int i = 0; i < 50; i++) years[i] = String.valueOf(1980 + i);

        dayBox = new JComboBox<>(days);
        dayBox.setBounds(130, 120, 50, 20);
        monthBox = new JComboBox<>(months);
        monthBox.setBounds(190, 120, 70, 20);
        yearBox = new JComboBox<>(years);
        yearBox.setBounds(270, 120, 60, 20);

        // Address
        addressLabel = new JLabel("Address");
        addressLabel.setBounds(20, 150, 100, 20);
        addressArea = new JTextArea();
        addressArea.setBounds(130, 150, 200, 60);

        // Terms and conditions
        termsBox = new JCheckBox("Accept Terms And Conditions");
        termsBox.setBounds(130, 220, 250, 20);

        // Buttons
        submitButton = new JButton("Submit");
        submitButton.setBounds(130, 250, 100, 25);
        submitButton.addActionListener(this);

        resetButton = new JButton("Reset");
        resetButton.setBounds(240, 250, 100, 25);
        resetButton.addActionListener(this);

        // Output area
        outputArea = new JTextArea();
        outputArea.setBounds(400, 30, 250, 180);
        outputArea.setEditable(false);
        outputArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Status label
        statusLabel = new JLabel("");
        statusLabel.setBounds(130, 280, 250, 20);

        // Add all components
        add(nameLabel); add(nameField);
        add(mobileLabel); add(mobileField);
        add(genderLabel); add(maleRadio); add(femaleRadio);
        add(dobLabel); add(dayBox); add(monthBox); add(yearBox);
        add(addressLabel); add(addressArea);
        add(termsBox);
        add(submitButton); add(resetButton);
        add(outputArea); add(statusLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            if (!termsBox.isSelected()) {
                statusLabel.setText("Please accept terms.");
                return;
            }

            String name = nameField.getText();
            String mobile = mobileField.getText();
            String gender = maleRadio.isSelected() ? "Male" : (femaleRadio.isSelected() ? "Female" : "Not selected");
            String dob = dayBox.getSelectedItem() + "/" + monthBox.getSelectedItem() + "/" + yearBox.getSelectedItem();
            String address = addressArea.getText();

            outputArea.setText("Name : " + name + "\n" +
                    "Mobile : " + mobile + "\n" +
                    "Gender : " + gender + "\n" +
                    "DOB : " + dob + "\n" +
                    "Address : " + address);
            statusLabel.setText("Registration Successful.");
        }

        if (e.getSource() == resetButton) {
            nameField.setText("");
            mobileField.setText("");
            genderGroup.clearSelection();
            dayBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);
            addressArea.setText("");
            termsBox.setSelected(false);
            outputArea.setText("");
            statusLabel.setText("");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);
    }
}
