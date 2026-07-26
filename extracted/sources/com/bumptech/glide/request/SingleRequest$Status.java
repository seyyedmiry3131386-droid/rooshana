package com.bumptech.glide.request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class SingleRequest$Status {
    public static final SingleRequest$Status a;
    public static final SingleRequest$Status b;
    public static final SingleRequest$Status c;
    public static final SingleRequest$Status d;
    public static final SingleRequest$Status e;
    public static final SingleRequest$Status f;
    public static final /* synthetic */ SingleRequest$Status[] g;

    static {
        SingleRequest$Status singleRequest$Status = new SingleRequest$Status("PENDING", 0);
        a = singleRequest$Status;
        SingleRequest$Status singleRequest$Status2 = new SingleRequest$Status("RUNNING", 1);
        b = singleRequest$Status2;
        SingleRequest$Status singleRequest$Status3 = new SingleRequest$Status("WAITING_FOR_SIZE", 2);
        c = singleRequest$Status3;
        SingleRequest$Status singleRequest$Status4 = new SingleRequest$Status("COMPLETE", 3);
        d = singleRequest$Status4;
        SingleRequest$Status singleRequest$Status5 = new SingleRequest$Status("FAILED", 4);
        e = singleRequest$Status5;
        SingleRequest$Status singleRequest$Status6 = new SingleRequest$Status("CLEARED", 5);
        f = singleRequest$Status6;
        g = new SingleRequest$Status[]{singleRequest$Status, singleRequest$Status2, singleRequest$Status3, singleRequest$Status4, singleRequest$Status5, singleRequest$Status6};
    }

    public static SingleRequest$Status valueOf(String str) {
        return (SingleRequest$Status) Enum.valueOf(SingleRequest$Status.class, str);
    }

    public static SingleRequest$Status[] values() {
        return (SingleRequest$Status[]) g.clone();
    }
}
