package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bw extends qt8 {
    public static final aw c = new aw();
    public final Class a;
    public final ci4 b;

    public bw(vv2 vv2Var, qt8 qt8Var, Class cls) {
        this.b = new ci4(vv2Var, qt8Var, cls);
        this.a = cls;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        mw3Var.c1();
        while (mw3Var.hasNext()) {
            arrayList.add(this.b.c.b(mw3Var));
        }
        mw3Var.W0();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        if (obj == null) {
            uw3Var.u();
            return;
        }
        uw3Var.c1();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(uw3Var, Array.get(obj, i));
        }
        uw3Var.W0();
    }
}
