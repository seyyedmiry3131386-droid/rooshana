package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import defpackage.m91;
import defpackage.rq4;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", l = {225}, m = "toBitmap", v = 1)
final class LayerSnapshotV22$toBitmap$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        LayerSnapshotV22$toBitmap$1 layerSnapshotV22$toBitmap$1;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            layerSnapshotV22$toBitmap$1 = this;
        } else {
            layerSnapshotV22$toBitmap$1 = new LayerSnapshotV22$toBitmap$1(this);
        }
        Object obj2 = layerSnapshotV22$toBitmap$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = layerSnapshotV22$toBitmap$1.b;
        if (i2 == 0) {
            kotlin.b.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            kotlin.b.b(obj2);
            Bitmap bitmapC = rq4.c((Image) obj2);
            m91.i(null, null);
            return bitmapC;
        } finally {
        }
    }
}
