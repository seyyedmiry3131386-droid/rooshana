package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.a67;
import defpackage.bg8;
import defpackage.cc7;
import defpackage.dp2;
import defpackage.kb5;
import defpackage.lg8;
import defpackage.mb5;
import defpackage.ri1;
import defpackage.v25;
import defpackage.xf8;
import defpackage.yf8;
import defpackage.zf8;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final zf8 a(ri1 ri1Var) {
        lg8 lg8Var;
        xf8 xf8Var = new xf8();
        cc7.F(ri1Var, bg8.a, new v25(new a67(21, xf8Var), new TextContextMenuModifierKt$collectTextContextMenuData$1$1(1, xf8Var, xf8.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0), 23));
        mb5 mb5Var = new mb5();
        mb5 mb5Var2 = xf8Var.a;
        Object[] objArr = mb5Var2.a;
        int i = mb5Var2.b;
        int i2 = 0;
        boolean z = true;
        yf8 yf8Var = null;
        while (true) {
            lg8Var = lg8.b;
            if (i2 >= i) {
                break;
            }
            yf8 yf8Var2 = (yf8) objArr[i2];
            if (!z || yf8Var2 != lg8Var) {
                if (yf8Var2 == lg8Var && yf8Var == lg8Var) {
                    z = false;
                    break;
                    break;
                }
                if (yf8Var2 != lg8Var) {
                    mb5 mb5Var3 = xf8Var.b;
                    Object[] objArr2 = mb5Var3.a;
                    int i3 = mb5Var3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((Boolean) ((dp2) objArr2[i4]).invoke(yf8Var2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                mb5Var.g(yf8Var2);
                z = false;
                yf8Var = yf8Var2;
            }
            i2++;
        }
        if (((yf8) (mb5Var.d() ? null : mb5Var.a[mb5Var.b - 1])) == lg8Var) {
            mb5Var.l(mb5Var.b - 1);
        }
        kb5 kb5Var = mb5Var.c;
        if (kb5Var == null) {
            kb5Var = new kb5(0, mb5Var);
            mb5Var.c = kb5Var;
        }
        return new zf8(kb5Var);
    }
}
