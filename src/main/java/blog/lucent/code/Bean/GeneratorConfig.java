package blog.lucent.code.Bean;

import lombok.Data;

import java.util.List;

@Data
public class GeneratorConfig {
    private Integer dbType;
    private String jdbcLink;
    private String dbName;
    private String jdbcUser;
    private String jdbcPwd;
    private String projectPath;
    private String author;
    private String parent;
    private String moduleName;
    private String dbTables;
}
