/**
 * This class represents a Barangay, a small administrative division in the Philippines.
 */
package BSIT1stSem.PSGC_API_Project;

/**
 * The Barangay class is a simple data model used to store information about a barangay.
 * It includes properties for the barangay's name and its unique code. This class is
 * typically used in conjunction with the PSGC (Philippine Standard Geographic Code) API.
 *
 * @author Jules
 * @version 1.0
 */
public class Barangay {

    /**
     * The name of the barangay.
     */
    private String name;
    /**
     * The unique code of the barangay.
     */
    private String code;

    /**
     * Gets the unique code of the barangay.
     *
     * @return The barangay's code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the unique code of the barangay.
     *
     * @param code The new code for the barangay.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the name of the barangay.
     *
     * @return The barangay's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the barangay.
     *
     * @param name The new name for the barangay.
     */
    public void setName(String name) {
        this.name = name;
    }
}
