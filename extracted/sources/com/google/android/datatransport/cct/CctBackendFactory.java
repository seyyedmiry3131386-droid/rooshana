package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import defpackage.bs8;
import defpackage.h71;
import defpackage.j20;
import defpackage.un0;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory {
    public bs8 create(h71 h71Var) {
        j20 j20Var = (j20) h71Var;
        return new un0(j20Var.a, j20Var.b, j20Var.c);
    }
}
