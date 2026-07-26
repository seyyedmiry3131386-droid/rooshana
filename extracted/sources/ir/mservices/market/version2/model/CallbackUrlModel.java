package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import defpackage.dw1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "UrlCallback")
@Deprecated
public class CallbackUrlModel implements Serializable {

    @DatabaseField(columnName = "count")
    private int count;

    @DatabaseField(columnName = "id", id = true)
    private Integer id;

    @DatabaseField(columnName = "timestamp")
    private long timestamp;

    @DatabaseField(columnName = "type")
    private String type;

    @DatabaseField(columnName = "url", unique = true)
    private String url;

    public final int a() {
        return this.count;
    }

    public final String b() {
        return this.url;
    }

    public final String getType() {
        return this.type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlModel{id=");
        sb.append(this.id);
        sb.append(", url='");
        sb.append(this.url);
        sb.append("', count=");
        return dw1.q(sb, this.count, '}');
    }
}
