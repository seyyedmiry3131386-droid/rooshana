package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ah6;
import defpackage.at2;
import defpackage.ct2;
import defpackage.tb1;
import defpackage.vg6;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1103}, m = "awaitHorizontalDragOrCancellation-rnUCldI", v = 1)
final class DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public Ref$LongRef b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        this.c = obj;
        int i = this.d | Integer.MIN_VALUE;
        this.d = i;
        float f = d.a;
        int i2 = i - Integer.MIN_VALUE;
        this.d = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref$LongRef ref$LongRef = this.b;
        androidx.compose.ui.input.pointer.e eVar = this.a;
        kotlin.b.b(obj);
        do {
            vg6 vg6Var = (vg6) obj;
            List list = vg6Var.a;
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i4);
                if (ct2.h(((ah6) obj2).a, ref$LongRef.a)) {
                    break;
                }
                i4++;
            }
            ah6 ah6Var = (ah6) obj2;
            if (ah6Var == null) {
                ah6Var = null;
            } else if (at2.Q(ah6Var)) {
                List list2 = vg6Var.a;
                int size2 = list2.size();
                while (true) {
                    if (i3 >= size2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list2.get(i3);
                    if (((ah6) obj3).d) {
                        break;
                    }
                    i3++;
                }
                ah6 ah6Var2 = (ah6) obj3;
                if (ah6Var2 != null) {
                    ref$LongRef.a = ah6Var2.a;
                    this.a = eVar;
                    this.b = ref$LongRef;
                    this.d = 1;
                    obj = eVar.a(PointerEventPass.b, this);
                }
            } else {
                if (Float.intBitsToFloat((int) (at2.i0(ah6Var, true) >> 32)) != 0.0f) {
                }
                this.a = eVar;
                this.b = ref$LongRef;
                this.d = 1;
                obj = eVar.a(PointerEventPass.b, this);
            }
            if (ah6Var == null || ah6Var.b()) {
                return null;
            }
            return ah6Var;
        } while (obj != coroutineSingletons);
        return coroutineSingletons;
    }
}
