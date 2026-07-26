package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.common.Flattenable;
import com.microsoft.clarity.models.display.images.Sampling;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.models.display.paints.Paint;
import com.microsoft.clarity.models.display.paints.colorfilters.ColorFilter;
import com.microsoft.clarity.models.display.paints.colorfilters.ModeColorFilter;
import com.microsoft.clarity.models.display.paints.loopers.Looper;
import com.microsoft.clarity.models.display.paints.maskfilters.MaskFilter;
import com.microsoft.clarity.models.display.paints.patheffects.PathEffect;
import com.microsoft.clarity.models.display.paints.shaders.GradientShaderDescriptor;
import com.microsoft.clarity.models.display.paints.shaders.ImageShader;
import com.microsoft.clarity.models.display.paints.shaders.Shader;
import defpackage.g27;
import defpackage.js3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements c {
    public final Q a;

    public l(t tVar, Q q) {
        js3.p(tVar, "pathParser");
        this.a = q;
    }

    public static GradientShaderDescriptor b(d dVar) throws IOException {
        ArrayList arrayList;
        int iL = dVar.l();
        int i = (iL >>> 8) & 15;
        int i2 = iL & 255;
        int iL2 = dVar.l();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < iL2; i3++) {
            arrayList2.add(new Color4f(dVar.b(), dVar.b(), dVar.b(), dVar.b()));
        }
        if ((536870912 & iL) != 0) {
            dVar.a(dVar.l(), false);
        }
        if ((Integer.MIN_VALUE & iL) != 0) {
            ArrayList arrayList3 = new ArrayList();
            int iL3 = dVar.l();
            for (int i4 = 0; i4 < iL3; i4++) {
                arrayList3.add(Float.valueOf(dVar.b()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        return new GradientShaderDescriptor(((long) i) & 4294967295L, ((long) i2) & 4294967295L, arrayList2, arrayList, (iL & 1073741824) != 0 ? dVar.e() : null);
    }

    public final Paint a(d dVar, List list) throws IOException {
        Color4f color4f;
        ColorFilter colorFilter;
        MaskFilter maskFilter;
        Shader shader;
        Looper looper;
        PathEffect pathEffect;
        ColorFilter colorFilter2;
        Looper looper2;
        float fB = dVar.b();
        float fB2 = dVar.b();
        Color4f color4f2 = new Color4f(dVar.b(), dVar.b(), dVar.b(), dVar.b());
        int iL = dVar.l();
        boolean z = (iL & 1) != 0;
        boolean z2 = (iL & 2) != 0;
        int i = (iL >>> 8) & 255;
        int i2 = (iL >>> 16) & 3;
        int i3 = (iL >>> 18) & 3;
        int i4 = (iL >>> 20) & 3;
        if (((iL >>> 24) & 2) != 0) {
            PathEffect pathEffect2 = (PathEffect) a(dVar, list, g27.a(PathEffect.class), false);
            Shader shader2 = (Shader) a(dVar, list, g27.a(Shader.class), false);
            MaskFilter maskFilter2 = (MaskFilter) a(dVar, list, g27.a(MaskFilter.class), false);
            ColorFilter colorFilter3 = (ColorFilter) a(dVar, list, g27.a(ColorFilter.class), false);
            if (c()) {
                colorFilter2 = colorFilter3;
                looper2 = (Looper) a(dVar, list, g27.a(Looper.class), false);
            } else {
                colorFilter2 = colorFilter3;
                looper2 = null;
            }
            a(dVar, list, g27.a(Flattenable.class), true);
            if (b()) {
                a(dVar, list, g27.a(Flattenable.class), true);
            }
            maskFilter = maskFilter2;
            looper = looper2;
            color4f = color4f2;
            pathEffect = pathEffect2;
            shader = shader2;
            colorFilter = colorFilter2;
        } else {
            color4f = color4f2;
            colorFilter = null;
            maskFilter = null;
            shader = null;
            looper = null;
            pathEffect = null;
        }
        return new Paint(color4f, ((long) i4) & 4294967295L, ((long) i) & 4294967295L, ((long) i2) & 4294967295L, ((long) i3) & 4294967295L, fB, fB2, z, z2, colorFilter, maskFilter, shader, looper, pathEffect);
    }

    public abstract boolean b();

    public abstract ImageShader c(d dVar);

    public abstract boolean c();

    public Sampling d(d dVar) {
        js3.p(dVar, "buffer");
        return dVar.j();
    }

    public ModeColorFilter e(d dVar) {
        js3.p(dVar, "buffer");
        return new ModeColorFilter(Long.valueOf(((long) dVar.l()) & 4294967295L), null, 4294967295L & ((long) dVar.l()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, yd1] */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.microsoft.clarity.models.display.paints.shaders.LocalMatrixShader] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.microsoft.clarity.models.display.paints.shaders.ImageShader] */
    /* JADX WARN: Type inference failed for: r5v20, types: [com.microsoft.clarity.models.display.paints.colorfilters.ColorFilter] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.microsoft.clarity.models.display.paints.colorfilters.ModeColorFilter] */
    /* JADX WARN: Type inference failed for: r5v25, types: [com.microsoft.clarity.models.display.common.Flattenable] */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.microsoft.clarity.models.display.paints.maskfilters.BlurMaskFilter] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.microsoft.clarity.models.display.paints.loopers.LayerDrawLooper] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.microsoft.clarity.models.display.common.Flattenable a(com.microsoft.clarity.m.d r23, java.util.List r24, defpackage.zw3 r25, boolean r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.m.l.a(com.microsoft.clarity.m.d, java.util.List, zw3, boolean):com.microsoft.clarity.models.display.common.Flattenable");
    }
}
