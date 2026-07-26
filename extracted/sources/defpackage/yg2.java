package defpackage;

import android.app.usage.UsageStats;
import android.view.View;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.h;
import androidx.compose.ui.semantics.c;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.appUsage.recycler.InstalledAppUsageData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.version2.model.MovieWatchProgressModel;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class yg2 implements Comparator {
    public static final yg2 b = new yg2(0);
    public static final yg2 c = new yg2(1);
    public static final yg2 d = new yg2(2);
    public static final yg2 e = new yg2(3);
    public static final yg2 f = new yg2(4);
    public final /* synthetic */ int a;

    public /* synthetic */ yg2(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long lValueOf;
        int i = 0;
        switch (this.a) {
            case 0:
                d dVar = (d) obj;
                d dVar2 = (d) obj2;
                if (zk8.L(dVar) && zk8.L(dVar2)) {
                    h hVarH = y40.H(dVar);
                    h hVarH2 = y40.H(dVar2);
                    if (!js3.i(hVarH, hVarH2)) {
                        Object[] objArr = new h[16];
                        int i2 = 0;
                        while (hVarH != null) {
                            int i3 = i2 + 1;
                            if (objArr.length < i3) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i2 != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i2 + 0);
                            }
                            objArr[0] = hVarH;
                            i2++;
                            hVarH = hVarH.F();
                        }
                        Object[] objArr3 = new h[16];
                        int i4 = 0;
                        while (hVarH2 != null) {
                            int i5 = i4 + 1;
                            if (objArr3.length < i5) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i4 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i4 + 0);
                            }
                            objArr3[0] = hVarH2;
                            i4++;
                            hVarH2 = hVarH2.F();
                        }
                        int iMin = Math.min(i2 - 1, i4 - 1);
                        if (iMin >= 0) {
                            while (js3.i(objArr[i], objArr3[i])) {
                                if (i != iMin) {
                                    i++;
                                }
                            }
                            return js3.r(((h) objArr[i]).G(), ((h) objArr3[i]).G());
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (zk8.L(dVar)) {
                        return -1;
                    }
                    if (zk8.L(dVar2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                sy6 sy6VarH = ((c) obj).h();
                sy6 sy6VarH2 = ((c) obj2).h();
                int iCompare = Float.compare(sy6VarH.a, sy6VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(sy6VarH.b, sy6VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(sy6VarH.d, sy6VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(sy6VarH.c, sy6VarH2.c);
            case 2:
                h hVar = (h) obj;
                h hVar2 = (h) obj2;
                int iR = js3.r(hVar2.r, hVar.r);
                return iR != 0 ? iR : js3.r(hVar.hashCode(), hVar2.hashCode());
            case 3:
                sy6 sy6VarH3 = ((c) obj).h();
                sy6 sy6VarH4 = ((c) obj2).h();
                int iCompare4 = Float.compare(sy6VarH4.c, sy6VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(sy6VarH3.b, sy6VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(sy6VarH3.d, sy6VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(sy6VarH4.a, sy6VarH3.a);
            case 4:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompare7 = Float.compare(((sy6) pair.a).b, ((sy6) pair2.a).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((sy6) pair.a).d, ((sy6) pair2.a).d);
            case 5:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 6:
                return bt2.t(Integer.valueOf(((kl) obj).b), Integer.valueOf(((kl) obj2).b));
            case 7:
                return bt2.t(Integer.valueOf(((kl) obj).b), Integer.valueOf(((kl) obj2).b));
            case 8:
                MyketRecyclerData myketRecyclerData = (MyketRecyclerData) obj;
                js3.n(myketRecyclerData, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
                String str = ((InstalledAppUsageData) myketRecyclerData).a.b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                js3.o(lowerCase, "toLowerCase(...)");
                MyketRecyclerData myketRecyclerData2 = (MyketRecyclerData) obj2;
                js3.n(myketRecyclerData2, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
                String lowerCase2 = ((InstalledAppUsageData) myketRecyclerData2).a.b.toLowerCase(locale);
                js3.o(lowerCase2, "toLowerCase(...)");
                return bt2.t(lowerCase, lowerCase2);
            case 9:
                Long lValueOf2 = Long.MAX_VALUE;
                MyketRecyclerData myketRecyclerData3 = (MyketRecyclerData) obj;
                js3.n(myketRecyclerData3, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
                bu buVar = ((InstalledAppUsageData) myketRecyclerData3).a;
                UsageStats usageStats = buVar.e;
                if (usageStats == null || usageStats.getLastTimeUsed() != 0) {
                    UsageStats usageStats2 = buVar.e;
                    lValueOf = usageStats2 != null ? Long.valueOf(usageStats2.getLastTimeUsed()) : null;
                } else {
                    lValueOf = lValueOf2;
                }
                MyketRecyclerData myketRecyclerData4 = (MyketRecyclerData) obj2;
                js3.n(myketRecyclerData4, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
                bu buVar2 = ((InstalledAppUsageData) myketRecyclerData4).a;
                UsageStats usageStats3 = buVar2.e;
                if (usageStats3 == null || usageStats3.getLastTimeUsed() != 0) {
                    UsageStats usageStats4 = buVar2.e;
                    lValueOf2 = usageStats4 != null ? Long.valueOf(usageStats4.getLastTimeUsed()) : null;
                }
                return bt2.t(lValueOf, lValueOf2);
            case 10:
                MyketRecyclerData myketRecyclerData5 = (MyketRecyclerData) obj2;
                js3.n(myketRecyclerData5, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
                Long lValueOf3 = Long.valueOf(((InstalledAppUsageData) myketRecyclerData5).a.d.d);
                MyketRecyclerData myketRecyclerData6 = (MyketRecyclerData) obj;
                js3.n(myketRecyclerData6, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
                return bt2.t(lValueOf3, Long.valueOf(((InstalledAppUsageData) myketRecyclerData6).a.d.d));
            case 11:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 12:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                js3.p(str2, "a");
                js3.p(str3, "b");
                int iMin2 = Math.min(str2.length(), str3.length());
                int i6 = 4;
                while (true) {
                    if (i6 >= iMin2) {
                        int length3 = str2.length();
                        int length4 = str3.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 >= length4) {
                            return 1;
                        }
                    } else {
                        char cCharAt = str2.charAt(i6);
                        char cCharAt2 = str3.charAt(i6);
                        if (cCharAt == cCharAt2) {
                            i6++;
                        } else if (js3.r(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 13:
                WeakHashMap weakHashMap = q69.a;
                float fH = h69.h((View) obj);
                float fH2 = h69.h((View) obj2);
                if (fH > fH2) {
                    return -1;
                }
                return fH < fH2 ? 1 : 0;
            case 14:
                h hVar3 = (h) obj;
                h hVar4 = (h) obj2;
                int iR2 = js3.r(hVar3.r, hVar4.r);
                return iR2 != 0 ? iR2 : js3.r(hVar3.hashCode(), hVar4.hashCode());
            case 15:
                return ((eo1) obj).a - ((eo1) obj2).a;
            case 16:
                int i7 = ((es1) ((bs1) obj)).f;
                int i8 = ((es1) ((bs1) obj2)).f;
                if (i7 < i8) {
                    return 1;
                }
                return i7 > i8 ? -1 : 0;
            case 17:
                return bt2.t(Long.valueOf(((AppDownloadData) obj2).A), Long.valueOf(((AppDownloadData) obj).A));
            case 18:
                return bt2.t(Long.valueOf(((AppDownloadData) obj2).A), Long.valueOf(((AppDownloadData) obj).A));
            case 19:
                iq2 iq2Var = (iq2) obj;
                iq2 iq2Var2 = (iq2) obj2;
                RecyclerView recyclerView = iq2Var.d;
                if ((recyclerView == null) == (iq2Var2.d == null)) {
                    boolean z = iq2Var.a;
                    if (z == iq2Var2.a) {
                        int i9 = iq2Var2.b - iq2Var.b;
                        if (i9 != 0) {
                            return i9;
                        }
                        int i10 = iq2Var.c - iq2Var2.c;
                        if (i10 != 0) {
                            return i10;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 20:
                return bt2.t(Integer.valueOf(((HomeItemDTO) obj).getIndex()), Integer.valueOf(((HomeItemDTO) obj2).getIndex()));
            case 21:
                return bt2.t(Integer.valueOf(((HomeBannerDto) obj).getIndex()), Integer.valueOf(((HomeBannerDto) obj2).getIndex()));
            case 22:
                return Integer.compare(((zx3) obj).a, ((zx3) obj2).a);
            case 23:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 24:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 25:
                return bt2.t(Long.valueOf(((h85) obj2).e), Long.valueOf(((h85) obj).e));
            case 26:
                return bt2.t(Long.valueOf(((h85) obj2).e), Long.valueOf(((h85) obj).e));
            case 27:
                return bt2.t(Long.valueOf(((h85) obj2).e), Long.valueOf(((h85) obj).e));
            case 28:
                return bt2.t(Long.valueOf(((MovieWatchProgressModel) obj2).f()), Long.valueOf(((MovieWatchProgressModel) obj).f()));
            default:
                return bt2.t(Integer.valueOf(((uo6) obj2).a), Integer.valueOf(((uo6) obj).a));
        }
    }
}
