package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class io2 extends cv {
    public static HandlerThread f;
    public static Handler g;
    public final int b;
    public SparseIntArray[] c;
    public final ArrayList d;
    public final ho2 e;

    public io2(int i) {
        super(23);
        this.c = new SparseIntArray[9];
        this.d = new ArrayList();
        this.e = new ho2(this);
        this.b = i;
    }

    public static void B(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i, sparseIntArray.get(i) + 1);
            }
        }
    }

    @Override // defpackage.cv
    public final SparseIntArray[] A() {
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity2 = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity2.getWindow().removeOnFrameMetricsAvailableListener(this.e);
                arrayList.remove(size);
            }
        }
        return this.c;
    }

    @Override // defpackage.cv
    public final void q(Activity activity2) {
        if (f == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            f = handlerThread;
            handlerThread.start();
            g = new Handler(f.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = this.c;
            if (sparseIntArrayArr[i] == null && (this.b & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity2.getWindow().addOnFrameMetricsAvailableListener(this.e, g);
        this.d.add(new WeakReference(activity2));
    }

    @Override // defpackage.cv
    public final SparseIntArray[] w() {
        return this.c;
    }

    @Override // defpackage.cv
    public final SparseIntArray[] x(Activity activity2) {
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity2) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity2.getWindow().removeOnFrameMetricsAvailableListener(this.e);
        return this.c;
    }

    @Override // defpackage.cv
    public final SparseIntArray[] z() {
        SparseIntArray[] sparseIntArrayArr = this.c;
        this.c = new SparseIntArray[9];
        return sparseIntArrayArr;
    }
}
