package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "movie_search_history")
public class MovieSearchHistoryModel implements Serializable {

    @DatabaseField(columnName = "received_date_time")
    private long receivedDateTime;

    @DatabaseField(columnName = "title", id = true, unique = true)
    private String title;

    public static MovieSearchHistoryModel b(String str) {
        MovieSearchHistoryModel movieSearchHistoryModel = new MovieSearchHistoryModel();
        movieSearchHistoryModel.title = str;
        movieSearchHistoryModel.receivedDateTime = System.currentTimeMillis();
        return movieSearchHistoryModel;
    }

    public final String a() {
        return this.title;
    }

    public final String toString() {
        return "RecentAppsModel{title='" + this.title + "', receivedDateTime=" + this.receivedDateTime + '}';
    }
}
