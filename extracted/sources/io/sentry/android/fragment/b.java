package io.sentry.android.fragment;

import defpackage.js3;
import io.sentry.a1;
import io.sentry.z3;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements z3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ b(Ref$ObjectRef ref$ObjectRef, int i) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    @Override // io.sentry.z3
    public final void g(a1 a1Var) {
        switch (this.a) {
            case 0:
                js3.p(a1Var, "it");
                this.b.a = a1Var.o();
                break;
            case 1:
                js3.p(a1Var, "scope");
                this.b.a = new ArrayList(a1Var.u());
                break;
            default:
                js3.p(a1Var, "it");
                this.b.a = a1Var.o();
                break;
        }
    }
}
