package ir.mservices.market.version2.core.async;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncTaskSupport$Status {
    public static final AsyncTaskSupport$Status a;
    public static final AsyncTaskSupport$Status b;
    public static final AsyncTaskSupport$Status c;
    public static final /* synthetic */ AsyncTaskSupport$Status[] d;

    static {
        AsyncTaskSupport$Status asyncTaskSupport$Status = new AsyncTaskSupport$Status("PENDING", 0);
        a = asyncTaskSupport$Status;
        AsyncTaskSupport$Status asyncTaskSupport$Status2 = new AsyncTaskSupport$Status("RUNNING", 1);
        b = asyncTaskSupport$Status2;
        AsyncTaskSupport$Status asyncTaskSupport$Status3 = new AsyncTaskSupport$Status("FINISHED", 2);
        c = asyncTaskSupport$Status3;
        d = new AsyncTaskSupport$Status[]{asyncTaskSupport$Status, asyncTaskSupport$Status2, asyncTaskSupport$Status3};
    }

    public static AsyncTaskSupport$Status valueOf(String str) {
        return (AsyncTaskSupport$Status) Enum.valueOf(AsyncTaskSupport$Status.class, str);
    }

    public static AsyncTaskSupport$Status[] values() {
        return (AsyncTaskSupport$Status[]) d.clone();
    }
}
