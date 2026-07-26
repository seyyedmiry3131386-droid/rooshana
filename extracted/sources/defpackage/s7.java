package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.e;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableList;
import com.j256.ormlite.stmt.query.SimpleComparison;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.myket.player.domain.models.PlayerMovie;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class s7 {
    public static final Object b = new Object();
    public static final t42 c = new t42(0);
    public static final byte[] d = {0, 0, 0, 1};
    public static final float[] e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f = new Object();
    public static int[] g = new int[10];
    public static final sy6 h = new sy6(0.0f, 0.0f, 10.0f, 10.0f);
    public static final kd2 i = new kd2(0);
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ s7(int i2) {
        this.a = i2;
    }

    public static PropertyValuesHolder A(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        int i5 = 0;
        boolean z = typedValuePeekValue != null;
        int i6 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z2 = typedValuePeekValue2 != null;
        int i7 = z2 ? typedValuePeekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && C(i6)) || (z2 && C(i7))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            t36[] t36VarArrO = wq2.o(string);
            t36[] t36VarArrO2 = wq2.o(string2);
            if (t36VarArrO != null || t36VarArrO2 != null) {
                if (t36VarArrO != null) {
                    gl glVar = new gl(i5);
                    if (t36VarArrO2 == null) {
                        return PropertyValuesHolder.ofObject(str, glVar, t36VarArrO);
                    }
                    if (wq2.k(t36VarArrO, t36VarArrO2)) {
                        return PropertyValuesHolder.ofObject(str, glVar, t36VarArrO, t36VarArrO2);
                    }
                    throw new InflateException(dw1.o(" Can't morph from ", string, " to ", string2));
                }
                if (t36VarArrO2 != null) {
                    return PropertyValuesHolder.ofObject(str, new gl(i5), t36VarArrO2);
                }
            }
            return null;
        }
        zu zuVar = i2 == 3 ? zu.b : null;
        if (z3) {
            if (z) {
                float dimension = i6 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i7 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i7 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            int dimension2 = i6 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : C(i6) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i7 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : C(i7) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i7 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : C(i7) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
        }
        if (propertyValuesHolderOfInt != null && zuVar != null) {
            propertyValuesHolderOfInt.setEvaluator(zuVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static final ye4 B(ye4 ye4Var) {
        h hVarF = ye4Var.p.p;
        while (true) {
            h hVarF2 = hVarF.F();
            if ((hVarF2 != null ? hVarF2.j : null) == null) {
                ye4 ye4VarH0 = ((m) hVarF.H.e).H0();
                js3.m(ye4VarH0);
                return ye4VarH0;
            }
            h hVarF3 = hVarF.F();
            h hVar = hVarF3 != null ? hVarF3.j : null;
            js3.m(hVar);
            if (hVar.i) {
                hVarF = hVarF.F();
                js3.m(hVarF);
            } else {
                h hVarF4 = hVarF.F();
                js3.m(hVarF4);
                hVarF = hVarF4.j;
                js3.m(hVarF);
            }
        }
    }

    public static boolean C(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static boolean D(byte[] bArr, int i2, b bVar) {
        int i3;
        if (Objects.equals(bVar.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(bVar.n, "video/hevc")) {
            rz5 rz5VarO = O(new ao0(bArr, 4, i2 + 4));
            int i4 = rz5VarO.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && rz5VarO.c == bVar.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean E(c cVar) {
        m mVarD = cVar.d();
        en7 en7Var = cVar.d;
        if (mVarD != null ? mVarD.R0() : false) {
            return true;
        }
        g gVar = d.a;
        if (en7Var.a.c(d.p)) {
            return true;
        }
        return en7Var.a.c(d.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean F(androidx.compose.ui.semantics.c r14) {
        /*
            boolean r0 = E(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            en7 r14 = r14.d
            boolean r0 = r14.c
            if (r0 != 0) goto L59
            rb5 r14 = r14.a
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            androidx.compose.ui.semantics.g r11 = (androidx.compose.ui.semantics.g) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.F(androidx.compose.ui.semantics.c):boolean");
    }

    public static boolean G(Context context) {
        NetworkInfo networkInfoR;
        return (context == null || (networkInfoR = r(context)) == null || !networkInfoR.isConnected()) ? false : true;
    }

    public static boolean H(Context context) {
        NetworkInfo networkInfoR = r(context);
        return networkInfoR != null && networkInfoR.isConnected() && networkInfoR.getType() == 17;
    }

    public static ValueAnimator I(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i2;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayK = a27.k(resources, theme, attributeSet, at2.g);
        TypedArray typedArrayK2 = a27.k(resources, theme, attributeSet, at2.k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long jF = a27.f(typedArrayK, xmlPullParser, "duration", 1, 300);
        long j2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArrayK.getInt(2, 0) : 0;
        int i3 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayK.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i3 == 4) {
                TypedValue typedValuePeekValue = typedArrayK.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i4 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayK.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i3 = ((z && C(i4)) || (z2 && C(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderA = A(typedArrayK, i3, 5, 6, "");
            if (propertyValuesHolderA != null) {
                valueAnimator3.setValues(propertyValuesHolderA);
            }
        }
        valueAnimator3.setDuration(jF);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayK.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayK.getInt(4, 1) : 1);
        if (typedArrayK2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strG = a27.g(typedArrayK2, xmlPullParser, "pathData", 1);
            if (strG != null) {
                String strG2 = a27.g(typedArrayK2, xmlPullParser, "propertyXName", 2);
                String strG3 = a27.g(typedArrayK2, xmlPullParser, "propertyYName", 3);
                if (i3 != 2) {
                }
                if (strG2 == null && strG3 == null) {
                    throw new InflateException(typedArrayK2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathP = wq2.p(strG);
                PathMeasure pathMeasure = new PathMeasure(pathP, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathP, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f2 = length / (iMin - 1);
                int i5 = 0;
                valueAnimator = valueAnimator3;
                float f3 = 0.0f;
                int i6 = 0;
                while (true) {
                    if (i5 >= iMin) {
                        break;
                    }
                    int i7 = iMin;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    int i8 = i6 + 1;
                    f3 += f2;
                    if (i8 < arrayList.size() && f3 > ((Float) arrayList.get(i8)).floatValue()) {
                        pathMeasure2.nextContour();
                        i6 = i8;
                    }
                    i5++;
                    iMin = i7;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strG2 != null ? PropertyValuesHolder.ofFloat(strG2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strG3 != null ? PropertyValuesHolder.ofFloat(strG3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                i2 = 0;
            } else {
                valueAnimator = valueAnimator3;
                i2 = 0;
                objectAnimator2.setPropertyName(a27.g(typedArrayK2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i2 = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayK.getResourceId(i2, i2) : i2;
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayK.recycle();
        if (typedArrayK2 != null) {
            typedArrayK2.recycle();
        }
        return valueAnimator2;
    }

    public static void J(Boolean bool) {
        K(xa7.c("next_ep_play_image", js3.i(bool, Boolean.TRUE) ? CommonDataKt.MOVIE_IMAGE_TYPE_PORTRAIT : js3.i(bool, Boolean.FALSE) ? "land" : "no"));
    }

    public static void K(String str) {
        bl4.H("on", str, "movie_click");
    }

    public static hh2 L(Context context, int i2) {
        return new hh2(context, context != null ? context.getString(i2) : null);
    }

    public static int M(b bVar) {
        if (Objects.equals(bVar.n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(bVar.n, "video/hevc") || tv4.b(bVar.k, "video/hevc") != null) ? 2 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gi2 N(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i2;
        int i3;
        String str;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            Z(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gu6.FontFamily);
        String string = typedArrayObtainAttributes.getString(gu6.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(gu6.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(gu6.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(gu6.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(gu6.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(gu6.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(gu6.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(gu6.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        int i4 = 3;
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gu6.FontFamilyFont);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(gu6.FontFamilyFont_fontWeight) ? gu6.FontFamilyFont_fontWeight : gu6.FontFamilyFont_android_fontWeight, ErrorDTO.CODE_ACCESS_DENIED);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(gu6.FontFamilyFont_fontStyle) ? gu6.FontFamilyFont_fontStyle : gu6.FontFamilyFont_android_fontStyle, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(gu6.FontFamilyFont_ttcIndex) ? gu6.FontFamilyFont_ttcIndex : gu6.FontFamilyFont_android_ttcIndex;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(gu6.FontFamilyFont_fontVariationSettings) ? gu6.FontFamilyFont_fontVariationSettings : gu6.FontFamilyFont_android_fontVariationSettings);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(gu6.FontFamilyFont_font) ? gu6.FontFamilyFont_font : gu6.FontFamilyFont_android_font;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            Z(xmlResourceParser);
                        }
                        arrayList.add(new ii2(string7, string6, z, i5, i7, resourceId2));
                    } else {
                        Z(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new hi2((ii2[]) arrayList.toArray(new ii2[0]));
        }
        List listW = W(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), gu6.FontFamilyProviderFallback);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(gu6.FontFamilyProviderFallback_fontProviderQuery);
                        String string9 = typedArrayObtainAttributes3.getString(gu6.FontFamilyProviderFallback_fontProviderSystemFontFamily);
                        String string10 = typedArrayObtainAttributes3.getString(gu6.FontFamilyProviderFallback_fontVariationSettings);
                        if (string8 == null) {
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i4) {
                            Z(xmlResourceParser);
                        }
                        i3 = integer2;
                        str = string5;
                        zh2 zh2Var = new zh2(string, string2, string8, string9, string10, listW);
                        if (typedArrayObtainAttributes3 instanceof AutoCloseable) {
                            typedArrayObtainAttributes3.close();
                        } else if (typedArrayObtainAttributes3 instanceof ExecutorService) {
                            d1.m((ExecutorService) typedArrayObtainAttributes3);
                        } else {
                            typedArrayObtainAttributes3.recycle();
                        }
                        arrayList2.add(zh2Var);
                    } catch (Throwable th) {
                        if (typedArrayObtainAttributes3 == 0) {
                            throw th;
                        }
                        try {
                            if (typedArrayObtainAttributes3 instanceof AutoCloseable) {
                                typedArrayObtainAttributes3.close();
                            } else if (typedArrayObtainAttributes3 instanceof ExecutorService) {
                                d1.m((ExecutorService) typedArrayObtainAttributes3);
                            } else {
                                typedArrayObtainAttributes3.recycle();
                            }
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    i3 = integer2;
                    str = string5;
                    Z(xmlResourceParser);
                }
                integer2 = i3;
                string5 = str;
                i2 = 2;
                i4 = 3;
            }
        }
        int i9 = integer2;
        String str2 = string5;
        if (!arrayList2.isEmpty()) {
            return new ji2(arrayList2, integer, i9, str2);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new zh2(string, string2, string3, null, null, listW));
        if (string4 != null) {
            arrayList2.add(new zh2(string, string2, string4, null, null, listW));
        }
        return new ji2(arrayList2, integer, i9, str2);
    }

    public static rz5 O(ao0 ao0Var) {
        ao0Var.s();
        return new rz5(ao0Var.i(6), ao0Var.i(6), ao0Var.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.gh5 P(defpackage.ao0 r19, boolean r20, int r21, defpackage.gh5 r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.i(r5)
            boolean r8 = r0.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.h()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.i(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.h()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.t(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.t(r6)
        L7b:
            gh5 r12 = new gh5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.P(ao0, boolean, int, gh5):gh5");
    }

    public static tu2 Q(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        ao0 ao0Var = new ao0(bArr, i4, i3 + 1);
        while (ao0Var.d(16)) {
            int i5 = ao0Var.i(8);
            int i6 = 0;
            while (i5 == 255) {
                i6 += 255;
                i5 = ao0Var.i(8);
            }
            int i7 = i6 + i5;
            int i8 = ao0Var.i(8);
            int i9 = 0;
            while (i8 == 255) {
                i9 += 255;
                i8 = ao0Var.i(8);
            }
            int i10 = i9 + i8;
            if (i10 == 0 || !ao0Var.d(i10)) {
                return null;
            }
            if (i7 == 176) {
                int iM = ao0Var.m();
                boolean zH = ao0Var.h();
                int iM2 = zH ? ao0Var.m() : 0;
                int iM3 = ao0Var.m();
                int iM4 = -1;
                for (int i11 = 0; i11 <= iM3; i11++) {
                    iM4 = ao0Var.m();
                    ao0Var.m();
                    int i12 = ao0Var.i(6);
                    if (i12 == 63) {
                        return null;
                    }
                    ao0Var.i(i12 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i12 + iM) - 31));
                    if (zH) {
                        int i13 = ao0Var.i(6);
                        if (i13 == 63) {
                            return null;
                        }
                        ao0Var.i(i13 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i13 + iM2) - 31));
                    }
                    if (ao0Var.h()) {
                        ao0Var.t(10);
                    }
                }
                return new tu2(iM4);
            }
            ao0Var.t(i10 * 8);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.jh5 R(byte[] r32, int r33, int r34, defpackage.vp7 r35) {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.R(byte[], int, int, vp7):jh5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.vp7 S(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 2159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.S(byte[], int, int):vp7");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mh5 U(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.U(byte[], int, int):mh5");
    }

    public static Object V(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static List W(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final a X(int i2, np2 np2Var, qz0 qz0Var) {
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = new a(i2, np2Var, true);
            qz0Var.l0(objM);
        }
        a aVar = (a) objM;
        aVar.n(np2Var);
        return aVar;
    }

    public static final boolean Y(my6 my6Var, my6 my6Var2) {
        if (my6Var == null) {
            return true;
        }
        if (my6Var instanceof my6) {
            return !my6Var.b() || my6Var.equals(my6Var2) || js3.i(my6Var.c, my6Var2.c);
        }
        return false;
    }

    public static void Z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final void a(hx4 hx4Var, cy6 cy6Var, dp2 dp2Var, int i2, qz0 qz0Var, int i3) {
        int i4;
        js3.p(cy6Var, "recommendationViewState");
        qz0Var.c0(1218729283);
        if ((i3 & 6) == 0) {
            i4 = (qz0Var.f(hx4Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= qz0Var.h(cy6Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= qz0Var.d(i2) ? 2048 : 1024;
        }
        if (qz0Var.R(i4 & 1, (i4 & 1171) != 1170)) {
            zk8.b(l.n.a(LayoutDirection.b), X(-1762555389, new ca(dp2Var, hx4Var, i2, cy6Var), qz0Var), qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new og0(hx4Var, cy6Var, dp2Var, i2, i3, 1);
        }
    }

    public static void a0(ao0 ao0Var) {
        int iM = ao0Var.m() + 1;
        ao0Var.t(8);
        for (int i2 = 0; i2 < iM; i2++) {
            ao0Var.m();
            ao0Var.m();
            ao0Var.s();
        }
        ao0Var.t(20);
    }

    public static final boolean b(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (js3.r(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b0(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static final bj6 c0(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new bj6(str);
    }

    public static final int d(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final bj6 d0(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new bj6(str);
    }

    public static final bj6 e(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new bj6(str);
    }

    public static int[] e0(String str) {
        int[] iArr = new int[2];
        String[] strArrSplit = str.split(":");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            iArr[i2] = Integer.parseInt(strArrSplit[i2]);
        }
        if (strArrSplit.length != 0) {
            return iArr;
        }
        return null;
    }

    public static void f(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static final xf6 f0(qx6 qx6Var) {
        js3.p(qx6Var, "<this>");
        return new xf6(qx6Var.d, new PlayerMovie(qx6Var.a, qx6Var.d, qx6Var.b, qx6Var.e, qx6Var.c, qx6Var.j), qx6Var.g, 24);
    }

    public static void g(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int g0(int i2, byte[] bArr) {
        int i3;
        synchronized (f) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = g;
                    if (iArr.length <= i5) {
                        g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    g[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = g[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final a h(qz0 qz0Var, int i2, Lambda lambda) {
        a aVar;
        qz0Var.Y(Integer.rotateLeft(i2, 1), b);
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            aVar = new a(i2, lambda, true);
            qz0Var.l0(aVar);
        } else {
            js3.n(objM, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            aVar = (a) objM;
            aVar.n(lambda);
        }
        qz0Var.q(false);
        return aVar;
    }

    public static zx8 h0(Iterator it) {
        it.getClass();
        return it instanceof zx8 ? (zx8) it : new qj3(it, 1);
    }

    public static boolean i(Object obj, Iterator it) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final int i0(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] j(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c0, code lost:
    
        if (r32 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c2, code lost:
    
        if (r18 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c4, code lost:
    
        r1 = new android.animation.Animator[r18.size()];
        r2 = r18.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03d3, code lost:
    
        if (r2.hasNext() == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03d5, code lost:
    
        r1[r11] = (android.animation.Animator) r2.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03e1, code lost:
    
        if (r33 != 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e3, code lost:
    
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03e7, code lost:
    
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03ea, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r18 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator k(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.k(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(String str) {
        if (str != null) {
            throw new AssertionError(str);
        }
        throw new AssertionError();
    }

    public static final long n(long j2, boolean z, int i2, float f2) {
        int iH = ((z || i2 == 2 || i2 == 4 || i2 == 5) && h31.d(j2)) ? h31.h(j2) : Integer.MAX_VALUE;
        if (h31.j(j2) != iH) {
            iH = ok4.t(d77.a(f2), h31.j(j2), iH);
        }
        return vy2.y(0, iH, 0, h31.g(j2));
    }

    public static int o(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        vy2.s(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            g(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            g(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            g(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    g(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static String p(Object obj, String str) {
        return rm7.q(obj == null ? Ssh2PublicKeyAlgorithmName.NULL : obj.getClass().getName(), SimpleComparison.LESS_THAN_OPERATION, str, SimpleComparison.GREATER_THAN_OPERATION);
    }

    public static ez3 q(ez3 ez3Var, LayoutDirection layoutDirection, gj8 gj8Var, qj1 qj1Var, oh2 oh2Var) {
        if (ez3Var != null && layoutDirection == ((LayoutDirection) ez3Var.c) && sy7.l(gj8Var, layoutDirection).equals((gj8) ez3Var.d) && qj1Var.getDensity() == ((tj1) ez3Var.e).a && oh2Var == ((oh2) ez3Var.f)) {
            return ez3Var;
        }
        ez3 ez3Var2 = ez3.h;
        if (ez3Var2 != null && layoutDirection == ((LayoutDirection) ez3Var2.c) && sy7.l(gj8Var, layoutDirection).equals((gj8) ez3Var2.d) && qj1Var.getDensity() == ((tj1) ez3Var2.e).a && oh2Var == ((oh2) ez3Var2.f)) {
            return ez3Var2;
        }
        ez3 ez3Var3 = new ez3(layoutDirection, sy7.l(gj8Var, layoutDirection), new tj1(qj1Var.getDensity(), qj1Var.O()), oh2Var);
        ez3.h = ez3Var3;
        return ez3Var3;
    }

    public static NetworkInfo r(Context context) {
        Object systemService = context.getSystemService("connectivity");
        js3.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return ((ConnectivityManager) systemService).getActiveNetworkInfo();
    }

    public static final ya5 s(mn7 mn7Var, dp2 dp2Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            c cVarA = mn7Var.a();
            h hVar = cVarA.c;
            if (hVar.V() && hVar.U()) {
                ya5 ya5Var = new ya5(48);
                c35 c35Var = new c35(11);
                vq3 vq3VarR = js3.R(cVarA.g());
                ((Region) c35Var.b).set(vq3VarR.a, vq3VarR.b, vq3VarR.c, vq3VarR.d);
                t(c35Var, cVarA, ya5Var, dp2Var, cVarA, new c35(11));
                return ya5Var;
            }
            ya5 ya5Var2 = qq3.a;
            js3.n(ya5Var2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return ya5Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void t(c35 c35Var, c cVar, ya5 ya5Var, dp2 dp2Var, c cVar2, c35 c35Var2) {
        sy6 sy6VarE1;
        h hVar;
        c cVar3 = cVar;
        int i2 = cVar3.g;
        c35 c35Var3 = c35Var2;
        Region region = (Region) c35Var3.b;
        h hVar2 = cVar2.c;
        int i3 = cVar2.g;
        boolean z = (hVar2.V() && hVar2.U()) ? false : true;
        c35 c35Var4 = c35Var;
        Region region2 = (Region) c35Var4.b;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z || cVar2.e) {
                Object objF = cVar2.f();
                if (objF == null) {
                    sy6VarE1 = ((e) hVar2.H.d).e1();
                } else {
                    gx4 gx4Var = ((gx4) objF).a;
                    boolean z2 = androidx.compose.ui.semantics.b.a(cVar2.d, androidx.compose.ui.semantics.a.b) != null;
                    if (!gx4Var.a.n) {
                        sy6VarE1 = sy6.e;
                    } else if (z2) {
                        sy6VarE1 = y40.E(gx4Var, 8).e1();
                    } else {
                        m mVarE = y40.E(gx4Var, 8);
                        sy6VarE1 = c26.t(mVarE).I(mVarE, true);
                    }
                }
                vq3 vq3VarR = js3.R(sy6VarE1);
                region.set(vq3VarR.a, vq3VarR.b, vq3VarR.c, vq3VarR.d);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (cVar2.e) {
                        c cVarL = cVar2.l();
                        ya5Var.h(i3, new ln7(cVar2, js3.R((cVarL == null || (hVar = cVarL.c) == null || !hVar.V()) ? h : cVarL.g())));
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            ya5Var.h(i3, new ln7(cVar2, new vq3(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                ya5Var.h(i3, new ln7(cVar2, new vq3(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = c.j(4, cVar2);
                int size = listJ.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) dp2Var.invoke(listJ.get(size))).booleanValue()) {
                        t(c35Var4, cVar3, ya5Var, dp2Var, (c) listJ.get(size), c35Var3);
                    }
                    size--;
                    c35Var4 = c35Var;
                    cVar3 = cVar;
                    c35Var3 = c35Var2;
                }
                if (F(cVar2)) {
                    region2.op(vq3VarR.a, vq3VarR.b, vq3VarR.c, vq3VarR.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static int u(ArrayList arrayList) {
        SparseIntArray sparseIntArray = new SparseIntArray(25);
        sparseIntArray.put(101, 1);
        sparseIntArray.put(102, 2);
        sparseIntArray.put(103, 3);
        sparseIntArray.put(104, 4);
        sparseIntArray.put(111, 5);
        sparseIntArray.put(121, 6);
        sparseIntArray.put(131, 7);
        sparseIntArray.put(1311, 8);
        sparseIntArray.put(132, 9);
        sparseIntArray.put(133, 10);
        sparseIntArray.put(1331, 11);
        sparseIntArray.put(1332, 12);
        sparseIntArray.put(1333, 13);
        sparseIntArray.put(1334, 14);
        sparseIntArray.put(1335, 15);
        sparseIntArray.put(134, 16);
        sparseIntArray.put(1341, 17);
        sparseIntArray.put(1342, 18);
        sparseIntArray.put(135, 19);
        sparseIntArray.put(1351, 20);
        sparseIntArray.put(136, 21);
        sparseIntArray.put(137, 22);
        sparseIntArray.put(141, 23);
        sparseIntArray.put(151, 24);
        sparseIntArray.put(191, 25);
        return x(sparseIntArray, kotlin.collections.a.m0(arrayList));
    }

    public static int v(ArrayList arrayList) {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        sparseIntArray.put(100, 1);
        sparseIntArray.put(110, 2);
        sparseIntArray.put(120, 3);
        sparseIntArray.put(150, 4);
        sparseIntArray.put(130, 5);
        sparseIntArray.put(140, 6);
        sparseIntArray.put(190, 7);
        return x(sparseIntArray, kotlin.collections.a.m0(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String w(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                lj3 lj3VarM = ImmutableList.m();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iO = o(bArr, i3, bArr.length, zArr);
                    if (iO != bArr.length) {
                        lj3VarM.O(Integer.valueOf(iO));
                    }
                    i3 = iO + 3;
                }
                ImmutableList immutableListS = lj3VarM.S();
                for (int i4 = 0; i4 < immutableListS.size(); i4++) {
                    if (((Integer) immutableListS.get(i4)).intValue() + 3 < length) {
                        ao0 ao0Var = new ao0(bArr, ((Integer) immutableListS.get(i4)).intValue() + 3, length);
                        rz5 rz5VarO = O(ao0Var);
                        if (rz5VarO.a == 33 && rz5VarO.b == 0) {
                            ao0Var.t(4);
                            int i5 = ao0Var.i(3);
                            ao0Var.s();
                            gh5 gh5VarP = P(ao0Var, true, i5, null);
                            return ku0.a(gh5VarP.a, gh5VarP.b, gh5VarP.c, gh5VarP.d, gh5VarP.e, gh5VarP.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int x(SparseIntArray sparseIntArray, ArrayList arrayList) {
        int iIntValue = ((Number) arrayList.get(0)).intValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (sparseIntArray.get(iIntValue) > sparseIntArray.get(iIntValue2)) {
                iIntValue = iIntValue2;
            }
        }
        return iIntValue;
    }

    public static Object y(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    public static final om0 z(g51 g51Var) {
        om0 om0Var;
        om0 om0Var2;
        if (!(g51Var instanceof qp1)) {
            return new om0(1, g51Var);
        }
        qp1 qp1Var = (qp1) g51Var;
        mu3 mu3Var = dy3.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qp1.h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(qp1Var);
            om0Var = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(qp1Var, mu3Var);
                om0Var2 = null;
                break;
            }
            if (obj instanceof om0) {
                while (!atomicReferenceFieldUpdater.compareAndSet(qp1Var, obj, mu3Var)) {
                    if (atomicReferenceFieldUpdater.get(qp1Var) != obj) {
                        break;
                    }
                }
                om0Var2 = (om0) obj;
                break loop0;
            }
            if (obj != mu3Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (om0Var2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = om0.g;
            Object obj2 = atomicReferenceFieldUpdater2.get(om0Var2);
            if (!(obj2 instanceof px0) || ((px0) obj2).d == null) {
                om0.f.set(om0Var2, 536870911);
                atomicReferenceFieldUpdater2.set(om0Var2, n6.a);
                om0Var = om0Var2;
            } else {
                om0Var2.r();
            }
            if (om0Var != null) {
                return om0Var;
            }
        }
        return new om0(2, g51Var);
    }

    public final Object T(Intent intent, int i2) {
        switch (this.a) {
            case 0:
                if (i2 == -1) {
                    if (intent != null) {
                        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                        if (intArrayExtra != null && stringArrayExtra != null) {
                            ArrayList arrayList = new ArrayList(intArrayExtra.length);
                            for (int i3 : intArrayExtra) {
                                arrayList.add(Boolean.valueOf(i3 == 0));
                            }
                            ArrayList arrayListJ0 = ew.J0(stringArrayExtra);
                            Iterator it = arrayListJ0.iterator();
                            Iterator it2 = arrayList.iterator();
                            ArrayList arrayList2 = new ArrayList(Math.min(wu0.V(arrayListJ0, 10), wu0.V(arrayList, 10)));
                            while (it.hasNext() && it2.hasNext()) {
                                arrayList2.add(new Pair(it.next(), it2.next()));
                            }
                        }
                    }
                }
                break;
            case 1:
                if (intent != null && i2 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                if (intArrayExtra2[i4] == 0) {
                                    z = true;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                break;
        }
        return new ActivityResult(intent, i2);
    }
}
