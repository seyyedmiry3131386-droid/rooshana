package defpackage;

import androidx.compose.runtime.InvalidationResult;
import kotlin.Pair;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class rz0 implements ny6 {
    public final /* synthetic */ j01 a;
    public final /* synthetic */ lz4 b;

    public rz0(j01 j01Var, lz4 lz4Var) {
        this.a = j01Var;
        this.b = lz4Var;
    }

    @Override // defpackage.ny6
    public final InvalidationResult c(my6 my6Var, Object obj) {
        InvalidationResult invalidationResultC;
        j01 j01Var = this.a;
        j01 j01Var2 = j01Var instanceof ny6 ? j01Var : null;
        if (j01Var2 == null || (invalidationResultC = j01Var2.c(my6Var, obj)) == null) {
            invalidationResultC = InvalidationResult.a;
        }
        if (invalidationResultC != InvalidationResult.a) {
            return invalidationResultC;
        }
        lz4 lz4Var = this.b;
        lz4Var.f = a.A0(new Pair(my6Var, obj), lz4Var.f);
        return InvalidationResult.b;
    }

    @Override // defpackage.ny6
    public final void a() {
    }

    @Override // defpackage.ny6
    public final void b(Object obj) {
    }
}
