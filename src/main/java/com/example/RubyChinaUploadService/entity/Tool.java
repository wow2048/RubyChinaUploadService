package com.example.RubyChinaUploadService.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@Node
public class Tool {
    @Id
    @GeneratedValue
    private long id;

    @Property
    private String name;

    @Property
    private String description;

    @Property
    private String type;

    @Relationship(type = "HasBlogOf", direction = Relationship.Direction.OUTGOING)
    private List<Blog> blogs;
}