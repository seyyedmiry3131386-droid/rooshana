package com.microsoft.clarity.q;

import android.os.Trace;
import com.microsoft.clarity.g.h0;
import defpackage.bp2;
import defpackage.js3;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {
    public static Object a(String str, h0 h0Var, bp2 bp2Var) {
        js3.p(str, "section");
        js3.p(bp2Var, "code");
        try {
            Trace.beginSection(str);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ref$ObjectRef.a = bp2Var.invoke();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (h0Var != null) {
                h0Var.a(str, jCurrentTimeMillis2);
            }
            return ref$ObjectRef.a;
        } finally {
            Trace.endSection();
        }
    }
}
