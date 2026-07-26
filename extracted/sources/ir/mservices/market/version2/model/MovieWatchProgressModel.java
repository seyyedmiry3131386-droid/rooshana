package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import defpackage.bl4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "movie_watch_progress")
public final class MovieWatchProgressModel implements Serializable {

    @DatabaseField(columnName = "content_length")
    private long contentLength;

    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "movie_id")
    private String movieId;

    @DatabaseField(columnName = "play_id")
    private String playId;

    @DatabaseField(columnName = "time")
    private long time;

    @DatabaseField(columnName = "timestamp")
    private long timeStamp;

    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public final long a() {
        return this.contentLength;
    }

    public final String b() {
        return this.movieId;
    }

    public final String c() {
        return this.playId;
    }

    public final long e() {
        return this.time;
    }

    public final long f() {
        return this.timeStamp;
    }

    public final String toString() {
        int i = this.id;
        String str = this.playId;
        String str2 = this.movieId;
        long j = this.time;
        long j2 = this.contentLength;
        long j3 = this.timeStamp;
        StringBuilder sb = new StringBuilder("MovieProgressModel{title='");
        sb.append(i);
        sb.append("', playId='");
        sb.append(str);
        sb.append("', movieId='");
        sb.append(str2);
        sb.append("', time=");
        sb.append(j);
        sb.append(", contentLength=");
        sb.append(j2);
        sb.append(", updateTimeStamp=");
        return bl4.s(j3, "}", sb);
    }
}
