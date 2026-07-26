package defpackage;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ke1 {
    public long a;
    public int b;
    public int c;
    public final Cloneable d;
    public final Cloneable e;
    public final Object f;
    public Object g;

    /* JADX WARN: Type inference failed for: r2v7, types: [byte[], java.lang.Cloneable] */
    public ke1(int i) {
        switch (i) {
            case 1:
                this.d = new SparseLongArray();
                this.e = new SparseBooleanArray();
                this.f = new ArrayList();
                this.g = new ue4((Object) null);
                this.b = -1;
                this.c = -1;
                break;
            default:
                this.d = new byte[8];
                this.e = new ArrayDeque();
                this.f = new e39();
                break;
        }
    }

    public void a(MotionEvent motionEvent) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                ((SparseBooleanArray) this.e).put(pointerId2, true);
            }
        }
    }

    public void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.b && source == this.c) {
            return;
        }
        this.b = toolType;
        this.c = source;
        ((SparseBooleanArray) this.e).clear();
        ((SparseLongArray) this.d).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.nc2 c(android.view.MotionEvent r46, androidx.compose.ui.platform.AndroidComposeView r47) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke1.c(android.view.MotionEvent, androidx.compose.ui.platform.AndroidComposeView):nc2");
    }

    public long d(w72 w72Var, int i) {
        byte[] bArr = (byte[]) this.d;
        w72Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public void e(MotionEvent motionEvent) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.e;
        SparseLongArray sparseLongArray = (SparseLongArray) this.d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
