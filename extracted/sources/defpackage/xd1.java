package defpackage;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class xd1 implements j21 {
    public final Context a;
    public final r57 b;

    public xd1(Context context, r57 r57Var) {
        this.a = context.getApplicationContext();
        this.b = r57Var;
    }

    @Override // defpackage.e64
    public final void b() {
        wx7 wx7VarA = wx7.a(this.a);
        r57 r57Var = this.b;
        synchronized (wx7VarA) {
            ((HashSet) wx7VarA.c).remove(r57Var);
            if (wx7VarA.a && ((HashSet) wx7VarA.c).isEmpty()) {
                ((sx7) wx7VarA.b).b();
                wx7VarA.a = false;
            }
        }
    }

    @Override // defpackage.e64
    public final void k() {
        wx7 wx7VarA = wx7.a(this.a);
        r57 r57Var = this.b;
        synchronized (wx7VarA) {
            ((HashSet) wx7VarA.c).add(r57Var);
            if (!wx7VarA.a && !((HashSet) wx7VarA.c).isEmpty()) {
                wx7VarA.a = ((sx7) wx7VarA.b).a();
            }
        }
    }

    @Override // defpackage.e64
    public final void e() {
    }
}
