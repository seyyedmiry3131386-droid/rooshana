package com.microsoft.clarity.g;

import com.microsoft.clarity.models.display.blobs.TextBlobRun;
import defpackage.js3;
import defpackage.wq2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {
    public final k0 a;

    public i0(k0 k0Var) {
        js3.p(k0Var, "typefaceCollection");
        this.a = k0Var;
    }

    public static final void a(i0 i0Var, TextBlobRun textBlobRun, j0 j0Var, int i, int i2) {
        i0Var.getClass();
        int i3 = i > i2 ? -1 : 1;
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        int iK = wq2.K(i, i2, i3);
        if ((i3 <= 0 || i > iK) && (i3 >= 0 || iK > i)) {
            return;
        }
        while (true) {
            if (i >= 0) {
                List<Long> glyphs = textBlobRun.getGlyphs();
                js3.m(glyphs);
                if (i < glyphs.size()) {
                    List<Long> glyphs2 = textBlobRun.getGlyphs();
                    js3.m(glyphs2);
                    if (j0Var.g.contains(Long.valueOf(glyphs2.get(i).longValue()))) {
                        return;
                    }
                    List<Long> glyphs3 = textBlobRun.getGlyphs();
                    js3.m(glyphs3);
                    glyphs3.set(i, Long.valueOf(j0Var.i));
                }
            }
            if (i == iK) {
                return;
            } else {
                i += i3;
            }
        }
    }
}
