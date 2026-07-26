package com.j256.ormlite.table;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import defpackage.rm7;
import defpackage.t61;
import j$.util.DesugarCollections;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TableInfo<T, ID> {
    private static final FieldType[] NO_FOREIGN_COLLECTIONS = new FieldType[0];
    private final Class<T> dataClass;
    private final DatabaseType databaseType;
    private final Map<String, FieldType> fieldNameMap;
    private final FieldType[] fieldTypes;
    private final boolean foreignAutoCreate;
    private final FieldType[] foreignCollections;
    private final FieldType idField;
    private final String schemaName;
    private final String tableName;

    public TableInfo(DatabaseType databaseType, Class<T> cls) throws SQLException {
        this(databaseType, DatabaseTableConfig.fromClass(databaseType, cls));
    }

    public Class<T> getDataClass() {
        return this.dataClass;
    }

    public FieldType getFieldTypeByColumnName(String str) {
        String strDownCaseString = this.databaseType.downCaseString(str, true);
        FieldType fieldType = this.fieldNameMap.get(strDownCaseString);
        if (fieldType != null) {
            return fieldType;
        }
        for (FieldType fieldType2 : this.fieldTypes) {
            if (this.databaseType.downCaseString(fieldType2.getFieldName(), true).equals(strDownCaseString)) {
                StringBuilder sbT = rm7.t("Unknown column-name '", strDownCaseString, "', maybe field-name instead of column-name '", this.databaseType.downCaseString(fieldType2.getColumnName(), true), "' from table '");
                sbT.append(this.tableName);
                sbT.append("' with columns: ");
                sbT.append(this.fieldNameMap.keySet());
                throw new IllegalArgumentException(sbT.toString());
            }
        }
        StringBuilder sbN = t61.n("Unknown column-name '", strDownCaseString, "' in table '");
        sbN.append(this.tableName);
        sbN.append("' with columns: ");
        sbN.append(this.fieldNameMap.keySet());
        throw new IllegalArgumentException(sbN.toString());
    }

    public FieldType[] getFieldTypes() {
        return this.fieldTypes;
    }

    public FieldType[] getForeignCollections() {
        return this.foreignCollections;
    }

    public FieldType getIdField() {
        return this.idField;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public boolean hasColumnName(String str) {
        for (FieldType fieldType : this.fieldTypes) {
            if (fieldType.getColumnName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isForeignAutoCreate() {
        return this.foreignAutoCreate;
    }

    public boolean isUpdatable() {
        return this.idField != null && this.fieldTypes.length > 1;
    }

    public String objectToString(T t) {
        StringBuilder sb = new StringBuilder(64);
        sb.append(t.getClass().getSimpleName());
        for (FieldType fieldType : this.fieldTypes) {
            sb.append(' ');
            sb.append(fieldType.getColumnName());
            sb.append('=');
            try {
                sb.append(fieldType.extractJavaFieldValue(t));
            } catch (Exception e) {
                throw new IllegalStateException("Could not generate toString of field " + fieldType, e);
            }
        }
        return sb.toString();
    }

    public TableInfo(DatabaseType databaseType, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        this.databaseType = databaseType;
        this.dataClass = databaseTableConfig.getDataClass();
        this.schemaName = databaseTableConfig.getSchemaName();
        this.tableName = databaseTableConfig.getTableName();
        FieldType[] fieldTypes = databaseTableConfig.getFieldTypes(databaseType);
        this.fieldTypes = fieldTypes;
        HashMap map = new HashMap();
        FieldType fieldType = null;
        boolean z = false;
        int i = 0;
        for (FieldType fieldType2 : fieldTypes) {
            if (fieldType2.isId() || fieldType2.isGeneratedId() || fieldType2.isGeneratedIdSequence()) {
                if (fieldType != null) {
                    throw new SQLException("More than 1 idField configured for class " + this.dataClass + " (" + fieldType + "," + fieldType2 + ")");
                }
                fieldType = fieldType2;
            }
            z = fieldType2.isForeignAutoCreate() ? true : z;
            if (fieldType2.isForeignCollection()) {
                i++;
            }
            map.put(databaseType.downCaseString(fieldType2.getColumnName(), true), fieldType2);
        }
        this.fieldNameMap = DesugarCollections.unmodifiableMap(map);
        this.idField = fieldType;
        this.foreignAutoCreate = z;
        if (i == 0) {
            this.foreignCollections = NO_FOREIGN_COLLECTIONS;
            return;
        }
        this.foreignCollections = new FieldType[i];
        int i2 = 0;
        for (FieldType fieldType3 : this.fieldTypes) {
            if (fieldType3.isForeignCollection()) {
                this.foreignCollections[i2] = fieldType3;
                i2++;
            }
        }
    }
}
