package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import defpackage.ah6;
import defpackage.at2;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.fh6;
import defpackage.ir9;
import defpackage.js3;
import defpackage.tx8;
import defpackage.v04;
import defpackage.vg6;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public v04 a;
    public PointerInteropFilter$DispatchToViewState b = PointerInteropFilter$DispatchToViewState.a;
    public vg6 c;
    public final /* synthetic */ fh6 d;

    public c(fh6 fh6Var) {
        this.d = fh6Var;
    }

    public final void a(vg6 vg6Var, boolean z) {
        List list = vg6Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ah6) list.get(i)).b()) {
                d(vg6Var);
                return;
            }
        }
        v04 v04Var = this.a;
        if (v04Var == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        long jK = v04Var.K(0L);
        final fh6 fh6Var = this.d;
        dt2.F(vg6Var, jK, new dp2() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                fh6 fh6Var2 = fh6Var;
                if (actionMasked == 0) {
                    dp2 dp2Var = fh6Var2.b;
                    if (dp2Var == null) {
                        js3.V("onTouchEvent");
                        throw null;
                    }
                    this.g.b = ((Boolean) ((PointerInteropFilter_androidKt$pointerInteropFilter$3) dp2Var).invoke(motionEvent)).booleanValue() ? PointerInteropFilter$DispatchToViewState.b : PointerInteropFilter$DispatchToViewState.c;
                } else {
                    dp2 dp2Var2 = fh6Var2.b;
                    if (dp2Var2 == null) {
                        js3.V("onTouchEvent");
                        throw null;
                    }
                    ((PointerInteropFilter_androidKt$pointerInteropFilter$3) dp2Var2).invoke(motionEvent);
                }
                return tx8.a;
            }
        }, false);
        if (this.b == PointerInteropFilter$DispatchToViewState.b) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((ah6) list.get(i2)).a();
                }
            }
            ir9 ir9Var = vg6Var.b;
            if (ir9Var != null) {
                ir9Var.b = !fh6Var.d;
            }
        }
    }

    public final void b() {
        if (this.b == PointerInteropFilter$DispatchToViewState.b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final fh6 fh6Var = this.d;
            dp2 dp2Var = new dp2() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    MotionEvent motionEvent = (MotionEvent) obj;
                    dp2 dp2Var2 = fh6Var.b;
                    if (dp2Var2 != null) {
                        ((PointerInteropFilter_androidKt$pointerInteropFilter$3) dp2Var2).invoke(motionEvent);
                        return tx8.a;
                    }
                    js3.V("onTouchEvent");
                    throw null;
                }
            };
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            dp2Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.b = PointerInteropFilter$DispatchToViewState.a;
            fh6Var.d = false;
            this.c = null;
        }
    }

    public final void c(vg6 vg6Var, PointerEventPass pointerEventPass) {
        boolean z;
        boolean z2;
        boolean z3;
        List list = vg6Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ah6 ah6Var = (ah6) list.get(i);
            if (at2.O(ah6Var) || at2.Q(ah6Var)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((ah6) list.get(i2)).b()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        fh6 fh6Var = this.d;
        if (fh6Var.d) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    ah6 ah6Var2 = (ah6) list.get(i3);
                    if (at2.O(ah6Var2) || at2.Q(ah6Var2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (this.b != PointerInteropFilter$DispatchToViewState.c) {
            if (pointerEventPass == PointerEventPass.a && z3) {
                this.c = vg6Var;
                a(vg6Var, !z || fh6Var.d);
            }
            if (pointerEventPass == PointerEventPass.b && z && vg6Var.equals(this.c) && fh6Var.d) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ah6) list.get(i4)).a();
                }
            }
            if (pointerEventPass == PointerEventPass.c && !z3 && !vg6Var.equals(this.c)) {
                a(vg6Var, true);
            }
        }
        if (pointerEventPass == PointerEventPass.c) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    this.b = PointerInteropFilter$DispatchToViewState.a;
                    fh6Var.d = false;
                    this.c = null;
                    break;
                } else if (!at2.Q((ah6) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (vg6Var.equals(this.c) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((ah6) list.get(i6)).b()) {
                        i6++;
                    } else if (!fh6Var.d) {
                        d(vg6Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((ah6) list.get(i7)).a();
                }
            }
        }
    }

    public final void d(vg6 vg6Var) {
        if (this.b == PointerInteropFilter$DispatchToViewState.b) {
            v04 v04Var = this.a;
            if (v04Var == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            long jK = v04Var.K(0L);
            final fh6 fh6Var = this.d;
            dt2.F(vg6Var, jK, new dp2() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    MotionEvent motionEvent = (MotionEvent) obj;
                    dp2 dp2Var = fh6Var.b;
                    if (dp2Var != null) {
                        ((PointerInteropFilter_androidKt$pointerInteropFilter$3) dp2Var).invoke(motionEvent);
                        return tx8.a;
                    }
                    js3.V("onTouchEvent");
                    throw null;
                }
            }, true);
        }
        this.b = PointerInteropFilter$DispatchToViewState.c;
    }
}
