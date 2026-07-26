package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o78 {
    public static final Set a = ew.b1(new no7[]{sw8.b, xw8.b, kw8.b, cx8.b});

    public static final boolean a(no7 no7Var) {
        js3.p(no7Var, "<this>");
        return no7Var.isInline() && a.contains(no7Var);
    }
}
