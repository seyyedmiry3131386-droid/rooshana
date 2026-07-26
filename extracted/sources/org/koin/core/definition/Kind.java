package org.koin.core.definition;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Kind {
    public static final Kind a;
    public static final Kind b;
    public static final Kind c;
    public static final /* synthetic */ Kind[] d;

    static {
        Kind kind = new Kind("Singleton", 0);
        a = kind;
        Kind kind2 = new Kind("Factory", 1);
        b = kind2;
        Kind kind3 = new Kind("Scoped", 2);
        c = kind3;
        Kind[] kindArr = {kind, kind2, kind3};
        d = kindArr;
        a.a(kindArr);
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) d.clone();
    }
}
