package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.common.SkiaPictureHeader;
import com.microsoft.clarity.models.display.paints.Paint;
import com.microsoft.clarity.models.display.paints.shaders.ImageShader;
import com.microsoft.clarity.models.display.paints.shaders.LocalMatrixShader;
import defpackage.br9;
import defpackage.js3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public final s a;
    public final Q b;

    public v(s sVar, Q q) {
        js3.p(sVar, "factory");
        this.a = sVar;
        this.b = q;
    }

    public final C0102a a(d dVar) throws IOException {
        js3.p(dVar, "buffer");
        js3.i(dVar.a(8), "skiapict");
        int iL = dVar.l();
        dVar.i();
        dVar.a();
        Object objA = new u(new SkiaPictureHeader(((long) iL) & 4294967295L).getPictureVersion(), this.b, this.a).a(dVar);
        js3.m(objA);
        C0102a c0102a = (C0102a) objA;
        List list = c0102a.c;
        js3.n(list, "null cannot be cast to non-null type java.util.ArrayList<com.microsoft.clarity.models.display.images.Image>{ kotlin.collections.TypeAliasesKt.ArrayList<com.microsoft.clarity.models.display.images.Image> }");
        ArrayList arrayList = (ArrayList) list;
        for (Paint paint : c0102a.f) {
            if (paint.getShader() != null && (paint.getShader() instanceof ImageShader)) {
                arrayList.add(((ImageShader) paint.getShader()).getImage());
                ((ImageShader) paint.getShader()).setImageIndex(Integer.valueOf(br9.y(arrayList)));
            } else if (paint.getShader() != null && (paint.getShader() instanceof LocalMatrixShader) && (((LocalMatrixShader) paint.getShader()).getShader() instanceof ImageShader)) {
                arrayList.add(((ImageShader) ((LocalMatrixShader) paint.getShader()).getShader()).getImage());
                ((ImageShader) ((LocalMatrixShader) paint.getShader()).getShader()).setImageIndex(Integer.valueOf(br9.y(arrayList)));
            }
        }
        return c0102a;
    }
}
