package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class i67 implements sx3 {
    public static final nd1 j = new nd1(50);
    public final dr3 b;
    public final sx3 c;
    public final sx3 d;
    public final int e;
    public final int f;
    public final Class g;
    public final sv5 h;
    public final nq8 i;

    public i67(dr3 dr3Var, sx3 sx3Var, sx3 sx3Var2, int i, int i2, nq8 nq8Var, Class cls, sv5 sv5Var) {
        this.b = dr3Var;
        this.c = sx3Var;
        this.d = sx3Var2;
        this.e = i;
        this.f = i2;
        this.i = nq8Var;
        this.g = cls;
        this.h = sv5Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        Object objF;
        dr3 dr3Var = this.b;
        synchronized (dr3Var) {
            ig4 ig4Var = (ig4) dr3Var.d;
            uh6 uh6VarC = (uh6) ((ArrayDeque) ig4Var.b).poll();
            if (uh6VarC == null) {
                uh6VarC = ig4Var.C();
            }
            hg4 hg4Var = (hg4) uh6VarC;
            hg4Var.b = 8;
            hg4Var.c = byte[].class;
            objF = dr3Var.f(hg4Var, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        nq8 nq8Var = this.i;
        if (nq8Var != null) {
            nq8Var.b(messageDigest);
        }
        this.h.b(messageDigest);
        nd1 nd1Var = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) nd1Var.b(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(sx3.a);
            nd1Var.e(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.i(bArr);
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof i67) {
            i67 i67Var = (i67) obj;
            if (this.f == i67Var.f && this.e == i67Var.e && i29.b(this.i, i67Var.i) && this.g.equals(i67Var.g) && this.c.equals(i67Var.c) && this.d.equals(i67Var.d) && this.h.equals(i67Var.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        nq8 nq8Var = this.i;
        if (nq8Var != null) {
            iHashCode = (iHashCode * 31) + nq8Var.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
