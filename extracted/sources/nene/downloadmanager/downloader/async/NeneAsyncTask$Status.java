package nene.downloadmanager.downloader.async;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class NeneAsyncTask$Status {
    public static final NeneAsyncTask$Status a;
    public static final NeneAsyncTask$Status b;
    public static final NeneAsyncTask$Status c;
    public static final /* synthetic */ NeneAsyncTask$Status[] d;

    static {
        NeneAsyncTask$Status neneAsyncTask$Status = new NeneAsyncTask$Status("PENDING", 0);
        a = neneAsyncTask$Status;
        NeneAsyncTask$Status neneAsyncTask$Status2 = new NeneAsyncTask$Status("RUNNING", 1);
        b = neneAsyncTask$Status2;
        NeneAsyncTask$Status neneAsyncTask$Status3 = new NeneAsyncTask$Status("FINISHED", 2);
        c = neneAsyncTask$Status3;
        d = new NeneAsyncTask$Status[]{neneAsyncTask$Status, neneAsyncTask$Status2, neneAsyncTask$Status3};
    }

    public static NeneAsyncTask$Status valueOf(String str) {
        return (NeneAsyncTask$Status) Enum.valueOf(NeneAsyncTask$Status.class, str);
    }

    public static NeneAsyncTask$Status[] values() {
        return (NeneAsyncTask$Status[]) d.clone();
    }
}
