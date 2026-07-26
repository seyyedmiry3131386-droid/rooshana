package defpackage;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class jt7 {
    public static final u58 a = new u58(new js5(29));

    public static final xr7 a(ShapeKeyTokens shapeKeyTokens, qz0 qz0Var) {
        it7 it7Var = (it7) qz0Var.j(a);
        switch (shapeKeyTokens.ordinal()) {
            case 0:
                return it7Var.h;
            case 1:
                return it7Var.e;
            case 2:
                return it7Var.g;
            case 3:
                return b(it7Var.e);
            case 4:
                return it7Var.a;
            case 5:
                return b(it7Var.a);
            case 6:
                return la7.a;
            case 7:
                return it7Var.d;
            case 8:
                i61 i61Var = it7Var.d;
                bu1 bu1Var = gs7.i;
                return i61.c(i61Var, bu1Var, null, null, bu1Var, 6);
            case 9:
                return it7Var.f;
            case 10:
                i61 i61Var2 = it7Var.d;
                bu1 bu1Var2 = gs7.i;
                return i61.c(i61Var2, null, bu1Var2, bu1Var2, null, 9);
            case 11:
                return b(it7Var.d);
            case 12:
                return it7Var.c;
            case 13:
                return tt3.d;
            case 14:
                return it7Var.b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static i61 b(i61 i61Var) {
        bu1 bu1Var = gs7.i;
        return i61.c(i61Var, null, null, bu1Var, bu1Var, 3);
    }
}
