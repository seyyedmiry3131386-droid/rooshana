package defpackage;

import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;

/* JADX INFO: loaded from: classes3.dex */
public final class ir2 extends d72 {
    public final ev4 a;
    public final Object b;
    public final ev4 c;
    public final hr2 d;

    public ir2(ev4 ev4Var, Object obj, ev4 ev4Var2, hr2 hr2Var) {
        if (ev4Var == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (hr2Var.b == WireFormat$FieldType.e && ev4Var2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = ev4Var;
        this.b = obj;
        this.c = ev4Var2;
        this.d = hr2Var;
    }

    public final Object a(Object obj) {
        if (this.d.b.a != WireFormat$JavaType.ENUM) {
            return obj;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    public final Object b(Object obj) {
        return this.d.b.a == WireFormat$JavaType.ENUM ? Integer.valueOf(((lr3) obj).getNumber()) : obj;
    }
}
