package defpackage;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* JADX INFO: loaded from: classes.dex */
public final class xx implements fn6 {
    public final int a;

    public xx(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return fn6.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn6)) {
            return false;
        }
        if (this.a != ((xx) ((fn6) obj)).a) {
            return false;
        }
        Object obj2 = Protobuf$IntEncoding.a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (Protobuf$IntEncoding.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + Protobuf$IntEncoding.a + ')';
    }
}
