package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;

/* JADX INFO: loaded from: classes.dex */
public abstract class dv8 {
    public static final h27 a;
    public static final lg4 b;
    public static Paint c;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    static {
        /*
            java.lang.String r0 = "TypefaceCompat static init"
            defpackage.ia7.d(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L13
            kv8 r0 = new kv8
            r0.<init>()
            defpackage.dv8.a = r0
            goto L57
        L13:
            r1 = 29
            if (r0 < r1) goto L1f
            jv8 r0 = new jv8
            r0.<init>()
            defpackage.dv8.a = r0
            goto L57
        L1f:
            r1 = 28
            if (r0 < r1) goto L2b
            iv8 r0 = new iv8
            r0.<init>()
            defpackage.dv8.a = r0
            goto L57
        L2b:
            r1 = 26
            if (r0 < r1) goto L37
            hv8 r0 = new hv8
            r0.<init>()
            defpackage.dv8.a = r0
            goto L57
        L37:
            r1 = 24
            if (r0 < r1) goto L50
            java.lang.reflect.Method r0 = defpackage.fv8.f
            if (r0 != 0) goto L46
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            io.sentry.android.core.t0.m(r1, r2)
        L46:
            if (r0 == 0) goto L50
            fv8 r0 = new fv8
            r0.<init>()
            defpackage.dv8.a = r0
            goto L57
        L50:
            ev8 r0 = new ev8
            r0.<init>()
            defpackage.dv8.a = r0
        L57:
            lg4 r0 = new lg4
            r1 = 16
            r0.<init>(r1)
            defpackage.dv8.b = r0
            r0 = 0
            defpackage.dv8.c = r0
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv8.<clinit>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e7, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, defpackage.gi2 r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, defpackage.z67 r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv8.a(android.content.Context, gi2, android.content.res.Resources, int, java.lang.String, int, int, z67, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
