package com.google.android.datatransport.runtime.backends;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BackendResponse$Status {
    public static final BackendResponse$Status a;
    public static final BackendResponse$Status b;
    public static final BackendResponse$Status c;
    public static final BackendResponse$Status d;
    public static final /* synthetic */ BackendResponse$Status[] e;

    static {
        BackendResponse$Status backendResponse$Status = new BackendResponse$Status("OK", 0);
        a = backendResponse$Status;
        BackendResponse$Status backendResponse$Status2 = new BackendResponse$Status("TRANSIENT_ERROR", 1);
        b = backendResponse$Status2;
        BackendResponse$Status backendResponse$Status3 = new BackendResponse$Status("FATAL_ERROR", 2);
        c = backendResponse$Status3;
        BackendResponse$Status backendResponse$Status4 = new BackendResponse$Status("INVALID_PAYLOAD", 3);
        d = backendResponse$Status4;
        e = new BackendResponse$Status[]{backendResponse$Status, backendResponse$Status2, backendResponse$Status3, backendResponse$Status4};
    }

    public static BackendResponse$Status valueOf(String str) {
        return (BackendResponse$Status) Enum.valueOf(BackendResponse$Status.class, str);
    }

    public static BackendResponse$Status[] values() {
        return (BackendResponse$Status[]) e.clone();
    }
}
