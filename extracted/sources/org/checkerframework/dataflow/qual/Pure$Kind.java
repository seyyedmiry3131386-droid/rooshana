package org.checkerframework.dataflow.qual;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Pure$Kind {
    public static final /* synthetic */ Pure$Kind[] a = {new Pure$Kind("SIDE_EFFECT_FREE", 0), new Pure$Kind("DETERMINISTIC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Pure$Kind EF5;

    public static Pure$Kind valueOf(String str) {
        return (Pure$Kind) Enum.valueOf(Pure$Kind.class, str);
    }

    public static Pure$Kind[] values() {
        return (Pure$Kind[]) a.clone();
    }
}
