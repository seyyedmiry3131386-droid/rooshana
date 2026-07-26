package ir.mservices.market.version2.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.d;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.br9;
import defpackage.bt2;
import defpackage.ew;
import defpackage.f88;
import defpackage.fj5;
import defpackage.ij5;
import defpackage.is3;
import defpackage.ja1;
import defpackage.js3;
import defpackage.ni5;
import defpackage.pa2;
import defpackage.rb4;
import defpackage.sg4;
import defpackage.t40;
import defpackage.tj5;
import defpackage.ug1;
import defpackage.ui5;
import defpackage.up1;
import defpackage.vi5;
import defpackage.wi5;
import defpackage.yb;
import defpackage.yi5;
import defpackage.zh5;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.data.NavIntentDirections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public ij5 a;
    public NavHostFragment b;
    public boolean c = true;

    public a(tj5 tj5Var) {
    }

    public final void a(Integer num) {
        try {
            if (num != null) {
                int iIntValue = num.intValue();
                ij5 ij5Var = this.a;
                if (ij5Var != null) {
                    ni5 ni5Var = ij5Var.b;
                    if (ni5Var.l(iIntValue, false, false)) {
                        ni5Var.b();
                        return;
                    }
                    return;
                }
                return;
            }
            ij5 ij5Var2 = this.a;
            if (ij5Var2 != null) {
                int i = ij5Var2.b.g().g.a;
                ij5 ij5Var3 = this.a;
                if (ij5Var3 != null) {
                    ni5 ni5Var2 = ij5Var3.b;
                    if (ni5Var2.l(i, false, false)) {
                        ni5Var2.b();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final d b() {
        Object next;
        NavHostFragment navHostFragment = this.b;
        if (navHostFragment != null) {
            ij5 ij5Var = this.a;
            if (ij5Var == null || ij5Var.b.f() == null) {
                navHostFragment = null;
            }
            if (navHostFragment != null) {
                try {
                    List listS = navHostFragment.G().c.S();
                    js3.o(listS, "getFragments(...)");
                    Iterator it = listS.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((d) next) instanceof BaseContentFragment) {
                            break;
                        }
                    }
                    d dVar = (d) next;
                    return dVar == null ? navHostFragment.G().A : dVar;
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final d c() {
        Object objPrevious;
        NavHostFragment navHostFragment = this.b;
        if (navHostFragment != null) {
            ij5 ij5Var = this.a;
            if (ij5Var == null || ij5Var.b.f() == null) {
                navHostFragment = null;
            }
            if (navHostFragment != null) {
                try {
                    List listS = navHostFragment.G().c.S();
                    js3.o(listS, "getFragments(...)");
                    ListIterator listIterator = listS.listIterator(listS.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        if (((d) objPrevious) instanceof DialogFragment) {
                            break;
                        }
                    }
                    return (d) objPrevious;
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final void d() {
        try {
            ij5 ij5Var = this.a;
            if (ij5Var != null) {
                ij5Var.d();
            }
            this.c = true;
        } catch (Exception unused) {
        }
    }

    public final void e(String str) {
        wi5 wi5VarF;
        Bundle bundleA;
        Intent intent;
        ij5 ij5Var = this.a;
        Integer numValueOf = null;
        if ((ij5Var != null ? ij5Var.b.f() : null) == null) {
            ij5 ij5Var2 = this.a;
            if (ij5Var2 != null) {
                ij5Var2.d();
                return;
            }
            return;
        }
        d dVarB = b();
        if (dVarB instanceof BaseContentFragment) {
            ij5 ij5Var3 = this.a;
            if (ij5Var3 != null && (wi5VarF = ij5Var3.b.f()) != null) {
                numValueOf = Integer.valueOf(wi5VarF.b.a);
            }
            String strValueOf = String.valueOf(numValueOf);
            if (f88.n0(str)) {
                ij5 ij5Var4 = this.a;
                if (ij5Var4 != null) {
                    ij5Var4.d();
                }
                e(strValueOf);
                return;
            }
            if (strValueOf.equalsIgnoreCase(str) && js3.i(((BaseContentFragment) dVarB).e1(), t40.g)) {
                ij5 ij5Var5 = this.a;
                if (ij5Var5 != null) {
                    ij5Var5.d();
                }
                e(strValueOf);
                return;
            }
            return;
        }
        ij5 ij5Var6 = this.a;
        if (ij5Var6 != null) {
            ni5 ni5Var = ij5Var6.b;
            Activity activity2 = ij5Var6.d;
            if (ij5Var6.a() != 1) {
                ij5Var6.d();
                return;
            }
            Bundle extras = (activity2 == null || (intent = activity2.getIntent()) == null) ? null : intent.getExtras();
            int i = 0;
            if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
                wi5 wi5VarF2 = ni5Var.f();
                js3.m(wi5VarF2);
                int i2 = wi5VarF2.b.a;
                for (fj5 fj5Var = wi5VarF2.c; fj5Var != null; fj5Var = fj5Var.c) {
                    yb ybVar = fj5Var.b;
                    if (fj5Var.g.a != i2) {
                        b.I();
                        Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        if (activity2 != null && activity2.getIntent() != null && activity2.getIntent().getData() != null) {
                            Intent intent2 = activity2.getIntent();
                            js3.o(intent2, "getIntent(...)");
                            bundleG.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                            fj5 fj5VarI = ni5Var.i();
                            Intent intent3 = activity2.getIntent();
                            js3.o(intent3, "getIntent(...)");
                            vi5 vi5VarM = fj5VarI.m(new pa2(intent3.getData(), intent3.getAction(), intent3.getType(), 25), fj5VarI);
                            if ((vi5VarM != null ? vi5VarM.b : null) != null && (bundleA = vi5VarM.a.a(vi5VarM.b)) != null) {
                                bundleG.putAll(bundleA);
                            }
                        }
                        rb4 rb4Var = new rb4(ij5Var6);
                        int i3 = ybVar.a;
                        ArrayList arrayList = (ArrayList) rb4Var.e;
                        arrayList.clear();
                        arrayList.add(new ui5(i3, null));
                        if (((fj5) rb4Var.f) != null) {
                            rb4Var.Q();
                        }
                        ((Intent) rb4Var.d).putExtra("android-support-nav:controller:deepLinkExtras", bundleG);
                        rb4Var.n().c();
                        if (activity2 != null) {
                            activity2.finish();
                            return;
                        }
                        return;
                    }
                    i2 = ybVar.a;
                }
                return;
            }
            if (ij5Var6.e) {
                js3.m(activity2);
                Intent intent4 = activity2.getIntent();
                Bundle extras2 = intent4.getExtras();
                js3.m(extras2);
                int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
                js3.m(intArray);
                ArrayList arrayListZ0 = ew.Z0(intArray);
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                if (arrayListZ0.size() < 2) {
                    return;
                }
                int iIntValue = ((Number) kotlin.collections.a.F0(arrayListZ0)).intValue();
                if (parcelableArrayList != null) {
                }
                wi5 wi5VarD = ni5.d(iIntValue, ni5Var.g(), null, false);
                if (wi5VarD instanceof fj5) {
                    int i4 = fj5.h;
                    iIntValue = ja1.o((fj5) wi5VarD).b.a;
                }
                wi5 wi5VarF3 = ni5Var.f();
                if (wi5VarF3 == null || iIntValue != wi5VarF3.b.a) {
                    return;
                }
                rb4 rb4Var2 = new rb4(ij5Var6);
                b.I();
                Bundle bundleG2 = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundleG2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
                Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                if (bundle != null) {
                    bundleG2.putAll(bundle);
                }
                ((Intent) rb4Var2.d).putExtra("android-support-nav:controller:deepLinkExtras", bundleG2);
                for (Object obj : arrayListZ0) {
                    int i5 = i + 1;
                    if (i < 0) {
                        br9.P();
                        throw null;
                    }
                    ((ArrayList) rb4Var2.e).add(new ui5(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                    if (((fj5) rb4Var2.f) != null) {
                        rb4Var2.Q();
                    }
                    i = i5;
                }
                rb4Var2.n().c();
                activity2.finish();
            }
        }
    }

    public final void f() {
        try {
            e("");
            this.c = true;
        } catch (Exception unused) {
        }
    }

    public final void g(yi5 yi5Var) {
        wi5 wi5VarF;
        js3.p(yi5Var, "navDirections");
        ij5 ij5Var = this.a;
        if (ij5Var != null) {
            try {
                ni5 ni5Var = ij5Var.b;
                if ((yi5Var instanceof NavIntentDirections) && ni5Var.f() != null) {
                    wi5 wi5VarF2 = ni5Var.f();
                    if ((wi5VarF2 != null ? wi5VarF2.d(((NavIntentDirections) yi5Var).getActionId()) : null) == null && (wi5VarF = ni5Var.f()) != null) {
                        wi5VarF.i(((NavIntentDirections) yi5Var).getActionId(), new zh5(((NavIntentDirections) yi5Var).getDestinationId()));
                    }
                }
                if (yi5Var instanceof NavIntentDirections.NavDialogDirections) {
                    ug1 ug1Var = up1.a;
                    bt2.G(js3.a(sg4.a), null, null, new FragmentNavigationWrapper$pushFragment$1$1(this, ij5Var, yi5Var, null), 3);
                    return;
                }
                wi5 wi5VarF3 = ni5Var.f();
                if (wi5VarF3 == null || wi5VarF3.d(yi5Var.getActionId()) == null) {
                    return;
                }
                ij5Var.c(yi5Var.getActionId(), yi5Var.getArguments(), yi5Var instanceof NavIntentDirections ? ((NavIntentDirections) yi5Var).getNavOptions() : null);
            } catch (Exception unused) {
            }
        }
    }

    public final void h(NavHostFragment navHostFragment) {
        js3.p(navHostFragment, "navHost");
        this.b = navHostFragment;
        this.a = navHostFragment.z0();
    }
}
