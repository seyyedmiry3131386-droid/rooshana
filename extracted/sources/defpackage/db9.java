package defpackage;

import com.android.volley.Request$Priority;
import com.android.volley.VolleyError;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class db9 extends x47 {
    public final ka1 o;
    public final Request$Priority p;
    public final Map q;

    public db9(String str, ka1 ka1Var, Request$Priority request$Priority, Map map) {
        super(0, str);
        this.o = ka1Var;
        this.p = request$Priority;
        this.q = map;
    }

    @Override // defpackage.x47
    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // defpackage.x47
    public final Map i() {
        return this.q;
    }

    @Override // defpackage.x47
    public final Request$Priority j() {
        return this.p;
    }

    @Override // defpackage.x47
    public final VolleyError o(VolleyError volleyError) {
        if (!l()) {
            this.o.a(volleyError);
        }
        return volleyError;
    }

    @Override // defpackage.x47
    public final ry p(fn5 fn5Var) {
        byte[] bArr = (byte[]) fn5Var.c;
        if (!l()) {
            this.o.f(new ByteArrayInputStream(bArr));
        }
        return new ry(bArr, yh0.E(fn5Var));
    }
}
