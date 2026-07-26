package defpackage;

import com.google.protobuf.WireFormat$FieldType;

/* JADX INFO: loaded from: classes3.dex */
public final class hr2 implements Comparable {
    public final int a;
    public final WireFormat$FieldType b;
    public final boolean c;
    public final boolean d;

    public hr2(nr3 nr3Var, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
        this.a = i;
        this.b = wireFormat$FieldType;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((hr2) obj).a;
    }
}
