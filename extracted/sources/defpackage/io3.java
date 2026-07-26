package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class io3 implements sa1 {
    public final dr3 a;

    public io3(dr3 dr3Var) {
        this.a = dr3Var;
    }

    @Override // defpackage.sa1
    public final ta1 a(Object obj) {
        return new pt2((InputStream) obj, this.a);
    }

    @Override // defpackage.sa1
    public final Class getDataClass() {
        return InputStream.class;
    }
}
