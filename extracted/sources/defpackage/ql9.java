package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ql9 implements tl9 {
    public final /* synthetic */ int a;
    public final o77 b;
    public final String c;

    public /* synthetic */ ql9(o77 o77Var, String str, int i) {
        this.a = i;
        this.b = o77Var;
        this.c = str;
    }

    @Override // defpackage.tl9
    public final o77 b(xk9 xk9Var) {
        switch (this.a) {
            case 0:
                o77 o77VarK = this.b.K();
                String str = this.c;
                o77VarK.N(str, xk9Var);
                ((HashMap) o77VarK.d).put(str, Boolean.TRUE);
                return o77VarK;
            default:
                String str2 = this.c;
                o77 o77Var = this.b;
                o77Var.N(str2, xk9Var);
                return o77Var;
        }
    }
}
