package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable {
    public final Object a;
    public final Object b;
    public final Object c;

    public c() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        this.a = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.util.MaskRenderer$lazySinglePixelBitmap$1
            @Override // defpackage.bp2
            public final Object invoke() {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
        });
        this.b = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.util.MaskRenderer$singlePixelBitmapCanvas$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return new Canvas((Bitmap) this.g.a.getValue());
            }
        });
        this.c = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.util.MaskRenderer$maskingPaint$2
            @Override // defpackage.bp2
            public final Object invoke() {
                return new Paint();
            }
        });
    }

    public final List b(final Bitmap bitmap, io.sentry.android.replay.viewhierarchy.f fVar, final Matrix matrix) {
        js3.p(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            return EmptyList.a;
        }
        final ArrayList arrayList = new ArrayList();
        final Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        fVar.a(new dp2() { // from class: io.sentry.android.replay.util.MaskRenderer$renderMasks$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[PHI: r4
              0x010d: PHI (r4v5 java.lang.Integer) = (r4v2 java.lang.Integer), (r4v13 java.lang.Integer) binds: [B:52:0x0116, B:48:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
            /* JADX WARN: Type inference failed for: r2v11, types: [c24, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v0, types: [c24, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v0, types: [c24, java.lang.Object] */
            @Override // defpackage.dp2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.util.MaskRenderer$renderMasks$2.invoke(java.lang.Object):java.lang.Object");
            }
        });
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ?? r0 = this.a;
        if (!r0.isInitialized() || ((Bitmap) r0.getValue()).isRecycled()) {
            return;
        }
        ((Bitmap) r0.getValue()).recycle();
    }
}
