package com.xpam.webconnector.framework.datasource.plan;

import com.xpam.webconnector.framework.datasource.analysis.SqlStatementAnalysis;

import java.sql.SQLException;

public interface ExecutionPlanDialect {
    PlanDatabase database();

    ExecutionPlanCapabilities capabilities();

    DialectPlanResult explainEstimated(PlanExecutionContext context, SqlStatementAnalysis statement) throws SQLException;
}
