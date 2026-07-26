package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class kv8 extends jv8 {
    @Override // defpackage.jv8
    public final Font r(hj2 hj2Var) {
        Font fontD;
        Uri uri = hj2Var.a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = hj2Var.e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontD = dv8.d(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontD;
                }
                try {
                    return new Font.Builder(fontD).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    t0.d("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
