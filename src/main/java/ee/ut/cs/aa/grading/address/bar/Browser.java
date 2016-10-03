package ee.ut.cs.aa.grading.address.bar;

/**
 * A very simple browser to test the address bar with.
 */
public interface Browser {

    /**
     * Open the URL currently entered into the associated address bar.
     */
    void open();

    /**
     * Associate an address bar with the current browser.
     *
     * @param addressBar to be connected with the browser
     */
    void setAddressBar(AddressBar addressBar);

}
