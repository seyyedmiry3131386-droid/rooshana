package ir.mservices.market.search.history.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "search_history")
public final class SearchHistoryModel implements Serializable {

    @DatabaseField(columnName = "received_date_time")
    private long receivedDateTime;

    @DatabaseField(columnName = "title", id = true, unique = true)
    public String title;

    public final String toString() {
        String str = this.title;
        if (str == null) {
            js3.V("title");
            throw null;
        }
        return "RecentAppsModel{title='" + str + "', receivedDateTime=" + this.receivedDateTime + "}";
    }
}
