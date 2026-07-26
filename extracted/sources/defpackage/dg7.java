package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.viewpager.widget.ViewPager;
import io.sentry.android.core.t0;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dg7 extends kz5 {
    public final g b;
    public p40 c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public d f = null;
    public boolean g;
    public final ArrayList h;

    public dg7(g gVar, ArrayList arrayList) {
        this.b = gVar;
        this.h = arrayList;
    }

    @Override // defpackage.kz5
    public final void a(int i, Object obj) {
        ArrayList arrayList;
        d dVar = (d) obj;
        p40 p40Var = this.c;
        g gVar = this.b;
        if (p40Var == null) {
            gVar.getClass();
            this.c = new p40(gVar);
        }
        while (true) {
            arrayList = this.d;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, dVar.Q() ? gVar.d0(dVar) : null);
        this.e.set(i, null);
        this.c.j(dVar);
        if (dVar.equals(this.f)) {
            this.f = null;
        }
    }

    @Override // defpackage.kz5
    public final void b() {
        p40 p40Var = this.c;
        if (p40Var != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    if (p40Var.g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    p40Var.h = false;
                    p40Var.r.C(p40Var, true);
                } finally {
                    this.g = false;
                }
            }
            this.c = null;
        }
    }

    @Override // defpackage.kz5
    public final void c(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList arrayList2 = this.e;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment$SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith(ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME)) {
                    int i = Integer.parseInt(str.substring(1));
                    d dVarJ = this.b.J(bundle, str);
                    if (dVarJ != null) {
                        while (arrayList2.size() <= i) {
                            arrayList2.add(null);
                        }
                        dVarJ.v0(false);
                        arrayList2.set(i, dVarJ);
                    } else {
                        t0.m("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // defpackage.kz5
    public final void e(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
