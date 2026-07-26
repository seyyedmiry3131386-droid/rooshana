package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import defpackage.dp2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final dp2 a = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.g;

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float b(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final void c(float[] fArr, float[] fArr2) {
        float fB = b(0, 0, fArr2, fArr);
        float fB2 = b(0, 1, fArr2, fArr);
        float fB3 = b(0, 2, fArr2, fArr);
        float fB4 = b(0, 3, fArr2, fArr);
        float fB5 = b(1, 0, fArr2, fArr);
        float fB6 = b(1, 1, fArr2, fArr);
        float fB7 = b(1, 2, fArr2, fArr);
        float fB8 = b(1, 3, fArr2, fArr);
        float fB9 = b(2, 0, fArr2, fArr);
        float fB10 = b(2, 1, fArr2, fArr);
        float fB11 = b(2, 2, fArr2, fArr);
        float fB12 = b(2, 3, fArr2, fArr);
        float fB13 = b(3, 0, fArr2, fArr);
        float fB14 = b(3, 1, fArr2, fArr);
        float fB15 = b(3, 2, fArr2, fArr);
        float fB16 = b(3, 3, fArr2, fArr);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }
}
