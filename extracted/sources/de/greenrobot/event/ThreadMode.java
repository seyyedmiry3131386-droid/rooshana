package de.greenrobot.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadMode {
    public static final ThreadMode a;
    public static final ThreadMode b;
    public static final ThreadMode c;
    public static final ThreadMode d;
    public static final /* synthetic */ ThreadMode[] e;

    static {
        ThreadMode threadMode = new ThreadMode("PostThread", 0);
        a = threadMode;
        ThreadMode threadMode2 = new ThreadMode("MainThread", 1);
        b = threadMode2;
        ThreadMode threadMode3 = new ThreadMode("BackgroundThread", 2);
        c = threadMode3;
        ThreadMode threadMode4 = new ThreadMode("Async", 3);
        d = threadMode4;
        e = new ThreadMode[]{threadMode, threadMode2, threadMode3, threadMode4};
    }

    public static ThreadMode valueOf(String str) {
        return (ThreadMode) Enum.valueOf(ThreadMode.class, str);
    }

    public static ThreadMode[] values() {
        return (ThreadMode[]) e.clone();
    }
}
