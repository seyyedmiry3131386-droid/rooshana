package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class my3 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.append(eu6.KeyPosition_motionTarget, 1);
        sparseIntArray.append(eu6.KeyPosition_framePosition, 2);
        sparseIntArray.append(eu6.KeyPosition_transitionEasing, 3);
        sparseIntArray.append(eu6.KeyPosition_curveFit, 4);
        sparseIntArray.append(eu6.KeyPosition_drawPath, 5);
        sparseIntArray.append(eu6.KeyPosition_percentX, 6);
        sparseIntArray.append(eu6.KeyPosition_percentY, 7);
        sparseIntArray.append(eu6.KeyPosition_keyPositionType, 9);
        sparseIntArray.append(eu6.KeyPosition_sizePercent, 8);
        sparseIntArray.append(eu6.KeyPosition_percentWidth, 11);
        sparseIntArray.append(eu6.KeyPosition_percentHeight, 12);
        sparseIntArray.append(eu6.KeyPosition_pathMotionArc, 10);
    }
}
