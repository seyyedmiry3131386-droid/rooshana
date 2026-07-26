package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh implements sp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ch chVar = (ch) this.b;
                qv8 qv8VarB = ((qh2) chVar.e).b((ph2) obj, (fj2) obj2, ((si2) obj3).a, ((cj2) obj4).a);
                if (qv8VarB instanceof pv8) {
                    Object obj5 = ((pv8) qv8VarB).a;
                    js3.n(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                sk6 sk6Var = new sk6(qv8VarB, chVar.j);
                chVar.j = sk6Var;
                Object obj6 = sk6Var.d;
                js3.n(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
            default:
                ut4 ut4Var = (ut4) this.b;
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                js3.m(sQLiteQuery);
                ro2 ro2Var = new ro2(sQLiteQuery);
                gc8 gc8Var = (gc8) ut4Var.b;
                int length = gc8Var.d.length;
                for (int i = 1; i < length; i++) {
                    int i2 = gc8Var.d[i];
                    if (i2 == 1) {
                        ro2Var.l(i, gc8Var.e[i]);
                    } else if (i2 == 2) {
                        ro2Var.N(i, gc8Var.f[i]);
                    } else if (i2 == 3) {
                        String str2 = gc8Var.g[i];
                        js3.m(str2);
                        ro2Var.x(i, str2);
                    } else if (i2 == 4) {
                        byte[] bArr = gc8Var.h[i];
                        js3.m(bArr);
                        ro2Var.i0(i, bArr);
                    } else if (i2 == 5) {
                        ro2Var.K0(i);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
