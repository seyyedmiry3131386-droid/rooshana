package androidx.datastore.preferences.protobuf;

import defpackage.dw1;
import defpackage.er2;
import defpackage.hf7;
import defpackage.i72;
import defpackage.k72;
import defpackage.r79;

/* JADX INFO: loaded from: classes.dex */
public final class i implements hf7 {
    public final a a;
    public final m b;
    public final k72 c;

    public i(m mVar, k72 k72Var, a aVar) {
        this.b = mVar;
        k72Var.getClass();
        this.c = k72Var;
        this.a = aVar;
    }

    @Override // defpackage.hf7
    public final void a(Object obj, Object obj2) {
        l.k(this.b, obj, obj2);
    }

    @Override // defpackage.hf7
    public final void b(Object obj) {
        ((o) this.b).getClass();
        n nVar = ((f) obj).unknownFields;
        if (nVar.e) {
            nVar.e = false;
        }
        this.c.getClass();
        dw1.x(obj);
        throw null;
    }

    @Override // defpackage.hf7
    public final boolean c(Object obj) {
        this.c.getClass();
        dw1.x(obj);
        throw null;
    }

    @Override // defpackage.hf7
    public final f d() {
        a aVar = this.a;
        return aVar instanceof f ? ((f) aVar).i() : ((er2) ((f) aVar).c(GeneratedMessageLite$MethodToInvoke.e)).b();
    }

    @Override // defpackage.hf7
    public final void e(Object obj, r79 r79Var) {
        this.c.getClass();
        dw1.x(obj);
        throw null;
    }

    @Override // defpackage.hf7
    public final void f(Object obj, d dVar, i72 i72Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.hf7
    public final int g(f fVar) {
        ((o) this.b).getClass();
        n nVar = fVar.unknownFields;
        int i = nVar.d;
        if (i != -1) {
            return i;
        }
        int iV = 0;
        for (int i2 = 0; i2 < nVar.a; i2++) {
            int i3 = nVar.b[i2] >>> 3;
            iV += e.V(3, (ByteString) nVar.c[i2]) + e.a0(i3) + e.Z(2) + (e.Z(1) * 2);
        }
        nVar.d = iV;
        return iV;
    }

    @Override // defpackage.hf7
    public final int h(f fVar) {
        ((o) this.b).getClass();
        return fVar.unknownFields.hashCode();
    }

    @Override // defpackage.hf7
    public final boolean i(f fVar, f fVar2) {
        o oVar = (o) this.b;
        oVar.getClass();
        n nVar = fVar.unknownFields;
        oVar.getClass();
        return nVar.equals(fVar2.unknownFields);
    }
}
