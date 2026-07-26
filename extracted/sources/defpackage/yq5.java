package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class yq5 implements sx3 {
    public final Object b;

    public yq5(Object obj) {
        ok4.p(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(sx3.a));
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof yq5) {
            return this.b.equals(((yq5) obj).b);
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
