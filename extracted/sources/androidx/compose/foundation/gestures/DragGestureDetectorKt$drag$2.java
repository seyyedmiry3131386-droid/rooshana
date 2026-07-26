package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ah6;
import defpackage.at2;
import defpackage.ct2;
import defpackage.dp2;
import defpackage.nr5;
import defpackage.tb1;
import defpackage.vg6;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1103}, m = "drag-VnAYq1g", v = 1)
final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public dp2 b;
    public Orientation c;
    public dp2 d;
    public androidx.compose.ui.input.pointer.e e;
    public Ref$LongRef f;
    public /* synthetic */ Object g;
    public int h;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.e eVar;
        ah6 ah6Var;
        Object obj2;
        Object obj3;
        Object objA = obj;
        this.g = objA;
        int i = this.h | Integer.MIN_VALUE;
        this.h = i;
        float f = d.a;
        int i2 = i - Integer.MIN_VALUE;
        this.h = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i2 == 0) {
            kotlin.b.b(objA);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref$LongRef ref$LongRef = this.f;
        androidx.compose.ui.input.pointer.e eVar2 = this.e;
        dp2 dp2Var = this.d;
        Orientation orientation = this.c;
        dp2 dp2Var2 = this.b;
        androidx.compose.ui.input.pointer.e eVar3 = this.a;
        kotlin.b.b(objA);
        do {
            vg6 vg6Var = (vg6) objA;
            List list = vg6Var.a;
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    eVar = eVar2;
                    ah6Var = null;
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i3);
                ah6Var = null;
                int i4 = i3;
                eVar = eVar2;
                if (ct2.h(((ah6) obj2).a, ref$LongRef.a)) {
                    break;
                }
                i3 = i4 + 1;
                eVar2 = eVar;
            }
            ah6 ah6Var2 = (ah6) obj2;
            if (ah6Var2 == null) {
                ah6Var2 = ah6Var;
            } else {
                if (at2.Q(ah6Var2)) {
                    List list2 = vg6Var.a;
                    int size2 = list2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            obj3 = ah6Var;
                            break;
                        }
                        obj3 = list2.get(i5);
                        if (((ah6) obj3).d) {
                            break;
                        }
                        i5++;
                    }
                    ah6 ah6Var3 = (ah6) obj3;
                    if (ah6Var3 != null) {
                        ref$LongRef.a = ah6Var3.a;
                        eVar2 = eVar;
                    }
                } else {
                    long jI0 = at2.i0(ah6Var2, true);
                    if ((orientation == null ? nr5.d(jI0) : orientation == Orientation.a ? Float.intBitsToFloat((int) (jI0 & 4294967295L)) : Float.intBitsToFloat((int) (jI0 >> 32))) == 0.0f) {
                        eVar2 = eVar;
                    }
                }
                this.a = eVar3;
                this.b = dp2Var2;
                this.c = orientation;
                this.d = dp2Var;
                this.e = eVar2;
                this.f = ref$LongRef;
                this.h = 1;
                objA = eVar2.a(PointerEventPass.b, this);
            }
            if (ah6Var2 == null || ((Boolean) dp2Var.invoke(ah6Var2)).booleanValue()) {
                return ah6Var;
            }
            if (at2.Q(ah6Var2)) {
                return ah6Var2;
            }
            dp2Var2.invoke(ah6Var2);
            long j = ah6Var2.a;
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.a = j;
            ref$LongRef = ref$LongRef2;
            eVar2 = eVar3;
            this.a = eVar3;
            this.b = dp2Var2;
            this.c = orientation;
            this.d = dp2Var;
            this.e = eVar2;
            this.f = ref$LongRef;
            this.h = 1;
            objA = eVar2.a(PointerEventPass.b, this);
        } while (objA != coroutineSingletons);
        return coroutineSingletons;
    }
}
