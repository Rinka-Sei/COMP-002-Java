/**
 * This class represents a region in the Philippines.
 */
package BSIT1stSem.PSGC_API_Project;

/**
 * The Region class is a simple data model used to store information about a region.
 * It includes properties for the region's name and its unique code. This class is
 * typically used in conjunction with the PSGC (Philippine Standard Geographic Code) API.
 *
 * @author Jules
 * @version 1.0
 */
public class Region {

    /**
     * The name of the region.
     */
    private String name;
    /**
     * The unique code of the region.
     */
    private String code;

    /**
     * Gets the unique code of the region.
     *
     * @return The region's code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the unique code of the region.
     *
     * @param code The new code for the region.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the name of the region.
     *
     * @return The region's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the region.
     *
     * @param name The new name for the region.
     */
    public void setName(String name) {
        this.name = name;
    }
}
