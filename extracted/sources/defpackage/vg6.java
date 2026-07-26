package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vg6 {
    public final List a;
    public final ir9 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vg6(java.util.List r7, defpackage.ir9 r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.a = r7
            r6.b = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r8 < r0) goto L19
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L19
            int r8 = r8.getClassification()
            goto L1a
        L19:
            r8 = r1
        L1a:
            r6.c = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L27
            int r8 = r8.getButtonState()
            goto L28
        L27:
            r8 = r1
        L28:
            r6.d = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L35
            int r8 = r8.getMetaState()
            goto L36
        L35:
            r8 = r1
        L36:
            r6.e = r8
            android.view.MotionEvent r8 = r6.a()
            r0 = 3
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L5b
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L59
            if (r7 == r3) goto L57
            if (r7 == r2) goto L55
            switch(r7) {
                case 5: goto L59;
                case 6: goto L57;
                case 7: goto L55;
                case 8: goto L53;
                case 9: goto L51;
                case 10: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L78
        L4f:
            r1 = 5
            goto L78
        L51:
            r1 = 4
            goto L78
        L53:
            r1 = 6
            goto L78
        L55:
            r1 = r0
            goto L78
        L57:
            r1 = r2
            goto L78
        L59:
            r1 = r3
            goto L78
        L5b:
            int r8 = r7.size()
        L5f:
            if (r1 >= r8) goto L55
            java.lang.Object r4 = r7.get(r1)
            ah6 r4 = (defpackage.ah6) r4
            boolean r5 = defpackage.at2.Q(r4)
            if (r5 == 0) goto L6e
            goto L57
        L6e:
            boolean r4 = defpackage.at2.O(r4)
            if (r4 == 0) goto L75
            goto L59
        L75:
            int r1 = r1 + 1
            goto L5f
        L78:
            r6.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg6.<init>(java.util.List, ir9):void");
    }

    public final MotionEvent a() {
        ir9 ir9Var = this.b;
        if (ir9Var != null) {
            return (MotionEvent) ((nc2) ir9Var.d).b;
        }
        return null;
    }
}
