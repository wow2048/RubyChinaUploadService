package com.example.RubyChinaUploadService.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Data
@Node
public class ProgrammingLanguage {
    @Id
    @GeneratedValue
    private long id;

    @Property
    private String name;

    @Property
    private String description;

    @Property
    private String pros;

    @Property
    private String cons;

    @Property
    private String difference;
}
