package androidx.compose.material3;

import defpackage.ol8;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.TimePickerKt", f = "TimePicker.kt", l = {920, 923}, m = "onTap-uYHVD98")
final class TimePickerKt$onTap$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TimePickerKt$onTap$1 timePickerKt$onTap$1;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        int i2 = ol8.a;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            timePickerKt$onTap$1 = this;
        } else {
            timePickerKt$onTap$1 = new TimePickerKt$onTap$1(this);
        }
        Object obj2 = timePickerKt$onTap$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = timePickerKt$onTap$1.b;
        if (i3 == 0) {
            kotlin.b.b(obj2);
            Math.atan2(0.0f - ((int) 0), 0.0f - ((int) 0));
            throw null;
        }
        if (i3 == 1) {
            kotlin.b.b(obj2);
            throw null;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj2);
        return tx8.a;
    }
}
