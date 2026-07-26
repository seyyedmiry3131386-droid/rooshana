package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.lazy.staggeredgrid.a;
import androidx.compose.material3.k;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import ir.mservices.market.app.detail.more.data.MoreDescriptionList;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.intro.recycler.IntroData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.ui.detail.MovieDetailViewModel;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class us3 implements dp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ us3(int i) {
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
        int i = this.a;
        int i2 = 20;
        int i3 = 19;
        int i4 = 18;
        tx8 tx8Var = tx8.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new RecyclerItem((IntroData) it.next()));
                }
                return arrayList;
            case 1:
                zu3 zu3Var = (zu3) obj;
                js3.p(zu3Var, "$this$Json");
                zu3Var.a = true;
                return tx8Var;
            case 2:
                qs0 qs0Var = (qs0) obj;
                js3.p(qs0Var, "$this$buildSerialDescriptor");
                qs0.a(qs0Var, "JsonPrimitive", new ov3(new qq1(i4)));
                qs0.a(qs0Var, "JsonNull", new ov3(new qq1(i3)));
                qs0.a(qs0Var, "JsonLiteral", new ov3(new qq1(i2)));
                qs0.a(qs0Var, "JsonObject", new ov3(new qq1(21)));
                qs0.a(qs0Var, "JsonArray", new ov3(new qq1(22)));
                return tx8Var;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                js3.p(entry, "<destruct>");
                String str = (String) entry.getKey();
                kv3 kv3Var = (kv3) entry.getValue();
                StringBuilder sb = new StringBuilder();
                y78.a(sb, str);
                sb.append(':');
                sb.append(kv3Var);
                return sb.toString();
            case 4:
                List list2 = (List) obj;
                return new b(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 5:
                return tx8Var;
            case 6:
                List list3 = (List) obj;
                return new a((int[]) list3.get(0), (int[]) list3.get(1));
            case 7:
                return tx8Var;
            case 8:
                return tx8Var;
            case 9:
                return tx8Var;
            case 10:
                d84 d84Var = (d84) obj;
                js3.p(d84Var, "it");
                b47 b47Var = d84Var.f;
                if (b47Var instanceof d84) {
                    return (d84) b47Var;
                }
                return null;
            case 11:
                d84 d84Var2 = (d84) obj;
                js3.p(d84Var2, "it");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d84Var2.d);
                sb2.append('=');
                sb2.append(d84Var2.e);
                return sb2.toString();
            case 12:
                u58 u58Var = e.b;
                i56 i56Var = (i56) ((j56) obj);
                i56Var.getClass();
                Context baseContext = (Context) wu8.G(i56Var, u58Var);
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (baseContext instanceof Activity) {
                            obj = baseContext;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                }
                return (Activity) obj;
            case 13:
                ((Long) obj).getClass();
                return tx8Var;
            case 14:
                float f = k.a;
                return Boolean.TRUE;
            case 15:
                f.i((nn7) obj);
                return tx8Var;
            case 16:
                ox3[] ox3VarArr = f.a;
                ((nn7) obj).a(d.x, tx8Var);
                return tx8Var;
            case 17:
                List<MyketRecyclerData> items = ((MoreDescriptionList) obj).getItems();
                ArrayList arrayList2 = new ArrayList(wu0.V(items, 10));
                Iterator<T> it2 = items.iterator();
                while (it2.hasNext()) {
                    bl4.G((MyketRecyclerData) it2.next(), arrayList2);
                }
                return arrayList2;
            case 18:
                js3.p((vd6) obj, "it");
                return tx8Var;
            case 19:
                nx4 nx4Var = (nx4) obj;
                js3.p(nx4Var, "$this$module");
                LinkedHashMap linkedHashMap = nx4Var.c;
                rl3 rl3Var = new rl3();
                sy0 sy0Var = new sy0(24);
                a88 a88Var = vp7.j;
                Kind kind = Kind.a;
                EmptyList emptyList = EmptyList.a;
                nx4Var.a(new cx7(new va0(a88Var, g27.a(qk7.class), null, sy0Var, kind, emptyList)));
                cx7 cx7VarI = dw1.i(new va0(a88Var, g27.a(c15.class), null, new r05(2, rl3Var), kind, emptyList), nx4Var);
                ps0 ps0VarA = g27.a(c15.class);
                va0 va0Var = cx7VarI.a;
                va0Var.f = kotlin.collections.a.A0(ps0VarA, va0Var.f);
                to6 to6Var = va0Var.c;
                to6 to6Var2 = va0Var.a;
                StringBuilder sb3 = new StringBuilder();
                dw1.w(ps0VarA, sb3, ':');
                String str2 = "";
                if (to6Var == null || (value = to6Var.getValue()) == null) {
                    value = "";
                }
                linkedHashMap.put(dw1.r(sb3, value, ':', to6Var2, "mapping"), cx7VarI);
                cx7 cx7VarI2 = dw1.i(new va0(a88Var, g27.a(z75.class), null, new sy0(rl3Var), kind, emptyList), nx4Var);
                ps0 ps0VarA2 = g27.a(z75.class);
                va0 va0Var2 = cx7VarI2.a;
                va0Var2.f = kotlin.collections.a.A0(ps0VarA2, va0Var2.f);
                to6 to6Var3 = va0Var2.c;
                to6 to6Var4 = va0Var2.a;
                StringBuilder sb4 = new StringBuilder();
                dw1.w(ps0VarA2, sb4, ':');
                if (to6Var3 == null || (value2 = to6Var3.getValue()) == null) {
                    value2 = "";
                }
                linkedHashMap.put(dw1.r(sb4, value2, ':', to6Var4, "mapping"), cx7VarI2);
                sy0 sy0Var2 = new sy0(17);
                Kind kind2 = Kind.b;
                e82 e82VarG = t61.g(new va0(a88Var, g27.a(ws0.class), null, sy0Var2, kind2, emptyList), nx4Var);
                ps0 ps0VarA3 = g27.a(yq2.class);
                va0 va0Var3 = e82VarG.a;
                va0Var3.f = kotlin.collections.a.A0(ps0VarA3, va0Var3.f);
                to6 to6Var5 = va0Var3.c;
                to6 to6Var6 = va0Var3.a;
                StringBuilder sb5 = new StringBuilder();
                dw1.w(ps0VarA3, sb5, ':');
                if (to6Var5 == null || (value3 = to6Var5.getValue()) == null) {
                    value3 = "";
                }
                linkedHashMap.put(dw1.r(sb5, value3, ':', to6Var6, "mapping"), e82VarG);
                e82 e82VarG2 = t61.g(new va0(a88Var, g27.a(sr2.class), null, new sy0(i4), kind2, emptyList), nx4Var);
                ps0 ps0VarA4 = g27.a(wq2.class);
                va0 va0Var4 = e82VarG2.a;
                va0Var4.f = kotlin.collections.a.A0(ps0VarA4, va0Var4.f);
                to6 to6Var7 = va0Var4.c;
                to6 to6Var8 = va0Var4.a;
                StringBuilder sb6 = new StringBuilder();
                dw1.w(ps0VarA4, sb6, ':');
                if (to6Var7 == null || (value4 = to6Var7.getValue()) == null) {
                    value4 = "";
                }
                linkedHashMap.put(dw1.r(sb6, value4, ':', to6Var8, "mapping"), e82VarG2);
                e82 e82VarG3 = t61.g(new va0(a88Var, g27.a(zr2.class), null, new sy0(i3), kind2, emptyList), nx4Var);
                ps0 ps0VarA5 = g27.a(wq2.class);
                va0 va0Var5 = e82VarG3.a;
                va0Var5.f = kotlin.collections.a.A0(ps0VarA5, va0Var5.f);
                to6 to6Var9 = va0Var5.c;
                to6 to6Var10 = va0Var5.a;
                StringBuilder sb7 = new StringBuilder();
                dw1.w(ps0VarA5, sb7, ':');
                if (to6Var9 == null || (value5 = to6Var9.getValue()) == null) {
                    value5 = "";
                }
                linkedHashMap.put(dw1.r(sb7, value5, ':', to6Var10, "mapping"), e82VarG3);
                e82 e82VarG4 = t61.g(new va0(a88Var, g27.a(as2.class), null, new sy0(i2), kind2, emptyList), nx4Var);
                ps0 ps0VarA6 = g27.a(yq2.class);
                va0 va0Var6 = e82VarG4.a;
                va0Var6.f = kotlin.collections.a.A0(ps0VarA6, va0Var6.f);
                to6 to6Var11 = va0Var6.c;
                to6 to6Var12 = va0Var6.a;
                StringBuilder sb8 = new StringBuilder();
                dw1.w(ps0VarA6, sb8, ':');
                if (to6Var11 == null || (value6 = to6Var11.getValue()) == null) {
                    value6 = "";
                }
                linkedHashMap.put(dw1.r(sb8, value6, ':', to6Var12, "mapping"), e82VarG4);
                e82 e82VarG5 = t61.g(new va0(a88Var, g27.a(bs2.class), null, new sy0(21), kind2, emptyList), nx4Var);
                ps0 ps0VarA7 = g27.a(wq2.class);
                va0 va0Var7 = e82VarG5.a;
                va0Var7.f = kotlin.collections.a.A0(ps0VarA7, va0Var7.f);
                to6 to6Var13 = va0Var7.c;
                to6 to6Var14 = va0Var7.a;
                StringBuilder sb9 = new StringBuilder();
                dw1.w(ps0VarA7, sb9, ':');
                if (to6Var13 == null || (value7 = to6Var13.getValue()) == null) {
                    value7 = "";
                }
                linkedHashMap.put(dw1.r(sb9, value7, ':', to6Var14, "mapping"), e82VarG5);
                e82 e82VarG6 = t61.g(new va0(a88Var, g27.a(cs2.class), null, new sy0(22), kind2, emptyList), nx4Var);
                ps0 ps0VarA8 = g27.a(yq2.class);
                va0 va0Var8 = e82VarG6.a;
                va0Var8.f = kotlin.collections.a.A0(ps0VarA8, va0Var8.f);
                to6 to6Var15 = va0Var8.c;
                to6 to6Var16 = va0Var8.a;
                StringBuilder sb10 = new StringBuilder();
                dw1.w(ps0VarA8, sb10, ':');
                if (to6Var15 == null || (value8 = to6Var15.getValue()) == null) {
                    value8 = "";
                }
                linkedHashMap.put(dw1.r(sb10, value8, ':', to6Var16, "mapping"), e82VarG6);
                e82 e82VarG7 = t61.g(new va0(a88Var, g27.a(ds2.class), null, new sy0(23), kind2, emptyList), nx4Var);
                ps0 ps0VarA9 = g27.a(yq2.class);
                va0 va0Var9 = e82VarG7.a;
                va0Var9.f = kotlin.collections.a.A0(ps0VarA9, va0Var9.f);
                to6 to6Var17 = va0Var9.c;
                to6 to6Var18 = va0Var9.a;
                StringBuilder sb11 = new StringBuilder();
                dw1.w(ps0VarA9, sb11, ':');
                if (to6Var17 == null || (value9 = to6Var17.getValue()) == null) {
                    value9 = "";
                }
                linkedHashMap.put(dw1.r(sb11, value9, ':', to6Var18, "mapping"), e82VarG7);
                e82 e82VarG8 = t61.g(new va0(a88Var, g27.a(fs2.class), null, new sy0(25), kind2, emptyList), nx4Var);
                ps0 ps0VarA10 = g27.a(yq2.class);
                va0 va0Var10 = e82VarG8.a;
                va0Var10.f = kotlin.collections.a.A0(ps0VarA10, va0Var10.f);
                to6 to6Var19 = va0Var10.c;
                to6 to6Var20 = va0Var10.a;
                StringBuilder sb12 = new StringBuilder();
                dw1.w(ps0VarA10, sb12, ':');
                if (to6Var19 == null || (value10 = to6Var19.getValue()) == null) {
                    value10 = "";
                }
                linkedHashMap.put(dw1.r(sb12, value10, ':', to6Var20, "mapping"), e82VarG8);
                e82 e82VarG9 = t61.g(new va0(a88Var, g27.a(lo3.class), null, new sy0(26), kind2, emptyList), nx4Var);
                ps0 ps0VarA11 = g27.a(yq2.class);
                va0 va0Var11 = e82VarG9.a;
                va0Var11.f = kotlin.collections.a.A0(ps0VarA11, va0Var11.f);
                to6 to6Var21 = va0Var11.c;
                to6 to6Var22 = va0Var11.a;
                StringBuilder sb13 = new StringBuilder();
                dw1.w(ps0VarA11, sb13, ':');
                if (to6Var21 == null || (value11 = to6Var21.getValue()) == null) {
                    value11 = "";
                }
                linkedHashMap.put(dw1.r(sb13, value11, ':', to6Var22, "mapping"), e82VarG9);
                e82 e82VarG10 = t61.g(new va0(a88Var, g27.a(no6.class), null, new sy0(27), kind2, emptyList), nx4Var);
                ps0 ps0VarA12 = g27.a(yq2.class);
                va0 va0Var12 = e82VarG10.a;
                va0Var12.f = kotlin.collections.a.A0(ps0VarA12, va0Var12.f);
                to6 to6Var23 = va0Var12.c;
                to6 to6Var24 = va0Var12.a;
                StringBuilder sb14 = new StringBuilder();
                dw1.w(ps0VarA12, sb14, ':');
                if (to6Var23 == null || (value12 = to6Var23.getValue()) == null) {
                    value12 = "";
                }
                linkedHashMap.put(dw1.r(sb14, value12, ':', to6Var24, "mapping"), e82VarG10);
                e82 e82VarG11 = t61.g(new va0(a88Var, g27.a(y15.class), null, new sy0(28), kind2, emptyList), nx4Var);
                ps0 ps0VarA13 = g27.a(x15.class);
                va0 va0Var13 = e82VarG11.a;
                va0Var13.f = kotlin.collections.a.A0(ps0VarA13, va0Var13.f);
                to6 to6Var25 = va0Var13.c;
                to6 to6Var26 = va0Var13.a;
                StringBuilder sb15 = new StringBuilder();
                dw1.w(ps0VarA13, sb15, ':');
                if (to6Var25 == null || (value13 = to6Var25.getValue()) == null) {
                    value13 = "";
                }
                linkedHashMap.put(dw1.r(sb15, value13, ':', to6Var26, "mapping"), e82VarG11);
                e82 e82VarG12 = t61.g(new va0(a88Var, g27.a(e85.class), null, new sy0(29), kind2, emptyList), nx4Var);
                ps0 ps0VarA14 = g27.a(d85.class);
                va0 va0Var14 = e82VarG12.a;
                va0Var14.f = kotlin.collections.a.A0(ps0VarA14, va0Var14.f);
                to6 to6Var27 = va0Var14.c;
                to6 to6Var28 = va0Var14.a;
                StringBuilder sb16 = new StringBuilder();
                dw1.w(ps0VarA14, sb16, ':');
                if (to6Var27 == null || (value14 = to6Var27.getValue()) == null) {
                    value14 = "";
                }
                linkedHashMap.put(dw1.r(sb16, value14, ':', to6Var28, "mapping"), e82VarG12);
                byte b = 0;
                e82 e82VarG13 = t61.g(new va0(a88Var, g27.a(n85.class), null, new r05(b, b), kind2, emptyList), nx4Var);
                ps0 ps0VarA15 = g27.a(m85.class);
                va0 va0Var15 = e82VarG13.a;
                va0Var15.f = kotlin.collections.a.A0(ps0VarA15, va0Var15.f);
                to6 to6Var29 = va0Var15.c;
                to6 to6Var30 = va0Var15.a;
                StringBuilder sb17 = new StringBuilder();
                dw1.w(ps0VarA15, sb17, ':');
                if (to6Var29 == null || (value15 = to6Var29.getValue()) == null) {
                    value15 = "";
                }
                linkedHashMap.put(dw1.r(sb17, value15, ':', to6Var30, "mapping"), e82VarG13);
                e82 e82VarG14 = t61.g(new va0(a88Var, g27.a(vk7.class), null, new r05(1, (byte) 0), kind2, emptyList), nx4Var);
                ps0 ps0VarA16 = g27.a(uk7.class);
                va0 va0Var16 = e82VarG14.a;
                va0Var16.f = kotlin.collections.a.A0(ps0VarA16, va0Var16.f);
                to6 to6Var31 = va0Var16.c;
                to6 to6Var32 = va0Var16.a;
                StringBuilder sb18 = new StringBuilder();
                dw1.w(ps0VarA16, sb18, ':');
                if (to6Var31 != null && (value16 = to6Var31.getValue()) != null) {
                    str2 = value16;
                }
                linkedHashMap.put(dw1.r(sb18, str2, ':', to6Var32, "mapping"), e82VarG14);
                return tx8Var;
            case 20:
                HomeMovieBannerListDto homeMovieBannerListDto = (HomeMovieBannerListDto) obj;
                js3.p(homeMovieBannerListDto, "dto");
                List<HomeMovieBannerDto> banners = homeMovieBannerListDto.getBanners();
                ArrayList arrayList3 = new ArrayList(wu0.V(banners, 10));
                Iterator<T> it3 = banners.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new RecyclerItem(new MovieHomeBannersItemData((HomeMovieBannerDto) it3.next())));
                }
                return arrayList3;
            case 21:
                fv7 fv7Var = (fv7) obj;
                js3.p(fv7Var, "it");
                ArrayList arrayList4 = fv7Var.a;
                ArrayList arrayList5 = new ArrayList(wu0.V(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    bl4.G((MyketRecyclerData) it4.next(), arrayList5);
                }
                return arrayList5;
            case 22:
                fv7 fv7Var2 = (fv7) obj;
                js3.p(fv7Var2, "it");
                ArrayList arrayList6 = fv7Var2.a;
                ArrayList arrayList7 = new ArrayList(wu0.V(arrayList6, 10));
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    bl4.G((MyketRecyclerData) it5.next(), arrayList7);
                }
                return arrayList7;
            case 23:
                fv7 fv7Var3 = (fv7) obj;
                js3.p(fv7Var3, "it");
                ArrayList arrayList8 = fv7Var3.a;
                ArrayList arrayList9 = new ArrayList(wu0.V(arrayList8, 10));
                Iterator it6 = arrayList8.iterator();
                while (it6.hasNext()) {
                    bl4.G((MyketRecyclerData) it6.next(), arrayList9);
                }
                return arrayList9;
            case 24:
                HomeMovieBannerListDto homeMovieBannerListDto2 = (HomeMovieBannerListDto) obj;
                js3.p(homeMovieBannerListDto2, "bannersDto");
                List<HomeMovieBannerDto> banners2 = homeMovieBannerListDto2.getBanners();
                ArrayList arrayList10 = new ArrayList(wu0.V(banners2, 10));
                Iterator<T> it7 = banners2.iterator();
                while (it7.hasNext()) {
                    arrayList10.add(new RecyclerItem(new MovieHomeBannersItemData((HomeMovieBannerDto) it7.next())));
                }
                return arrayList10;
            case 25:
                fv7 fv7Var4 = (fv7) obj;
                js3.p(fv7Var4, "it");
                ArrayList arrayList11 = fv7Var4.a;
                ArrayList arrayList12 = new ArrayList(wu0.V(arrayList11, 10));
                Iterator it8 = arrayList11.iterator();
                while (it8.hasNext()) {
                    bl4.G((MyketRecyclerData) it8.next(), arrayList12);
                }
                return arrayList12;
            case 26:
                fv7 fv7Var5 = (fv7) obj;
                js3.p(fv7Var5, "it");
                ArrayList arrayList13 = fv7Var5.a;
                ArrayList arrayList14 = new ArrayList(wu0.V(arrayList13, 10));
                Iterator it9 = arrayList13.iterator();
                while (it9.hasNext()) {
                    bl4.G((MyketRecyclerData) it9.next(), arrayList14);
                }
                return arrayList14;
            case 27:
                dq4 dq4Var = (dq4) obj;
                return new Pair(dq4Var != null ? dq4Var.a : null, dq4Var != null ? Boolean.valueOf(dq4Var.b) : null);
            case 28:
                return Boolean.valueOf(MovieDetailViewModel.updateReview$lambda$2((RecyclerItem) obj));
            default:
                bs1 bs1Var = (bs1) obj;
                js3.p(bs1Var, "downloadInfo");
                return Boolean.valueOf(((es1) bs1Var).f != 100);
        }
    }

    public /* synthetic */ us3(int i, v34 v34Var) {
        this.a = 5;
    }
}
