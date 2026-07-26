package defpackage;

import androidx.datastore.core.f;
import defpackage.dm2;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.feedback.data.FeedbackList;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.pika.send.recycler.InstalledAppsTitleData;
import ir.mservices.market.pika.send.recycler.SearchAppData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements dp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ sl0(int i) {
        this.a = i;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws Exception {
        String value;
        String value2;
        int i = 3;
        int i2 = 2;
        z = false;
        boolean z = false;
        int i3 = 1;
        switch (this.a) {
            case 0:
                mb7 mb7Var = (mb7) obj;
                js3.p(mb7Var, "_connection");
                rb7 rb7VarM1 = mb7Var.m1("SELECT * FROM callback_url");
                try {
                    int iJ = sb7.j(rb7VarM1, "id");
                    int iJ2 = sb7.j(rb7VarM1, "url");
                    int iJ3 = sb7.j(rb7VarM1, "type");
                    int iJ4 = sb7.j(rb7VarM1, "retry_count");
                    int iJ5 = sb7.j(rb7VarM1, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (rb7VarM1.f1()) {
                        arrayList.add(new vl0((int) rb7VarM1.getLong(iJ), rb7VarM1.B0(iJ2), rb7VarM1.B0(iJ3), (int) rb7VarM1.getLong(iJ4), rb7VarM1.getLong(iJ5)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                mb7 mb7Var2 = (mb7) obj;
                js3.p(mb7Var2, "_connection");
                rb7 rb7VarM12 = mb7Var2.m1("DELETE FROM callback_url WHERE retry_count > 5 OR timestamp < (strftime('%s', 'now') * 1000 - 259200000)");
                try {
                    rb7VarM12.f1();
                    rb7VarM12.close();
                    return tx8.a;
                } finally {
                }
            case 2:
                fs8 fs8Var = (fs8) obj;
                js3.n(fs8Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                f26 f26Var = (f26) fs8Var;
                f26Var.p = false;
                t17.f(f26Var);
                return Boolean.FALSE;
            case 3:
                String str = "";
                nx4 nx4Var = (nx4) obj;
                js3.p(nx4Var, "$this$module");
                LinkedHashMap linkedHashMap = nx4Var.c;
                nx4 nx4Var2 = new nx4();
                nx4Var2.a(new cx7(new va0(vp7.j, g27.a(lz.class), null, new g66(i3), Kind.a, EmptyList.a)));
                int i4 = 16;
                sm5 sm5Var = new sm5(i4);
                js3.p(nx4Var2, "<this>");
                sm5Var.invoke(new nf7(qh.b, nx4Var2));
                sm5 sm5Var2 = new sm5(18);
                nx4 nx4Var3 = new nx4();
                sm5Var2.invoke(nx4Var3);
                nx4 nx4Var4 = new nx4();
                g66 g66Var = new g66(15);
                a88 a88Var = vp7.j;
                Kind kind = Kind.a;
                EmptyList emptyList = EmptyList.a;
                nx4Var4.a(new cx7(new va0(a88Var, g27.a(de6.class), null, g66Var, kind, emptyList)));
                nx4Var4.a(new cx7(new va0(a88Var, g27.a(sq4.class), null, new g66(i4), kind, emptyList)));
                sm5 sm5Var3 = new sm5(22);
                nx4 nx4Var5 = new nx4();
                sm5Var3.invoke(nx4Var5);
                a.c0(nx4Var.e, new nx4[]{nx4Var2, nx4Var3, nx4Var4, nx4Var5});
                a88 a88Var2 = new a88("AUDIO_PLAYER");
                ae aeVar = new ae(26);
                a88 a88Var3 = vp7.j;
                Kind kind2 = Kind.b;
                EmptyList emptyList2 = EmptyList.a;
                e82 e82VarG = t61.g(new va0(a88Var3, g27.a(wz.class), a88Var2, aeVar, kind2, emptyList2), nx4Var);
                ps0 ps0VarA = g27.a(of6.class);
                va0 va0Var = e82VarG.a;
                va0Var.f = a.A0(ps0VarA, va0Var.f);
                to6 to6Var = va0Var.c;
                to6 to6Var2 = va0Var.a;
                StringBuilder sb = new StringBuilder();
                dw1.w(ps0VarA, sb, ':');
                if (to6Var == null || (value = to6Var.getValue()) == null) {
                    value = "";
                }
                linkedHashMap.put(dw1.r(sb, value, ':', to6Var2, "mapping"), e82VarG);
                e82 e82VarG2 = t61.g(new va0(a88Var3, g27.a(mt0.class), new a88("VIDEO_PLAYER"), new ae(27), kind2, emptyList2), nx4Var);
                ps0 ps0VarA2 = g27.a(of6.class);
                va0 va0Var2 = e82VarG2.a;
                va0Var2.f = a.A0(ps0VarA2, va0Var2.f);
                to6 to6Var3 = va0Var2.c;
                to6 to6Var4 = va0Var2.a;
                StringBuilder sb2 = new StringBuilder();
                dw1.w(ps0VarA2, sb2, ':');
                if (to6Var3 != null && (value2 = to6Var3.getValue()) != null) {
                    str = value2;
                }
                linkedHashMap.put(dw1.r(sb2, str, ':', to6Var4, "mapping"), e82VarG2);
                return tx8.a;
            case 4:
                nx4 nx4Var6 = (nx4) obj;
                js3.p(nx4Var6, "$this$module");
                sy0 sy0Var = new sy0(i3);
                a88 a88Var4 = vp7.j;
                Kind kind3 = Kind.b;
                EmptyList emptyList3 = EmptyList.a;
                nx4Var6.a(new e82(new va0(a88Var4, g27.a(k21.class), null, sy0Var, kind3, emptyList3)));
                sy0 sy0Var2 = new sy0(i2);
                Kind kind4 = Kind.a;
                nx4Var6.a(new cx7(new va0(a88Var4, g27.a(qu2.class), null, sy0Var2, kind4, emptyList3)));
                nx4Var6.a(new cx7(new va0(a88Var4, g27.a(fw4.class), null, new sy0(i), kind4, emptyList3)));
                return tx8.a;
            case 5:
                u61 u61Var = (u61) obj;
                if (u61Var instanceof y61) {
                    return (y61) u61Var;
                }
                return null;
            case 6:
                return Boolean.valueOf(((Integer) obj).intValue() == 252);
            case 7:
                return Boolean.valueOf(((Integer) obj).intValue() == 250);
            case 8:
                es1 es1Var = (es1) ((bs1) obj);
                return Boolean.valueOf((es1Var.f == 100 && es1Var.g == 102) ? false : true);
            case 9:
                long j = ((nr5) obj).a;
                throw null;
            case 10:
                return Boolean.TRUE;
            case 11:
                List<MyketRecyclerData> items = ((FeedbackList) obj).getItems();
                ArrayList arrayList2 = new ArrayList(wu0.V(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList2);
                }
                return arrayList2;
            case 12:
                File file = (File) obj;
                js3.p(file, "it");
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                js3.o(absolutePath, "getAbsolutePath(...)");
                return new f(absolutePath);
            case 13:
                return 100L;
            case 14:
                Pair pair = (Pair) obj;
                js3.p(pair, "it");
                return (String) pair.a;
            case 15:
                js3.p((l71) obj, "$this$initializer");
                return new dm2.a();
            case 16:
                synchronized (g08.c) {
                    List list = g08.i;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((dp2) list.get(i5)).invoke(obj);
                    }
                }
                return tx8.a;
            case 17:
                return HomeViewModel.fillHomeData$lambda$11$5((HomeMovieBannerListDto) obj);
            case 18:
                return HomeViewModel.getExtHeaderAppsData$lambda$1((fv7) obj);
            case 19:
                return HomeViewModel.getExtensionApp$lambda$1((fv7) obj);
            case 20:
                return HomeViewModel.getExtensionApps$lambda$1((fv7) obj);
            case 21:
                return HomeViewModel.getExtensionReviews$lambda$1((fv7) obj);
            case 22:
                ArrayList arrayList3 = ((kp) obj).a;
                ArrayList arrayList4 = new ArrayList(wu0.V(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    bl4.G((MyketRecyclerData) it2.next(), arrayList4);
                }
                return arrayList4;
            case 23:
                List list2 = (List) obj;
                ListBuilder listBuilderS = br9.s();
                listBuilderS.add(new RecyclerItem(new InstalledAppsTitleData(list2.size())));
                listBuilderS.add(new RecyclerItem(new SearchAppData()));
                ArrayList arrayList5 = new ArrayList(wu0.V(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    bl4.G((MyketRecyclerData) it3.next(), arrayList5);
                }
                listBuilderS.addAll(arrayList5);
                return br9.q(listBuilderS);
            case 24:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 25:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 26:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 27:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 28:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            default:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
