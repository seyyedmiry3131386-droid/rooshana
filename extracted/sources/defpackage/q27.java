package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q27 extends qt8 {
    public final s27 a;

    public q27(s27 s27Var) {
        this.a = s27Var;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        Object objD = d();
        Map map = this.a.a;
        try {
            mw3Var.P0();
            while (mw3Var.hasNext()) {
                p27 p27Var = (p27) map.get(mw3Var.m0());
                if (p27Var == null) {
                    mw3Var.z();
                } else {
                    f(objD, mw3Var, p27Var);
                }
            }
            mw3Var.t0();
            return e(objD);
        } catch (IllegalAccessException e) {
            j27 j27Var = m27.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        if (obj == null) {
            uw3Var.u();
            return;
        }
        uw3Var.P0();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((p27) it.next()).a(uw3Var, obj);
            }
            uw3Var.t0();
        } catch (IllegalAccessException e) {
            j27 j27Var = m27.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, mw3 mw3Var, p27 p27Var);
}
