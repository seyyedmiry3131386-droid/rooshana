package androidx.compose.ui.semantics;

import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;
    public final qp2 b;
    public final boolean c;

    public g(String str, qp2 qp2Var) {
        this.a = str;
        this.b = qp2Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ g(String str) {
        this(str, new qp2() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return obj == null ? obj2 : obj;
            }
        });
    }

    public g(String str, int i) {
        this(str);
        this.c = true;
    }

    public g(String str, boolean z, qp2 qp2Var) {
        this(str, qp2Var);
        this.c = z;
    }
}
