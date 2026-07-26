package kotlin.jvm.internal;

import defpackage.aq2;
import defpackage.g27;
import defpackage.i27;
import defpackage.rm7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AdaptedFunctionReference implements aq2, Serializable {
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e = false;
    public final int f;
    public final int g;

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.f = i;
        this.g = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.e == adaptedFunctionReference.e && this.f == adaptedFunctionReference.f && this.g == adaptedFunctionReference.g && this.a.equals(adaptedFunctionReference.a) && this.b.equals(adaptedFunctionReference.b) && this.c.equals(adaptedFunctionReference.c) && this.d.equals(adaptedFunctionReference.d);
    }

    @Override // defpackage.aq2
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        return ((((rm7.k(this.d, rm7.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        g27.a.getClass();
        return i27.a(this);
    }
}
