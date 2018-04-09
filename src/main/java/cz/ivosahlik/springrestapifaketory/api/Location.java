
package cz.ivosahlik.springrestapifaketory.api;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Intellij Idea
 * Created by ivosahlik on 09/04/2018
 */
@Data
public class Location implements Serializable {

    private String street;
    private String city;
    private String state;
    private String postcode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
