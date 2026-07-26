package defpackage;

import com.android.volley.Request$Priority;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class eb9 implements la1 {
    public final l37 a;
    public final ot2 b;
    public volatile db9 c;

    public eb9(l37 l37Var, ot2 ot2Var) {
        this.a = l37Var;
        this.b = ot2Var;
    }

    @Override // defpackage.la1
    public final void cancel() {
        db9 db9Var = this.c;
        if (db9Var != null) {
            db9Var.b();
        }
    }

    @Override // defpackage.la1
    public final DataSource d() {
        return DataSource.b;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) {
        String strD = this.b.d();
        int iOrdinal = priority.ordinal();
        this.c = new db9(strD, ka1Var, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 3 ? Request$Priority.b : Request$Priority.a : Request$Priority.c : Request$Priority.d, this.b.b.a());
        this.a.a(this.c);
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override // defpackage.la1
    public final void c() {
    }
}
