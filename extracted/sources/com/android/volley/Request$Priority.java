package com.android.volley;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Request$Priority {
    public static final Request$Priority a;
    public static final Request$Priority b;
    public static final Request$Priority c;
    public static final Request$Priority d;
    public static final /* synthetic */ Request$Priority[] e;

    static {
        Request$Priority request$Priority = new Request$Priority("LOW", 0);
        a = request$Priority;
        Request$Priority request$Priority2 = new Request$Priority("NORMAL", 1);
        b = request$Priority2;
        Request$Priority request$Priority3 = new Request$Priority("HIGH", 2);
        c = request$Priority3;
        Request$Priority request$Priority4 = new Request$Priority("IMMEDIATE", 3);
        d = request$Priority4;
        e = new Request$Priority[]{request$Priority, request$Priority2, request$Priority3, request$Priority4};
    }

    public static Request$Priority valueOf(String str) {
        return (Request$Priority) Enum.valueOf(Request$Priority.class, str);
    }

    public static Request$Priority[] values() {
        return (Request$Priority[]) e.clone();
    }
}
