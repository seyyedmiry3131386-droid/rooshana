package ir.mservices.market.app.common.recycler;

import defpackage.js6;

/* JADX INFO: loaded from: classes3.dex */
public class HomeNestedAppsRowData extends NestedAppsRowData {
    public static final int i = js6.home_apps_view;
    public static final int j = js6.home_apps_view_digested;
    public static final int k = js6.home_apps_multi_one;
    public static final int l = js6.home_apps_multi_two;
    public static final int m = js6.home_apps_multi_three;
    public static final int n = js6.home_apps_multi_one_digested;
    public static final int o = js6.home_apps_multi_two_digested;
    public static final int p = js6.home_apps_multi_three_digested;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ir.mservices.market.app.common.recycler.NestedAppsRowData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String mode = this.g.getMode();
        int iHashCode = mode.hashCode();
        int i2 = i;
        switch (iHashCode) {
            case -2056960487:
                if (mode.equals("DigestedVertical")) {
                    return j;
                }
                return i2;
            case -1919497322:
                mode.equals("Vertical");
                return i2;
            case -326601974:
                if (mode.equals("DigestedHorizontal1")) {
                    return n;
                }
                return i2;
            case -326601973:
                if (mode.equals("DigestedHorizontal2")) {
                    return o;
                }
                return i2;
            case -326601972:
                if (mode.equals("DigestedHorizontal3")) {
                    return p;
                }
                return i2;
            case 1734713453:
                if (mode.equals("Horizontal1")) {
                    return k;
                }
                return i2;
            case 1734713454:
                if (mode.equals("Horizontal2")) {
                    return l;
                }
                return i2;
            case 1734713455:
                if (mode.equals("Horizontal3")) {
                    return m;
                }
                return i2;
            default:
                return i2;
        }
    }
}
