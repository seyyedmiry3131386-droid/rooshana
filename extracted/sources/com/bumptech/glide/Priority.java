package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Priority {
    public static final Priority a;
    public static final Priority b;
    public static final Priority c;
    public static final Priority d;
    public static final /* synthetic */ Priority[] e;

    static {
        Priority priority = new Priority("IMMEDIATE", 0);
        a = priority;
        Priority priority2 = new Priority("HIGH", 1);
        b = priority2;
        Priority priority3 = new Priority("NORMAL", 2);
        c = priority3;
        Priority priority4 = new Priority("LOW", 3);
        d = priority4;
        e = new Priority[]{priority, priority2, priority3, priority4};
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) e.clone();
    }
}
