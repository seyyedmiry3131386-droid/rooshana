package defpackage;

import ir.mservices.market.app.common.data.DisplayMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class wp1 {
    static {
        DisplayMode.Companion companion = DisplayMode.Companion;
    }

    public static int a(DisplayMode displayMode) {
        String str;
        String mode = displayMode.getMode();
        switch (mode.hashCode()) {
            case -2056960487:
                str = "DigestedVertical";
                break;
            case -1919497322:
                str = "Vertical";
                break;
            case -326601974:
                str = "DigestedHorizontal1";
                break;
            case -326601973:
                return !mode.equals("DigestedHorizontal2") ? 1 : 2;
            case -326601972:
                return !mode.equals("DigestedHorizontal3") ? 1 : 3;
            case 1734713453:
                str = "Horizontal1";
                break;
            case 1734713454:
                return !mode.equals("Horizontal2") ? 1 : 2;
            case 1734713455:
                return !mode.equals("Horizontal3") ? 1 : 3;
            default:
                return 1;
        }
        mode.equals(str);
        return 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean b(DisplayMode displayMode) {
        String mode = displayMode.getMode();
        int iHashCode = mode.hashCode();
        if (iHashCode == -2056960487) {
            return mode.equals("DigestedVertical");
        }
        switch (iHashCode) {
            case -326601974:
                return mode.equals("DigestedHorizontal1");
            case -326601973:
                return mode.equals("DigestedHorizontal2");
            case -326601972:
                return mode.equals("DigestedHorizontal3");
            default:
                return false;
        }
    }

    public static boolean c(DisplayMode displayMode) {
        String str;
        String mode = displayMode.getMode();
        switch (mode.hashCode()) {
            case -2056960487:
                return !mode.equals("DigestedVertical");
            case -1919497322:
                return !mode.equals("Vertical");
            case -326601974:
                str = "DigestedHorizontal1";
                break;
            case -326601973:
                str = "DigestedHorizontal2";
                break;
            case -326601972:
                str = "DigestedHorizontal3";
                break;
            case 1734713453:
                str = "Horizontal1";
                break;
            case 1734713454:
                str = "Horizontal2";
                break;
            case 1734713455:
                str = "Horizontal3";
                break;
            default:
                return true;
        }
        mode.equals(str);
        return true;
    }
}
