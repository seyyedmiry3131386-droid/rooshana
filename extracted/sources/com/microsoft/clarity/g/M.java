package com.microsoft.clarity.g;

import com.microsoft.clarity.models.MaskingMode;
import com.microsoft.clarity.models.display.DisplayFrame;
import com.microsoft.clarity.models.display.common.ImageSize;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.models.display.paints.shaders.ImageShader;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class M {
    public final MaskingMode a;
    public final i0 b;
    public final Color4f c;

    public M(MaskingMode maskingMode, k0 k0Var) {
        js3.p(maskingMode, "maskingMode");
        js3.p(k0Var, "typefaceCollection");
        this.a = maskingMode;
        this.b = new i0(k0Var);
        this.c = new Color4f(128.0f, 128.0f, 128.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04d1 A[LOOP:7: B:153:0x04cf->B:154:0x04d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x054a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.microsoft.clarity.models.observers.FramePicture r24, com.microsoft.clarity.models.display.DisplayFrame r25) throws com.microsoft.clarity.c.a {
        /*
            Method dump skipped, instruction units count: 1688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.g.M.a(com.microsoft.clarity.models.observers.FramePicture, com.microsoft.clarity.models.display.DisplayFrame):void");
    }

    public final void a(ImageShader imageShader, DisplayFrame displayFrame) {
        byte[] data;
        Integer imageIndex = imageShader.getImageIndex();
        js3.m(imageIndex);
        int iIntValue = imageIndex.intValue();
        if (iIntValue < 0 || iIntValue >= displayFrame.getImages().size() || (data = displayFrame.getImages().get(iIntValue).getData()) == null || data.length == 0) {
            return;
        }
        ImageSize imageSize = new ImageSize(com.microsoft.clarity.q.a.a(data, 16), com.microsoft.clarity.q.a.a(data, 20), null);
        imageShader.setMaskedColor(this.c);
        imageShader.setMaskedWidth(Integer.valueOf(imageSize.m20getWidthpVg5ArA()));
        imageShader.setMaskedHeight(Integer.valueOf(imageSize.m19getHeightpVg5ArA()));
        imageShader.setImageIndex(null);
    }
}
