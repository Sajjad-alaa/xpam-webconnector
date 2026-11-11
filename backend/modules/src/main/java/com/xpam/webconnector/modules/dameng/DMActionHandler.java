package com.xpam.webconnector.modules.dameng;

import lombok.extern.slf4j.Slf4j;
import com.xpam.webconnector.framework.datasource.base.BaseActionHandler;
import com.xpam.webconnector.framework.datasource.entity.action.Action;
import com.xpam.webconnector.framework.datasource.entity.action.EventEmitter;
import com.xpam.webconnector.framework.datasource.entity.form.FormData;
import com.xpam.webconnector.framework.datasource.entity.resource.TreeNode;
import com.xpam.webconnector.framework.i18n.MessageUtils;

import java.sql.SQLException;
import java.util.List;

@Slf4j
public class DMActionHandler extends BaseActionHandler {

    @Override
    public List<Action> getSchemaActions(TreeNode node) {
        return List.of(
                Action.builder()
                        .label(MessageUtils.get("action.refresh"))
                        .key("refresh_node")
                        .divided(true)
                        .icon("el-icon-refresh")
                        .build(),
                Action.builder()
                        .label(MessageUtils.get("action.new_query"))
                        .key("new_query")
                        .icon("el-icon-search")
                        .build()
                ,
                Action.builder()
                        .label(MessageUtils.get("action.show_properties"))
                        .key("show_properties")
                        .icon("fa fa-align-justify")
                        .build()
        );
    }

    @Override
    public List<Action> getTableActions(TreeNode node) {
        return List.of(
                Action.builder()
                        .label(MessageUtils.get("action.new_query"))
                        .key("new_query")
                        .icon("el-icon-search")
                        .build(),
                Action.builder()
                        .label(MessageUtils.get("action.view_data"))
                        .key("view_data")
                        .icon("el-icon-view")
                        .build(),
                Action.builder()
                        .label(MessageUtils.get("action.show_properties"))
                        .key("show_properties")
                        .icon("fa fa-align-justify")
                        .build()
        );
    }

    @Override
    public EventEmitter handleForm(FormData formData) throws SQLException {
        return null;
    }
}
