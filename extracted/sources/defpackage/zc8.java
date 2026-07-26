package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.f;

/* JADX INFO: loaded from: classes.dex */
public final class zc8 extends mx4 {
    public final Object b;
    public final Object c;
    public final PointerInputEventHandler d;

    public zc8(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.b = obj;
        this.c = obj2;
        this.d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc8)) {
            return false;
        }
        zc8 zc8Var = (zc8) obj;
        return js3.i(this.b, zc8Var.b) && js3.i(this.c, zc8Var.c) && this.d == zc8Var.d;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new f(this.b, this.c, this.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        return this.d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        f fVar = (f) gx4Var;
        Object obj = fVar.o;
        Object obj2 = this.b;
        boolean z = !js3.i(obj, obj2);
        fVar.o = obj2;
        Object obj3 = fVar.p;
        Object obj4 = this.c;
        if (!js3.i(obj3, obj4)) {
            z = true;
        }
        fVar.p = obj4;
        Class<?> cls = fVar.q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            fVar.E0();
        }
        fVar.q = pointerInputEventHandler;
    }
}
