/**
 * This class represents a city or municipality in the Philippines.
 */
package BSIT1stSem.PSGC_API_Project;

/**
 * The City class is a simple data model used to store information about a city or municipality.
 * It includes properties for the city's name and its unique code. This class is
 * typically used in conjunction with the PSGC (Philippine Standard Geographic Code) API.
 *
 * @author Jules
 * @version 1.0
 */
public class City {

    /**
     * The unique code of the city.
     */
    private String code;
    /**
     * The name of the city.
     */
    private String name;

    /**
     * Gets the unique code of the city.
     *
     * @return The city's code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the unique code of the city.
     *
     * @param code The new code for the city.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the name of the city.
     *
     * @return The city's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the city.
     *
     * @param name The new name for the city.
     */
    public void setName(String name) {
        this.name = name;
    }
}
