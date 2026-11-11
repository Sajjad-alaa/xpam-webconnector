package com.xpam.webconnector.web.controller;

import com.xpam.webconnector.framework.datasource.entity.action.Action;
import com.xpam.webconnector.framework.datasource.entity.action.ActionRequest;
import com.xpam.webconnector.framework.datasource.entity.action.EventEmitter;
import com.xpam.webconnector.framework.datasource.entity.form.FormData;
import com.xpam.webconnector.framework.datasource.entity.resource.TreeNode;
import com.xpam.webconnector.web.entity.RelationMetadataPage;
import com.xpam.webconnector.web.entity.GetHintsRequest;
import com.xpam.webconnector.web.entity.MetadataColumnsRequest;
import com.xpam.webconnector.web.entity.MetadataColumnsResponse;
import com.xpam.webconnector.web.entity.MetadataRelationsRequest;
import com.xpam.webconnector.web.entity.SchemaOverviewMetadata;
import com.xpam.webconnector.web.entity.SchemaOverviewRequest;
import com.xpam.webconnector.web.entity.TableMetadata;
import com.xpam.webconnector.web.entity.TableMetadataRequest;
import com.xpam.webconnector.web.service.HintsService;
import com.xpam.webconnector.web.service.ResourceService;
import com.xpam.webconnector.web.service.SchemaOverviewService;
import com.xpam.webconnector.web.service.TableMetadataService;
import com.xpam.webconnector.web.service.SqlMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {


    @Autowired
    private ResourceService resourceService;

    @Autowired
    private SqlMetadataService sqlMetadataService;

    @Autowired
    private SchemaOverviewService schemaOverviewService;

    @Autowired
    private TableMetadataService tableMetadataService;

    @Autowired
    private HintsService hintsService;


    @PostMapping("/children")
    public List<TreeNode> getChild(@RequestBody(required = false) TreeNode node,
                                   @RequestParam(required = false) boolean force) {

        try {
            var children = this.resourceService.getChildren(node, force);
            return children;
        } catch (Exception e) {
            throw e;
        }
    }

    @PostMapping("/actions")
    public List<Action> getActions(@RequestBody TreeNode node) {
        return this.resourceService.getActions(node);
    }

    @PostMapping("/actions/do")
    public EventEmitter doAction(@RequestBody ActionRequest actionRequest) {
        return this.resourceService.doAction(actionRequest.getNode(), actionRequest.getAction());
    }

    @PostMapping("/forms")
    public EventEmitter submitResourceFormData(@RequestBody FormData form) throws SQLException {
        return this.resourceService.submitResourceForm(form);
    }

    @PostMapping("/hints")
    public Map<String, List<String>> getHints(@RequestBody GetHintsRequest request) {
        return this.hintsService.getHints(request.getNodeKey(), request.getContext());
    }

    @PostMapping("/metadata/relations")
    public RelationMetadataPage getMetadataRelations(
            @RequestBody MetadataRelationsRequest request
    ) {
        return this.sqlMetadataService.listRelations(request);
    }

    @PostMapping("/metadata/columns")
    public MetadataColumnsResponse getMetadataColumns(@RequestBody MetadataColumnsRequest request) {
        return this.sqlMetadataService.listColumns(request);
    }

    @PostMapping("/metadata/schema-overview")
    public SchemaOverviewMetadata getSchemaOverview(@RequestBody SchemaOverviewRequest request) {
        return this.schemaOverviewService.getSchemaOverview(request);
    }

    @PostMapping("/metadata/table")
    public TableMetadata getTableMetadata(@RequestBody TableMetadataRequest request) {
        return this.tableMetadataService.getTableMetadata(request);
    }

}
