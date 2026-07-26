package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.node.i;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.semantics.f;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import org.koin.core.definition.Kind;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7 implements dp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ k7(int i) {
        this.a = i;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        String value7;
        String value8;
        String value9;
        String value10;
        String value11;
        String value12;
        String value13;
        String value14;
        String value15;
        String value16;
        String value17;
        String value18;
        String value19;
        String value20;
        int i = this.a;
        int i2 = 9;
        int i3 = 10;
        int i4 = 2;
        int i5 = 0;
        int i6 = 25;
        String str = "";
        int i7 = 1;
        tx8 tx8Var = tx8.a;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                js3.p(context, "it");
                if (context instanceof ContextWrapper) {
                }
                break;
            case 1:
                break;
            case 2:
                nx4 nx4Var = (nx4) obj;
                js3.p(nx4Var, "$this$module");
                LinkedHashMap linkedHashMap = nx4Var.c;
                eq eqVar = new eq(i6);
                ae aeVar = new ae(i5, eqVar);
                a88 a88Var = vp7.j;
                Kind kind = Kind.a;
                EmptyList emptyList = EmptyList.a;
                cx7 cx7VarI = dw1.i(new va0(a88Var, g27.a(x28.class), null, aeVar, kind, emptyList), nx4Var);
                ps0 ps0VarA = g27.a(x28.class);
                va0 va0Var = cx7VarI.a;
                va0Var.f = a.A0(ps0VarA, va0Var.f);
                to6 to6Var = va0Var.c;
                to6 to6Var2 = va0Var.a;
                StringBuilder sb = new StringBuilder();
                dw1.w(ps0VarA, sb, ':');
                if (to6Var == null || (value = to6Var.getValue()) == null) {
                    value = "";
                }
                linkedHashMap.put(dw1.r(sb, value, ':', to6Var2, "mapping"), cx7VarI);
                cx7 cx7VarI2 = dw1.i(new va0(a88Var, g27.a(k87.class), new a88("SPIX"), new ae(i7, eqVar), kind, emptyList), nx4Var);
                ps0 ps0VarA2 = g27.a(k87.class);
                va0 va0Var2 = cx7VarI2.a;
                va0Var2.f = a.A0(ps0VarA2, va0Var2.f);
                to6 to6Var3 = va0Var2.c;
                to6 to6Var4 = va0Var2.a;
                StringBuilder sb2 = new StringBuilder();
                dw1.w(ps0VarA2, sb2, ':');
                if (to6Var3 == null || (value2 = to6Var3.getValue()) == null) {
                    value2 = "";
                }
                linkedHashMap.put(dw1.r(sb2, value2, ':', to6Var4, "mapping"), cx7VarI2);
                ae aeVar2 = new ae(i4);
                Kind kind2 = Kind.b;
                e82 e82VarG = t61.g(new va0(a88Var, g27.a(z28.class), null, aeVar2, kind2, emptyList), nx4Var);
                ps0 ps0VarA3 = g27.a(y28.class);
                va0 va0Var3 = e82VarG.a;
                va0Var3.f = a.A0(ps0VarA3, va0Var3.f);
                to6 to6Var5 = va0Var3.c;
                to6 to6Var6 = va0Var3.a;
                StringBuilder sb3 = new StringBuilder();
                dw1.w(ps0VarA3, sb3, ':');
                if (to6Var5 == null || (value3 = to6Var5.getValue()) == null) {
                    value3 = "";
                }
                linkedHashMap.put(dw1.r(sb3, value3, ':', to6Var6, "mapping"), e82VarG);
                e82 e82VarG2 = t61.g(new va0(a88Var, g27.a(ir.myket.analytics.spix.domain.usecase.a.class), null, new ae(3), kind2, emptyList), nx4Var);
                ps0 ps0VarA4 = g27.a(yq2.class);
                va0 va0Var4 = e82VarG2.a;
                va0Var4.f = a.A0(ps0VarA4, va0Var4.f);
                to6 to6Var7 = va0Var4.c;
                to6 to6Var8 = va0Var4.a;
                StringBuilder sb4 = new StringBuilder();
                dw1.w(ps0VarA4, sb4, ':');
                if (to6Var7 != null && (value4 = to6Var7.getValue()) != null) {
                    str = value4;
                }
                linkedHashMap.put(dw1.r(sb4, str, ':', to6Var8, "mapping"), e82VarG2);
                break;
            case 3:
                break;
            case 4:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList);
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                aw0 aw0Var = (aw0) obj;
                int i8 = AppSearchRecyclerListFragment.e1;
                js3.p(aw0Var, "it");
                if (aw0Var.a instanceof ia4) {
                    boolean z = aw0Var.b.a;
                }
                break;
            case 18:
                zu3 zu3Var = (zu3) obj;
                js3.p(zu3Var, "$this$Json");
                zu3Var.a = true;
                break;
            case 19:
                RecyclerItem recyclerItem = (RecyclerItem) obj;
                js3.p(recyclerItem, "it");
                break;
            case 20:
                nz3 nz3Var = (nz3) obj;
                Context applicationContext = ApplicationLauncher.o.getApplicationContext();
                js3.p(nz3Var, "<this>");
                js3.p(applicationContext, "androidContext");
                mz3 mz3Var = nz3Var.a;
                av avVar = mz3Var.a;
                Level level = Level.b;
                avVar.getClass();
                if (Level.e.compareTo(level) <= 0) {
                    av avVar2 = mz3Var.a;
                    avVar2.getClass();
                    avVar2.x(level, "[init] declare Android Context");
                }
                m22 m22Var = new m22(i2, applicationContext);
                nx4 nx4Var2 = new nx4();
                m22Var.invoke(nx4Var2);
                mz3Var.d(br9.B(nx4Var2), true);
                nx4 nx4Var3 = rz3.a;
                js3.p(nx4Var3, "modules");
                nz3Var.a(br9.B(nx4Var3));
                break;
            case 21:
                break;
            case 22:
                nx4 nx4Var4 = (nx4) obj;
                js3.p(nx4Var4, "$this$module");
                LinkedHashMap linkedHashMap2 = nx4Var4.c;
                ae aeVar3 = new ae(i3, new av(i4));
                a88 a88Var2 = vp7.j;
                Kind kind3 = Kind.a;
                EmptyList emptyList2 = EmptyList.a;
                cx7 cx7VarI3 = dw1.i(new va0(a88Var2, g27.a(v00.class), null, aeVar3, kind3, emptyList2), nx4Var4);
                ps0 ps0VarA5 = g27.a(v00.class);
                va0 va0Var5 = cx7VarI3.a;
                va0Var5.f = a.A0(ps0VarA5, va0Var5.f);
                to6 to6Var9 = va0Var5.c;
                to6 to6Var10 = va0Var5.a;
                StringBuilder sb5 = new StringBuilder();
                dw1.w(ps0VarA5, sb5, ':');
                if (to6Var9 == null || (value5 = to6Var9.getValue()) == null) {
                    value5 = "";
                }
                linkedHashMap2.put(dw1.r(sb5, value5, ':', to6Var10, "mapping"), cx7VarI3);
                ae aeVar4 = new ae(12);
                Kind kind4 = Kind.b;
                e82 e82VarG3 = t61.g(new va0(a88Var2, g27.a(tr2.class), null, aeVar4, kind4, emptyList2), nx4Var4);
                ps0 ps0VarA6 = g27.a(wq2.class);
                va0 va0Var6 = e82VarG3.a;
                va0Var6.f = a.A0(ps0VarA6, va0Var6.f);
                to6 to6Var11 = va0Var6.c;
                to6 to6Var12 = va0Var6.a;
                StringBuilder sb6 = new StringBuilder();
                dw1.w(ps0VarA6, sb6, ':');
                if (to6Var11 == null || (value6 = to6Var11.getValue()) == null) {
                    value6 = "";
                }
                linkedHashMap2.put(dw1.r(sb6, value6, ':', to6Var12, "mapping"), e82VarG3);
                e82 e82VarG4 = t61.g(new va0(a88Var2, g27.a(gt3.class), null, new ae(13), kind4, emptyList2), nx4Var4);
                ps0 ps0VarA7 = g27.a(xq2.class);
                va0 va0Var7 = e82VarG4.a;
                va0Var7.f = a.A0(ps0VarA7, va0Var7.f);
                to6 to6Var13 = va0Var7.c;
                to6 to6Var14 = va0Var7.a;
                StringBuilder sb7 = new StringBuilder();
                dw1.w(ps0VarA7, sb7, ':');
                if (to6Var13 == null || (value7 = to6Var13.getValue()) == null) {
                    value7 = "";
                }
                linkedHashMap2.put(dw1.r(sb7, value7, ':', to6Var14, "mapping"), e82VarG4);
                e82 e82VarG5 = t61.g(new va0(a88Var2, g27.a(ht3.class), null, new ae(14), kind4, emptyList2), nx4Var4);
                ps0 ps0VarA8 = g27.a(xq2.class);
                va0 va0Var8 = e82VarG5.a;
                va0Var8.f = a.A0(ps0VarA8, va0Var8.f);
                to6 to6Var15 = va0Var8.c;
                to6 to6Var16 = va0Var8.a;
                StringBuilder sb8 = new StringBuilder();
                dw1.w(ps0VarA8, sb8, ':');
                if (to6Var15 == null || (value8 = to6Var15.getValue()) == null) {
                    value8 = "";
                }
                linkedHashMap2.put(dw1.r(sb8, value8, ':', to6Var16, "mapping"), e82VarG5);
                e82 e82VarG6 = t61.g(new va0(a88Var2, g27.a(hq7.class), null, new ae(15), kind4, emptyList2), nx4Var4);
                ps0 ps0VarA9 = g27.a(xq2.class);
                va0 va0Var9 = e82VarG6.a;
                va0Var9.f = a.A0(ps0VarA9, va0Var9.f);
                to6 to6Var17 = va0Var9.c;
                to6 to6Var18 = va0Var9.a;
                StringBuilder sb9 = new StringBuilder();
                dw1.w(ps0VarA9, sb9, ':');
                if (to6Var17 == null || (value9 = to6Var17.getValue()) == null) {
                    value9 = "";
                }
                linkedHashMap2.put(dw1.r(sb9, value9, ':', to6Var18, "mapping"), e82VarG6);
                e82 e82VarG7 = t61.g(new va0(a88Var2, g27.a(mq7.class), null, new ae(16), kind4, emptyList2), nx4Var4);
                ps0 ps0VarA10 = g27.a(xq2.class);
                va0 va0Var10 = e82VarG7.a;
                va0Var10.f = a.A0(ps0VarA10, va0Var10.f);
                to6 to6Var19 = va0Var10.c;
                to6 to6Var20 = va0Var10.a;
                StringBuilder sb10 = new StringBuilder();
                dw1.w(ps0VarA10, sb10, ':');
                if (to6Var19 == null || (value10 = to6Var19.getValue()) == null) {
                    value10 = "";
                }
                linkedHashMap2.put(dw1.r(sb10, value10, ':', to6Var20, "mapping"), e82VarG7);
                cx7 cx7VarI4 = dw1.i(new va0(a88Var2, g27.a(kn8.class), null, new ae(17), kind3, emptyList2), nx4Var4);
                ps0 ps0VarA11 = g27.a(g10.class);
                va0 va0Var11 = cx7VarI4.a;
                va0Var11.f = a.A0(ps0VarA11, va0Var11.f);
                to6 to6Var21 = va0Var11.c;
                to6 to6Var22 = va0Var11.a;
                StringBuilder sb11 = new StringBuilder();
                dw1.w(ps0VarA11, sb11, ':');
                if (to6Var21 == null || (value11 = to6Var21.getValue()) == null) {
                    value11 = "";
                }
                linkedHashMap2.put(dw1.r(sb11, value11, ':', to6Var22, "mapping"), cx7VarI4);
                cx7 cx7VarI5 = dw1.i(new va0(a88Var2, g27.a(h10.class), new a88("AUTH_INTERCEPTOR"), new ae(7), kind3, emptyList2), nx4Var4);
                ps0 ps0VarA12 = g27.a(hr3.class);
                va0 va0Var12 = cx7VarI5.a;
                va0Var12.f = a.A0(ps0VarA12, va0Var12.f);
                to6 to6Var23 = va0Var12.c;
                to6 to6Var24 = va0Var12.a;
                StringBuilder sb12 = new StringBuilder();
                dw1.w(ps0VarA12, sb12, ':');
                if (to6Var23 == null || (value12 = to6Var23.getValue()) == null) {
                    value12 = "";
                }
                linkedHashMap2.put(dw1.r(sb12, value12, ':', to6Var24, "mapping"), cx7VarI5);
                e82 e82VarG8 = t61.g(new va0(a88Var2, g27.a(a10.class), null, new ae(8), kind4, emptyList2), nx4Var4);
                ps0 ps0VarA13 = g27.a(z00.class);
                va0 va0Var13 = e82VarG8.a;
                va0Var13.f = a.A0(ps0VarA13, va0Var13.f);
                to6 to6Var25 = va0Var13.c;
                to6 to6Var26 = va0Var13.a;
                StringBuilder sb13 = new StringBuilder();
                dw1.w(ps0VarA13, sb13, ':');
                if (to6Var25 != null && (value13 = to6Var25.getValue()) != null) {
                    str = value13;
                }
                linkedHashMap2.put(dw1.r(sb13, str, ':', to6Var26, "mapping"), e82VarG8);
                nx4Var4.a(new cx7(new va0(a88Var2, g27.a(j10.class), null, new ae(i2), kind3, emptyList2)));
                nx4Var4.a(new cx7(new va0(a88Var2, g27.a(w27.class), null, new ae(11), kind3, emptyList2)));
                break;
            case 23:
                int i9 = ka0.a;
                break;
            case 24:
                zw3 zw3Var = (zw3) obj;
                js3.p(zw3Var, "it");
                break;
            case 25:
                ((i) obj).a();
                break;
            case 26:
                break;
            case 27:
                u58 u58Var = e.b;
                i56 i56Var = (i56) ((j56) obj);
                i56Var.getClass();
                if (!((Context) wu8.G(i56Var, u58Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    wg0.a.getClass();
                }
                break;
            case 28:
                f.f((nn7) obj, 0);
                break;
            default:
                nx4 nx4Var5 = (nx4) obj;
                js3.p(nx4Var5, "$this$module");
                LinkedHashMap linkedHashMap3 = nx4Var5.c;
                fv fvVar = new fv(6);
                ae aeVar5 = new ae(18);
                a88 a88Var3 = vp7.j;
                Kind kind5 = Kind.b;
                EmptyList emptyList3 = EmptyList.a;
                e82 e82VarG9 = t61.g(new va0(a88Var3, g27.a(xl0.class), null, aeVar5, kind5, emptyList3), nx4Var5);
                ps0 ps0VarA14 = g27.a(wl0.class);
                va0 va0Var14 = e82VarG9.a;
                va0Var14.f = a.A0(ps0VarA14, va0Var14.f);
                to6 to6Var27 = va0Var14.c;
                to6 to6Var28 = va0Var14.a;
                StringBuilder sb14 = new StringBuilder();
                dw1.w(ps0VarA14, sb14, ':');
                if (to6Var27 == null || (value14 = to6Var27.getValue()) == null) {
                    value14 = "";
                }
                linkedHashMap3.put(dw1.r(sb14, value14, ':', to6Var28, "mapping"), e82VarG9);
                ae aeVar6 = new ae(19, fvVar);
                Kind kind6 = Kind.a;
                cx7 cx7VarI6 = dw1.i(new va0(a88Var3, g27.a(rl0.class), null, aeVar6, kind6, emptyList3), nx4Var5);
                ps0 ps0VarA15 = g27.a(rl0.class);
                va0 va0Var15 = cx7VarI6.a;
                va0Var15.f = a.A0(ps0VarA15, va0Var15.f);
                to6 to6Var29 = va0Var15.c;
                to6 to6Var30 = va0Var15.a;
                StringBuilder sb15 = new StringBuilder();
                dw1.w(ps0VarA15, sb15, ':');
                if (to6Var29 == null || (value15 = to6Var29.getValue()) == null) {
                    value15 = "";
                }
                linkedHashMap3.put(dw1.r(sb15, value15, ':', to6Var30, "mapping"), cx7VarI6);
                e82 e82VarG10 = t61.g(new va0(a88Var3, g27.a(fj1.class), null, new ae(20), kind5, emptyList3), nx4Var5);
                ps0 ps0VarA16 = g27.a(yq2.class);
                va0 va0Var16 = e82VarG10.a;
                va0Var16.f = a.A0(ps0VarA16, va0Var16.f);
                to6 to6Var31 = va0Var16.c;
                to6 to6Var32 = va0Var16.a;
                StringBuilder sb16 = new StringBuilder();
                dw1.w(ps0VarA16, sb16, ':');
                if (to6Var31 == null || (value16 = to6Var31.getValue()) == null) {
                    value16 = "";
                }
                linkedHashMap3.put(dw1.r(sb16, value16, ':', to6Var32, "mapping"), e82VarG10);
                e82 e82VarG11 = t61.g(new va0(a88Var3, g27.a(rr2.class), null, new ae(21), kind5, emptyList3), nx4Var5);
                ps0 ps0VarA17 = g27.a(yq2.class);
                va0 va0Var17 = e82VarG11.a;
                va0Var17.f = a.A0(ps0VarA17, va0Var17.f);
                to6 to6Var33 = va0Var17.c;
                to6 to6Var34 = va0Var17.a;
                StringBuilder sb17 = new StringBuilder();
                dw1.w(ps0VarA17, sb17, ':');
                if (to6Var33 == null || (value17 = to6Var33.getValue()) == null) {
                    value17 = "";
                }
                linkedHashMap3.put(dw1.r(sb17, value17, ':', to6Var34, "mapping"), e82VarG11);
                e82 e82VarG12 = t61.g(new va0(a88Var3, g27.a(im3.class), null, new ae(22), kind5, emptyList3), nx4Var5);
                ps0 ps0VarA18 = g27.a(yq2.class);
                va0 va0Var18 = e82VarG12.a;
                va0Var18.f = a.A0(ps0VarA18, va0Var18.f);
                to6 to6Var35 = va0Var18.c;
                to6 to6Var36 = va0Var18.a;
                StringBuilder sb18 = new StringBuilder();
                dw1.w(ps0VarA18, sb18, ':');
                if (to6Var35 == null || (value18 = to6Var35.getValue()) == null) {
                    value18 = "";
                }
                linkedHashMap3.put(dw1.r(sb18, value18, ':', to6Var36, "mapping"), e82VarG12);
                e82 e82VarG13 = t61.g(new va0(a88Var3, g27.a(ko3.class), null, new ae(23), kind5, emptyList3), nx4Var5);
                ps0 ps0VarA19 = g27.a(yq2.class);
                va0 va0Var19 = e82VarG13.a;
                va0Var19.f = a.A0(ps0VarA19, va0Var19.f);
                to6 to6Var37 = va0Var19.c;
                to6 to6Var38 = va0Var19.a;
                StringBuilder sb19 = new StringBuilder();
                dw1.w(ps0VarA19, sb19, ':');
                if (to6Var37 == null || (value19 = to6Var37.getValue()) == null) {
                    value19 = "";
                }
                linkedHashMap3.put(dw1.r(sb19, value19, ':', to6Var38, "mapping"), e82VarG13);
                e82 e82VarG14 = t61.g(new va0(a88Var3, g27.a(vn7.class), null, new ae(24), kind5, emptyList3), nx4Var5);
                ps0 ps0VarA20 = g27.a(yq2.class);
                va0 va0Var20 = e82VarG14.a;
                va0Var20.f = a.A0(ps0VarA20, va0Var20.f);
                to6 to6Var39 = va0Var20.c;
                to6 to6Var40 = va0Var20.a;
                StringBuilder sb20 = new StringBuilder();
                dw1.w(ps0VarA20, sb20, ':');
                if (to6Var39 != null && (value20 = to6Var39.getValue()) != null) {
                    str = value20;
                }
                linkedHashMap3.put(dw1.r(sb20, str, ':', to6Var40, "mapping"), e82VarG14);
                nx4Var5.a(new cx7(new va0(a88Var3, g27.a(ir.myket.callback.manager.a.class), null, new ae(i6), kind6, emptyList3)));
                break;
        }
        return tx8Var;
    }

    public /* synthetic */ k7(AppSearchRecyclerListFragment appSearchRecyclerListFragment) {
        this.a = 17;
    }
}
