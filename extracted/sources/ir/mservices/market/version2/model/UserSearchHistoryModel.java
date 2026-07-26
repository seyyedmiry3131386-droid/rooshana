package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "user_search_history")
public final class UserSearchHistoryModel implements Serializable {
    public static final Companion a = new Companion(0);

    @DatabaseField(columnName = "received_date_time")
    private long receivedDateTime;

    @DatabaseField(columnName = "title", id = true, unique = true)
    private String title = "";

    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public final String a() {
        return this.title;
    }

    public final void b(long j) {
        this.receivedDateTime = j;
    }

    public final void c(String str) {
        this.title = str;
    }

    public final String toString() {
        return "RecentAppsModel{title='" + this.title + "', receivedDateTime=" + this.receivedDateTime + "}";
    }
}
