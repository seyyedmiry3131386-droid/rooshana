package org.commonmark.internal;

import defpackage.r32;
import defpackage.t74;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public LinkReferenceDefinitionParser$State a = LinkReferenceDefinitionParser$State.a;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String strA = r32.a(this.f);
            StringBuilder sb = this.h;
            String strA2 = sb != null ? r32.a(sb.toString()) : null;
            String str = this.e;
            t74 t74Var = new t74();
            t74Var.f = str;
            t74Var.g = strA;
            t74Var.h = strA2;
            this.c.add(t74Var);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}
