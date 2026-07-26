package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class qy3 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.append(eu6.KeyTrigger_framePosition, 8);
        sparseIntArray.append(eu6.KeyTrigger_onCross, 4);
        sparseIntArray.append(eu6.KeyTrigger_onNegativeCross, 1);
        sparseIntArray.append(eu6.KeyTrigger_onPositiveCross, 2);
        sparseIntArray.append(eu6.KeyTrigger_motionTarget, 7);
        sparseIntArray.append(eu6.KeyTrigger_triggerId, 6);
        sparseIntArray.append(eu6.KeyTrigger_triggerSlack, 5);
        sparseIntArray.append(eu6.KeyTrigger_motion_triggerOnCollision, 9);
        sparseIntArray.append(eu6.KeyTrigger_motion_postLayoutCollision, 10);
        sparseIntArray.append(eu6.KeyTrigger_triggerReceiver, 11);
        sparseIntArray.append(eu6.KeyTrigger_viewTransitionOnCross, 12);
        sparseIntArray.append(eu6.KeyTrigger_viewTransitionOnNegativeCross, 13);
        sparseIntArray.append(eu6.KeyTrigger_viewTransitionOnPositiveCross, 14);
    }
}
