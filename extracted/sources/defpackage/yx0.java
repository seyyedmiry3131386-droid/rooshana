package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import ir.mservices.market.movie.data.webapi.MovieDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yx0 implements pd7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yx0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pd7
    public final Bundle a() {
        wl2 wl2VarL;
        Bundle bundleG;
        Pair[] pairArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.u;
                Bundle bundle = new Bundle();
                dy0 dy0Var = ((ComponentActivity) obj).i;
                dy0Var.getClass();
                LinkedHashMap linkedHashMap = dy0Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(dy0Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(dy0Var.g));
                return bundle;
            case 1:
                Map mapD = ((gd7) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapD.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                int i3 = FragmentActivity.A;
                do {
                    wl2VarL = fragmentActivity.L();
                    Lifecycle$State lifecycle$State = Lifecycle$State.a;
                } while (FragmentActivity.N(wl2VarL));
                fragmentActivity.w.d(Lifecycle$Event.ON_STOP);
                return new Bundle();
            case 3:
                return ((g) obj).c0();
            case 4:
                ij5 ij5Var = (ij5) obj;
                ni5 ni5Var = ij5Var.b;
                LinkedHashMap linkedHashMap2 = ni5Var.l;
                ov<ei5> ovVar = ni5Var.f;
                LinkedHashMap linkedHashMap3 = ni5Var.k;
                ArrayList arrayList = new ArrayList();
                b.I();
                Bundle bundleG2 = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                for (Map.Entry entry2 : b.T(ni5Var.r.a).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Bundle bundleH = ((kl5) entry2.getValue()).h();
                    if (bundleH != null) {
                        arrayList.add(str2);
                        h27.l(bundleG2, str2, bundleH);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundleG = null;
                } else {
                    b.I();
                    bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    h27.n(bundleG2, "android-support-nav:controller:navigatorState:names", arrayList);
                    h27.l(bundleG, "android-support-nav:controller:navigatorState", bundleG2);
                }
                if (!ovVar.isEmpty()) {
                    if (bundleG == null) {
                        b.I();
                        bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (ei5 ei5Var : ovVar) {
                        js3.p(ei5Var, "entry");
                        int i4 = ei5Var.b.b.a;
                        String str3 = ei5Var.f;
                        gi5 gi5Var = ei5Var.h;
                        Bundle bundleA = gi5Var.a();
                        b.I();
                        Bundle bundleG3 = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        gi5Var.h.w(bundleG3);
                        b.I();
                        Bundle bundleG4 = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        h27.m("nav-entry-state:id", str3, bundleG4);
                        bundleG4.putInt("nav-entry-state:destination-id", i4);
                        if (bundleA == null) {
                            b.I();
                            bundleA = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        }
                        h27.l(bundleG4, "nav-entry-state:args", bundleA);
                        h27.l(bundleG4, "nav-entry-state:saved-state", bundleG3);
                        arrayList2.add(bundleG4);
                    }
                    bundleG.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundleG == null) {
                        b.I();
                        bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                        int iIntValue = ((Number) entry3.getKey()).intValue();
                        String str4 = (String) entry3.getValue();
                        int i6 = i5 + 1;
                        iArr[i5] = iIntValue;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList3.add(str4);
                        i5 = i6;
                    }
                    bundleG.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    h27.n(bundleG, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleG == null) {
                        b.I();
                        bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        String str5 = (String) entry4.getKey();
                        ov ovVar2 = (ov) entry4.getValue();
                        arrayList4.add(str5);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it = ovVar2.iterator();
                        while (it.hasNext()) {
                            jx9 jx9Var = ((hi5) it.next()).a;
                            jx9Var.getClass();
                            b.I();
                            Bundle bundleG5 = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            h27.m("nav-entry-state:id", (String) jx9Var.b, bundleG5);
                            bundleG5.putInt("nav-entry-state:destination-id", jx9Var.a);
                            Bundle bundleG6 = (Bundle) jx9Var.c;
                            if (bundleG6 == null) {
                                b.I();
                                bundleG6 = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            }
                            h27.l(bundleG5, "nav-entry-state:args", bundleG6);
                            h27.l(bundleG5, "nav-entry-state:saved-state", (Bundle) jx9Var.d);
                            arrayList5.add(bundleG5);
                        }
                        String str6 = "android-support-nav:controller:backStackStates:" + str5;
                        js3.p(str6, "key");
                        bundleG.putParcelableArrayList(str6, arrayList5);
                    }
                    h27.n(bundleG, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (ij5Var.e) {
                    if (bundleG == null) {
                        b.I();
                        bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    bundleG.putBoolean("android-support-nav:controller:deepLinkHandled", ij5Var.e);
                }
                if (bundleG != null) {
                    return bundleG;
                }
                Bundle bundle3 = Bundle.EMPTY;
                js3.o(bundle3, MovieDto.EMPTY_ID);
                return bundle3;
            case 5:
                int i7 = ((NavHostFragment) obj).C0;
                if (i7 != 0) {
                    return is3.g(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i7)));
                }
                Bundle bundle4 = Bundle.EMPTY;
                js3.m(bundle4);
                return bundle4;
            default:
                rb4 rb4Var = (rb4) obj;
                for (Map.Entry entry5 : b.T((LinkedHashMap) rb4Var.e).entrySet()) {
                    rb4Var.J(((l) ((xb5) entry5.getValue())).getValue(), (String) entry5.getKey());
                }
                for (Map.Entry entry6 : b.T((LinkedHashMap) rb4Var.c).entrySet()) {
                    rb4Var.J(((pd7) entry6.getValue()).a(), (String) entry6.getKey());
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) rb4Var.b;
                if (linkedHashMap4.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(linkedHashMap4.size());
                    for (Map.Entry entry7 : linkedHashMap4.entrySet()) {
                        arrayList6.add(new Pair((String) entry7.getKey(), entry7.getValue()));
                    }
                    pairArr = (Pair[]) arrayList6.toArray(new Pair[0]);
                }
                return is3.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
