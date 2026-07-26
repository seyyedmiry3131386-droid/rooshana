package defpackage;

import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class si0 implements vh5 {
    public Pointer a;

    public si0(int i) {
        this.a = null;
        this.a = new gt4(i);
    }

    @Override // defpackage.vh5
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.vh5
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        si0 si0Var = (si0) yq2.r0(getClass());
        si0Var.a = (Pointer) obj;
        return si0Var;
    }

    @Override // defpackage.vh5
    public final Class c() {
        return Pointer.class;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof si0)) {
            return false;
        }
        Pointer pointer = ((si0) obj).a;
        Pointer pointer2 = this.a;
        return pointer2 == null ? pointer == null : pointer2.equals(pointer);
    }

    public final int hashCode() {
        Pointer pointer = this.a;
        if (pointer != null) {
            return pointer.hashCode();
        }
        return 0;
    }

    public final String toString() {
        if (this.a == null) {
            return "NULL";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" (");
        return dw1.s(sb, super.toString(), ")");
    }
}
