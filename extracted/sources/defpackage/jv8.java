package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import io.sentry.android.core.t0;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jv8 extends h27 {
    public static Font p(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : ErrorDTO.CODE_ACCESS_DENIED, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iS = s(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iS2 = s(fontStyle, font2.getStyle());
            if (iS2 < iS) {
                font = font2;
                iS = iS2;
            }
        }
        return font;
    }

    public static int s(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.h27
    public final Typeface b(Context context, hi2 hi2Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (ii2 ii2Var : hi2Var.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, ii2Var.f).setWeight(ii2Var.b).setSlant(ii2Var.c ? 1 : 0).setTtcIndex(ii2Var.e).setFontVariationSettings(ii2Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(p(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            t0.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.h27
    public final Typeface c(Context context, hj2[] hj2VarArr, int i) {
        try {
            FontFamily fontFamilyQ = q(hj2VarArr, context.getContentResolver());
            if (fontFamilyQ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyQ).setStyle(p(fontFamilyQ, i).getStyle()).build();
        } catch (Exception e) {
            t0.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.h27
    public final Typeface d(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyQ = q((hj2[]) list.get(0), contentResolver);
            if (fontFamilyQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyQ);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyQ2 = q((hj2[]) list.get(i2), contentResolver);
                if (fontFamilyQ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyQ2);
                }
            }
            return customFallbackBuilder.setStyle(p(fontFamilyQ, i).getStyle()).build();
        } catch (Exception e) {
            t0.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.h27
    public final Typeface e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.h27
    public final Typeface f(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            t0.n("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.h27
    public final hj2 h(hj2[] hj2VarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final FontFamily q(hj2[] hj2VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (hj2 hj2Var : hj2VarArr) {
            if (Objects.equals(hj2Var.a.getScheme(), "systemfont")) {
                fontBuild = r(hj2Var);
            } else {
                try {
                    Uri uri = hj2Var.a;
                    str = hj2Var.e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    t0.n("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(hj2Var.c).setSlant(hj2Var.d ? 1 : 0).setTtcIndex(hj2Var.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font r(hj2 hj2Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
