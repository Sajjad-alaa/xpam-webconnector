package com.xpam.webconnector.web.entity;

import java.util.List;

public record RelationColumnsMetadata(QualifiedRelation relation, List<SqlColumnMetadata> columns) {
}
