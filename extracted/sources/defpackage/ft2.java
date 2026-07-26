package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.load.engine.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ft2 extends ContextWrapper {
    public static final nr2 k = new nr2();
    public final dr3 a;
    public final x41 b;
    public final cv c;
    public final ys2 d;
    public final List e;
    public final wv f;
    public final b g;
    public final pt2 h;
    public final int i;
    public w57 j;

    public ft2(Context context, dr3 dr3Var, ry ryVar, cv cvVar, ys2 ys2Var, wv wvVar, List list, b bVar, pt2 pt2Var, int i) {
        super(context.getApplicationContext());
        this.a = dr3Var;
        this.c = cvVar;
        this.d = ys2Var;
        this.e = list;
        this.f = wvVar;
        this.g = bVar;
        this.h = pt2Var;
        this.i = i;
        this.b = new x41(ryVar);
    }

    public final synchronized w57 a() {
        try {
            if (this.j == null) {
                this.j = (w57) this.d.build().q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final y27 b() {
        return (y27) this.b.get();
    }
}
