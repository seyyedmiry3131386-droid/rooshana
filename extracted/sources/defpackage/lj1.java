package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class lj1 implements ho7 {
    public final CharSequence a;
    public final int b;
    public final qp2 c;

    public lj1(CharSequence charSequence, int i, qp2 qp2Var) {
        js3.p(charSequence, "input");
        this.a = charSequence;
        this.b = i;
        this.c = qp2Var;
    }

    @Override // defpackage.ho7
    public final Iterator iterator() {
        return new kj1(this);
    }
}
