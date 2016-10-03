package ee.ut.cs.aa.grading.address.bar;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Simple browser implementation.
 */
public class BrowserImpl implements Browser {

    private final Desktop desktop;
    private AddressBar addressBar;

    BrowserImpl(){
        desktop = Desktop.getDesktop();
    }

    @Override
    public void open() {
        try {
            desktop.browse(addressBar.getCurrentPage().toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setAddressBar(AddressBar addressBar) {
        this.addressBar = addressBar;
    }
}
