package com.xpam.webconnector.web.entity;

import java.util.List;

public record RelationMetadataPage(List<QualifiedRelation> items, boolean truncated) {
}
