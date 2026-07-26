package ir.mservices.market.app.home.ui.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.f88;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.ub5;
import defpackage.wo2;
import ir.mservices.market.app.common.data.DisplayMode;
import ir.mservices.market.app.common.data.HomeAppsDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeAppsRowData extends NestedRecyclerData implements g32, wo2 {
    public final HomeAppsDto g;
    public final DisplayMode h;
    public final bz6 i;
    public final ub5 j;
    public final String k;
    public final boolean l;
    public static final int m = js6.home_apps_view;
    public static final int n = js6.home_apps_view_ext;
    public static final int o = js6.home_apps_view_digested;
    public static final int p = js6.home_apps_view_digested_ext;
    public static final int q = js6.home_apps_multi_one;
    public static final int r = js6.home_apps_multi_one_digested;
    public static final int s = js6.home_apps_multi_one_ext;
    public static final int t = js6.home_apps_multi_one_ext_digested;
    public static final int u = js6.home_apps_multi_two;
    public static final int v = js6.home_apps_multi_two_digested;
    public static final int w = js6.home_apps_multi_two_ext;
    public static final int x = js6.home_apps_multi_two_ext_digested;
    public static final int y = js6.home_apps_multi_three;
    public static final int z = js6.home_apps_multi_three_digested;
    public static final int A = js6.home_apps_multi_three_ext;
    public static final int B = js6.home_apps_multi_three_ext_digested;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeAppsRowData(HomeAppsDto homeAppsDto, DisplayMode displayMode, bz6 bz6Var, i iVar, String str, boolean z2, dp2 dp2Var, int i) {
        super(bz6Var, dp2Var);
        iVar = (i & 8) != 0 ? null : iVar;
        z2 = (i & 32) != 0 ? false : z2;
        js3.p(bz6Var, "homeAppsFlow");
        js3.p(str, "id");
        this.g = homeAppsDto;
        this.h = displayMode;
        this.i = bz6Var;
        this.j = iVar;
        this.k = str;
        this.l = z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0088, code lost:
    
        if (r0 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0093, code lost:
    
        if (r0 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0097, code lost:
    
        return ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009a, code lost:
    
        return ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.n;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int U() {
        /*
            r3 = this;
            bz6 r0 = r3.i
            xe2 r0 = r0.d
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            ir.mservices.market.app.common.data.DisplayMode r1 = r3.h
            java.lang.String r1 = r1.getMode()
            int r2 = r1.hashCode()
            switch(r2) {
                case -2056960487: goto L8b;
                case -1919497322: goto L7f;
                case -326601974: goto L6e;
                case -326601973: goto L5d;
                case -326601972: goto L4c;
                case 1734713453: goto L3b;
                case 1734713454: goto L2a;
                case 1734713455: goto L18;
                default: goto L16;
            }
        L16:
            goto L93
        L18:
            java.lang.String r2 = "Horizontal3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L22
            goto L93
        L22:
            if (r0 == 0) goto L27
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.y
            return r0
        L27:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.A
            return r0
        L2a:
            java.lang.String r2 = "Horizontal2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L33
            goto L93
        L33:
            if (r0 == 0) goto L38
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.u
            return r0
        L38:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.w
            return r0
        L3b:
            java.lang.String r2 = "Horizontal1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L44
            goto L93
        L44:
            if (r0 == 0) goto L49
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.q
            return r0
        L49:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.s
            return r0
        L4c:
            java.lang.String r2 = "DigestedHorizontal3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L55
            goto L93
        L55:
            if (r0 == 0) goto L5a
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.z
            return r0
        L5a:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.B
            return r0
        L5d:
            java.lang.String r2 = "DigestedHorizontal2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L66
            goto L93
        L66:
            if (r0 == 0) goto L6b
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.v
            return r0
        L6b:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.x
            return r0
        L6e:
            java.lang.String r2 = "DigestedHorizontal1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L77
            goto L93
        L77:
            if (r0 == 0) goto L7c
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.r
            return r0
        L7c:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.t
            return r0
        L7f:
            java.lang.String r2 = "Vertical"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L88
            goto L93
        L88:
            if (r0 == 0) goto L98
            goto L95
        L8b:
            java.lang.String r2 = "DigestedVertical"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L9b
        L93:
            if (r0 == 0) goto L98
        L95:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.m
            return r0
        L98:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.n
            return r0
        L9b:
            if (r0 == 0) goto La0
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.o
            return r0
        La0:
            int r0 = ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.p
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.home.ui.recycler.HomeAppsRowData.U():int");
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return this.h.getHorizontalType();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeAppsRowData)) {
            return false;
        }
        HomeAppsRowData homeAppsRowData = (HomeAppsRowData) obj;
        return js3.i(this.g, homeAppsRowData.g) && js3.i(this.h, homeAppsRowData.h);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String packageKey;
        HomeAppsDto homeAppsDto = this.g;
        if (homeAppsDto != null && (packageKey = homeAppsDto.getPackageKey()) != null) {
            if (f88.n0(packageKey)) {
                packageKey = null;
            }
            if (packageKey != null) {
                return packageKey;
            }
        }
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() * 31;
        HomeAppsDto homeAppsDto = this.g;
        return iHashCode + (homeAppsDto != null ? homeAppsDto.hashCode() : 0);
    }
}
