package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "BindHistory")
public class BindHistoryModel {

    @DatabaseField(columnName = "identifier", id = true)
    private String identifier;

    @DatabaseField(columnName = "type")
    private Integer type;

    public BindHistoryModel() {
    }

    public final String a() {
        return this.identifier;
    }

    public final String toString() {
        return "BindHistoryModel{identifier='" + this.identifier + "', type=" + this.type + '}';
    }

    public BindHistoryModel(String str) {
        this.identifier = str;
        this.type = 1;
    }
}
