package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import defpackage.b59;
import defpackage.bl4;
import defpackage.bq8;
import defpackage.c35;
import defpackage.d1;
import defpackage.g67;
import defpackage.j67;
import defpackage.pc0;
import defpackage.pv5;
import defpackage.qc0;
import defpackage.sv5;
import defpackage.wt1;
import defpackage.xg5;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j67 {
    public static final pv5 d = new pv5("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new c35(18));
    public static final pv5 e = new pv5("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new xg5(17));
    public static final bq8 f = new bq8();
    public static final List g = DesugarCollections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final b59 a;
    public final pc0 b;
    public final bq8 c = f;

    public b(pc0 pc0Var, b59 b59Var) {
        this.b = pc0Var;
        this.a = b59Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.j67
    public final g67 a(Object obj, int i, int i2, sv5 sv5Var) throws Exception {
        long jLongValue = ((Long) sv5Var.c(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(bl4.r(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) sv5Var.c(e);
        if (num == null) {
            num = 2;
        }
        wt1 wt1Var = (wt1) sv5Var.c(wt1.g);
        if (wt1Var == null) {
            wt1Var = wt1.f;
        }
        wt1 wt1Var2 = wt1Var;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.f(mediaMetadataRetriever, obj);
            try {
                Bitmap bitmapC = c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, wt1Var2);
                if (Build.VERSION.SDK_INT < 29) {
                    mediaMetadataRetriever.release();
                } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                    mediaMetadataRetriever.close();
                } else if (mediaMetadataRetriever instanceof ExecutorService) {
                    d1.m((ExecutorService) mediaMetadataRetriever);
                } else {
                    mediaMetadataRetriever.release();
                }
                return qc0.b(this.b, bitmapC);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT < 29) {
                    mediaMetadataRetriever.release();
                    throw th2;
                }
                if (mediaMetadataRetriever instanceof AutoCloseable) {
                    mediaMetadataRetriever.close();
                    throw th2;
                }
                if (mediaMetadataRetriever instanceof ExecutorService) {
                    d1.m((ExecutorService) mediaMetadataRetriever);
                    throw th2;
                }
                mediaMetadataRetriever.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.j67
    public final boolean b(Object obj, sv5 sv5Var) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(java.lang.Object r12, android.media.MediaMetadataRetriever r13, long r14, int r16, int r17, int r18, defpackage.wt1 r19) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.b.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, wt1):android.graphics.Bitmap");
    }
}
