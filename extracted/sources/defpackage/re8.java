package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public abstract class re8 {
    public static void c(vp7 vp7Var, rf0 rf0Var, kd3 kd3Var) {
        ArrayList arrayList = kd3Var.f;
        for (kd3 kd3Var2 : arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList)) {
            if (kd3Var2.m()) {
                re8 re8VarM = rf0Var.M((String) kd3Var2.c);
                if (re8VarM != null) {
                    re8VarM.a(vp7Var, rf0Var, kd3Var2);
                } else {
                    c(vp7Var, rf0Var, kd3Var2);
                }
            }
        }
    }

    public abstract void a(vp7 vp7Var, rf0 rf0Var, u2 u2Var);

    public abstract Collection b();
}
