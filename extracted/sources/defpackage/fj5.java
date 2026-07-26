package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fj5 extends wi5 implements Iterable, dx3 {
    public static final /* synthetic */ int h = 0;
    public final jx9 g;

    public fj5(hj5 hj5Var) {
        super(hj5Var);
        jx9 jx9Var = new jx9();
        jx9Var.b = this;
        jx9Var.c = new m28(0);
        this.g = jx9Var;
    }

    @Override // defpackage.wi5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fj5) || !super.equals(obj)) {
            return false;
        }
        jx9 jx9Var = this.g;
        int iF = ((m28) jx9Var.c).f();
        jx9 jx9Var2 = ((fj5) obj).g;
        if (iF != ((m28) jx9Var2.c).f() || jx9Var.a != jx9Var2.a) {
            return false;
        }
        m28 m28Var = (m28) jx9Var.c;
        js3.p(m28Var, "<this>");
        for (wi5 wi5Var : (u21) mo7.p(new w0(3, m28Var))) {
            if (!wi5Var.equals(((m28) jx9Var2.c).c(wi5Var.b.a))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wi5
    public final vi5 f(pa2 pa2Var) {
        vi5 vi5VarF = super.f(pa2Var);
        jx9 jx9Var = this.g;
        jx9Var.getClass();
        return jx9Var.k(vi5VarF, pa2Var, false, (fj5) jx9Var.b);
    }

    @Override // defpackage.wi5
    public final void h(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.h(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, pt6.NavGraphNavigator);
        js3.o(typedArrayObtainAttributes, "obtainAttributes(...)");
        int resourceId = typedArrayObtainAttributes.getResourceId(pt6.NavGraphNavigator_startDestination, 0);
        jx9 jx9Var = this.g;
        jx9Var.t(resourceId);
        int i = jx9Var.a;
        if (i <= 16777215) {
            strValueOf = String.valueOf(i);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i);
                js3.m(strValueOf);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
        }
        jx9Var.d = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.wi5
    public final int hashCode() {
        jx9 jx9Var = this.g;
        int iD = jx9Var.a;
        m28 m28Var = (m28) jx9Var.c;
        int iF = m28Var.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + m28Var.d(i)) * 31) + ((wi5) m28Var.g(i)).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        jx9 jx9Var = this.g;
        jx9Var.getClass();
        return new gj5(jx9Var);
    }

    public final void j(wi5 wi5Var) {
        js3.p(wi5Var, "node");
        jx9 jx9Var = this.g;
        m28 m28Var = (m28) jx9Var.c;
        fj5 fj5Var = (fj5) jx9Var.b;
        yb ybVar = wi5Var.b;
        int i = ybVar.a;
        String str = (String) ybVar.f;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = (String) fj5Var.b.f;
        if (str2 != null && js3.i(str, str2)) {
            throw new IllegalArgumentException(("Destination " + wi5Var + " cannot have the same route as graph " + fj5Var).toString());
        }
        if (i == fj5Var.b.a) {
            throw new IllegalArgumentException(("Destination " + wi5Var + " cannot have the same id as graph " + fj5Var).toString());
        }
        wi5 wi5Var2 = (wi5) m28Var.c(i);
        if (wi5Var2 == wi5Var) {
            return;
        }
        if (wi5Var.c != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (wi5Var2 != null) {
            wi5Var2.c = null;
        }
        wi5Var.c = fj5Var;
        m28Var.e(ybVar.a, wi5Var);
    }

    public final wi5 l(int i) {
        jx9 jx9Var = this.g;
        return jx9Var.f(i, (fj5) jx9Var.b, null, false);
    }

    public final vi5 m(pa2 pa2Var, wi5 wi5Var) {
        return this.g.k(super.f(pa2Var), pa2Var, true, wi5Var);
    }

    @Override // defpackage.wi5
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        jx9 jx9Var = this.g;
        jx9Var.getClass();
        jx9Var.getClass();
        wi5 wi5VarL = l(jx9Var.a);
        sb.append(" startDestination=");
        if (wi5VarL == null) {
            String str = (String) jx9Var.d;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(jx9Var.a));
            }
        } else {
            sb.append("{");
            sb.append(wi5VarL.toString());
            sb.append("}");
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
