package com.microsoft.clarity.q;

import defpackage.js3;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final String a;
    public static final int b;
    public static Boolean c;
    public static Integer d;
    public static Boolean e;

    static {
        String id = TimeZone.getDefault().getID();
        js3.o(id, "getDefault().id");
        a = id;
        TimeZone timeZone = TimeZone.getDefault();
        b = (-(timeZone.getDSTSavings() + timeZone.getRawOffset())) / 60000;
    }
}
