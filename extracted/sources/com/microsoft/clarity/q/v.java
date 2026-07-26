package com.microsoft.clarity.q;

import defpackage.bp2;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public static s a(bp2 bp2Var) {
        u uVar;
        js3.p(bp2Var, "task");
        int i = 0;
        while (i < 3) {
            try {
                uVar = (u) bp2Var.invoke();
            } catch (Exception e) {
                i++;
                if (i >= 3) {
                    throw e;
                }
            }
            if (uVar instanceof s) {
                return (s) uVar;
            }
            if (uVar instanceof r) {
                i++;
            }
        }
        throw new com.microsoft.clarity.c.c(3);
    }
}
