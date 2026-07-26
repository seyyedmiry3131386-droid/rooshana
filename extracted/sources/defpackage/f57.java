package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f57 extends x80 {
    public f57 A;
    public f57 B;
    public boolean C = true;
    public boolean D;
    public boolean E;
    public final Context t;
    public final s57 u;
    public final Class v;
    public final ft2 w;
    public sr8 x;
    public Object y;
    public ArrayList z;

    static {
    }

    public f57(a aVar, s57 s57Var, Class cls, Context context) {
        w57 w57Var;
        this.u = s57Var;
        this.v = cls;
        this.t = context;
        wv wvVar = s57Var.a.c.f;
        sr8 sr8Var = (sr8) wvVar.get(cls);
        if (sr8Var == null) {
            for (Map.Entry entry : (rv) wvVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    sr8Var = (sr8) entry.getValue();
                }
            }
        }
        this.x = sr8Var == null ? ft2.k : sr8Var;
        this.w = aVar.c;
        Iterator it = s57Var.i.iterator();
        while (it.hasNext()) {
            L((p57) it.next());
        }
        synchronized (s57Var) {
            w57Var = s57Var.j;
        }
        a(w57Var);
    }

    public f57 L(p57 p57Var) {
        if (this.q) {
            return clone().L(p57Var);
        }
        if (p57Var != null) {
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(p57Var);
        }
        A();
        return this;
    }

    @Override // defpackage.x80
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public f57 a(x80 x80Var) {
        ok4.o(x80Var);
        return (f57) super.a(x80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final v47 N(Object obj, ve8 ve8Var, g57 g57Var, sr8 sr8Var, Priority priority, int i, int i2, x80 x80Var) {
        g57 g57Var2;
        g57 o32Var;
        x80 x80Var2;
        v47 aVar;
        Priority priority2;
        if (this.B != null) {
            o32Var = new o32(obj, g57Var);
            g57Var2 = o32Var;
        } else {
            g57Var2 = null;
            o32Var = g57Var;
        }
        f57 f57Var = this.A;
        if (f57Var == null) {
            Context context = this.t;
            ft2 ft2Var = this.w;
            x80Var2 = x80Var;
            aVar = new com.bumptech.glide.request.a(context, ft2Var, obj, this.y, this.v, x80Var2, i, i2, priority, ve8Var, this.z, o32Var, ft2Var.g, sr8Var.a);
        } else {
            if (this.E) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            sr8 sr8Var2 = f57Var.C ? sr8Var : f57Var.x;
            if (x80.p(f57Var.a, 8)) {
                priority2 = this.A.c;
            } else {
                int iOrdinal = priority.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    priority2 = Priority.a;
                } else if (iOrdinal == 2) {
                    priority2 = Priority.b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.c);
                    }
                    priority2 = Priority.c;
                }
            }
            Priority priority3 = priority2;
            f57 f57Var2 = this.A;
            int i3 = f57Var2.i;
            int i4 = f57Var2.h;
            if (i29.j(i, i2)) {
                f57 f57Var3 = this.A;
                if (!i29.j(f57Var3.i, f57Var3.h)) {
                    i3 = x80Var.i;
                    i4 = x80Var.h;
                }
            }
            int i5 = i4;
            hl8 hl8Var = new hl8(obj, o32Var);
            Context context2 = this.t;
            hl8 hl8Var2 = hl8Var;
            ft2 ft2Var2 = this.w;
            com.bumptech.glide.request.a aVar2 = new com.bumptech.glide.request.a(context2, ft2Var2, obj, this.y, this.v, x80Var, i, i2, priority, ve8Var, this.z, hl8Var2, ft2Var2.g, sr8Var.a);
            this.E = true;
            f57 f57Var4 = this.A;
            v47 v47VarN = f57Var4.N(obj, ve8Var, hl8Var2, sr8Var2, priority3, i3, i5, f57Var4);
            this.E = false;
            hl8Var2.c = aVar2;
            hl8Var2.d = v47VarN;
            x80Var2 = x80Var;
            aVar = hl8Var2;
        }
        if (g57Var2 == null) {
            return aVar;
        }
        f57 f57Var5 = this.B;
        int i6 = f57Var5.i;
        int i7 = f57Var5.h;
        if (i29.j(i, i2)) {
            f57 f57Var6 = this.B;
            if (!i29.j(f57Var6.i, f57Var6.h)) {
                i6 = x80Var2.i;
                i7 = x80Var2.h;
            }
        }
        int i8 = i7;
        f57 f57Var7 = this.B;
        o32 o32Var2 = g57Var2;
        v47 v47VarN2 = f57Var7.N(obj, ve8Var, o32Var2, f57Var7.x, f57Var7.c, i6, i8, f57Var7);
        o32Var2.c = aVar;
        o32Var2.d = v47VarN2;
        return o32Var2;
    }

    @Override // defpackage.x80
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public f57 clone() {
        f57 f57Var = (f57) super.clone();
        f57Var.x = f57Var.x.clone();
        if (f57Var.z != null) {
            f57Var.z = new ArrayList(f57Var.z);
        }
        f57 f57Var2 = f57Var.A;
        if (f57Var2 != null) {
            f57Var.A = f57Var2.clone();
        }
        f57 f57Var3 = f57Var.B;
        if (f57Var3 != null) {
            f57Var.B = f57Var3.clone();
        }
        return f57Var;
    }

    public final aj3 P(ImageView imageView) {
        x80 x80VarR;
        nc0 nc0Var;
        i29.a();
        ok4.o(imageView);
        if (!x80.p(this.a, 2048) && this.l && imageView.getScaleType() != null) {
            switch (c57.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    x80VarR = clone().r();
                    break;
                case 2:
                    x80VarR = clone().s();
                    break;
                case 3:
                case 4:
                case 5:
                    x80VarR = clone().t();
                    break;
                case 6:
                    x80VarR = clone().s();
                    break;
                default:
                    x80VarR = this;
                    break;
            }
        } else {
            x80VarR = this;
        }
        this.w.c.getClass();
        Class cls = this.v;
        if (Bitmap.class.equals(cls)) {
            nc0Var = new nc0(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(bl4.t(cls, "Unhandled class: ", ", try .as*(Class).transcode(ResourceTranscoder)"));
            }
            nc0Var = new nc0(imageView, 1);
        }
        Q(nc0Var, x80VarR);
        return nc0Var;
    }

    public final ve8 Q(ve8 ve8Var, x80 x80Var) {
        ok4.o(ve8Var);
        if (!this.D) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        v47 v47VarN = N(new Object(), ve8Var, null, this.x, x80Var.c, x80Var.i, x80Var.h, x80Var);
        v47 v47VarA = ve8Var.a();
        if (v47VarN.g(v47VarA) && (x80Var.g || !v47VarA.c())) {
            ok4.p(v47VarA, "Argument must not be null");
            if (!v47VarA.isRunning()) {
                v47VarA.k();
            }
            return ve8Var;
        }
        this.u.o(ve8Var);
        ve8Var.c(v47VarN);
        s57 s57Var = this.u;
        synchronized (s57Var) {
            s57Var.f.a.add(ve8Var);
            ir9 ir9Var = s57Var.d;
            ((Set) ir9Var.c).add(v47VarN);
            if (ir9Var.b) {
                v47VarN.clear();
                ((HashSet) ir9Var.d).add(v47VarN);
            } else {
                v47VarN.k();
            }
        }
        return ve8Var;
    }

    public f57 R(Drawable drawable) {
        return U(drawable).a((w57) new w57().g(zo1.b));
    }

    public f57 S(Object obj) {
        return U(obj);
    }

    public f57 T(String str) {
        return U(str);
    }

    public final f57 U(Object obj) {
        if (this.q) {
            return clone().U(obj);
        }
        this.y = obj;
        this.D = true;
        A();
        return this;
    }

    public f57 V(f57 f57Var) {
        if (this.q) {
            return clone().V(f57Var);
        }
        this.A = f57Var;
        A();
        return this;
    }

    public f57 W(uv1 uv1Var) {
        if (this.q) {
            return clone().W(uv1Var);
        }
        this.x = uv1Var;
        this.C = false;
        A();
        return this;
    }

    @Override // defpackage.x80
    public final boolean equals(Object obj) {
        if (!(obj instanceof f57)) {
            return false;
        }
        f57 f57Var = (f57) obj;
        return super.equals(f57Var) && Objects.equals(this.v, f57Var.v) && this.x.equals(f57Var.x) && Objects.equals(this.y, f57Var.y) && Objects.equals(this.z, f57Var.z) && Objects.equals(this.A, f57Var.A) && Objects.equals(this.B, f57Var.B) && this.C == f57Var.C && this.D == f57Var.D;
    }

    @Override // defpackage.x80
    public final int hashCode() {
        return i29.h(this.D ? 1 : 0, i29.h(this.C ? 1 : 0, i29.i(i29.i(i29.i(i29.i(i29.i(i29.i(i29.i(super.hashCode(), this.v), this.x), this.y), this.z), this.A), this.B), null)));
    }
}
