package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorSpace;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.f;
import io.sentry.android.core.t0;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class i3 {
    public static void A(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static void B(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    public static final void a(CursorAnchorInfo.Builder builder, ri8 ri8Var, sy6 sy6Var) {
        if (sy6Var.f()) {
            return;
        }
        q95 q95Var = ri8Var.b;
        int i = q95Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iT = ok4.t(q95Var.e(sy6Var.b), 0, i);
        int iT2 = ok4.t(q95Var.e(sy6Var.d), 0, i);
        if (iT > iT2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(ri8Var.d(iT), q95Var.f(iT), ri8Var.e(iT), q95Var.b(iT));
            if (iT == iT2) {
                return;
            } else {
                iT++;
            }
        }
    }

    public static final void b(CursorAnchorInfo.Builder builder, ri8 ri8Var, sy6 sy6Var) {
        if (sy6Var.f()) {
            return;
        }
        q95 q95Var = ri8Var.b;
        int i = q95Var.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iT = ok4.t(q95Var.e(sy6Var.b), 0, i);
        int iT2 = ok4.t(q95Var.e(sy6Var.d), 0, i);
        if (iT > iT2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(ri8Var.d(iT), q95Var.f(iT), ri8Var.e(iT), q95Var.b(iT));
            if (iT == iT2) {
                return;
            } else {
                iT++;
            }
        }
    }

    public static Bitmap c(FileDescriptor fileDescriptor, BitmapFactory.Options options, pa2 pa2Var) throws Throwable {
        boolean zT;
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmapU = null;
        if (i == 34) {
            if ((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) fz.b.get()).booleanValue() : false) {
                try {
                    zT = pa2Var.t();
                } catch (IOException unused) {
                    zT = false;
                }
                if (zT) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    ok4.n("", config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                        if (bitmapDecodeFileDescriptor == null) {
                            if (bitmapDecodeFileDescriptor != null) {
                            }
                            options.inPreferredConfig = config2;
                            return bitmapU;
                        }
                        try {
                            bitmapU = u(bitmapDecodeFileDescriptor);
                        } catch (Throwable th) {
                            th = th;
                            bitmapU = bitmapDecodeFileDescriptor;
                            if (bitmapU != null) {
                                bitmapU.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                        bitmapDecodeFileDescriptor.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapU;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    public static Bitmap d(InputStream inputStream, BitmapFactory.Options options, pa2 pa2Var) throws Throwable {
        boolean zT;
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmapU = null;
        if (i == 34) {
            if ((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) fz.b.get()).booleanValue() : false) {
                try {
                    zT = pa2Var.t();
                } catch (IOException unused) {
                    zT = false;
                }
                if (zT) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    ok4.n("", config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                        if (bitmapDecodeStream == null) {
                            if (bitmapDecodeStream != null) {
                            }
                            options.inPreferredConfig = config2;
                            return bitmapU;
                        }
                        try {
                            bitmapU = u(bitmapDecodeStream);
                        } catch (Throwable th) {
                            th = th;
                            bitmapU = bitmapDecodeStream;
                            if (bitmapU != null) {
                                bitmapU.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapU;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static int e(HandwritingGesture handwritingGesture, z45 z45Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        z45Var.invoke(new xw0(fallbackText, 1));
        return 5;
    }

    public static AccessibilityNodeInfo.AccessibilityAction f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float g(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int[] j(pi8 pi8Var, RectF rectF, int i, final g8 g8Var) {
        return pi8Var.f.getRangeForRect(rectF, i == 1 ? new am(new bn6(pi8Var.f.getText(), pi8Var.j(), 19)) : new GraphemeClusterSegmentFinder(pi8Var.f.getText(), pi8Var.a), new Layout.TextInclusionStrategy() { // from class: qg
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) g8Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int m(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int n(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean p(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static final ColorSpace q(nv0 nv0Var) {
        if (js3.i(nv0Var, pv0.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (js3.i(nv0Var, pv0.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static void r(long j, ll llVar, boolean z, z45 z45Var) {
        if (z) {
            int i = zi8.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(llVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < llVar.b.length() ? Character.codePointAt(llVar, iCharCount2) : 10;
            if (c26.J(iCodePointBefore) && (c26.I(iCodePointAt) || c26.H(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(llVar, iCharCount);
                    }
                } while (c26.J(iCodePointBefore));
                j = uy6.b(iCharCount, iCharCount2);
            } else if (c26.J(iCodePointAt) && (c26.I(iCodePointBefore) || c26.H(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == llVar.b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(llVar, iCharCount2);
                    }
                } while (c26.J(iCodePointAt));
                j = uy6.b(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        z45Var.invoke(new xw2(new gz1[]{new lq7(i2, i2), new gj1(zi8.e(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int s(defpackage.x44 r16, android.view.inputmethod.HandwritingGesture r17, androidx.compose.foundation.text.selection.f r18, defpackage.v69 r19, defpackage.z45 r20) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3.s(x44, android.view.inputmethod.HandwritingGesture, androidx.compose.foundation.text.selection.f, v69, z45):int");
    }

    public static boolean t(x44 x44Var, PreviewableHandwritingGesture previewableHandwritingGesture, f fVar, CancellationSignal cancellationSignal) {
        qi8 qi8Var;
        ll llVar = x44Var.j;
        if (llVar != null) {
            si8 si8VarD = x44Var.d();
            if (llVar.equals((si8VarD == null || (qi8Var = si8VarD.a.a) == null) ? null : qi8Var.a)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (fVar != null) {
                        long jZ = c26.z(x44Var, uy6.u(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        x44 x44Var2 = fVar.d;
                        if (x44Var2 != null) {
                            x44Var2.f(jZ);
                        }
                        x44 x44Var3 = fVar.d;
                        if (x44Var3 != null) {
                            x44Var3.e(zi8.b);
                        }
                        if (!zi8.d(jZ)) {
                            fVar.w(false);
                            fVar.t(HandleState.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (fVar != null) {
                        long jZ2 = c26.z(x44Var, uy6.u(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        x44 x44Var4 = fVar.d;
                        if (x44Var4 != null) {
                            x44Var4.e(jZ2);
                        }
                        x44 x44Var5 = fVar.d;
                        if (x44Var5 != null) {
                            x44Var5.f(zi8.b);
                        }
                        if (!zi8.d(jZ2)) {
                            fVar.w(false);
                            fVar.t(HandleState.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (fVar != null) {
                        long jG = c26.g(x44Var, uy6.u(selectRangeGesture.getSelectionStartArea()), uy6.u(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        x44 x44Var6 = fVar.d;
                        if (x44Var6 != null) {
                            x44Var6.f(jG);
                        }
                        x44 x44Var7 = fVar.d;
                        if (x44Var7 != null) {
                            x44Var7.e(zi8.b);
                        }
                        if (!zi8.d(jG)) {
                            fVar.w(false);
                            fVar.t(HandleState.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (fVar != null) {
                        long jG2 = c26.g(x44Var, uy6.u(deleteRangeGesture.getDeletionStartArea()), uy6.u(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        x44 x44Var8 = fVar.d;
                        if (x44Var8 != null) {
                            x44Var8.e(jG2);
                        }
                        x44 x44Var9 = fVar.d;
                        if (x44Var9 != null) {
                            x44Var9.f(zi8.b);
                        }
                        if (!zi8.d(jG2)) {
                            fVar.w(false);
                            fVar.t(HandleState.a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new ez0(1, fVar));
                }
                return true;
            }
        }
        return false;
    }

    public static Bitmap u(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = zs2.a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    ok4.n("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(zs2.a);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmap2;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static void v(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            t0.d("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static void w(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void x(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void y(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(br9.C(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(ew.b1(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void z(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }
}
