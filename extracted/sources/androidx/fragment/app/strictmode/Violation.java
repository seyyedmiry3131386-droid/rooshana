package androidx.fragment.app.strictmode;

import androidx.fragment.app.d;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public abstract class Violation extends RuntimeException {
    public final d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(d dVar, String str) {
        super(str);
        js3.p(dVar, "fragment");
        this.a = dVar;
    }
}
