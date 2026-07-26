package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public class zb4 extends SoftReference implements ec4 {
    public final c27 a;

    public zb4(ReferenceQueue referenceQueue, Object obj, c27 c27Var) {
        super(obj, referenceQueue);
        this.a = c27Var;
    }

    @Override // defpackage.ec4
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ec4
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ec4
    public final c27 c() {
        return this.a;
    }

    @Override // defpackage.ec4
    public int e() {
        return 1;
    }

    @Override // defpackage.ec4
    public ec4 f(ReferenceQueue referenceQueue, Object obj, c27 c27Var) {
        return new zb4(referenceQueue, obj, c27Var);
    }

    @Override // defpackage.ec4
    public final void d(Object obj) {
    }
}
