package liquibase.logging.mdc;

public class MdcKey {
    public static final String DEPLOYMENT_ID = "deploymentId";
    public static final String CHANGESET_ID = "changesetId";
    public static final String CHANGESET_AUTHOR = "changesetAuthor";
    public static final String CHANGESET_FILEPATH = "changesetFilepath";
    public static final String CHANGESET_OUTCOME = "changesetOutcome";
    public static final String LIQUIBASE_INTERNAL_COMMAND = "liquibaseInternalCommand";
    public static final String LIQUIBASE_TARGET_URL = "liquibaseTargetUrl";
    public static final String LIQUIBASE_REF_URL = "liquibaseReferenceUrl";
    public static final String LIQUIBASE_CATALOG_NAME = "liquibaseCatalogName";
    public static final String LIQUIBASE_SCHEMA_NAME = "liquibaseSchemaName";
    public static final String CHANGESET_OPERATION_START_TIME = "changesetOperationStart";
    public static final String CHANGESET_OPERATION_STOP_TIME = "changesetOperationStop";
    public static final String OPERATION_START_TIME = "operationStart";
    public static final String OPERATION_STOP_TIME = "operationStop";
    public static final String CHANGESET_SQL = "changesetSql";
    public static final String DEPLOYMENT_OUTCOME = "deploymentOutcome";
    public static final String LIQUIBASE_COMMAND_NAME = "liquibaseCommandName";
    public static final String LIQUIBASE_VERSION = "liquibaseVersion";
    public static final String LIQUIBASE_SYSTEM_NAME = "liquibaseSystemName";
    public static final String LIQUIBASE_SYSTEM_USER = "liquibaseSystemUser";
    public static final String OUTPUT_FILE = "outputFile";
    public static final String OUTPUT_FILE_ENCODING = "outputFileEncoding";
    public static final String ROLLBACK_TO_TAG = "rollbackToTag";
    public static final String CHANGELOG_FILE = "changelogFile";
    public static final String ROLLBACK_SCRIPT = "rollbackScript";
    public static final String CHANGESET_COMMENT = "changesetComment";
    public static final String CHANGESET_LABEL = "changesetLabel";
    public static final String COMMAND_LABEL_FILTER = "commandLabelFilter";
    public static final String CHANGESET_CONTEXT = "changesetContext";
    public static final String COMMAND_CONTEXT_FILTER = "commandContextFilter";
    public static final String DEPLOYMENT_OUTCOME_COUNT = "deploymentOutcomeCount";
    public static final String CHANGELOG_PROPERTIES = "changelogProperties";
    public static final String ROLLBACK_COUNT = "rollbackCount";
    public static final String CHANGESETS_ROLLED_BACK = "changesetsRolledback";
    public static final String ROLLBACK_ONE_CHANGESET_FORCE = "rollbackOneChangesetForce";
    public static final String ROLLBACK_ONE_UPDATE_FORCE = "rollbackOneUpdateForce";
    public static final String ROLLBACK_TO_DATE = "rollbackToDate";
    public static final String DATABASE_CHANGELOG_SQL = "databaseChangelogSQL";
    public static final String LIQUIBASE_PSQL_PATH = "liquibasePsqlPath";
    public static final String LIQUIBASE_PSQL_TIMEOUT = "liquibasePsqlTimeout";
    public static final String LIQUIBASE_PSQL_KEEP_TEMP = "liquibasePsqlKeepTemp";
    public static final String LIQUIBASE_PSQL_KEEP_TEMP_PATH = "liquibasePsqlKeepTempPath";
    public static final String LIQUIBASE_PSQL_KEEP_TEMP_NAME = "liquibasePsqlKeepTempName";
    public static final String LIQUIBASE_PSQL_ARGS = "liquibasePsqlArgs";
    public static final String LIQUIBASE_PSQL_LOG_FILE = "liquibasePsqlLogFile";
    public static final String LIQUIBASE_SQLCMD_PATH = "liquibaseSqlcmdPath";
    public static final String LIQUIBASE_SQLCMD_TIMEOUT = "liquibaseSqlcmdTimeout";
    public static final String LIQUIBASE_SQLCMD_KEEP_TEMP = "liquibaseSqlcmdKeepTemp";
    public static final String LIQUIBASE_SQLCMD_KEEP_TEMP_PATH = "liquibaseSqlcmdKeepTempPath";
    public static final String LIQUIBASE_SQLCMD_KEEP_TEMP_NAME = "liquibaseSqlcmdKeepTempName";
    public static final String LIQUIBASE_SQLCMD_ARGS = "liquibaseSqlcmdArgs";
    public static final String LIQUIBASE_SQLCMD_LOG_FILE = "liquibaseSqlcmdLogFile";
    public static final String LIQUIBASE_SQLCMD_TEMP_OVERWRITE = "liquibaseSqlcmdTempOverwrite";
    public static final String LIQUIBASE_SQLCMD_CATALOG_NAME = "liquibaseSqlcmdCatalogName";
    public static final String LIQUIBASE_SQLPLUS_PATH = "liquibaseSqlplusPath";
    public static final String LIQUIBASE_SQLPLUS_TIMEOUT = "liquibaseSqlplusTimeout";
    public static final String LIQUIBASE_SQLPLUS_KEEP_TEMP = "liquibaseSqlplusKeepTemp";
    public static final String LIQUIBASE_SQLPLUS_KEEP_TEMP_PATH = "liquibaseSqlplusKeepTempPath";
    public static final String LIQUIBASE_SQLPLUS_KEEP_TEMP_NAME = "liquibaseSqlplusKeepTempName";
    public static final String LIQUIBASE_SQLPLUS_ARGS = "liquibaseSqlplusArgs";
    public static final String LIQUIBASE_SQLPLUS_CREATE_SPOOL = "liquibaseSqlplusCreateSpool";
    public static final String LIQUIBASE_SQLPLUS_SPOOL_FILE = "liquibaseSqlplusSpoolFile";
    public static final String LIQUIBASE_SQLPLUS_TEMP_OVERWRITE = "liquibaseSqlplusTempOverwrite";
    public static final String RUN_WITH = "runWith";
    public static final String DATABASE_CHANGELOG_TABLE_OUTCOME = "databaseChangelogTableOutcome";
    public static final String ROLLBACK_SQL_FILE = "rollbackSqlFile";
    public static final String UPDATE_SUMMARY = "updateSummary";
    public static final String CHANGESETS_UPDATED = "changesetsUpdated";
    public static final String UPDATE_ONE_CHANGESET_FORCE = "updateOneChangesetForce";
    public static final String REFERENCE_USERNAME = "referenceUsername";
    public static final String EXCLUDE_OBJECTS = "excludeObjects";
    public static final String INCLUDE_OBJECTS = "includeObjects";
    public static final String FORMAT = "format";
    public static final String DIFF_TYPES = "diffTypes";
    public static final String DIFF_RESULTS_SUMMARY = "diffResultsSummary";
    public static final String REFERENCE_DEFAULT_CATALOG_NAME = "referenceDefaultCatalogName";
    public static final String REFERENCE_DEFAULT_SCHEMA_NAME = "referenceDefaultSchemaName";
    public static final String REFERENCE_SCHEMAS = "referenceSchemas";
    public static final String OUTPUT_SCHEMAS = "outputSchemas";
    public static final String INCLUDE_CATALOG = "includeCatalog";
    public static final String INCLUDE_SCHEMA = "includeSchema";
    public static final String INCLUDE_TABLESPACE = "includeTablespace";
    public static final String SCHEMAS = "schemas";
    public static final String DIFF_OUTCOME = "diffOutcome";
    public static final String UPDATE_TO_TAG = "updateToTag";
    public static final String UPDATE_COUNT = "updateCount";
    public static final String ROLLBACK_ON_ERROR = "rollbackOnError";
    public static final String CHANGESET_SYNC_COUNT = "changesetSyncCount";
    public static final String CHANGELOG_SYNC_OUTCOME = "changelogSyncOutcome";
    public static final String OPERATION_START = "operationStart";
    public static final String OPERATION_STOP = "operationStop";
    public static final String DIFF_CHANGELOG_FILE = "diffChangelogFile";
    public static final String DIFF_CHANGELOG_OUTCOME = "diffChangelogOutcome";
    public static final String CHANGESET_SYNC_OUTCOME = "changesetSyncOutcome";

    public static final String FLOW_FILE_ROOT = "flowFileRoot";
    public static final String FLOW_START_TIME = "flowStart";
    public static final String FLOW_STOP_TIME = "flowStop";
    public static final String FLOW_FILE_OUTCOME = "flowFileOutcome";
    public static final String FLOW_FILE_FAILED_MESSAGE = "flowFileFailedMessage";
    public static final String FLOW_FILE_FAILED_STAGE = "flowFileFailedStage";

    public static final String VERSION = "version";
    public static final String FAIL_ON_ERROR = "failOnError";
}
