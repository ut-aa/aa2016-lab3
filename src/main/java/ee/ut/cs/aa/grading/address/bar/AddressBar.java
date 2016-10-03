package ee.ut.cs.aa.grading.address.bar;

import java.net.URL;

/**
 * An address bar of a browser. Reference solution: Address bar of Chrome/Firefox.
 */
public interface AddressBar {

    /**
     * Return the current address that is visible in the address bar.
     *
     * @return the current address
     */
    URL getCurrentPage();

    /**
     * Enter an address to the address bar.
     *
     * @param address to go to
     */
    void enterAddress(URL address);

    /**
     * Move to the page that was visited before the current page. If there is no such page, stay on the current page.
     */
    void back();

    /**
     * Move to the page that was visited after the current page. If there is no such page, stay on the current page.
     */
    void forward();

}
