package androidx.compose.ui.semantics;

import defpackage.bp2;
import defpackage.en7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Object a(en7 en7Var, g gVar) {
        Object objG = en7Var.a.g(gVar);
        return objG == null ? new bp2() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // defpackage.bp2
            public final Object invoke() {
                return null;
            }
        }.invoke() : objG;
    }
}
