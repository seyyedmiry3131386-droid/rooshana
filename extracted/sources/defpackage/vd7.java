package defpackage;

import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeData;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTypeData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.streamers.StreamerProfileViewModel;
import ir.mservices.market.movie.streamers.data.StreamersDto;
import ir.mservices.market.search.history.ui.SearchViewModel;
import ir.mservices.market.securityShield.recycler.DeviceScanData;
import ir.mservices.market.securityShield.recycler.DeviceScanTipData;
import ir.mservices.market.version2.fragments.SplashScreenFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd7 implements dp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ vd7(int i) {
        this.a = i;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        xi8 xi8Var;
        int i5 = this.a;
        tx8 tx8Var = tx8.a;
        switch (i5) {
            case 0:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new x64(((Integer) obj).intValue());
            case 1:
                String str = obj != null ? (String) obj : null;
                js3.m(str);
                return new i49(str);
            case 2:
                String str2 = obj != null ? (String) obj : null;
                js3.m(str2);
                return new n09(str2);
            case 3:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                wd7 wd7Var = xd7.q;
                Boolean bool = Boolean.FALSE;
                js3.i(obj2, bool);
                of8 of8Var = obj2 != null ? (of8) wd7Var.b.invoke(obj2) : null;
                js3.m(of8Var);
                int i6 = of8Var.a;
                Object obj3 = list.get(1);
                wd7 wd7Var2 = xd7.r;
                js3.i(obj3, bool);
                ug8 ug8Var = obj3 != null ? (ug8) wd7Var2.b.invoke(obj3) : null;
                js3.m(ug8Var);
                int i7 = ug8Var.a;
                Object obj4 = list.get(2);
                kj8[] kj8VarArr = jj8.b;
                wd7 wd7Var3 = xd7.v;
                js3.i(obj4, bool);
                jj8 jj8Var = obj4 != null ? (jj8) wd7Var3.b.invoke(obj4) : null;
                js3.m(jj8Var);
                long j2 = jj8Var.a;
                Object obj5 = list.get(3);
                di8 di8Var = di8.c;
                di8 di8Var2 = (js3.i(obj5, bool) || obj5 == null) ? null : (di8) ((dp2) xd7.l.c).invoke(obj5);
                Object obj6 = list.get(4);
                w96 w96Var = (js3.i(obj6, bool) || obj6 == null) ? null : (w96) ((dp2) c26.c.c).invoke(obj6);
                Object obj7 = list.get(5);
                z64 z64Var = z64.d;
                z64 z64Var2 = (js3.i(obj7, bool) || obj7 == null) ? null : (z64) ((dp2) xd7.A.c).invoke(obj7);
                Object obj8 = list.get(6);
                u64 u64Var = (js3.i(obj8, bool) || obj8 == null) ? null : (u64) ((dp2) c26.e.c).invoke(obj8);
                js3.m(u64Var);
                int i8 = u64Var.a;
                Object obj9 = list.get(7);
                wd7 wd7Var4 = xd7.s;
                js3.i(obj9, bool);
                af3 af3Var = obj9 != null ? (af3) wd7Var4.b.invoke(obj9) : null;
                js3.m(af3Var);
                int i9 = af3Var.a;
                Object obj10 = list.get(8);
                bn6 bn6Var = c26.f;
                if (js3.i(obj10, bool) || obj10 == null) {
                    i = i6;
                    i2 = i7;
                    i3 = i9;
                    i4 = i8;
                    j = j2;
                    xi8Var = null;
                } else {
                    i = i6;
                    i2 = i7;
                    i3 = i9;
                    i4 = i8;
                    j = j2;
                    xi8Var = (xi8) ((dp2) bn6Var.c).invoke(obj10);
                }
                return new p16(i, i2, j, di8Var2, w96Var, z64Var2, i4, i3, xi8Var);
            case 4:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj11 = list2.get(0);
                int i10 = zu0.i;
                Boolean bool2 = Boolean.FALSE;
                js3.i(obj11, bool2);
                zu0 zu0Var = obj11 != null ? obj11.equals(bool2) ? new zu0(zu0.h) : new zu0(gu9.d(((Integer) obj11).intValue())) : null;
                js3.m(zu0Var);
                long j3 = zu0Var.a;
                Object obj12 = list2.get(1);
                kj8[] kj8VarArr2 = jj8.b;
                dp2 dp2Var = xd7.v.b;
                js3.i(obj12, bool2);
                jj8 jj8Var2 = obj12 != null ? (jj8) dp2Var.invoke(obj12) : null;
                js3.m(jj8Var2);
                long j4 = jj8Var2.a;
                Object obj13 = list2.get(2);
                fj2 fj2Var = fj2.b;
                fj2 fj2Var2 = (js3.i(obj13, bool2) || obj13 == null) ? null : (fj2) ((dp2) xd7.m.c).invoke(obj13);
                Object obj14 = list2.get(3);
                si2 si2Var = (js3.i(obj14, bool2) || obj14 == null) ? null : (si2) ((dp2) xd7.t.c).invoke(obj14);
                Object obj15 = list2.get(4);
                cj2 cj2Var = (js3.i(obj15, bool2) || obj15 == null) ? null : (cj2) ((dp2) xd7.u.c).invoke(obj15);
                Object obj16 = list2.get(6);
                String str3 = obj16 != null ? (String) obj16 : null;
                Object obj17 = list2.get(7);
                js3.i(obj17, bool2);
                jj8 jj8Var3 = obj17 != null ? (jj8) dp2Var.invoke(obj17) : null;
                js3.m(jj8Var3);
                long j5 = jj8Var3.a;
                Object obj18 = list2.get(8);
                ba0 ba0Var = (js3.i(obj18, bool2) || obj18 == null) ? null : (ba0) ((dp2) xd7.n.c).invoke(obj18);
                Object obj19 = list2.get(9);
                ci8 ci8Var = (js3.i(obj19, bool2) || obj19 == null) ? null : (ci8) ((dp2) xd7.k.c).invoke(obj19);
                Object obj20 = list2.get(10);
                wc4 wc4Var = wc4.c;
                wc4 wc4Var2 = (js3.i(obj20, bool2) || obj20 == null) ? null : (wc4) ((dp2) xd7.y.c).invoke(obj20);
                Object obj21 = list2.get(11);
                js3.i(obj21, bool2);
                zu0 zu0Var2 = obj21 != null ? obj21.equals(bool2) ? new zu0(zu0.h) : new zu0(gu9.d(((Integer) obj21).intValue())) : null;
                js3.m(zu0Var2);
                long j6 = zu0Var2.a;
                Object obj22 = list2.get(12);
                qg8 qg8Var = (js3.i(obj22, bool2) || obj22 == null) ? null : (qg8) ((dp2) xd7.j.c).invoke(obj22);
                Object obj23 = list2.get(13);
                ur7 ur7Var = ur7.d;
                return new c28(j3, j4, fj2Var2, si2Var, cj2Var, (ph2) null, str3, j5, ba0Var, ci8Var, wc4Var2, j6, qg8Var, (js3.i(obj23, bool2) || obj23 == null) ? null : (ur7) ((dp2) xd7.o.c).invoke(obj23), 49184);
            case 5:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list3 = (List) obj;
                Object obj24 = list3.get(0);
                Boolean bool3 = obj24 != null ? (Boolean) obj24 : null;
                js3.m(bool3);
                boolean zBooleanValue = bool3.booleanValue();
                Object obj25 = list3.get(1);
                n02 n02Var = (js3.i(obj25, Boolean.FALSE) || obj25 == null) ? null : (n02) ((dp2) c26.d.c).invoke(obj25);
                js3.m(n02Var);
                return new w96(n02Var.a, zBooleanValue);
            case 6:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new n02(((Integer) obj).intValue());
            case 7:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new u64(((Integer) obj).intValue());
            case 8:
                js3.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                Object obj26 = list4.get(0);
                wi8 wi8Var = (js3.i(obj26, Boolean.FALSE) || obj26 == null) ? null : (wi8) ((dp2) c26.g.c).invoke(obj26);
                js3.m(wi8Var);
                int i11 = wi8Var.a;
                Object obj27 = list4.get(1);
                Boolean bool4 = obj27 != null ? (Boolean) obj27 : null;
                js3.m(bool4);
                return new xi8(i11, bool4.booleanValue());
            case 9:
                js3.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return new wi8(((Integer) obj).intValue());
            case 10:
                RecyclerItem recyclerItem = (RecyclerItem) obj;
                js3.p(recyclerItem, "it");
                return Boolean.valueOf(recyclerItem.c instanceof ScheduleTimeData);
            case 11:
                RecyclerItem recyclerItem2 = (RecyclerItem) obj;
                js3.p(recyclerItem2, "it");
                return Boolean.valueOf(recyclerItem2.c instanceof ScheduleTypeData);
            case 12:
                ArrayList arrayList = ((ne7) obj).a;
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList2);
                }
                return arrayList2;
            case 13:
                return new tg7(((Integer) obj).intValue());
            case 14:
                hh6 hh6Var = (hh6) obj;
                if (hh6Var != null && hh6Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 15:
                return SearchViewModel.getSearchHomeData$lambda$0$1((HomeMovieBannerListDto) obj);
            case 16:
                RecyclerItem recyclerItem3 = (RecyclerItem) obj;
                js3.p(recyclerItem3, "it");
                return Boolean.valueOf(recyclerItem3.c instanceof DeviceScanTipData);
            case 17:
                RecyclerItem recyclerItem4 = (RecyclerItem) obj;
                js3.p(recyclerItem4, "it");
                return Boolean.valueOf(recyclerItem4.c instanceof DeviceScanData);
            case 18:
                ArrayList arrayList3 = ((js0) obj).a;
                ArrayList arrayList4 = new ArrayList(wu0.V(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    bl4.G((MyketRecyclerData) it2.next(), arrayList4);
                }
                return arrayList4;
            case 19:
                ox3[] ox3VarArr = f.a;
                ((nn7) obj).a(d.e, tx8Var);
                return tx8Var;
            case 20:
                nr5 nr5Var = (nr5) obj;
                long j7 = nr5Var.a;
                return (9223372034707292159L & j7) != 9205357640488583168L ? new al(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (nr5Var.a & 4294967295L))) : bn7.a;
            case 21:
                al alVar = (al) obj;
                return new nr5((((long) Float.floatToRawIntBits(alVar.a)) << 32) | (((long) Float.floatToRawIntBits(alVar.b)) & 4294967295L));
            case 22:
                ho7 ho7Var = (ho7) obj;
                js3.p(ho7Var, "it");
                return ho7Var.iterator();
            case 23:
                return Boolean.valueOf(obj == null);
            case 24:
                ArrayList arrayList5 = ((xq7) obj).a;
                ArrayList arrayList6 = new ArrayList(wu0.V(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    bl4.G((MyketRecyclerData) it3.next(), arrayList6);
                }
                return arrayList6;
            case 25:
                js3.p((vd6) obj, "it");
                return tx8Var;
            case 26:
                int i12 = zt7.k;
                return tx8Var;
            case 27:
                vd7 vd7Var = g08.a;
                return tx8Var;
            case 28:
                int i13 = SplashScreenFragment.L0;
                js3.p((rs5) obj, "$this$addOnBackPressedDispatcherCallback");
                return tx8Var;
            default:
                return StreamerProfileViewModel.getStreamersNestedList$lambda$0((StreamersDto) obj);
        }
    }
}
