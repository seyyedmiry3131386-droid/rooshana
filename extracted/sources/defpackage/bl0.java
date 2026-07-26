package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.SparseArray;
import androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;
import com.google.android.material.datepicker.MaterialCalendar;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bl0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public bl0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(yh0.J(vp6.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, yt6.MaterialCalendar);
        this.a = yb.f(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendar_dayStyle, 0));
        this.g = yb.f(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendar_dayInvalidStyle, 0));
        this.b = yb.f(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendar_daySelectedStyle, 0));
        this.c = yb.f(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListR = ja1.r(context, typedArrayObtainStyledAttributes, yt6.MaterialCalendar_rangeFillColor);
        this.d = yb.f(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendar_yearStyle, 0));
        this.e = yb.f(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendar_yearSelectedStyle, 0));
        this.f = yb.f(context, typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListR.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean a(int i, g gVar) {
        ArrayList arrayList = (ArrayList) this.e;
        if (i < 0 || i > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i);
        }
        if (((ConcatAdapter$Config$StableIdMode) this.g) != ConcatAdapter$Config$StableIdMode.a) {
            wu8.j("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", gVar.b);
        } else if (gVar.b) {
            t0.m("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iF = f(gVar);
        if ((iF == -1 ? null : (cm5) arrayList.get(iF)) != null) {
            return false;
        }
        cm5 cm5Var = new cm5(gVar, this, (j58) this.b, (ql3) ((vo4) this.h).b);
        arrayList.add(i, cm5Var);
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                gVar.k(recyclerView);
            }
        }
        if (cm5Var.e > 0) {
            ((u01) this.a).i(c(cm5Var), cm5Var.e);
        }
        b();
        return true;
    }

    public void b() {
        RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy;
        Iterator it = ((ArrayList) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.a;
                break;
            }
            cm5 cm5Var = (cm5) it.next();
            RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy2 = cm5Var.c.c;
            recyclerView$Adapter$StateRestorationPolicy = RecyclerView$Adapter$StateRestorationPolicy.c;
            if (recyclerView$Adapter$StateRestorationPolicy2 == recyclerView$Adapter$StateRestorationPolicy || (recyclerView$Adapter$StateRestorationPolicy2 == RecyclerView$Adapter$StateRestorationPolicy.b && cm5Var.e == 0)) {
                break;
            }
        }
        u01 u01Var = (u01) this.a;
        if (recyclerView$Adapter$StateRestorationPolicy != u01Var.c) {
            u01Var.v(recyclerView$Adapter$StateRestorationPolicy);
        }
    }

    public int c(cm5 cm5Var) {
        cm5 cm5Var2;
        Iterator it = ((ArrayList) this.e).iterator();
        int i = 0;
        while (it.hasNext() && (cm5Var2 = (cm5) it.next()) != cm5Var) {
            i += cm5Var2.e;
        }
        return i;
    }

    public h d(int i) {
        h hVar = (h) this.f;
        if (hVar.b) {
            hVar = new h();
        } else {
            hVar.b = true;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cm5 cm5Var = (cm5) it.next();
            int i3 = cm5Var.e;
            if (i3 > i2) {
                hVar.c = cm5Var;
                hVar.a = i2;
                break;
            }
            i2 -= i3;
        }
        if (((cm5) hVar.c) != null) {
            return hVar;
        }
        throw new IllegalArgumentException(rm7.n(i, "Cannot find wrapper for "));
    }

    public cm5 e(o oVar) {
        cm5 cm5Var = (cm5) ((IdentityHashMap) this.d).get(oVar);
        if (cm5Var != null) {
            return cm5Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + oVar + ", seems like it is not bound by this adapter: " + this);
    }

    public int f(g gVar) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((cm5) arrayList.get(i)).c == gVar) {
                return i;
            }
        }
        return -1;
    }

    public bl0(u01 u01Var) {
        this.c = new ArrayList();
        this.d = new IdentityHashMap();
        this.e = new ArrayList();
        this.f = new h();
        this.a = u01Var;
        j58 j58Var = new j58();
        j58Var.a = new SparseArray();
        j58Var.b = 0;
        this.b = j58Var;
        this.g = ConcatAdapter$Config$StableIdMode.a;
        this.h = new vo4(12);
    }
}
