package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: loaded from: classes.dex */
public final class kl2 implements LayoutInflater.Factory2 {
    public final g a;

    public kl2(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        h hVarH;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        g gVar = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, gVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iu6.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(iu6.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(iu6.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(iu6.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = d.class.isAssignableFrom(pl2.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    d dVarF = resourceId != -1 ? gVar.F(resourceId) : null;
                    if (dVarF == null && string != null) {
                        dVarF = gVar.G(string);
                    }
                    if (dVarF == null && id != -1) {
                        dVarF = gVar.F(id);
                    }
                    if (dVarF == null) {
                        pl2 pl2VarL = gVar.L();
                        context.getClassLoader();
                        dVarF = pl2VarL.a(attributeValue);
                        dVarF.p = true;
                        dVarF.z = resourceId != 0 ? resourceId : id;
                        dVarF.A = id;
                        dVarF.B = string;
                        dVarF.q = true;
                        dVarF.v = gVar;
                        tk2 tk2Var = gVar.x;
                        dVarF.w = tk2Var;
                        dVarF.e0(tk2Var.t, attributeSet, dVarF.b);
                        hVarH = gVar.a(dVarF);
                        if (g.N(2)) {
                            dVarF.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (dVarF.q) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        dVarF.q = true;
                        dVarF.v = gVar;
                        tk2 tk2Var2 = gVar.x;
                        dVarF.w = tk2Var2;
                        dVarF.e0(tk2Var2.t, attributeSet, dVarF.b);
                        hVarH = gVar.h(dVarF);
                        if (g.N(2)) {
                            dVarF.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    ym2 ym2Var = zm2.a;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(dVarF, "Attempting to use <fragment> tag to add fragment " + dVarF + " to container " + viewGroup);
                    zm2.c(fragmentTagUsageViolation);
                    ym2 ym2VarA = zm2.a(dVarF);
                    if (ym2VarA.a.contains(FragmentStrictMode$Flag.d) && zm2.e(ym2VarA, dVarF.getClass(), FragmentTagUsageViolation.class)) {
                        zm2.b(ym2VarA, fragmentTagUsageViolation);
                    }
                    dVarF.I = viewGroup;
                    hVarH.k();
                    hVarH.j();
                    View view2 = dVarF.J;
                    if (view2 == null) {
                        throw new IllegalStateException(o40.y("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (dVarF.J.getTag() == null) {
                        dVarF.J.setTag(string);
                    }
                    dVarF.J.addOnAttachStateChangeListener(new jl2(this, hVarH));
                    return dVarF.J;
                }
            }
        }
        return null;
    }
}
