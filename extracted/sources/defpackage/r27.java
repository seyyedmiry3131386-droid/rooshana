package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class r27 extends q27 {
    public final qq5 b;

    public r27(qq5 qq5Var, s27 s27Var) {
        super(s27Var);
        this.b = qq5Var;
    }

    @Override // defpackage.q27
    public final Object d() {
        return this.b.a();
    }

    @Override // defpackage.q27
    public final void f(Object obj, mw3 mw3Var, p27 p27Var) throws IllegalAccessException {
        Field field = p27Var.b;
        Object objB = p27Var.f.b(mw3Var);
        if (objB == null && p27Var.g) {
            return;
        }
        if (p27Var.h) {
            throw new JsonIOException(dw1.n("Cannot set value of 'static final' ", m27.d(field, false)));
        }
        field.set(obj, objB);
    }

    @Override // defpackage.q27
    public final Object e(Object obj) {
        return obj;
    }
}
