package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DialogController {

    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextArea notesTextArea;

    public void dialogAdd() {

        Contact contact = new Contact();
        contact.setFirstName(firstNameTextField.getText());
        contact.setLastName(lastNameTextField.getText());
        contact.setPhoneNumber(phoneNumberTextField.getText());
        contact.setNotes(notesTextArea.getText());

        ContactData contactData = new ContactData();
        contactData.addContact(contact);
    }


}
