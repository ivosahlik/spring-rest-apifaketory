
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
public class ExpirationDate implements Serializable {

    private String date;
    private Integer timezoneType;
    private String timezone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
