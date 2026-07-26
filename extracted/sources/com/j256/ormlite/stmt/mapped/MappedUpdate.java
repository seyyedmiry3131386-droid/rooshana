package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes3.dex */
public class MappedUpdate<T, ID> extends BaseMappedStatement<T, ID> {
    private final FieldType versionFieldType;
    private final int versionFieldTypeIndex;

    private MappedUpdate(Dao<T, ID> dao, TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType fieldType, int i) {
        super(dao, tableInfo, str, fieldTypeArr);
        this.versionFieldType = fieldType;
        this.versionFieldTypeIndex = i;
    }

    public static <T, ID> MappedUpdate<T, ID> build(Dao<T, ID> dao, TableInfo<T, ID> tableInfo) throws SQLException {
        FieldType idField = tableInfo.getIdField();
        if (idField == null) {
            throw new SQLException("Cannot update " + tableInfo.getDataClass() + " because it doesn't have an id field");
        }
        StringBuilder sb = new StringBuilder(64);
        DatabaseType databaseType = dao.getConnectionSource().getDatabaseType();
        BaseMappedStatement.appendTableName(databaseType, sb, "UPDATE ", (TableInfo<?, ?>) tableInfo);
        FieldType fieldType = null;
        int i = -1;
        int i2 = 0;
        for (FieldType fieldType2 : tableInfo.getFieldTypes()) {
            if (isFieldUpdatable(fieldType2, idField)) {
                if (fieldType2.isVersion()) {
                    i = i2;
                    fieldType = fieldType2;
                }
                i2++;
            }
        }
        int i3 = i2 + 1;
        if (fieldType != null) {
            i3 = i2 + 2;
        }
        FieldType[] fieldTypeArr = new FieldType[i3];
        boolean z = true;
        int i4 = 0;
        for (FieldType fieldType3 : tableInfo.getFieldTypes()) {
            if (isFieldUpdatable(fieldType3, idField)) {
                if (z) {
                    sb.append("SET ");
                    z = false;
                } else {
                    sb.append(", ");
                }
                BaseMappedStatement.appendFieldColumnName(databaseType, sb, fieldType3, null);
                fieldTypeArr[i4] = fieldType3;
                sb.append("= ?");
                i4++;
            }
        }
        sb.append(' ');
        BaseMappedStatement.appendWhereFieldEq(databaseType, idField, sb, null);
        int i5 = i4 + 1;
        fieldTypeArr[i4] = idField;
        if (fieldType != null) {
            sb.append(" AND ");
            BaseMappedStatement.appendFieldColumnName(databaseType, sb, fieldType, null);
            sb.append("= ?");
            fieldTypeArr[i5] = fieldType;
        }
        return new MappedUpdate<>(dao, tableInfo, sb.toString(), fieldTypeArr, fieldType, i);
    }

    private static boolean isFieldUpdatable(FieldType fieldType, FieldType fieldType2) {
        return (fieldType == fieldType2 || fieldType.isForeignCollection() || fieldType.isReadOnly()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.j256.ormlite.dao.ObjectCache] */
    /* JADX WARN: Type inference failed for: r14v8, types: [com.j256.ormlite.field.FieldType[]] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.j256.ormlite.dao.ObjectCache] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.j256.ormlite.field.FieldType] */
    public int update(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) throws SQLException {
        T t2;
        SQLException sQLException;
        Object objMoveToNextValue;
        ?? r11;
        try {
            int i = 0;
            if (this.argFieldTypes.length <= 1) {
                return 0;
            }
            Object[] fieldObjects = getFieldObjects(t);
            FieldType fieldType = this.versionFieldType;
            if (fieldType != null) {
                try {
                    objMoveToNextValue = this.versionFieldType.moveToNextValue(fieldType.extractJavaFieldValue(t));
                    fieldObjects[this.versionFieldTypeIndex] = this.versionFieldType.convertJavaFieldToSqlArgValue(objMoveToNextValue);
                } catch (SQLException e) {
                    sQLException = e;
                    t2 = t;
                }
            } else {
                objMoveToNextValue = null;
            }
            Object obj = objMoveToNextValue;
            int iUpdate = databaseConnection.update(this.statement, fieldObjects, this.argFieldTypes);
            if (iUpdate > 0) {
                if (obj != null) {
                    t2 = t;
                    try {
                        this.versionFieldType.assignField(this.connectionSource, t2, obj, false, null);
                    } catch (SQLException e2) {
                        e = e2;
                    }
                } else {
                    t2 = t;
                }
                if (objectCache != 0) {
                    Object obj2 = objectCache.get(this.clazz, this.idField.extractJavaFieldValue(t2));
                    if (obj2 != null && obj2 != t2) {
                        ?? fieldTypes = this.tableInfo.getFieldTypes();
                        int length = fieldTypes.length;
                        ?? r15 = objectCache;
                        while (i < length) {
                            ?? r6 = fieldTypes[i];
                            if (r6 != this.idField) {
                                r11 = r15;
                                r6.assignField(this.connectionSource, obj2, r6.extractJavaFieldValue(t2), false, r11);
                            } else {
                                r11 = r15;
                            }
                            i++;
                            r15 = r11;
                        }
                    }
                }
            } else {
                t2 = t;
            }
            BaseMappedStatement.logger.debug("update data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(fieldObjects.length), Integer.valueOf(iUpdate));
            if (fieldObjects.length > 0) {
                BaseMappedStatement.logger.trace("update arguments: {}", (Object) fieldObjects);
            }
            return iUpdate;
        } catch (SQLException e3) {
            e = e3;
            t2 = t;
        }
        sQLException = e;
        throw new SQLException("Unable to run update stmt on object " + t2 + ": " + this.statement, sQLException);
    }
}
