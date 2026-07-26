package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class er2 implements Cloneable {
    public final f a;
    public f b;

    public er2(f fVar) {
        this.a = fVar;
        if (fVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = fVar.i();
    }

    public final f a() {
        f fVarB = b();
        fVarB.getClass();
        if (f.f(fVarB, true)) {
            return fVarB;
        }
        throw new UninitializedMessageException();
    }

    public final f b() {
        if (!this.b.g()) {
            return this.b;
        }
        f fVar = this.b;
        fVar.getClass();
        hn6 hn6Var = hn6.c;
        hn6Var.getClass();
        hn6Var.a(fVar.getClass()).b(fVar);
        fVar.h();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        f fVarI = this.a.i();
        f fVar = this.b;
        hn6 hn6Var = hn6.c;
        hn6Var.getClass();
        hn6Var.a(fVarI.getClass()).a(fVarI, fVar);
        this.b = fVarI;
    }

    public final Object clone() {
        er2 er2Var = (er2) this.a.c(GeneratedMessageLite$MethodToInvoke.e);
        er2Var.b = b();
        return er2Var;
    }
}
