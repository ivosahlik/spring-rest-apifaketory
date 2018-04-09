
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
public class Login implements Serializable {

    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
