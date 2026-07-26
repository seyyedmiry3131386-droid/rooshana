package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Priority {
    public static final Priority a;
    public static final Priority b;
    public static final Priority c;
    public static final /* synthetic */ Priority[] d;

    static {
        Priority priority = new Priority("DEFAULT", 0);
        a = priority;
        Priority priority2 = new Priority("VERY_LOW", 1);
        b = priority2;
        Priority priority3 = new Priority("HIGHEST", 2);
        c = priority3;
        d = new Priority[]{priority, priority2, priority3};
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) d.clone();
    }
}
