package com.microsoft.clarity.g;

import com.microsoft.clarity.models.MaskingMode;
import defpackage.js3;
import defpackage.ov;

/* JADX INFO: loaded from: classes3.dex */
public final class K {
    public final MaskingMode a;
    public final J b;
    public final ov c;
    public final ov d;

    public K(boolean z, MaskingMode maskingMode, J j) {
        js3.p(maskingMode, "maskingMode");
        js3.p(j, "directives");
        this.a = maskingMode;
        this.b = j;
        ov ovVar = new ov();
        ovVar.addLast(Boolean.valueOf(z));
        this.c = ovVar;
        this.d = new ov();
    }

    public final void a(int i) {
        Integer num = (Integer) this.d.j();
        if (num != null) {
            if (this.b.b.contains(Integer.valueOf(num.intValue()))) {
                return;
            }
        }
        if (this.b.b.contains(Integer.valueOf(i)) || this.b.a.contains(Integer.valueOf(i))) {
            this.c.addLast(Boolean.TRUE);
        } else if (!this.b.c.contains(Integer.valueOf(i))) {
            return;
        } else {
            this.c.addLast(Boolean.FALSE);
        }
        this.d.addLast(Integer.valueOf(i));
    }

    public final void b(int i) throws com.microsoft.clarity.c.a {
        if (this.d.isEmpty() || ((Number) this.d.last()).intValue() != i) {
            return;
        }
        this.d.removeLast();
        if (this.c.a() > 1) {
            this.c.removeLast();
            return;
        }
        throw new com.microsoft.clarity.c.a("Masking stack underflow while exiting node " + i + '.');
    }
}
