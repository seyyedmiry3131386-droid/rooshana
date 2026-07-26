package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class f16 {
    public static final /* synthetic */ int a = 0;

    static {
        new ThreadLocal();
    }

    public static void a(uz3 uz3Var, BlendModeCompat blendModeCompat) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            te.M(uz3Var, blendModeCompat != null ? te.F(blendModeCompat) : null);
            return;
        }
        if (blendModeCompat == null) {
            uz3Var.setXfermode(null);
            return;
        }
        switch (blendModeCompat.ordinal()) {
            case 0:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 1:
                mode = PorterDuff.Mode.SRC;
                break;
            case 2:
                mode = PorterDuff.Mode.DST;
                break;
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 8:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 10:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 11:
                mode = PorterDuff.Mode.XOR;
                break;
            case 12:
                mode = PorterDuff.Mode.ADD;
                break;
            case 13:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 14:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 15:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 16:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 17:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        uz3Var.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }
}
